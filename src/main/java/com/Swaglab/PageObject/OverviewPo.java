package com.Swaglab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPo {
	@FindBy(xpath="//div[@class='inventory_item_name']")private WebElement OverViewProductName ;
	@FindBy(xpath="//div[@class='inventory_item_price']")private WebElement OverViewProductPrice;
	@FindBy(xpath="//div[@class='summary_subtotal_label']")private WebElement OverViewProductItemTotal;
	@FindBy(xpath="//div[@class='summary_tax_label']")private WebElement OverViewProductTax;
	@FindBy(xpath="//a[text()='FINISH']")private WebElement Finish;
	@FindBy(xpath="//div[@class='summary_total_label']")private WebElement OverViewProductTotalAmount ;


	public OverviewPo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public String getOverViewProductName()
	{ 
		return OverViewProductName.getText();
	}
	public String getOverViewProductPrice()
	{ 
		return OverViewProductPrice.getText();
	}
	public String getItemTotalOfOverViewProductItem()
	{ 
		return OverViewProductItemTotal.getText();
	}
	public String getTaxOfOverViewProductItem()
	{ 
		return OverViewProductTax.getText();
	}
	public String getTotalOfOverViewProductItem()
	{ 
		return OverViewProductTotalAmount.getText();
	}
	public void clickOnFinishButton()
	{
		Finish.click();
	}




}
