package designpattern.factory.example.search.validation;

import designpattern.factory.example.search.dto.SearchForm;

public interface ISearchValidationFactory {
	AbstractSearchValidationStrategy createSearchStrategy(SearchForm searchForm);
}
