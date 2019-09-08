package designpattern.factory.example.search;

import org.junit.*;

import designpattern.factory.example.search.dto.SearchForm;
import designpattern.factory.example.search.impl.AbstractSearch;
import designpattern.factory.example.search.impl.IdentifierSearch;
import designpattern.factory.example.search.impl.PhoneSearch;
import designpattern.factory.example.search.impl.StandardSearch;
import designpattern.factory.example.search.util.SearchHelper;
import designpattern.factory.example.search.util.SearchType;
import designpattern.factory.example.search.validation.ISearchValidationFactory;
import designpattern.factory.example.search.validation.SearchValidationFactoryImpl;
import designpattern.factory.example.search.validation.strategies.ISearchValidationStrategy;
import designpattern.factory.example.search.validation.strategies.IdentifierSearchValidationStrategy;
import designpattern.factory.example.search.validation.strategies.PhoneSeachValidationStrategy;
import designpattern.factory.example.search.validation.strategies.StandardSearchValidationStrategy;

public class SearchTest {
	@Test
	public void testSearchFactory()
	{
		ISearchValidationFactory searchValidationFactory = new SearchValidationFactoryImpl();
		ISearchFactory searchFactory = new SearchFactoryImpl();
		
		// Identifier Search input
		SearchForm input1 = new SearchForm();
		input1.setId("9999999");
		input1.setName("Input 1");
		
		SearchType searchType1 = SearchHelper.getInstance().determineSearchType(input1);
		ISearchValidationStrategy searchValidationStrategy1 = searchValidationFactory.createSearchValidationStrategy(searchType1);
		Assert.assertTrue(searchValidationStrategy1 instanceof IdentifierSearchValidationStrategy);
		
		AbstractSearch searchStrategy1 = searchFactory.createSearchStrategy(searchType1);
		Assert.assertTrue(searchStrategy1 instanceof IdentifierSearch);
		
		
		// Phone Seach
		SearchForm input2 = new SearchForm();
		input2.setName("Input 2");
		input2.setPhone("Phone input 2");
		
		SearchType searchType2 = SearchHelper.getInstance().determineSearchType(input2);
		ISearchValidationStrategy searchValidationStrategy2 = searchValidationFactory.createSearchValidationStrategy(searchType2);
		Assert.assertTrue(searchValidationStrategy2 instanceof PhoneSeachValidationStrategy);
		
		AbstractSearch searchStrategy2 = searchFactory.createSearchStrategy(searchType2);
		Assert.assertTrue(searchStrategy2 instanceof PhoneSearch);
		
		// Standart Search
		SearchForm input3 = new SearchForm();
		input3.setName("input 3");
		
		SearchType searchType3 = SearchHelper.getInstance().determineSearchType(input3);
		ISearchValidationStrategy searchValidationStrategy3 = searchValidationFactory.createSearchValidationStrategy(searchType3);
		Assert.assertTrue(searchValidationStrategy3 instanceof StandardSearchValidationStrategy);
		
		AbstractSearch searchStrategy3 = searchFactory.createSearchStrategy(searchType3);
		Assert.assertTrue(searchStrategy3 instanceof StandardSearch);
	}
}
