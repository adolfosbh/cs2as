package uk.ac.york.cs.cs2as.metrics;

import static org.junit.Assert.*;


import org.junit.Test;

public class WordsCounterTester {

	private String BASE_PATH = "uk/ac/york/cs/cs2as/metrics/testfiles/";
	@Test
	public void test() {
		WordsCounter wc = new WordsCounter("--","/*","*/");
		
		
		try {
			assertEquals(4, wc.countFile(getClass().
					getClassLoader().
					getResource(BASE_PATH + "test1.txt").toURI()));
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}

}
