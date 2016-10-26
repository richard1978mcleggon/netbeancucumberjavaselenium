/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author U021169
 */
public class LehmanCollegeHomepage {

    @FindBy(how = How.LINK_TEXT, using = "ACADEMICS")
    public static WebElement academics;

    @FindBy(how = How.LINK_TEXT, using = "PARTNERSHIPS")
    public static WebElement partnerships;
}
