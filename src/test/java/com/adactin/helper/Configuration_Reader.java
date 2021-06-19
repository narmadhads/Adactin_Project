package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
public static Properties p;
public Configuration_Reader() throws Throwable {
	
File f= new File("C:\\Users\\Sony\\eclipse-workspace\\AdactinProj\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
FileInputStream fis= new FileInputStream(f);
p=new Properties();
p.load(fis);
}

public String get_Cnum() {
String ccn = p.getProperty("ccnumber");
return ccn;
}

public String get_Emon() {
	String emon = p.getProperty("expmonth");
	return emon;
}

public String get_Eyear() {
	String eyear = p.getProperty("expyear");
	return eyear;
}

public String get_Cvv() {
	String cvv = p.getProperty("cvv");
	return cvv;
}

}
