package designpattern.factory.example.search.util;

import org.apache.commons.lang3.StringUtils;

import designpattern.factory.example.search.dto.SearchForm;

public final class SearchHelper {
	private static SearchHelper INSTANCE;
	
	private SearchHelper() {

	}

	public static SearchHelper getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SearchHelper();
		}

		return INSTANCE;
	}
	
	public SearchType determineSearchType(SearchForm searchForm) {
		if (StringUtils.isNotEmpty(searchForm.getId())) 
		{
			return SearchType.IDENTIFIER_SEARCH;
		}
		else if (StringUtils.isNotEmpty(searchForm.getPhone())) 
		{
			return SearchType.PHONE_SEARCH;
		} 
		else 
		{
			return SearchType.STANDARD_SEARCH;
		}
	}
}
