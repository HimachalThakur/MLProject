package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JavaProperties {
	
	public static void main(String args[])
	{
	Properties prop=new Properties();
	
	String filename="demo.properties";
	
	try {
		InputStream input =new FileInputStream(filename);
		
		
		//load a poperties file
		
		prop.load(input);
		
		System.out.println(prop.getProperty("bot"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
