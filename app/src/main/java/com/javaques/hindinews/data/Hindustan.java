package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class Hindustan extends NewsPaper{
	private List<NewsCategory> listOfNewsCategories;
	public Hindustan() {

		listOfNewsCategories = new ArrayList<NewsCategory>();	
		listOfNewsCategories.add(new NewsCategory("मुख्य खबरे", "http://www.livehindustan.com/home/rssfeed/1.html"));
		listOfNewsCategories.add(new NewsCategory("देश", "http://www.livehindustan.com/home/rssfeed/39.html"));
		listOfNewsCategories.add(new NewsCategory("दुनिया", "http://www.livehindustan.com/home/rssfeed/2.html"));
		listOfNewsCategories.add(new NewsCategory("क्रिकेट", "http://www.livehindustan.com/home/rssfeed/3.html"));
		listOfNewsCategories.add(new NewsCategory("अन्य खेल", "http://www.livehindustan.com/home/rssfeed/38.html"));
		listOfNewsCategories.add(new NewsCategory("बिजनेस", "http://www.livehindustan.com/home/rssfeed/45.html"));
		listOfNewsCategories.add(new NewsCategory("मना॓रंजन", "http://www.livehindustan.com/home/rssfeed/28.html"));
		listOfNewsCategories.add(new NewsCategory("जीवन.शैली", "http://www.livehindustan.com/home/rssfeed/50.html"));
		listOfNewsCategories.add(new NewsCategory("तरक्की", "http://www.livehindustan.com/home/rssfeed/67.html"));
		listOfNewsCategories.add(new NewsCategory("विमर्श", "http://www.livehindustan.com/home/rssfeed/57.html"));
		listOfNewsCategories.add(new NewsCategory("एन सी आर", "http://www.livehindustan.com/home/rssfeed/401.html"));
		listOfNewsCategories.add(new NewsCategory("उत्तराखंड", "http://www.livehindustan.com/home/rssfeed/402.html"));
		listOfNewsCategories.add(new NewsCategory("उत्तर प्रदेश", "http://www.livehindustan.com/home/rssfeed/403.html"));
		listOfNewsCategories.add(new NewsCategory("बिहार", "http://www.livehindustan.com/home/rssfeed/404.html"));
		listOfNewsCategories.add(new NewsCategory("झारखंड", "http://www.livehindustan.com/home/rssfeed/405.html"));
		listOfNewsCategories.add(new NewsCategory("पंजाब", "http://www.livehindustan.com/home/rssfeed/406.html"));
		listOfNewsCategories.add(new NewsCategory("वाराणसी", "http://www.livehindustan.com/home/rssfeed/413.html"));
		listOfNewsCategories.add(new NewsCategory("चुनाव-2015", "http://www.livehindustan.com/home/rssfeed/112.html"));
		
		
		
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
