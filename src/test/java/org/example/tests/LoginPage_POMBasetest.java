package org.example.Pages.PageObjectModel;

import org.example.Base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POMBasetest extends CommonToAllPage {
    WebDriver driver;

    public LoginPage_POMBasetest(){
        super();
    }
    By username = By.id("login-username");
    By password = By.id("login-password");
    By Signbutton = By.id("js-login-btn");
    By err_msg = By.id("js-notification-box-msg");


    public String VWOLoginNegative() {

      enterInput(username,"admin");
     enterInput(password,"admin");
      clickElement(Signbutton);
     try {
         Thread.sleep(3000);
     }catch (Exception e){
         e.printStackTrace();
     }
      return driver.findElement(err_msg).getText();


    }


}