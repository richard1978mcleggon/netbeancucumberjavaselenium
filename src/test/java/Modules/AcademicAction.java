/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import PageObjects.LehmanCollegeHomepage;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author U021169
 */
public class AcademicAction {

    public static void Execute(WebDriver driver) throws Exception {
        LehmanCollegeHomepage.academics.click();
        Log.info("Click action is perfromed on Academics link");
    }
}
