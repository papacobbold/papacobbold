package com.techelevator.tests;

import com.techelevator.base.BaseTest;
import org.testng.annotations.Test;


public class FirstTest extends BaseTest {

    @Test
    public static void verifyTest(){
        page.navigate("https://google.com");

        //Optional handle cookie pop up
        if(page.isVisible("button:has-text('Accept All')")){
            page.click(("button:has-text('Accept All')"));
        }

        System.out.println("The page title is: " + page.title());
    }


//    @Test
//    public static void runTest() {
//
//        try(Playwright playwright = Playwright.create()){
//            Browser browser = playwright.chromium()
//                    .launch( new BrowserType.LaunchOptions().setHeadless(false));
//            Page page = browser.newPage();
//            page.navigate("https://google.com");
//
//            System.out.println("The page title is: " + page.title());
//            browser.close();
//        }
//    }
}
