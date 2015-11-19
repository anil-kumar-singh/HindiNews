package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

public class Haribhoomi extends NewsPaper{
	private List<NewsCategory> listOfNewsCategories;
	public Haribhoomi() {

		listOfNewsCategories = new ArrayList<NewsCategory>();	
		listOfNewsCategories.add(new NewsCategory("भारत", "http://www.haribhoomi.com/rss/feed.aspx?catid=3"));
		listOfNewsCategories.add(new NewsCategory("विश्व", "http://www.haribhoomi.com/rss/feed.aspx?catid=4"));
		listOfNewsCategories.add(new NewsCategory("राज्य", "http://www.haribhoomi.com/rss/feed.aspx?catid=2"));
		listOfNewsCategories.add(new NewsCategory("खेल", "http://www.haribhoomi.com/rss/feed.aspx?catid=7"));
		listOfNewsCategories.add(new NewsCategory("मना॓रंजन", "http://www.haribhoomi.com/rss/feed.aspx?catid=6"));
		listOfNewsCategories.add(new NewsCategory("लाइफस्टाइल", "http://www.haribhoomi.com/rss/feed.aspx?catid=8"));
		listOfNewsCategories.add(new NewsCategory("बिजनेस", "http://www.haribhoomi.com/rss/feed.aspx?catid=5"));
		listOfNewsCategories.add(new NewsCategory("गैजेट", "http://www.haribhoomi.com/rss/feed.aspx?catid=18"));
		listOfNewsCategories.add(new NewsCategory("कॅरि‍यर", "http://www.haribhoomi.com/rss/feed.aspx?catid=214"));
		listOfNewsCategories.add(new NewsCategory("साहि‍त्‍य", "http://www.haribhoomi.com/rss/feed.aspx?catid=245"));
		listOfNewsCategories.add(new NewsCategory("धर्म", "http://www.haribhoomi.com/rss/feed.aspx?catid=19"));
		listOfNewsCategories.add(new NewsCategory("हंस भी लो", "http://www.haribhoomi.com/rss/feed.aspx?catid=160"));
		listOfNewsCategories.add(new NewsCategory("अजब गजब", "http://www.haribhoomi.com/rss/feed.aspx?catid=158"));
		listOfNewsCategories.add(new NewsCategory("संपादकीय", "http://www.haribhoomi.com/rss/feed.aspx?catid=9"));
		listOfNewsCategories.add(new NewsCategory("क्राइम अगेंस्ट वूमन", "http://www.haribhoomi.com/rss/feed.aspx?catid=38"));
		listOfNewsCategories.add(new NewsCategory("राजनीति", "http://www.haribhoomi.com/rss/feed.aspx?catid=36"));
		listOfNewsCategories.add(new NewsCategory("फिल्म समीक्षा", "http://www.haribhoomi.com/rss/feed.aspx?catid=171"));
		listOfNewsCategories.add(new NewsCategory("आने वाली फिल्में", "http://www.haribhoomi.com/rss/feed.aspx?catid=161"));
		listOfNewsCategories.add(new NewsCategory("नई दिल्ली", "http://www.haribhoomi.com/rss/feed.aspx?catid=28"));
		listOfNewsCategories.add(new NewsCategory("उत्तर प्रदेश", "http://www.haribhoomi.com/rss/feed.aspx?catid=27"));
		listOfNewsCategories.add(new NewsCategory("हि‍माचल प्रदेश", "http://www.haribhoomi.com/rss/feed.aspx?catid=243"));
		listOfNewsCategories.add(new NewsCategory("हरियाणा", "http://www.haribhoomi.com/rss/feed.aspx?catid=31"));
		listOfNewsCategories.add(new NewsCategory("छत्तीसगढ़", "http://www.haribhoomi.com/rss/feed.aspx?catid=25"));
		listOfNewsCategories.add(new NewsCategory("झारखंड", "http://www.haribhoomi.com/rss/feed.aspx?catid=26"));
		listOfNewsCategories.add(new NewsCategory("पंजाब", "http://www.haribhoomi.com/rss/feed.aspx?catid=21"));
		listOfNewsCategories.add(new NewsCategory("महाराष्ट्र", "http://www.haribhoomi.com/rss/feed.aspx?catid=20"));
		listOfNewsCategories.add(new NewsCategory("बिहार", "http://www.haribhoomi.com/rss/feed.aspx?catid=22"));
		listOfNewsCategories.add(new NewsCategory("मध्य प्रदेश", "http://www.haribhoomi.com/rss/feed.aspx?catid=33"));
		listOfNewsCategories.add(new NewsCategory("गुजरात", "http://www.haribhoomi.com/rss/feed.aspx?catid=34"));
		listOfNewsCategories.add(new NewsCategory("राजस्थान", "http://www.haribhoomi.com/rss/feed.aspx?catid=121"));
		listOfNewsCategories.add(new NewsCategory("उत्तराखंड", "http://www.haribhoomi.com/rss/feed.aspx?catid=190"));
		listOfNewsCategories.add(new NewsCategory("जम्मू एंड कश्मीर", "http://www.haribhoomi.com/rss/feed.aspx?catid=35"));
		listOfNewsCategories.add(new NewsCategory("चंडीगढ़", "http://www.haribhoomi.com/rss/feed.aspx?catid=124"));
		
		
		
		
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
