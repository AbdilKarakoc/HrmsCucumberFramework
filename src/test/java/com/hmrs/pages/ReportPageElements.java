package com.hmrs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ReportPageElements extends CommonMethods {
	@FindBy(linkText = "PIM")
	public WebElement PIM;
	@FindBy(id = "search_search")
	public WebElement searchBox;
	@FindBy(className = "searchBtn")
	public WebElement searchBtn;
	@FindBy(className = "reset")
	public WebElement resetBtn;
	@FindBy(id = "btnAdd")
	public WebElement addBtn;
	@FindBy(id = "btnDelete")
	public WebElement deleteBtn;
	@FindBy(xpath = "//table/tbody/tr/td[2]")
	public WebElement ValidSearchResult;
	@FindBy(xpath = "//table.tbody/tr/td")
	public WebElement InValidSearchResult;
	
	public ReportPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
