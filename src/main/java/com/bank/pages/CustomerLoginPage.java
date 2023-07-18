package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CustomerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='fontBig ng-binding']")
    WebElement displayedName;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOut;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement youName;

    //String  Fullname;
   // By YourName= By.xpath("//select[@id='userSelect']");
   // By SearchCustomer= By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]");
    //By loginbutton =By.xpath("//button[contains(text(),'Login')]");
    //By DisplayedName=By.xpath("//span[@class='fontBig ng-binding']");
   // By logOut =By.xpath("//button[contains(text(),'Logout')]");
    public void selectnameFromList(String  name) {
        selectByValueFromDropDown(youName,name);
    }
    public void loginclick(){
        clickOnElement(loginButton);
    }
    public void VerifyLogout(){
        String actual =getTextFromElement(logOut);
        Assert.assertEquals(actual,"Logout");
    }
    public void VerifyName(){
        String name=getTextFromElement(displayedName);

    }
    public void clickOnLogOut(){
        clickOnElement(logOut);
    }

}
