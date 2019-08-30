package designpattern.factory.example.search.validation;

import designpattern.factory.example.search.util.SearchType;
import designpattern.factory.example.search.validation.impl.AbstractSearchValidationStrategy;

public interface ISearchValidationFactory {
	AbstractSearchValidationStrategy createSearchValidationStrategy(SearchType searchType);
}
