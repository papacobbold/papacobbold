package com.techelevator.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private final Page page;

    //Locators
    private final String usernameInput = "input[name='username']";
    private final String passwordInput = "input[name='password']";
    private final String loginButton = "button[type='submit']";

    public LoginPage(Page page){
        this.page = page;
    }

    //Page actions
    public void navigate(){
        page.navigate("https://opensource-demo.orangehrmlive.com/");
    }

    public void addUsername(String username){
        page.fill(usernameInput, username);
    }

    public void addPassword(String password){
        page.fill(passwordInput, password);
    }

    public void clickLoginButton(){
        page.click(loginButton);
    }

    public void login(String username, String password){
        page.fill(usernameInput, username);
        page.fill(passwordInput, password);
        page.click(loginButton);
    }
}
