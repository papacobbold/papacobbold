package com.techelevator.tests;

import com.techelevator.base.BaseTest;
import com.techelevator.pages.HomePage;
import com.techelevator.pages.LoginPage;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class LoginTest2 extends BaseTest {

    @Test
    public void test1() {
        LoginPage loginpage = new LoginPage(page);
        HomePage homepage = new HomePage(page);

        test.info("Navigating to lofin page");
        page.navigate("https://opensource-demo.orangehrmlive.com/");


        test.info("Adding username");
        loginpage.addUsername("Admin");

        test.info("Adding password");
        loginpage.addPassword("admin123");

        test.info("Clicking login button");
        loginpage.clickLoginButton();
        page.waitForTimeout(3000); // waits 3 seconds

        test.info("Clicking time link");
        homepage.clickTimelink();
    }

    @Test
    public void test2() {
        test.skip("Skipping this test");
        throw new SkipException("Skipping test two");
    }

    @Test
    public void test3() {
        LoginPage loginpage = new LoginPage(page);
        HomePage homepage = new HomePage(page);

        test.info("Navigating to login page");
        page.navigate("https://opensource-demo.orangehrmlive.com/");


        test.info("Adding username");
        loginpage.addUsername("Admin");

        test.info("Adding password");
        loginpage.addPassword("admin1234");

        test.info("Clicking login button");
        loginpage.clickLoginButton();
        page.waitForTimeout(1000); // waits 3 seconds

        test.info("Clicking time link");
        homepage.clickTimelink();

    }
}
