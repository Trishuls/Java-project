package com.trishul.AllInOneUsingAnno;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

//use to indicate that it is the configuration file
@Configurable
//auto scans all the @Component in the specified package
@ComponentScan(basePackages = "com.trishul.AllInOneUsingAnno")
public class AppConfig 
{

}
