package com.moonshot.de.crawler;

public class Spider {

	public void search(String url, String searchWord)
	{
		String currentUrl = url;
        SpiderLeg leg = new SpiderLeg();
        
        
        leg.crawl(currentUrl);
        boolean success = leg.searchForWord(searchWord);
        if(success)
        {
            System.out.println(String.format("**Success** Word %s found at %s", searchWord, currentUrl));
        }
	}

}
