package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class NaiDuniya extends NewsPaper{
	private List<NewsCategory> listOfNewsCategories;
	
	
	
	public NaiDuniya() {
		listOfNewsCategories = new ArrayList<NewsCategory>();		
		listOfNewsCategories.add(new NewsCategory("ताजा खबर", "http://rss.jagran.com/naidunia/latest-news.xml"));
		listOfNewsCategories.add(new NewsCategory("राष्ट्रीय", "http://rss.jagran.com/naidunia/national.xml"));
		listOfNewsCategories.add(new NewsCategory("दुनिया", "http://rss.jagran.com/naidunia/world.xml"));
		listOfNewsCategories.add(new NewsCategory("बिजनेस", "http://rss.jagran.com/naidunia/business.xml"));
		listOfNewsCategories.add(new NewsCategory("खेल", "http://rss.jagran.com/naidunia/trending/sports.xml"));
		listOfNewsCategories.add(new NewsCategory("नई दिल्ली", "http://rss.jagran.com/naidunia/state/delhi-ncr.xml"));
		listOfNewsCategories.add(new NewsCategory("चर्चा में", "http://rss.jagran.com/naidunia/topnews.xml"));
		listOfNewsCategories.add(new NewsCategory("मना॓रंजन", "http://rss.jagran.com/naidunia/entertainment.xml"));
		listOfNewsCategories.add(new NewsCategory("आध्यात्मिक", "http://rss.jagran.com/naidunia/spiritual.xml"));
		listOfNewsCategories.add(new NewsCategory("प्रौद्योगिकी", "http://rss.jagran.com/naidunia/technology.xml"));
		listOfNewsCategories.add(new NewsCategory("संपादकीय", "http://rss.jagran.com/naidunia/editorial.xml"));		
		listOfNewsCategories.add(new NewsCategory("Tranding", "http://rss.jagran.com/naidunia/trending.xml"));
		
		
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
