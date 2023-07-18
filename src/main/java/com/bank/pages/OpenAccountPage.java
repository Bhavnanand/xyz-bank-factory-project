package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OpenAccountPage extends Utility {
    By Customer= By.xpath("//select[@id='userSelect']");
    By Currency=By.xpath("//select[@id='currency']");
    By Process =By.xpath("//button[contains(text(),'Process')]");
    public  void findCustomer(String  name) {
        selectByVisibleTextFromDropDown(Customer,name);
    }
    public void findCurrency(String currency){
        selectByValueFromDropDown(Currency,currency);}
        public void ClickOnProcess(){clickOnElement(Process);
    }
    public void handlePopUp(){
        String popUp= getTextFromAlert();
        switchToAlert();
        acceptAlert();
    }
    public void verifyMessage(){
        Assert.assertEquals("Account created successfully with account Number :1016",getTextFromAlert());
    }
}
