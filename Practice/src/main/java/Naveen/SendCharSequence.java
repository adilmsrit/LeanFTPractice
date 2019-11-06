package Naveen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendCharSequence {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.hubspot.com/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement email = driver.findElement(By.id("username"));

        //2. Below uses String Builder.
        StringBuilder stringBuilder = new StringBuilder().append("Adil")
                .append(" ").append("StringBuilder");

        //3. Below uses String Buffer.

        StringBuffer stringBuffer = new StringBuffer().append("StringBuffer")
                .append(" ");

        email.sendKeys(stringBuilder, stringBuffer, Keys.TAB);

    }
}
