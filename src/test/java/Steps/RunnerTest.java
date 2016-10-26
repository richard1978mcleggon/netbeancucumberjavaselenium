/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steps;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author U021169
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "src/test/java/Features",
        //format = {"pretty", "html:src/test/java/cucumber-html-report"},
        glue = {"Steps"},
        monochrome = true,
        tags = {}
)
public class RunnerTest {

}
