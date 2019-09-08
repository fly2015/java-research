package designpattern.factory.example.search;

import designpattern.factory.example.search.impl.AbstractSearch;
import designpattern.factory.example.search.util.SearchType;

public interface ISearchFactory {
	public AbstractSearch createSearchStrategy(SearchType searchType);
}
