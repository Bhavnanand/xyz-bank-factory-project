package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement CustomerLogin;
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;
    //By CustomerLogin =By.xpath("//button[contains(text(),'Customer Login')]");
   // By bankManagerLogin =By.xpath("//button[contains(text(),'Bank Manager Login')]");
    public void clickOnCustomerLogintab(){
        clickOnElement(CustomerLogin);
    }
    public void clickOnBankManagerLoginTab(){
        clickOnElement(bankManagerLogin);
    }
}
