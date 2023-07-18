package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Customers extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourName;
    @FindBy(name = "Transactions")
    WebElement TransactionTag;
    @FindBy(xpath = "//button[@class='btn btn-lg tab'][@ng-click='deposit()']")
    WebElement DepositeTag ;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement DepositeAmount ;
    @FindBy(xpath = "//button[@fdprocessedid='7i745n']")
    WebElement Deposit ;
    @FindBy  (xpath="//button[@fdprocessedid='z5tsfp']")
            WebElement Withdrawal;
    @FindBy  (xpath="//input[@fdprocessedid='0nx7nc']")
    WebElement Withdrawmoney;
    @FindBy  (xpath="//button[@fdprocessedid='mqpwui']")
    WebElement Withdraw;

 //By YourName= By.xpath("//select[@id='userSelect']");
// By Transactiontag= By.name("Transactions");
// By Depositetag =By.xpath("//button[@class='btn btn-lg tab'][@ng-click='deposit()']");
 //By depositAmount= By.xpath("//input[@placeholder='amount']");
// By Deposit =By.xpath("//button[@fdprocessedid='7i745n']");
 //By Withdrawal = By.xpath("//button[@fdprocessedid='z5tsfp']");
 //By Withdrawmoney =By.xpath("//input[@fdprocessedid='0nx7nc']");
 //By Withdraw =By.xpath("//button[@fdprocessedid='mqpwui']");
    public void Findcustomerlist(){
        List<WebElement>customer =driver.findElements(By.tagName("td"));
        for (WebElement customername:
             customer) {
            System.out.println(customername);
        }
    }
    public void SearchCustomer(String name){

        selectByVisibleTextFromDropDown(yourName,name);
    }
    public  void clickOnDepositeTag(){
        clickOnElement(DepositeTag);
    }
    public void EnterAmount(String dmoney){
        sendTextToElement(DepositeAmount,dmoney);
    }
    public void clickOnDeposit(){
        clickOnElement(Deposit);
    }
    public void clickOnWithdrawal(){
        clickOnElement(Withdrawal);
    }
    public  void EnterWithdrawAmount(String wmoney){
        sendTextToElement(Withdrawmoney,wmoney);
    }
    public  void clickOnWithdraw(){
        clickOnElement(Withdraw);
    }


}
