package sampleTest;

import org.testng.annotations.Test;

public class ReadDataInRuntimeTest {
	
	@Test
	public void readTest()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println(BROWSER);
		System.out.println(URL);
	}
}
