package designpattern.factory.example.search;

import org.junit.*;

import designpattern.factory.example.search.dto.SearchForm;
import designpattern.factory.example.search.impl.AbstractSearch;
import designpattern.factory.example.search.impl.IdentifierSearch;
import designpattern.factory.example.search.impl.PhoneSearch;
import designpattern.factory.example.search.impl.StandardSearch;
import designpattern.factory.example.search.util.SearchHelper;
import designpattern.factory.example.search.util.SearchType;

public class SearchTest {
	@Test
	public void testSearchFactory()
	{
		ISearchFactory searchFactory = new SearchFactoryImpl();
		
		// Identifier Search input
		SearchForm input1 = new SearchForm();
		input1.setId("9999999");
		input1.setName("Input 1");

		SearchType searchType1 = SearchHelper.getInstance().determineSearchType(input1);
		AbstractSearch searchStrategy1 = searchFactory.createSearchStrategy(searchType1);
		Assert.assertTrue(searchStrategy1 instanceof IdentifierSearch);
		searchStrategy1.validation(input1);
		searchStrategy1.search(input1);
		
		// Phone Seach
		SearchForm input2 = new SearchForm();
		input2.setName("Input 2");
		input2.setPhone("Phone input 2");
		
		SearchType searchType2 = SearchHelper.getInstance().determineSearchType(input2);
		AbstractSearch searchStrategy2 = searchFactory.createSearchStrategy(searchType2);
		Assert.assertTrue(searchStrategy2 instanceof PhoneSearch);
		searchStrategy2.validation(input2);
		searchStrategy2.search(input2);
		
		// Standart Search
		SearchForm input3 = new SearchForm();
		input3.setName("input 3");
		
		SearchType searchType3 = SearchHelper.getInstance().determineSearchType(input3);
		AbstractSearch searchStrategy3 = searchFactory.createSearchStrategy(searchType3);
		Assert.assertTrue(searchStrategy3 instanceof StandardSearch);
		searchStrategy3.validation(input3);
		searchStrategy3.search(input3);
	}
}
