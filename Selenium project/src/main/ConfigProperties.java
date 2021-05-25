package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	public String getProprty(String property) throws IOException{
		File file=new File("E:\\Arundhati\\selenium");
		FileInputStream inputFile=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(inputFile);
	return prop.getProperty(property);

}
}
