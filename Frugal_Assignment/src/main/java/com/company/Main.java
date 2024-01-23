package com.company;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\KIIT\\Downloads\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.makemytrip.com/railways/";
        String origin = "Delhi";
        String destination = "Lucknow";
        String date = "Mon May 20 2024";
        String AC = "3A";

        webpage.getWebPage(url, driver);
        helper.originCity(origin, driver);
        helper.destinationCity(destination, driver);
        helper.date(date, driver);
        helper.Class(AC, driver);
        helper.searchButton(driver); 
        driver.close();
    }
}