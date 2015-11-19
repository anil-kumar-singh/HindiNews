package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class Jagran extends NewsPaper{
	private List<NewsCategory> listOfNewsCategories;
	
	
	
	public Jagran() {
		listOfNewsCategories = new ArrayList<NewsCategory>();		
		//listOfNewsCategories.add(new NewsCategory("test", "http://feeds.feedburner.com/ndtvkhabar"));
		listOfNewsCategories.add(new NewsCategory("राष्ट्रीय", "http://rss.jagran.com/rss/news/national.xml"));
		listOfNewsCategories.add(new NewsCategory("दुनिया", "http://rss.jagran.com/rss/news/world.xml"));
		listOfNewsCategories.add(new NewsCategory("बिजनेस", "http://rss.jagran.com/rss/news/business.xml"));
		listOfNewsCategories.add(new NewsCategory("खेल", "http://rss.jagran.com/rss/news/sports.xml"));
		listOfNewsCategories.add(new NewsCategory("नई दिल्ली", "http://rss.jagran.com/local/delhi/new-delhi-city.xml"));
		listOfNewsCategories.add(new NewsCategory("चर्चा में", "http://rss.jagran.com/rss/news/spotlight.xml"));
		listOfNewsCategories.add(new NewsCategory("जरा हटके", "http://rss.jagran.com/rss/news/oddnews.xml"));
		listOfNewsCategories.add(new NewsCategory("बॉलीवुड", "http://rss.jagran.com/rss/entertainment/bollywood.xml"));
		listOfNewsCategories.add(new NewsCategory("मिर्च-मसाला", "http://rss.jagran.com/rss/entertainment/controversy.xml"));
		listOfNewsCategories.add(new NewsCategory("बॉक्स ऑफिस", "http://rss.jagran.com/rss/entertainment/box-office.xml"));
		listOfNewsCategories.add(new NewsCategory("फिल्म समीक्षा", "http://rss.jagran.com/rss/entertainment/reviews.xml"));
		listOfNewsCategories.add(new NewsCategory("धर्म समाचार", "http://rss.jagran.com/rss/spiritual/religion.xml"));
		listOfNewsCategories.add(new NewsCategory("शिक्षा", "http://rss.jagran.com/rss/josh/shiksha.xml"));
		listOfNewsCategories.add(new NewsCategory("विज्ञान", "http://rss.jagran.com/rss/josh/vigyan.xml"));
		listOfNewsCategories.add(new NewsCategory("कैरियर", "http://rss.jagran.com/rss/josh/career.xml"));
		listOfNewsCategories.add(new NewsCategory("अपनी बात", "http://rss.jagran.com/rss/editorial/apnibaat.xml"));
		listOfNewsCategories.add(new NewsCategory("नजरिया", "http://rss.jagran.com/rss/editorial/nazariya.xml"));
		
		
		
		
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
