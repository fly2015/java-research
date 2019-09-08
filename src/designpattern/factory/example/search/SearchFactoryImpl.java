package designpattern.factory.example.search;

import java.util.HashMap;
import java.util.Map;

import designpattern.factory.example.search.impl.AbstractSearch;
import designpattern.factory.example.search.impl.IdentifierSearch;
import designpattern.factory.example.search.impl.PhoneSearch;
import designpattern.factory.example.search.impl.StandardSearch;
import designpattern.factory.example.search.util.SearchType;
import designpattern.factory.example.search.validation.strategies.IdentifierSearchValidationStrategy;
import designpattern.factory.example.search.validation.strategies.PhoneSeachValidationStrategy;
import designpattern.factory.example.search.validation.strategies.StandardSearchValidationStrategy;

public class SearchFactoryImpl implements ISearchFactory{
	static Map<SearchType, AbstractSearch> searchStrategies = new HashMap<SearchType, AbstractSearch>();
	
	static {
		StandardSearch standardSearch = new StandardSearch();
		standardSearch.setValidationStrategy(new StandardSearchValidationStrategy());
		
		PhoneSearch phoneSearch = new PhoneSearch();
		phoneSearch.setValidationStrategy(new PhoneSeachValidationStrategy());
		
		IdentifierSearch identifierSearch = new IdentifierSearch();
		identifierSearch.setValidationStrategy(new IdentifierSearchValidationStrategy());
		
		searchStrategies.put(SearchType.STANDARD_SEARCH, standardSearch);
		searchStrategies.put(SearchType.PHONE_SEARCH, phoneSearch);
		searchStrategies.put(SearchType.IDENTIFIER_SEARCH, identifierSearch);
	}
	
	public AbstractSearch createSearchStrategy(SearchType searchType) {
		// TODO Auto-generated method stub
		return searchStrategies.get(searchType);
	}

}
