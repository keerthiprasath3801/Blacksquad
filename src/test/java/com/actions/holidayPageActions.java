package com.actions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.holidaysPageLocators;
import com.utility.BaseClass;

public class holidayPageActions {
	holidaysPageLocators holidaysLocators = null;
	Actions actions = null;
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(20));
	
	public holidayPageActions() {
		this.holidaysLocators = new holidaysPageLocators();
		PageFactory.initElements(BaseClass.getDriver(), holidaysLocators);
		this.actions = new Actions(BaseClass.getDriver());
	}
	public void setHolidays() {
		
		wait.until(ExpectedConditions.visibilityOf(holidaysLocators.Holidays));
		actions.moveToElement(holidaysLocators.Holidays).perform();
		BaseClass.log.info("User select the holiday tour package");
	}
	public void setEurope()   {
		
//    	wait.until(ExpectedConditions.visibilityOf(holidaysLocators.Europetourpackage));
      	actions.moveToElement(holidaysLocators.Europetourpackage).click().build().perform();
      	BaseClass.log.info("User select a Europe tour package");
      
	}
	public void setDeparture()  {
		wait.until(ExpectedConditions.visibilityOf(holidaysLocators.Departure));
		actions.moveToElement(holidaysLocators.Departure).click().build().perform();
		BaseClass.log.info("User select a departure place");
	}
	public void setDeparturecityChennai() {
		actions.moveToElement(holidaysLocators.Deparutecity).click().build().perform();
		BaseClass.log.info("User confirms their departure city");
	}
	public void setMonthofTravel() {
		wait.until(ExpectedConditions.visibilityOf(holidaysLocators.Monthoftravel));
		actions.moveToElement(holidaysLocators.Monthoftravel).click().build().perform();
		BaseClass.log.info("User select their month of travel");
	}
	public void setMonthFeb() {
		actions.moveToElement(holidaysLocators.Month).click().build().perform();
		BaseClass.log.info("User confirms their month of travel");
	}
	public void setDuration() {
		actions.moveToElement(holidaysLocators.duration).click().build().perform();
		BaseClass.log.info("User select the duration of stay for the travel");
	}
	public void setStayDuration() {
		actions.moveToElement(holidaysLocators.StayDuration).click().build().perform();
		BaseClass.log.info("User confirms their duration of travel");
	}
	public void setPackageType() {
		actions.moveToElement(holidaysLocators.Packagetype).click().build().perform();
		BaseClass.log.info("User select package for travel");
	}
	public void setPackageWithoutFlight() {
		actions.moveToElement(holidaysLocators.packageWithoutFlight).click().build().perform();
		BaseClass.log.info("User confirms their package type");
	}
	public void setTheme() {
		actions.moveToElement(holidaysLocators.Themes).click().build().perform();
		BaseClass.log.info("User select their theme");
	}
	public void setFamilyTheme() {
		actions.moveToElement(holidaysLocators.familytheme).click().build().perform();
		BaseClass.log.info("User select their Theme");
	}
	public void setMarvel() {
////		actions.moveToElement(holidaysLocators.MarvelofGeorgia).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(holidaysLocators.MarvelofGeorgia));
		Assert.assertEquals(holidaysLocators.MarvelofGeorgia.getText(), "Marvels Of Georgia");
		System.out.println("Asserted successfully");
		BaseClass.log.info("User choose their travel locatiion");
	}
}