package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class Navbharat extends NewsPaper{
	private List<NewsCategory> listOfNewsCategories;
	
	
	
	public Navbharat() {
		listOfNewsCategories = new ArrayList<NewsCategory>();		
		listOfNewsCategories.add(new NewsCategory("मुखपृष्ठ", "http://navbharattimes.indiatimes.com/rssfeedsdefault.cms"));
				
		
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
