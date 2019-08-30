package designpattern.factory.example.search.validation.impl;

import designpattern.factory.example.search.dto.SearchForm;

public abstract class AbstractSearchValidationStrategy {
	protected abstract boolean validation(SearchForm searchForm);
}
