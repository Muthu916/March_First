package com.logger.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Config 
{
	static Logger log = Logger.getLogger(Property_Config.class);
	
	public static void main(String[] args) 
	{
		PropertyConfigurator.configure("log4j.properties");
		
		 log.debug("Debug_Muthu");
		 log.info("Info_Muthu");
		 log.warn("Warner_King of Opening");
		 log.error("Error_King");
		 log.fatal("Fatal_Fatal");
		
	}

}
