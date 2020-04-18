package com.fcs.ecdb.config;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fcs.ecdb.constant.ApplicationProperties;

public class DriverConfig {

	public WebDriver loadDriver() throws IOException {        
        System.setProperty(ApplicationProperties.INSTANCE.getProperties().getProperty("driver"),ApplicationProperties.INSTANCE.getProperties().getProperty("driverPath"));
        WebDriver driver = new ChromeDriver();
        return driver;
	}
}
