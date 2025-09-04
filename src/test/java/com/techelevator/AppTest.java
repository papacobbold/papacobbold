package com.techelevator;

import com.techelevator.tests.FirstTest;
import org.testng.annotations.Test;


public class AppTest {

    @Test
    public void runAllPlaywrightTests() {
        // Call your Playwright test(s)
        FirstTest.verifyTest();

        // Later you can add multiple calls here or orchestrate them
        // Example:
        // LoginPageTest.runTest();
        // CheckoutPageTest.runTest();
    }
}