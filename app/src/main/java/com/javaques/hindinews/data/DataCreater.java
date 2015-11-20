package com.javaques.hindinews.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anil on 20-Nov-15.
 */
public class DataCreater {

    public static List<NewsCategory> getListOfCategories(int newsPaperId) {
        List<NewsCategory> categories = new ArrayList<>();
        switch (newsPaperId) {
            case NewsPaper.NP_JAGRAN:

                categories.add(new NewsCategory("राष्ट्रीय", "http://rss.jagran.com/rss/news/national.xml"));
                categories.add(new NewsCategory("दुनिया", "http://rss.jagran.com/rss/news/world.xml"));
                categories.add(new NewsCategory("बिजनेस", "http://rss.jagran.com/rss/news/business.xml"));
                categories.add(new NewsCategory("खेल", "http://rss.jagran.com/rss/news/sports.xml"));
                categories.add(new NewsCategory("नई दिल्ली", "http://rss.jagran.com/local/delhi/new-delhi-city.xml"));
                categories.add(new NewsCategory("जरा हटके", "http://rss.jagran.com/rss/news/oddnews.xml"));
                categories.add(new NewsCategory("बॉलीवुड", "http://rss.jagran.com/rss/entertainment/bollywood.xml"));
                categories.add(new NewsCategory("मिर्च-मसाला", "http://rss.jagran.com/rss/entertainment/controversy.xml"));
                categories.add(new NewsCategory("बॉक्स ऑफिस", "http://rss.jagran.com/rss/entertainment/box-office.xml"));
                categories.add(new NewsCategory("फिल्म समीक्षा", "http://rss.jagran.com/rss/entertainment/reviews.xml"));
                categories.add(new NewsCategory("धर्म समाचार", "http://rss.jagran.com/rss/spiritual/religion.xml"));
                categories.add(new NewsCategory("शिक्षा", "http://rss.jagran.com/rss/josh/shiksha.xml"));
                categories.add(new NewsCategory("विज्ञान", "http://rss.jagran.com/rss/josh/vigyan.xml"));
                categories.add(new NewsCategory("कैरियर", "http://rss.jagran.com/rss/josh/career.xml"));
                categories.add(new NewsCategory("अपनी बात", "http://rss.jagran.com/rss/editorial/apnibaat.xml"));
                categories.add(new NewsCategory("नजरिया", "http://rss.jagran.com/rss/editorial/nazariya.xml"));
                break;
            case NewsPaper.NP_AMAR_UJALA:
                categories.add(new NewsCategory("ताजा खबर", "http://www.amarujala.com/rss/breaking-news.xml"));
                categories.add(new NewsCategory("राष्ट्रीय", "http://www.amarujala.com/rss/national-news.xml"));
                categories.add(new NewsCategory("दुनिया", "http://www.amarujala.com/rss/international-news.xml"));
                categories.add(new NewsCategory("बिजनेस", "http://www.amarujala.com/rss/business-news.xml"));
                categories.add(new NewsCategory("खेल", "http://www.amarujala.com/rss/sports-news.xml"));
                categories.add(new NewsCategory("लाइफस्टाइल", "http://www.amarujala.com/rss/lifestyle-news.xml"));
                categories.add(new NewsCategory("संपादकीय", "http://www.amarujala.com/rss/editors-pick.xml"));
                categories.add(new NewsCategory("टेक वर्ल्ड", "http://www.amarujala.com/rss/technology-news.xml"));
                categories.add(new NewsCategory("ऑटो वर्ल्ड", "http://www.amarujala.com/rss/automobiles-news.xml"));
                categories.add(new NewsCategory("बहुभागी", "http://www.amarujala.com/rss/multiplex-news.xml"));
                categories.add(new NewsCategory("18+", "http://www.amarujala.com/rss/18-1-news.xml"));
                categories.add(new NewsCategory("आध्यात्मिकता", "http://www.amarujala.com/rss/spirituality-news.xml"));
                categories.add(new NewsCategory("ज्योतिष", "http://www.amarujala.com/rss/astrology-news.xml"));
                categories.add(new NewsCategory("नौकरी", "http://www.amarujala.com/rss/jobs.xml"));
                categories.add(new NewsCategory("क्राइम ब्यूरो", "http://www.amarujala.com/rss/crime-bureau.xml"));
                categories.add(new NewsCategory("जोक्स", "http://www.amarujala.com/rss/jokes.xml"));
                categories.add(new NewsCategory("गेम्स", "http://www.amarujala.com/rss/games.xml"));
                categories.add(new NewsCategory("उत्तर प्रदेश", "http://www.amarujala.com/rss/uttar-pradesh-news.xml"));
                categories.add(new NewsCategory("उत्तराखंड", "http://www.amarujala.com/rss/uttarakhand-news.xml"));
                categories.add(new NewsCategory("हिमाचल प्रदेश ", "http://www.amarujala.com/rss/himachal-pradesh-news.xml"));
                categories.add(new NewsCategory("दिल्ली", "http://www.amarujala.com/rss/delhi-news.xml"));
                categories.add(new NewsCategory("जम्मु और कश्मीर ", "http://www.amarujala.com/rss/jammu-kashmir-news.xml"));
                categories.add(new NewsCategory("पंजाब", "http://www.amarujala.com/rss/punjab-news.xml"));
                categories.add(new NewsCategory("हरियाणा", "http://www.amarujala.com/rss/haryana-news.xml"));
                categories.add(new NewsCategory("बिहार", "http://www.amarujala.com/rss/bihar-news.xml"));
                categories.add(new NewsCategory("छत्तीसगढ़", "http://www.amarujala.com/rss/chhattisgarh-news.xml"));
                categories.add(new NewsCategory("मध्य प्रदेश", "http://www.amarujala.com/rss/madhya-pradesh-news.xml"));
                categories.add(new NewsCategory("राजस्थान", "http://www.amarujala.com/rss/rajasthan-news.xml"));
                categories.add(new NewsCategory("झारखंड", "http://www.amarujala.com/rss/jharkhand-news.xml"));
                break;
            case NewsPaper.NP_BHASKAR:
                categories.add(new NewsCategory("ताजा खबर", "http://www.bhaskar.com/rss-feed/521/"));
                categories.add(new NewsCategory("राष्ट्रीय", "http://www.bhaskar.com/rss-feed/2322/"));
                categories.add(new NewsCategory("दुनिया", "http://www.bhaskar.com/rss-feed/2338/"));
                categories.add(new NewsCategory("मना॓रंजन", "http://www.bhaskar.com/rss-feed/3998/"));
                categories.add(new NewsCategory("लाइफस्टाइल", "http://www.bhaskar.com/rss-feed/3322/"));
                categories.add(new NewsCategory("संपादकीय", "http://www.bhaskar.com/rss-feed/2089/"));
                categories.add(new NewsCategory("गैजेट", "http://www.bhaskar.com/rss-feed/5707/"));
                categories.add(new NewsCategory("नौकरी", "http://www.bhaskar.com/rss-feed/3605/"));
                categories.add(new NewsCategory("जोक्स", "http://www.bhaskar.com/rss-feed/4867/"));
                categories.add(new NewsCategory("विशेस", "http://www.bhaskar.com/rss-feed/4587/"));
                // States  & cities
                categories.add(new NewsCategory("उत्तर प्रदेश", "http://www.bhaskar.com/rss-feed/2052/"));
                categories.add(new NewsCategory("हिमाचल प्रदेश ", "http://www.bhaskar.com/rss-feed/1744/"));
                categories.add(new NewsCategory("पंजाब", "http://www.bhaskar.com/rss-feed/1743/"));
                categories.add(new NewsCategory("हरियाणा", "http://www.bhaskar.com/rss-feed/1742/"));
                categories.add(new NewsCategory("बिहार", "http://www.bhaskar.com/rss-feed/3679/"));
                categories.add(new NewsCategory("छत्तीसगढ़", "http://www.bhaskar.com/rss-feed/1741/"));
                categories.add(new NewsCategory("मध्य प्रदेश", "http://www.bhaskar.com/rss-feed/1739/"));
                categories.add(new NewsCategory("राजस्थान", "http://www.bhaskar.com/rss-feed/1740/"));
                categories.add(new NewsCategory("झारखंड", "http://www.bhaskar.com/rss-feed/3682/"));
                categories.add(new NewsCategory("महाराष्ट्रा", "http://www.bhaskar.com/rss-feed/2318/"));
                categories.add(new NewsCategory("गुजरात", "http://www.bhaskar.com/rss-feed/2313/"));
                categories.add(new NewsCategory("जयपुर", "http://www.bhaskar.com/rss-feed/1709/"));
                categories.add(new NewsCategory("भोपाल", "http://www.bhaskar.com/rss-feed/1700/"));
                categories.add(new NewsCategory("उदयपुर", "http://www.bhaskar.com/rss-feed/1711/"));
                categories.add(new NewsCategory("रायपुर", "http://www.bhaskar.com/rss-feed/1719/"));
                categories.add(new NewsCategory("राँची", "http://www.bhaskar.com/rss-feed/4845/"));
                categories.add(new NewsCategory("लुधियाना", "http://www.bhaskar.com/rss-feed/1728/"));
                categories.add(new NewsCategory("इंदौर", "http://www.bhaskar.com/rss-feed/1701/"));
                categories.add(new NewsCategory("जोधपुर", "http://www.bhaskar.com/rss-feed/1710/"));
                break;
            case NewsPaper.NP_NAI_DUNIYA:

                categories.add(new NewsCategory("ताजा खबर", "http://rss.jagran.com/naidunia/latest-news.xml"));
                categories.add(new NewsCategory("राष्ट्रीय", "http://rss.jagran.com/naidunia/national.xml"));
                categories.add(new NewsCategory("दुनिया", "http://rss.jagran.com/naidunia/world.xml"));
                categories.add(new NewsCategory("बिजनेस", "http://rss.jagran.com/naidunia/business.xml"));
                categories.add(new NewsCategory("खेल", "http://rss.jagran.com/naidunia/trending/sports.xml"));
                categories.add(new NewsCategory("नई दिल्ली", "http://rss.jagran.com/naidunia/state/delhi-ncr.xml"));
                categories.add(new NewsCategory("चर्चा में", "http://rss.jagran.com/naidunia/topnews.xml"));
                categories.add(new NewsCategory("मना॓रंजन", "http://rss.jagran.com/naidunia/entertainment.xml"));
                categories.add(new NewsCategory("आध्यात्मिक", "http://rss.jagran.com/naidunia/spiritual.xml"));
                categories.add(new NewsCategory("प्रौद्योगिकी", "http://rss.jagran.com/naidunia/technology.xml"));
                categories.add(new NewsCategory("संपादकीय", "http://rss.jagran.com/naidunia/editorial.xml"));
                categories.add(new NewsCategory("Tranding", "http://rss.jagran.com/naidunia/trending.xml"));
                break;
            case NewsPaper.NP_JANSATTA:
                categories.add(new NewsCategory("प्रमुख समाचार", "http://www.jansatta.com/feed/"));
                categories.add(new NewsCategory("राष्ट्रीय", "http://www.jansatta.com/category/national/feed/"));
                categories.add(new NewsCategory("अंतरराष्ट्रीय", "http://www.jansatta.com/category/international/feed/"));
                categories.add(new NewsCategory("व्यापार", "http://www.jansatta.com/category/business/feed/"));
                categories.add(new NewsCategory("खेल", "http://www.jansatta.com/category/khel/feed/"));
                categories.add(new NewsCategory("मनोरंजन", "http://www.jansatta.com/category/entertainment/feed/"));
                categories.add(new NewsCategory("नई दिल्ली", "http://www.jansatta.com/category/rajya/new-delhi/feed/"));
                categories.add(new NewsCategory("कोलकाता", "http://www.jansatta.com/category/rajya/kolkata/feed/"));
                categories.add(new NewsCategory("लखनऊ", "http://www.jansatta.com/category/rajya/lucknow/feed/"));
                categories.add(new NewsCategory("चंडीगढ़", "http://www.jansatta.com/category/rajya/chandigarh/feed/"));
                categories.add(new NewsCategory("संपादकीय", "http://www.jansatta.com/category/editorial/feed/"));
                categories.add(new NewsCategory("राजनीति", "http://www.jansatta.com/category/politics/feed/"));
                categories.add(new NewsCategory("दुनिया मेरे आगे", "http://www.jansatta.com/category/duniya-mere-aage/feed/"));
                categories.add(new NewsCategory("समांतर", "http://www.jansatta.com/category/columns/feed/"));
                categories.add(new NewsCategory("चौपाल", "http://www.jansatta.com/category/chopal/feed/"));
                categories.add(new NewsCategory("रविवारीय स्तम्भ", "http://www.jansatta.com/category/sunday-column/feed/"));
                categories.add(new NewsCategory("जीवन-शैली", "http://www.jansatta.com/category/lifestyle/feed/"));
                categories.add(new NewsCategory("संपादक की पसंद", "http://www.jansatta.com/category/editors-pick/feed/"));
                break;
            case NewsPaper.NP_TEHELKA:
                categories.add(new NewsCategory("मुखपृष्ठ", "http://tehelkahindi.com/feed/"));
                break;
            case NewsPaper.NP_NAVBHARAT:
                categories.add(new NewsCategory("मुखपृष्ठ", "http://navbharattimes.indiatimes.com/rssfeedsdefault.cms"));
                break;
            case NewsPaper.NP_PRABHAT_KHABAR:

                categories.add(new NewsCategory("देश", "http://www.prabhatkhabar.com/feed.aspx?cat_id=436"));
                categories.add(new NewsCategory("अंतरराष्ट्रीय", "http://www.prabhatkhabar.com/feed.aspx?cat_id=432"));
                categories.add(new NewsCategory("खेल", "http://www.prabhatkhabar.com/feed.aspx?cat_id=433"));
                categories.add(new NewsCategory("इंटरटेनमेंट", "http://www.prabhatkhabar.com/feed.aspx?cat_id=441"));
                categories.add(new NewsCategory("उत्तर प्रदेश", "http://www.prabhatkhabar.com/feed.aspx?cat_id=468"));
                categories.add(new NewsCategory("बिहार", "http://www.prabhatkhabar.com/feed.aspx?cat_id=466"));
                categories.add(new NewsCategory("झारखंड", "http://www.prabhatkhabar.com/feed.aspx?cat_id=467"));
                categories.add(new NewsCategory("बंगाल", "http://www.prabhatkhabar.com/feed.aspx?cat_id=469"));
                categories.add(new NewsCategory("कारोबार", "http://www.prabhatkhabar.com/feed.aspx?cat_id=470"));
                categories.add(new NewsCategory("विशेष खबर", "http://www.prabhatkhabar.com/feed.aspx?cat_id=472"));
                categories.add(new NewsCategory("विशेष आलेख", "http://www.prabhatkhabar.com/feed.aspx?cat_id=674"));
                categories.add(new NewsCategory("खबरों की खबर", "http://www.prabhatkhabar.com/feed.aspx?cat_id=675"));
                categories.add(new NewsCategory("टेक्नोलॉजी", "http://www.prabhatkhabar.com/feed.aspx?cat_id=680"));
                categories.add(new NewsCategory("ज्योतिष", "http://www.prabhatkhabar.com/feed.aspx?cat_id=710"));
                break;
            case NewsPaper.NP_HARIBHOOMI:
                categories.add(new NewsCategory("भारत", "http://www.haribhoomi.com/rss/feed.aspx?catid=3"));
                categories.add(new NewsCategory("विश्व", "http://www.haribhoomi.com/rss/feed.aspx?catid=4"));
                categories.add(new NewsCategory("राज्य", "http://www.haribhoomi.com/rss/feed.aspx?catid=2"));
                categories.add(new NewsCategory("खेल", "http://www.haribhoomi.com/rss/feed.aspx?catid=7"));
                categories.add(new NewsCategory("मना॓रंजन", "http://www.haribhoomi.com/rss/feed.aspx?catid=6"));
                categories.add(new NewsCategory("लाइफस्टाइल", "http://www.haribhoomi.com/rss/feed.aspx?catid=8"));
                categories.add(new NewsCategory("बिजनेस", "http://www.haribhoomi.com/rss/feed.aspx?catid=5"));
                categories.add(new NewsCategory("गैजेट", "http://www.haribhoomi.com/rss/feed.aspx?catid=18"));
                categories.add(new NewsCategory("कॅरि‍यर", "http://www.haribhoomi.com/rss/feed.aspx?catid=214"));
                categories.add(new NewsCategory("साहि‍त्‍य", "http://www.haribhoomi.com/rss/feed.aspx?catid=245"));
                categories.add(new NewsCategory("धर्म", "http://www.haribhoomi.com/rss/feed.aspx?catid=19"));
                categories.add(new NewsCategory("हंस भी लो", "http://www.haribhoomi.com/rss/feed.aspx?catid=160"));
                categories.add(new NewsCategory("अजब गजब", "http://www.haribhoomi.com/rss/feed.aspx?catid=158"));
                categories.add(new NewsCategory("संपादकीय", "http://www.haribhoomi.com/rss/feed.aspx?catid=9"));
                categories.add(new NewsCategory("क्राइम अगेंस्ट वूमन", "http://www.haribhoomi.com/rss/feed.aspx?catid=38"));
                categories.add(new NewsCategory("राजनीति", "http://www.haribhoomi.com/rss/feed.aspx?catid=36"));
                categories.add(new NewsCategory("फिल्म समीक्षा", "http://www.haribhoomi.com/rss/feed.aspx?catid=171"));
                categories.add(new NewsCategory("आने वाली फिल्में", "http://www.haribhoomi.com/rss/feed.aspx?catid=161"));
                categories.add(new NewsCategory("नई दिल्ली", "http://www.haribhoomi.com/rss/feed.aspx?catid=28"));
                categories.add(new NewsCategory("उत्तर प्रदेश", "http://www.haribhoomi.com/rss/feed.aspx?catid=27"));
                categories.add(new NewsCategory("हि‍माचल प्रदेश", "http://www.haribhoomi.com/rss/feed.aspx?catid=243"));
                categories.add(new NewsCategory("हरियाणा", "http://www.haribhoomi.com/rss/feed.aspx?catid=31"));
                categories.add(new NewsCategory("छत्तीसगढ़", "http://www.haribhoomi.com/rss/feed.aspx?catid=25"));
                categories.add(new NewsCategory("झारखंड", "http://www.haribhoomi.com/rss/feed.aspx?catid=26"));
                categories.add(new NewsCategory("पंजाब", "http://www.haribhoomi.com/rss/feed.aspx?catid=21"));
                categories.add(new NewsCategory("महाराष्ट्र", "http://www.haribhoomi.com/rss/feed.aspx?catid=20"));
                categories.add(new NewsCategory("बिहार", "http://www.haribhoomi.com/rss/feed.aspx?catid=22"));
                categories.add(new NewsCategory("मध्य प्रदेश", "http://www.haribhoomi.com/rss/feed.aspx?catid=33"));
                categories.add(new NewsCategory("गुजरात", "http://www.haribhoomi.com/rss/feed.aspx?catid=34"));
                categories.add(new NewsCategory("राजस्थान", "http://www.haribhoomi.com/rss/feed.aspx?catid=121"));
                categories.add(new NewsCategory("उत्तराखंड", "http://www.haribhoomi.com/rss/feed.aspx?catid=190"));
                categories.add(new NewsCategory("जम्मू एंड कश्मीर", "http://www.haribhoomi.com/rss/feed.aspx?catid=35"));
                categories.add(new NewsCategory("चंडीगढ़", "http://www.haribhoomi.com/rss/feed.aspx?catid=124"));
                break;
            case NewsPaper.NP_NDTV:
                categories.add(new NewsCategory("ताज़ातरीन", "http://feeds.feedburner.com/ndtvkhabar"));
                categories.add(new NewsCategory("देश से", "http://feeds.feedburner.com/Khabar-India"));
                categories.add(new NewsCategory("दुनिया से", "http://feeds.feedburner.com/Khabar-World"));
                categories.add(new NewsCategory("क्रिकेट", "http://feeds.feedburner.com/Khabar-Cricket"));
                categories.add(new NewsCategory("खेल", "http://feeds.feedburner.com/Khabar-Sports"));
                categories.add(new NewsCategory("बिज़नेस", "http://feeds.feedburner.com/Khabar-Business"));
                categories.add(new NewsCategory("फिल्मी है", "http://feeds.feedburner.com/Khabar-Movies"));
                categories.add(new NewsCategory("ज़रा हटके", "http://feeds.feedburner.com/Khabar-zara-hatke"));
                categories.add(new NewsCategory("बड़ी ख़बर", "http://feeds.feedburner.com/NDTVKhabarTopstories"));
                break;
            case NewsPaper.NP_ABP_NEWS:
                categories.add(new NewsCategory("ताज़ा खबर", "http://abpnews.abplive.in/?widgetName=rssfeed&widgetContentId=102536&getXmlFeed=true"));
                break;

        }
        return categories;
    }


}
