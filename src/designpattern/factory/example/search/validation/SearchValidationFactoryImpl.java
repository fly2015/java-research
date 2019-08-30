package designpattern.factory.example.search.validation;

import java.util.HashMap;
import java.util.Map;


import designpattern.factory.example.search.util.SearchType;
import designpattern.factory.example.search.validation.impl.AbstractSearchValidationStrategy;
import designpattern.factory.example.search.validation.impl.IdentifierSearchValidation;
import designpattern.factory.example.search.validation.impl.PhoneSeachValidation;
import designpattern.factory.example.search.validation.impl.StandardSearchValidation;

public class SearchValidationFactoryImpl implements ISearchValidationFactory {
	static Map<SearchType, AbstractSearchValidationStrategy> searchValidationStrategies = new HashMap<SearchType, AbstractSearchValidationStrategy>();

	static {
		searchValidationStrategies.put(SearchType.STANDARD_SEARCH, new StandardSearchValidation());
		searchValidationStrategies.put(SearchType.PHONE_SEARCH, new PhoneSeachValidation());
		searchValidationStrategies.put(SearchType.IDENTIFIER_SEARCH, new IdentifierSearchValidation());
	}

	public AbstractSearchValidationStrategy createSearchValidationStrategy(SearchType searchType) {
		return searchValidationStrategies.get(searchType);
	}
}
