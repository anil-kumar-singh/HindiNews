package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class ABPNews extends NewsPaper{
	private List<NewsCategory> listOfNewsCategories;
	
	
	
	public ABPNews() {
		listOfNewsCategories = new ArrayList<NewsCategory>();		
		//listOfNewsCategories.add(new NewsCategory("test", "http://www.haribhoomi.com/rss/feed.aspx?catid=3"));
		listOfNewsCategories.add(new NewsCategory("ताज़ा खबर", "http://abpnews.abplive.in/?widgetName=rssfeed&widgetContentId=102536&getXmlFeed=true"));
		
		
		
		
	}



	@Override
	public List<NewsCategory> getListOfCategories() {
		// TODO Auto-generated method stub
		return listOfNewsCategories;
	}



	@Override
	public void setListOfCategories(List<NewsCategory> listOfCategories) {
		// TODO Auto-generated method stub
		super.setListOfCategories(listOfCategories);
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}



	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}



	@Override
	public int getLogo() {
		// TODO Auto-generated method stub
		return super.getLogo();
	}



	@Override
	public void setLogo(int logo) {
		// TODO Auto-generated method stub
		super.setLogo(logo);
	}



	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}



	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	
	

}
