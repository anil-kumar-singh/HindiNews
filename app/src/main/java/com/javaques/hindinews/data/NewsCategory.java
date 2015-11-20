package com.javaques.hindinews.data;

import android.os.Parcel;
import android.os.Parcelable;

public class NewsCategory implements Parcelable{
	private String title;
	private String url;
	
	public NewsCategory(String title, String url) {
		super();
		this.title = title;
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(title);
		dest.writeString(url);

	}
	public static final Parcelable.Creator<NewsCategory> CREATOR = new Creator<NewsCategory>() {
		@Override
		public NewsCategory createFromParcel(Parcel source) {
			return new NewsCategory(source);
		}

		@Override
		public NewsCategory[] newArray(int size) {
			return new NewsCategory[size];
		}
	};
	private NewsCategory(Parcel source){
		title = source.readString();
		url = source.readString();

	}
}
