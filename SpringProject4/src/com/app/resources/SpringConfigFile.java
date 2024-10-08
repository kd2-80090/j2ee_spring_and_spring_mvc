package com.app.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.app.beans")
//@ComponentScan({"com.app.beans"})
@ComponentScan(basePackages = {"com.app.beans"})
public class SpringConfigFile {

	
}
