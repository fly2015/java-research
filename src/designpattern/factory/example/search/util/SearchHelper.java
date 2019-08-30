package designpattern.factory.example.search.util;

public final class SearchHelper {
	private static SearchHelper INSTANCE = null;
	
	private SearchHelper()
	{
		
	}
	
	public static SearchHelper getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new SearchHelper();
		}
		
		return INSTANCE;
	}
}
