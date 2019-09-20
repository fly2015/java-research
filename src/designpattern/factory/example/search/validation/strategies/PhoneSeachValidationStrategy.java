package designpattern.factory.example.search.validation.strategies;

import designpattern.factory.example.search.dto.SearchForm;

public class PhoneSeachValidationStrategy implements ISearchValidationStrategy{

	public void validate(SearchForm searchForm) {
		System.out.println("Validating the search with Phone...");
	}

}
