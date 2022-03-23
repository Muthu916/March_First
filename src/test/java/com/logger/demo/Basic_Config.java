package com.logger.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Config 
{
	//Factory Design Pattern
	 static Logger log = Logger.getLogger(Basic_Config.class);

	public static void main(String[] args)
	{
		BasicConfigurator.configure();
		
		 log.debug("Debug_Muthu");
		 log.info("Info_Muthu");
		 log.warn("Warner_King of Opening");
		 log.error("Error_King");
		 log.fatal("Fatal_Fatal");
		 
	}
}
