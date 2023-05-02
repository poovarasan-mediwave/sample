package com.Lip_Global;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();

		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}

	public static void getDrive(String n) {
		driver.get(n);

	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void wait(int num) {

		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);

	}

	public static void enterText(WebElement element, String name) {
		element.sendKeys(name);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public String gettText(WebElement b) {
		String text = b.getText();
		return text;
	}

	public void screenShot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),
				new File(System.getProperty("user.dir") + "\\screenshot\\" + path + ".png"));
	}

	public boolean displayedMethod(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public void sleep(int num) throws InterruptedException {

		Thread.sleep(num);
	}

	public static void screenshotPage(String screenshot) throws IOException {

		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG",
				new File(System.getProperty("user.dir") + "\\screenshot\\" + screenshot + ".png"));

	}

	public static void selectbyindox(WebElement element, int num) {

		Select se = new Select(element);
		se.selectByIndex(num);

	}

	public static void selectbyvalue(WebElement element, String num) {

		Select se = new Select(element);
		se.selectByValue(num);

	}

	public static void selectbyVissibleText(WebElement element, String num) {

		Select se = new Select(element);
		se.selectByVisibleText(num);

	}

	public static void browserqu() {

		driver.quit();
	}

	public static void jsScrollDownElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void jsScrollUpElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

}
