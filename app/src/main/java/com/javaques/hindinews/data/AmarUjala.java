package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class AmarUjala extends NewsPaper{
private List<NewsCategory> listOfNewsCategories;
	
	
	
	public AmarUjala() {
		listOfNewsCategories = new ArrayList<NewsCategory>();
		listOfNewsCategories.add(new NewsCategory("ताजा खबर", "http://www.amarujala.com/rss/breaking-news.xml"));
		listOfNewsCategories.add(new NewsCategory("राष्ट्रीय", "http://www.amarujala.com/rss/national-news.xml"));
		listOfNewsCategories.add(new NewsCategory("दुनिया", "http://www.amarujala.com/rss/international-news.xml"));
		listOfNewsCategories.add(new NewsCategory("बिजनेस", "http://www.amarujala.com/rss/business-news.xml"));
		listOfNewsCategories.add(new NewsCategory("खेल", "http://www.amarujala.com/rss/sports-news.xml"));
		listOfNewsCategories.add(new NewsCategory("लाइफस्टाइल", "http://www.amarujala.com/rss/lifestyle-news.xml"));
		
		listOfNewsCategories.add(new NewsCategory("संपादकीय", "http://www.amarujala.com/rss/editors-pick.xml"));
		listOfNewsCategories.add(new NewsCategory("टेक वर्ल्ड", "http://www.amarujala.com/rss/technology-news.xml"));
		listOfNewsCategories.add(new NewsCategory("ऑटो वर्ल्ड", "http://www.amarujala.com/rss/automobiles-news.xml"));
		listOfNewsCategories.add(new NewsCategory("बहुभागी", "http://www.amarujala.com/rss/multiplex-news.xml"));
		listOfNewsCategories.add(new NewsCategory("18+", "http://www.amarujala.com/rss/18-1-news.xml"));
		
		listOfNewsCategories.add(new NewsCategory("आध्यात्मिकता", "http://www.amarujala.com/rss/spirituality-news.xml"));
		listOfNewsCategories.add(new NewsCategory("ज्योतिष", "http://www.amarujala.com/rss/astrology-news.xml"));
		listOfNewsCategories.add(new NewsCategory("नौकरी", "http://www.amarujala.com/rss/jobs.xml"));
		listOfNewsCategories.add(new NewsCategory("क्राइम ब्यूरो", "http://www.amarujala.com/rss/crime-bureau.xml"));
		listOfNewsCategories.add(new NewsCategory("जोक्स", "http://www.amarujala.com/rss/jokes.xml"));
		listOfNewsCategories.add(new NewsCategory("Games", "http://www.amarujala.com/rss/games.xml"));
		listOfNewsCategories.add(new NewsCategory("उत्तर प्रदेश", "http://www.amarujala.com/rss/uttar-pradesh-news.xml"));
		listOfNewsCategories.add(new NewsCategory("उत्तराखंड", "http://www.amarujala.com/rss/uttarakhand-news.xml"));
		listOfNewsCategories.add(new NewsCategory("हिमाचल प्रदेश ", "http://www.amarujala.com/rss/himachal-pradesh-news.xml"));
		listOfNewsCategories.add(new NewsCategory("दिल्ली", "http://www.amarujala.com/rss/delhi-news.xml"));
		listOfNewsCategories.add(new NewsCategory("जम्मु और कश्मीर ", "http://www.amarujala.com/rss/jammu-kashmir-news.xml"));
		listOfNewsCategories.add(new NewsCategory("पंजाब", "http://www.amarujala.com/rss/punjab-news.xml"));
		listOfNewsCategories.add(new NewsCategory("हरियाणा", "http://www.amarujala.com/rss/haryana-news.xml"));
		listOfNewsCategories.add(new NewsCategory("बिहार", "http://www.amarujala.com/rss/bihar-news.xml"));
		listOfNewsCategories.add(new NewsCategory("छत्तीसगढ़", "http://www.amarujala.com/rss/chhattisgarh-news.xml"));
		listOfNewsCategories.add(new NewsCategory("मध्य प्रदेश", "http://www.amarujala.com/rss/madhya-pradesh-news.xml"));
		listOfNewsCategories.add(new NewsCategory("राजस्थान", "http://www.amarujala.com/rss/rajasthan-news.xml"));
		listOfNewsCategories.add(new NewsCategory("झारखंड", "http://www.amarujala.com/rss/jharkhand-news.xml"));
		
		
		
		
		
		
		
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
