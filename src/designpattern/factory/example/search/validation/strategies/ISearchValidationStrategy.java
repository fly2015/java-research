package designpattern.factory.example.search.validation.strategies;

import designpattern.factory.example.search.dto.SearchForm;

public interface ISearchValidationStrategy {
	public void validate(SearchForm searchForm);
}
