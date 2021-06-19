package com.AdactinProj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BaseClass {
public static WebDriver driver;

//browser ->Property setting, driver, maximize
public static WebDriver browserLaunch(String browser) {
try {
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\AdactinProj\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("gecko", "");
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("Invalid Browser");
	}
}
 catch (Exception e) {
}
driver.manage().window().maximize();
return driver;
}
//click
public static void clickOnElement(WebElement element) {

	try {
		element.click();	
	} catch (Exception e) {
	}
}

//sendkeys
public static void enterValues(WebElement ele, String str) {
try {
	ele.sendKeys(str);	
} catch (Exception e) {
}

}

//select

public static void dropdown1(WebElement ele, String s1) {
try {
	Select sel=new Select(ele);
	sel.selectByValue(s1);
}catch(Exception e) {}
}

public static void dropdown2(WebElement ele, String s1) {
try {
	Select sel=new Select(ele);
	sel.selectByIndex(Integer.parseInt(s1));
}catch(Exception e) {}
}	

public static void dropdown3(WebElement ele, String s1) {
try {
	Select sel=new Select(ele);
	sel.selectByValue(s1);
}catch(Exception e) {}
}	



//implicitwait

public static void implicitWait(long a) {
try {
	driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);	
} catch (Exception e) {
}

}

//explicitwait
public static void explicitWait(WebElement ele, long a) {
try {
	WebDriverWait wait=new WebDriverWait(driver,a);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	
} catch (Exception e) {
}
}

//TakeScreenshot
public static void screenshot(String str) throws IOException {
try {
	TakesScreenshot ts=(TakesScreenshot) driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File(str);
FileUtils.copyFile(src, dest);	
} catch (Exception e) {
}

}


//robot
public static void robotAction(WebElement we, int a) throws AWTException {
try {
	Actions act=new Actions(driver);
act.contextClick(we).perform();
Robot rob=new Robot();
for (int i = 0; i < a; i++) {
rob.keyPress(KeyEvent.VK_DOWN);
rob.keyRelease(KeyEvent.VK_DOWN);
rob.keyPress(KeyEvent.VK_ENTER);
rob.keyRelease(KeyEvent.VK_ENTER);

}
	
} catch (Exception e) {
}
}
//scroll
public static void jsScroll1(WebElement ele, String str) {
try {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
if (str.equalsIgnoreCase("click")) {
	jse.executeScript("arguments[0].click();", ele);
}
else if (str.equalsIgnoreCase("Scroll")) {
	jse.executeScript("arguments[0].scrollIntoView();", ele);
}
	
} catch (Exception e) {
}
}
public static void jsScroll() {
try {
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,500);");
	
} catch (Exception e) {
}
}



//close
public static void closecurrentpage() {
try {
	driver.close();	
} catch (Exception e) {
}

}

//quit
public static void quit() {
	try {
		driver.quit();		
	} catch (Exception e) {
	}

}

//Alert
public static void alerts1(String str) {
try {
	if (str.equalsIgnoreCase("accept")) {
		Alert alert=driver.switchTo().alert();
		alert.accept();	
	}
	else if (str.equalsIgnoreCase("dismiss")) {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	else {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(str);
		alert.accept();
	}
	
} catch (Exception e) {
}
}

//Frames
public static void frames(WebElement element) {
try {
	driver.switchTo().frame(element);	
} catch (Exception e) {
}

}

//Actions Class
public static void actions(WebElement element, String s) {
	try {
		Actions act=new Actions(driver);
		if (s.equalsIgnoreCase("mouseover")) {
			act.moveToElement(element).perform();
		}
		else if (s.equalsIgnoreCase("rightclick")) {
			act.contextClick(element).perform();
		}
		else if (s.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).perform();
		}
		else {
			System.out.println("Invalid");
		}
		
	} catch (Exception e) {
	}
}
public static void dragdrop(WebElement ele1, WebElement ele2) {
try {
	Actions act=new Actions(driver);
	act.dragAndDrop(ele1, ele2).perform();
	
} catch (Exception e) {
}
}

public static void checkBox(WebElement ele) {
try {
	ele.click();	
} catch (Exception e) {
}

}

//isEnabled, isSelected, isDisplayed
public static void displayed(WebElement ele) {
	try {
		ele.click();
		boolean displayed = ele.isDisplayed();
		System.out.println(displayed);		
	} catch (Exception e) {
	}

}

public static void selected(WebElement ele) {
try {
	ele.click();
	boolean selected = ele.isSelected();
	System.out.println(selected);
} catch (Exception e) {
}
}

//isEnabled
public static void enabled(WebElement ele) {
try {
	ele.click();
	boolean enabled = ele.isEnabled();
	System.out.println(enabled);
} catch (Exception e) {
}
}

//Select Class
public static void isMultiples(WebElement ele) {
try {
	Select s=new Select(ele);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);

} catch (Exception e) {
}
}

//getOptions
public static void getopt(WebElement ele) {
try {
	Select s1= new Select(ele);
	List<WebElement> options = s1.getOptions();
	for (WebElement webElement : options) {
		System.out.println(webElement.getText());

}
}catch (Exception e) {
}	

}

//getAllselected
public static void getAll(WebElement ele, String str) {
try {
	Select s1= new Select(ele);
	s1.selectByValue(str);
	List<WebElement> options = s1.getAllSelectedOptions();
	for (WebElement webElement : options) {
		System.out.println(webElement.getText());
	
	}
} catch (Exception e) {
}
	
}

//getFirstSelected
public static void getsFirst(WebElement ele) {
try {
	Select s2=new Select(ele);
	WebElement firstSelectedOption = s2.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());

} catch (Exception e) {
}
}


//get 
public static void gets(String url) {
try {
	driver.get(url);
} catch (Exception e) {
	// TODO: handle exception
}
	
}

//get Url
public static void getUrl() {
try {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
} catch (Exception e) {
}
}

//getTitle
public static void getTitlee() {
try {
	String title = driver.getTitle();
	System.out.println(title);
} catch (Exception e) {
}
}

//getText
public static void getsText(WebElement ele) {
try {
	String text = ele.getText();
	System.out.println(text);
} catch (Exception e) {
}
}

//getAttribute
public static void getsAttribute(WebElement ele, String str) {
try {
	String attribute = ele.getAttribute(str);
	System.out.println(attribute);
} catch (Exception e) {
}
}

//navigate
public static void navigate(String str) {
try {
	if (str.equalsIgnoreCase("to")) {
		driver.navigate().to(str);	
	}
	else if (str.equalsIgnoreCase("back")) {
			driver.navigate().back();		
	}
else if (str.equalsIgnoreCase("forward")) {
	driver.navigate().forward();	
}
else {
	driver.navigate().refresh();
}
} catch (Exception e) {
}

	}
}




