package designpattern.factory.example.search.impl;

import designpattern.factory.example.search.dto.SearchForm;
import designpattern.factory.example.search.dto.SearchResponse;

public class StandardSearch extends AbstractSearch{

	@Override
	public SearchResponse search(SearchForm input) {
		System.out.println("Performing standard search...");
		return null;
	}

}
