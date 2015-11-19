package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class Jansatta extends NewsPaper{
	private List<NewsCategory> listOfNewsCategories;
	
	
	
	public Jansatta() {
		listOfNewsCategories = new ArrayList<NewsCategory>();	
		listOfNewsCategories.add(new NewsCategory("प्रमुख समाचार", "http://www.jansatta.com/feed/"));
		listOfNewsCategories.add(new NewsCategory("राष्ट्रीय", "http://www.jansatta.com/category/national/feed/"));
		listOfNewsCategories.add(new NewsCategory("अंतरराष्ट्रीय", "http://www.jansatta.com/category/international/feed/"));
		listOfNewsCategories.add(new NewsCategory("व्यापार", "http://www.jansatta.com/category/business/feed/"));		
		listOfNewsCategories.add(new NewsCategory("खेल", "http://www.jansatta.com/category/khel/feed/"));
		listOfNewsCategories.add(new NewsCategory("मनोरंजन", "http://www.jansatta.com/category/entertainment/feed/"));
		listOfNewsCategories.add(new NewsCategory("नई दिल्ली", "http://www.jansatta.com/category/rajya/new-delhi/feed/"));
		listOfNewsCategories.add(new NewsCategory("कोलकाता", "http://www.jansatta.com/category/rajya/kolkata/feed/"));
		listOfNewsCategories.add(new NewsCategory("लखनऊ", "http://www.jansatta.com/category/rajya/lucknow/feed/"));
		listOfNewsCategories.add(new NewsCategory("चंडीगढ़", "http://www.jansatta.com/category/rajya/chandigarh/feed/"));		
		listOfNewsCategories.add(new NewsCategory("संपादकीय", "http://www.jansatta.com/category/editorial/feed/"));
		listOfNewsCategories.add(new NewsCategory("राजनीति", "http://www.jansatta.com/category/politics/feed/"));
		listOfNewsCategories.add(new NewsCategory("दुनिया मेरे आगे", "http://www.jansatta.com/category/duniya-mere-aage/feed/"));
		listOfNewsCategories.add(new NewsCategory("समांतर", "http://www.jansatta.com/category/columns/feed/"));
		listOfNewsCategories.add(new NewsCategory("चौपाल", "http://www.jansatta.com/category/chopal/feed/"));
		listOfNewsCategories.add(new NewsCategory("रविवारीय स्तम्भ", "http://www.jansatta.com/category/sunday-column/feed/"));
		listOfNewsCategories.add(new NewsCategory("जीवन-शैली", "http://www.jansatta.com/category/lifestyle/feed/"));
		listOfNewsCategories.add(new NewsCategory("संपादक की पसंद", "http://www.jansatta.com/category/editors-pick/feed/"));
		
		
		
		
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
