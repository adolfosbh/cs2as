package uk.ac.york.cs.cs2as.metrics;

import static org.junit.Assert.*;

import java.net.URISyntaxException;

import org.junit.Test;

public class WordsCounterTester {

	private String BASE_PATH = "uk/ac/york/cs/cs2as/metrics/testfiles/";
	
	private int countFile(String filePath) {
		
		try {
			WordsCounter wc = new WordsCounter("--","/*","*/");
			return wc.countFile(getClass().
					getClassLoader().
					getResource(BASE_PATH + filePath).toURI());
		} catch (URISyntaxException e) {
			fail(e.getMessage());
			return 0;
		}
	}
	
	@Test
	public void test1()  {
		assertEquals(4, countFile("test1.txt"));
	}
	
	@Test
	public void test2()  {
		assertEquals(6, countFile("test2.txt"));
	}
	
	@Test
	public void test3()  {
		assertEquals(9, countFile("test3.txt"));
	}

	@Test
	public void test4()  {
		assertEquals(5, countFile("test4.txt"));
	}
	
	@Test
	public void test5()  {
		assertEquals(3, countFile("test5.txt"));
	}

}
