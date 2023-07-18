package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement addCustomer;
    @FindBy(xpath = "d Customer'//button[@ng-class='btnClass2']")
    WebElement openAccount;
    @FindBy(xpath = "/button[@ng-class='btnClass3']")
    WebElement customers ;

  //  By addCustomer = By.xpath("//button[contains(text(),'Add Customer')]");
  //  By openAccount =By.xpath("//button[@ng-class='btnClass2']");
   // By customers =By.xpath("//button[@ng-class='btnClass3']");
    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);

    }
    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
    public void click0nCustomers(String name){
        clickOnElement(customers);

    }
}
