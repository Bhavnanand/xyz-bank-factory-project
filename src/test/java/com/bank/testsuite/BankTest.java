package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {
    HomePage homePage;
    BankManagerLoginPage  bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    Customers customers;

    @BeforeMethod(alwaysRun = true)
    public void inIt() throws InterruptedException {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        customers = new Customers();

    }
    @Test(groups = {"sanity","regression"})
        public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        // click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        Thread.sleep(700);
        //	click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomer();
        Thread.sleep(700);
        // enter FirstName
       addCustomerPage.addFirstname("Hina");
        // enter LastName
        addCustomerPage.addLastname("Doshi");
        //enter PostCode
        addCustomerPage.addPostCode("sw19 1nr");
        //	click On "Add Customer" Button
        addCustomerPage.finalclickAddCustomer();
        Thread.sleep(700);
        //	popup display//	click on "ok" button on popup.
        addCustomerPage.handlePopUp();
        Thread.sleep(700);
        //	verify message "Customer added successfully"
        addCustomerPage.VerifyMessageFromPoup();
        Thread.sleep(700);
        //	click On "Add Customer" Button
        addCustomerPage.finalclickAddCustomer();
        Thread.sleep(700);
        //	popup display//	click on "ok" button on popup.
        addCustomerPage.handlePopUp();
        Thread.sleep(700);

        //	verify message "Customer added successfully"
        addCustomerPage.VerifyMessageFromPoup();


        Thread.sleep(1000);
        //haandlePopUp();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.findCustomer("Harry Potter");
        openAccountPage.findCurrency("");
        openAccountPage.ClickOnProcess();
        openAccountPage.verifyMessage();
        openAccountPage.handlePopUp();
    }

    @Test(groups = {"smoke","regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        homePage.clickOnCustomerLogintab();
        customerLoginPage.selectnameFromList("Harry Potter");
        customerLoginPage.VerifyLogout();
        customerLoginPage.clickOnLogOut();
        customerLoginPage.VerifyName();
    }

    @Test(groups = {"regression"})

    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLogintab();
        customers.SearchCustomer("Harry Potter");
        Thread.sleep(700);
        customerLoginPage.loginclick();
        customers.clickOnDepositeTag();
        customers.EnterAmount("100");
        customers.clickOnDeposit();
    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLogintab();
        customers.SearchCustomer("Harry Potter");
        customerLoginPage.loginclick();
        customers.clickOnWithdrawal();
        customers.EnterWithdrawAmount("50");
        customers.clickOnWithdraw();
    }

}
