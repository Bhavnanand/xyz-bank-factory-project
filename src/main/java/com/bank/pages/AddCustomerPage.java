package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@placeholder='last Name']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;
    @FindBy(xpath = "//button[text()='Add Customer']")
    WebElement addCustomer;
    @FindBy(xpath = "//button[@class='btn btn-default']")/// /body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]
    WebElement endaddcustomer;



   // By firstNameField = By.xpath("//input[@placeholder='First Name']");// //label[contains(text(),'First Name')]");
   // By lastNameField = By.tagName("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
   // By postCode = By.tagName("Post Code :");
   // By addCustomer= By.xpath("//button[text()='Add Customer']");
   // By addcustomerend = By.xpath("//button[@class='btn btn-default']");

   public void addFirstname(String fname) {
       sendTextToElement(firstNameField,fname);
    }
    public void addLastname(String lname){
        sendTextToElement(lastNameField,lname);
    }
    public void addPostCode(String  postcode){
        sendTextToElement(postCode,postcode);
    }

    public void finalclickAddCustomer() {
        clickOnElement(addCustomer);
    }
    public void handlePopUp(){
        switchToAlert();
        acceptAlert();
    }
    public void VerifyMessageFromPoup() {
        String popup = getTextFromAlert();
        Assert.assertEquals(popup, "Customer added successfully with customer id :6");
    }


}
