package com.techelevator.pages;

import com.microsoft.playwright.Page;

public class HomePage {
    private final Page page;
    private final String timeLink = "//span[text()='Time']";

    public HomePage(Page page){
        this.page = page;
    }

    public void clickTimelink(){
        page.locator(timeLink).click();
    }
}
