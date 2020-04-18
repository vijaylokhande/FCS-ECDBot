package com.fcs.ecdb.constant;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum ApplicationProperties {
	    INSTANCE;
	    private final Properties properties;
	    
	    ApplicationProperties() {
	        properties = new Properties();
	        try {
	            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
	        } catch (IOException e) {
	            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
	        }
	    }
	    
	    public final Properties getProperties() {
	    	return properties;
	    }

	    
}
