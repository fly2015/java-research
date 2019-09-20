package designpattern.factory.example.search.validation.strategies;

import designpattern.factory.example.search.dto.SearchForm;

public class StandardSearchValidationStrategy implements ISearchValidationStrategy
{
	public void validate(SearchForm searchForm) {
		System.out.println("Validating the search with standard...");
		
	}
}
