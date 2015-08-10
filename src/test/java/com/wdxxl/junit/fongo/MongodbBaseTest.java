package com.wdxxl.junit.fongo;

import org.junit.Rule;

import com.github.fakemongo.junit.FongoRule;

public class MongodbBaseTest {
	@Rule
	public FongoRule fongoRule = new FongoRule();
	
}
