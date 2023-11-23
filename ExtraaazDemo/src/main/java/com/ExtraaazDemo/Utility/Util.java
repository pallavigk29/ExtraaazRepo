package com.ExtraaazDemo.Utility;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.ExtraaazDemo.testBase.TestBase;
public class Util extends TestBase{
	
	public static void takeScreenshotOfWebpage(String filename)
	{
		String path = "C:\\Users\\Ganesh Kulkarni\\Desktop\\Git and GitHub\\ExtraaazRepo\\ExtraaazDemo\\ScreenShot\\";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path + filename + System.currentTimeMillis()+".png");
		try 
		{
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}