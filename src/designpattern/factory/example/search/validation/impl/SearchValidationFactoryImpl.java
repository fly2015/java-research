package designpattern.factory.example.search.validation.impl;

import designpattern.factory.example.search.dto.SearchForm;
import designpattern.factory.example.search.validation.AbstractSearchValidationStrategy;
import designpattern.factory.example.search.validation.ISearchValidationFactory;

public class SearchValidationFactoryImpl implements ISearchValidationFactory{
	
	@Override
	public AbstractSearchValidationStrategy createSearchStrategy(SearchForm searchForm) {
		return null;
	}

}
