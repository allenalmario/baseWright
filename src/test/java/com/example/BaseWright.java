package com.example;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseWright {

    @Test
    public void scriptTest() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
        Page page = browser.newPage();
        page.navigate("http://playwright.dev");
        Assertions.assertEquals("Fast and reliable end-to-end testing for modern web apps | Playwright", page.title());
    }

}
