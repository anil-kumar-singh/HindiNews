package com.javaques.hindinews.parsers;

import android.util.Xml;

import com.javaques.hindinews.data.News;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anil on 20-Nov-15.
 */
public class FeedXmlParser {

    private static final String TAG = "FeedXmlParser";


    public List<News> parse(InputStream in)throws XmlPullParserException, IOException {
        try {
            XmlPullParser parser = Xml.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in, null);
            parser.nextTag();
            parser.nextTag();
            return readFeed(parser);
        } finally {
            in.close();
        }

    }
    public List<News> readFeed(XmlPullParser parser) throws XmlPullParserException, IOException {
        List entries = new ArrayList();

        parser.require(XmlPullParser.START_TAG, null, "channel");
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            // Starts by looking for the entry tag
            if (name.equals("item")) {
                entries.add(readItem(parser));
            } else {
                skip(parser);
            }
        }
        return entries;
    }
    private News readItem(XmlPullParser parser) throws XmlPullParserException, IOException {

        parser.require(XmlPullParser.START_TAG, null, "item");
        String title = null;
        String link = null;
        String description = null;
        String pubDate = null;
        String image = null;

        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            //Log.d(TAG, "item: " + name);
            if (name.equals("title")) {
                title = readTitle(parser);
            } else if (name.equals("link")) {
                link = readLink(parser);
            } else if (name.equals("description")) {
                description = readDescription(parser);
                image = getImgUrl(description);
                description = description.replaceAll("(<(/)img>)|(<img.+?>)", "");
            }else if (name.equals("link")) {
                link = readLink(parser);
            } else if (name.equals("pubDate")) {
                pubDate = readPubDate(parser);
            } else {
                skip(parser);
            }

        }
        //Log.d(TAG, "" + posterLink);
        return new News(title, description, image, link, pubDate);
    }

    public String readText(XmlPullParser parser) throws IOException, XmlPullParserException {
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.getText();
            parser.nextTag();
        }
        return result;
    }



    public void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
                case XmlPullParser.END_TAG:
                    depth--;
                    break;
                case XmlPullParser.START_TAG:
                    depth++;
                    break;
            }
        }
    }
    public String getImgUrl(String str) {

        String imageUrl = null;
        if (str == null) {
            return null;
        }
        // 1. From string:
        Document doc = Jsoup.parse(str);
        // Then select images inside it:
        Elements images = doc.select("img");
        // Then iterate
        for (Element el : images) {
            imageUrl = el.attr("src");
        }
        return imageUrl;
    }

    // Processes title tags in the feed.
    protected String readTitle(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, "title");
        String title = readText(parser);
        parser.require(XmlPullParser.END_TAG, null, "title");
        return title;
    }
    protected String readLink(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, "link");
        String link = readText(parser);
        parser.require(XmlPullParser.END_TAG, null, "link");
        return link;
    }
    protected String readPubDate(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, "pubDate");
        String pubDate = readText(parser);
        parser.require(XmlPullParser.END_TAG, null, "pubDate");
        return pubDate;
    }
    protected String readDescription(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, "description");
        String readDescription = readText(parser);
        parser.require(XmlPullParser.END_TAG, null, "description");
        return readDescription;
    }

}
