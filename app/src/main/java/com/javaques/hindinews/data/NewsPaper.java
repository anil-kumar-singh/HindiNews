package com.javaques.hindinews.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Parcelable {
    public static final int NP_JAGRAN = 1;
    public static final int NP_AMAR_UJALA = 2;
    public static final int NP_NAVBHARAT_TIMES = 3;
    public static final int NP_BHASKAR = 4;
    public static final int NP_HINDUATAN = 5;
    public static final int NP_NAI_DUNIYA = 6;
    public static final int NP_PANJAB_KESHARI = 7;
    public static final int NP_RASHTRIYA_SAHARA = 8;
    public static final int NP_JANSATTA = 9;
    public static final int NP_TEHELKA = 10;
    public static final int NP_PATRIKA = 11;
    public static final int NP_NAVBHARAT = 12;
    public static final int NP_PRABHAT_KHABAR = 13;
    public static final int NP_HARIBHOOMI = 14;
    public static final int NP_LOKMAT = 15;
    public static final int NP_NDTV = 16;
    public static final int NP_ABP_NEWS = 17;
    private int id;
    private String name;
    private int logo;
    private List<NewsCategory> listOfCategories;


    public NewsPaper(int id, String name, int logo,
                     List<NewsCategory> listOfCategories) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.listOfCategories = listOfCategories;
    }

    public List<NewsCategory> getListOfCategories() {
        return listOfCategories;
    }

    public void setListOfCategories(List<NewsCategory> listOfCategories) {
        this.listOfCategories = listOfCategories;
    }

    public NewsPaper() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeInt(logo);
        dest.writeTypedList(listOfCategories);


    }

    public static final Parcelable.Creator<NewsPaper> CREATOR = new Creator<NewsPaper>() {
        @Override
        public NewsPaper createFromParcel(Parcel source) {
            return new NewsPaper(source);
        }

        @Override
        public NewsPaper[] newArray(int size) {
            return new NewsPaper[size];
        }
    };

    private NewsPaper(Parcel source) {
        id = source.readInt();
        name = source.readString();
        logo = source.readInt();
        listOfCategories = new ArrayList<>();
        source.readTypedList(listOfCategories, NewsCategory.CREATOR);


    }

}
