package com.techelevator.utils;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
    public static String takeScreenshot(Page page, String testName){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String path = "/Users/joecobbold/workspace/Alumni/Playwright/playwright-tests/test-output/screenshots/" +testName + "_" + timeStamp + ".png";
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));

        return path;
    }
}
