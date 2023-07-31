package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automatepage {
	WebDriver driver;
	
	By resources = By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span");
	By technologies = By.xpath("//*[@id=\"list-item-50\"]/div/div[1]");
	By shopify = By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span");
	By createaleadlist = By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span");
	By technologiesdrop = By.xpath("//input[@placeholder=\"Find a technology\"]");
	By techfield = By.id("input-985");
	By shopifyproductreviews = By.xpath("//*[@id=\"list-item-982-0\"]/div/span");
	
	public Automatepage(WebDriver driver) {
		this.driver = driver;
	}
	public void auto()
	{
		driver.findElement(resources).click();
		driver.findElement(technologies).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(shopify)).click();
		wait.until(ExpectedConditions.elementToBeClickable(createaleadlist)).click();
		wait.until(ExpectedConditions.elementToBeClickable(technologiesdrop)).click();
		
	}
	public void setValues(String value)
	{
		
		driver.findElement(techfield).sendKeys(value);
	}
	public void tech()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(shopifyproductreviews)).click();
	}

}
