package designpattern.factory.example.search.impl;

import designpattern.factory.example.search.dto.SearchForm;
import designpattern.factory.example.search.dto.SearchResponse;
import designpattern.factory.example.search.validation.strategies.ISearchValidationStrategy;

public abstract class AbstractSearch {
	private ISearchValidationStrategy validationStrategy;

	public void setValidationStrategy(ISearchValidationStrategy validationStrategy) {
		this.validationStrategy = validationStrategy;
	}

	public abstract SearchResponse search(SearchForm input);

	public void validation(SearchForm input) {
		validationStrategy.validate(input);
	}
}
