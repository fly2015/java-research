package designpattern.factory.example.search.impl;

import designpattern.factory.example.search.dto.SearchForm;
import designpattern.factory.example.search.dto.SearchResponse;

public class IdentifierSearch extends AbstractSearch{

	@Override
	public SearchResponse search(SearchForm input) {
		System.out.println("Performing search with identifier...");
		return new SearchResponse();
	}

}
