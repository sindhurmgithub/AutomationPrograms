package ToStoreDataInExternalFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./testResources/testData.properties");
		Properties properties=new Properties();
		
		properties.load(fis);
		//System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("username"));//admin
		System.out.println(properties.getProperty("urll"));//null bcoz urll key not present in testData.properties file
		System.out.println(properties.getProperty("url"));//http:www

	}

}
