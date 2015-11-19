package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class PrabhatKhabar  extends NewsPaper{
	private List<NewsCategory> listOfNewsCategories;
	
	
	
	public PrabhatKhabar() {
		listOfNewsCategories = new ArrayList<NewsCategory>();		
		//listOfNewsCategories.add(new NewsCategory("test", "http://www.prabhatkhabar.com/feed.aspx?cat_id=432"));
		listOfNewsCategories.add(new NewsCategory("देश", "http://www.prabhatkhabar.com/feed.aspx?cat_id=436"));
		listOfNewsCategories.add(new NewsCategory("अंतरराष्ट्रीय", "http://www.prabhatkhabar.com/feed.aspx?cat_id=432"));
		listOfNewsCategories.add(new NewsCategory("खेल", "http://www.prabhatkhabar.com/feed.aspx?cat_id=433"));
		//listOfNewsCategories.add(new NewsCategory("नॉलेज", "http://www.prabhatkhabar.com/feed.aspx?cat_id=435"));
		listOfNewsCategories.add(new NewsCategory("इंटरटेनमेंट", "http://www.prabhatkhabar.com/feed.aspx?cat_id=441"));
		listOfNewsCategories.add(new NewsCategory("उत्तर प्रदेश", "http://www.prabhatkhabar.com/feed.aspx?cat_id=468"));
		listOfNewsCategories.add(new NewsCategory("बिहार", "http://www.prabhatkhabar.com/feed.aspx?cat_id=466"));
		listOfNewsCategories.add(new NewsCategory("झारखंड", "http://www.prabhatkhabar.com/feed.aspx?cat_id=467"));
		listOfNewsCategories.add(new NewsCategory("बंगाल", "http://www.prabhatkhabar.com/feed.aspx?cat_id=469"));
		listOfNewsCategories.add(new NewsCategory("कारोबार", "http://www.prabhatkhabar.com/feed.aspx?cat_id=470"));
		listOfNewsCategories.add(new NewsCategory("विशेष खबर", "http://www.prabhatkhabar.com/feed.aspx?cat_id=472"));
				
		listOfNewsCategories.add(new NewsCategory("विशेष आलेख", "http://www.prabhatkhabar.com/feed.aspx?cat_id=674"));
		listOfNewsCategories.add(new NewsCategory("खबरों की खबर", "http://www.prabhatkhabar.com/feed.aspx?cat_id=675"));
		
		listOfNewsCategories.add(new NewsCategory("टेक्नोलॉजी", "http://www.prabhatkhabar.com/feed.aspx?cat_id=680"));
		listOfNewsCategories.add(new NewsCategory("ज्योतिष", "http://www.prabhatkhabar.com/feed.aspx?cat_id=710"));
		
		
		
		
		
		
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
