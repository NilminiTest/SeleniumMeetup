package org.companyname;


import io.appium.java_client.AppiumBy;
import org.companyname.TestUtils.AndroidBaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class eCommerceHybrid extends AndroidBaseTest{

	//Old code
	@Test
	public void FillFormOld() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ruki nilmini");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

	}

	@Test(dataProvider="getData", groups= {"Smoke"})
	public void FillForm(HashMap<String,String> input) throws InterruptedException
	{
		formPage.setNameField(input.get("name"));
		formPage.setGender(input.get("gender"));
		formPage.setCountrySelection(input.get("country"));
		formPage.submitForm();
	}

	@BeforeMethod(alwaysRun=true)
	public void preSetup()
	{
		//This is used when multiple data present to be passed
		//formPage.setActivity();
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		List<HashMap<String, String>>	data =getJsonData(System.getProperty("user.dir")+"//src//test//java//org//rahulshettyacademy//testData//eCommerce.json");

		return new Object[][] { {data.get(0)}  };
	}



}
