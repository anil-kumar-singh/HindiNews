package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class NDTVIndia extends NewsPaper{
	private List<NewsCategory> listOfNewsCategories;
	
	
	
	public NDTVIndia() {
		listOfNewsCategories = new ArrayList<NewsCategory>();		
		
		listOfNewsCategories.add(new NewsCategory("ताज़ातरीन", "http://feeds.feedburner.com/ndtvkhabar"));
		listOfNewsCategories.add(new NewsCategory("देश से", "http://feeds.feedburner.com/Khabar-India"));
		listOfNewsCategories.add(new NewsCategory("दुनिया से", "http://feeds.feedburner.com/Khabar-World"));
		listOfNewsCategories.add(new NewsCategory("क्रिकेट", "http://feeds.feedburner.com/Khabar-Cricket"));
		listOfNewsCategories.add(new NewsCategory("खेल", "http://feeds.feedburner.com/Khabar-Sports"));
		listOfNewsCategories.add(new NewsCategory("बिज़नेस", "http://feeds.feedburner.com/Khabar-Business"));
		listOfNewsCategories.add(new NewsCategory("फिल्मी है", "http://feeds.feedburner.com/Khabar-Movies"));
		listOfNewsCategories.add(new NewsCategory("ज़रा हटके", "http://feeds.feedburner.com/Khabar-zara-hatke"));
		listOfNewsCategories.add(new NewsCategory("बड़ी ख़बर", "http://feeds.feedburner.com/NDTVKhabarTopstories"));
		
		
		
		
		
		
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
