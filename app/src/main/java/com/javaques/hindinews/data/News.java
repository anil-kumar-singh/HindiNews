package com.javaques.hindinews.data;

/**
 * Created by Anil on 21-Nov-15.
 */
public class News {
    private String title;
    private String description;
    private String image;
    private String link;
    private String pubDate;

    public News(String title, String description, String image, String link, String pubDate) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.link = link;
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}
