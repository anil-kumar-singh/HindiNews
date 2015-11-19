package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class DainikBhaskar extends NewsPaper{
private List<NewsCategory> listOfNewsCategories;
	
	
	
	public DainikBhaskar() {
		listOfNewsCategories = new ArrayList<NewsCategory>();
		listOfNewsCategories.add(new NewsCategory("ताजा खबर", "http://www.bhaskar.com/rss-feed/521/"));
		listOfNewsCategories.add(new NewsCategory("राष्ट्रीय", "http://www.bhaskar.com/rss-feed/2322/"));
		listOfNewsCategories.add(new NewsCategory("दुनिया", "http://www.bhaskar.com/rss-feed/2338/"));
		//listOfNewsCategories.add(new NewsCategory("बिजनेस", ""));
		//listOfNewsCategories.add(new NewsCategory("खेल", "http://www.bhaskar.com/rss-feed/1053/"));
		listOfNewsCategories.add(new NewsCategory("मना॓रंजन", "http://www.bhaskar.com/rss-feed/3998/"));
		listOfNewsCategories.add(new NewsCategory("लाइफस्टाइल", "http://www.bhaskar.com/rss-feed/3322/"));
		//listOfNewsCategories.add(new NewsCategory("दिल्ली", "http://www.bhaskar.com/rss-feed/1756/"));
		listOfNewsCategories.add(new NewsCategory("संपादकीय", "http://www.bhaskar.com/rss-feed/2089/"));
		//listOfNewsCategories.add(new NewsCategory("टेक", "http://www.bhaskar.com/rss-feed/3589/"));	
		listOfNewsCategories.add(new NewsCategory("गैजेट", "http://www.bhaskar.com/rss-feed/5707/"));
		
		listOfNewsCategories.add(new NewsCategory("नौकरी", "http://www.bhaskar.com/rss-feed/3605/"));		
		listOfNewsCategories.add(new NewsCategory("जोक्स", "http://www.bhaskar.com/rss-feed/4867/"));	
		listOfNewsCategories.add(new NewsCategory("विशेस", "http://www.bhaskar.com/rss-feed/4587/"));
		// States  & cities
		listOfNewsCategories.add(new NewsCategory("उत्तर प्रदेश", "http://www.bhaskar.com/rss-feed/2052/"));
		//listOfNewsCategories.add(new NewsCategory("उत्तराखंड", ""));
		listOfNewsCategories.add(new NewsCategory("हिमाचल प्रदेश ", "http://www.bhaskar.com/rss-feed/1744/"));		
		//listOfNewsCategories.add(new NewsCategory("जम्मु और कश्मीर ", ""));
		listOfNewsCategories.add(new NewsCategory("पंजाब", "http://www.bhaskar.com/rss-feed/1743/"));
		listOfNewsCategories.add(new NewsCategory("हरियाणा", "http://www.bhaskar.com/rss-feed/1742/"));
		listOfNewsCategories.add(new NewsCategory("बिहार", "http://www.bhaskar.com/rss-feed/3679/"));
		listOfNewsCategories.add(new NewsCategory("छत्तीसगढ़", "http://www.bhaskar.com/rss-feed/1741/"));
		listOfNewsCategories.add(new NewsCategory("मध्य प्रदेश", "http://www.bhaskar.com/rss-feed/1739/"));
		listOfNewsCategories.add(new NewsCategory("राजस्थान", "http://www.bhaskar.com/rss-feed/1740/"));
		listOfNewsCategories.add(new NewsCategory("झारखंड", "http://www.bhaskar.com/rss-feed/3682/"));
		listOfNewsCategories.add(new NewsCategory("महाराष्ट्रा", "http://www.bhaskar.com/rss-feed/2318/"));
		listOfNewsCategories.add(new NewsCategory("गुजरात", "http://www.bhaskar.com/rss-feed/2313/"));
		
		
		listOfNewsCategories.add(new NewsCategory("जयपुर", "http://www.bhaskar.com/rss-feed/1709/"));
		listOfNewsCategories.add(new NewsCategory("भोपाल", "http://www.bhaskar.com/rss-feed/1700/"));
		listOfNewsCategories.add(new NewsCategory("उदयपुर", "http://www.bhaskar.com/rss-feed/1711/"));
		listOfNewsCategories.add(new NewsCategory("रायपुर", "http://www.bhaskar.com/rss-feed/1719/"));
		listOfNewsCategories.add(new NewsCategory("राँची", "http://www.bhaskar.com/rss-feed/4845/"));
		listOfNewsCategories.add(new NewsCategory("लुधियाना", "http://www.bhaskar.com/rss-feed/1728/"));
		listOfNewsCategories.add(new NewsCategory("इंदौर", "http://www.bhaskar.com/rss-feed/1701/"));
		listOfNewsCategories.add(new NewsCategory("जोधपुर", "http://www.bhaskar.com/rss-feed/1710/"));
		
		
		
		
		
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
