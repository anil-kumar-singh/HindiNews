package com.javaques.hindinews.parsers;

import android.util.Xml;

import com.javaques.hindinews.data.News;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anil on 20-Nov-15.
 */
public abstract class FeedXmlParser {

    private static final String TAG = "FeedXmlParser";


    public List<News> parse(InputStream in)throws XmlPullParserException, IOException {
        try {
            XmlPullParser parser = Xml.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in, null);
            parser.nextTag();
            return readFeed(parser);
        } finally {
            in.close();
        }

    }


    private List<News> readFeed(XmlPullParser parser) throws XmlPullParserException, IOException {
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
        String author = null;
        String pubDate = null;
        String posterLink = null;
        String content = null;
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            //Log.d(TAG, "item: " + name);
           /* if (name.equals("title")) {
                title = readTitle(parser);
            } else if (name.equals("link")) {
                link = readLink(parser);
            } else if (name.equals("description")) {
                description = readDescription(parser);
                posterLink = getImgUrl(description);
            } else if (name.equals("content:encoded")) {
                content = readContent(parser);

            } else if (name.equals("author")) {
                author = readAuthor(parser);
            } else if (name.equals("pubDate")) {
                pubDate = readPubDate(parser);
            } else {
                skip(parser);
            }*/

        }
        //Log.d(TAG, "" + posterLink);
        return null;
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

}
