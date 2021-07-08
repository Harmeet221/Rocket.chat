package TestP.TestingP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.junit.Assert; 


public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harmeet\\AppData\\Local\\Programs\\Python\\Python37-32\\Scripts\\chromedriver.exe");
		
		//Step1: Goto URL- http://www.lourencodemonaco.com.br/vvtest/
		driver.get("http://www.lourencodemonaco.com.br/vvtest/"); // opens the url
		driver.manage().window().maximize(); //maximize browser
		Thread.sleep(10000);
		
		
		//Step2: Verify the title whether on the correct page or not
		System.out.println("Page title is : " + driver.getTitle());
		
		String expected ="VV Test – Página de teste da Via Varejo";
		Assert.assertEquals(driver.getTitle(),expected );
		System.out.println("Assertion Passed successfully"); // Title is verified
		
		
		//Step3: Wait for the 20sec for the web elements to get loaded on the web page 
		driver.manage().timeouts().implicitlyWait((20),TimeUnit.SECONDS);
		
		
		//Step4: Find Search - QA element on the page
		WebElement element = driver.findElement(By.xpath("//a[contains(.,'Pesquisa – QA')]"));
		
		
		//Step5: Click on the Select - QA among the menu items
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);// Wait for element before throwing an exception 
		element.click(); //clicking on Search - QA menu
		System.out.println(" Clicked on Search - QA menu ");
		
		
		//Step6: Verify the title of the URL whether on the correct page or not
		System.out.println("Page title is : " + driver.getTitle());
				
		String expected1 ="Pesquisa – QA – VV Test";
		Assert.assertEquals(driver.getTitle(),expected1);
		System.out.println("Assertion Passed successfully"); // Title is verified
	
		
		//Step7: Scroll page to a location and Enter data
		WebElement element1 = driver.findElement(By.name("nf-field-8"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(element1);
		actions1.perform();
		System.out.println(" Page scrolled down");
		
		
		//Get the Web Element corresponding to the Name field (Textfield)
		WebElement name = driver.findElement(By.name("fname"));
		name.sendKeys("Harmeet");
		System.out.println("Enter Name");
		
		
		//Get the Web Element corresponding to the Last Name field (Textfield)
		WebElement LastName = driver.findElement(By.name("lname"));
		LastName.sendKeys("Kour");
		System.out.println("Enter Last Name");
		
		
		//Wait for the web element to be loaded
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);// Wait for element before throwing an exception 
		
		
		//Get the Web Element corresponding to the Email field 
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("harmeetkaur2@gmail.com");
		System.out.println("Enter email address");
			
		
		//Scroll down page
		WebElement element2 = driver.findElement(By.name("nf-field-11"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(element2);
		actions2.perform();
		
		
		//Get the Web Element corresponding to the Confirm Email field 
		WebElement ConfirmEmail = driver.findElement(By.name("nf-field-8"));
		ConfirmEmail.sendKeys("harmeetkaur2@gmail.com");
		System.out.println("Enter confirm email address");
		
		
		//Get the Web Element corresponding to the Phone number field 
		WebElement Phone = driver.findElement(By.name("phone"));
		Phone.sendKeys("8825073388");
		System.out.println(" Enter Phone Number ");
		
		
		//Get the Web Element corresponding to the Age group and check age 18-30
		WebElement Age = driver.findElement(By.xpath("//label[contains(.,'18-30')]"));
		Age.click();
		System.out.println(" Select age group as 18-30");
		
		
		//Get the Web Element and select option from dropdown
		WebElement area = driver.findElement(By.name("nf-field-11"));
		area.click();
		
		
		//Wait for the web element to be loaded
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);// Wait for element before throwing an exception 
		
		WebElement Select_Area = driver.findElement(By.xpath("//option[@value='menos-de-5-anos']"));
		Select_Area.click();
		System.out.println(" Answer question-How long have you been in the QA area? ");
		
		
		//Answer the question 1
		WebElement Question1 = driver.findElement(By.name("nf-field-12"));
		Question1.sendKeys("My power of critical thinking and observation attracted me to this area ");
		System.out.println("Question no. 1 Answered");
		
		//Scroll down page
		WebElement element3 = driver.findElement(By.xpath("//input[@type=\"button\"]"));
		Actions actions3 = new Actions(driver);
		actions3.moveToElement(element3);
		actions3.perform();		
		
		//Wait for the web element to be loaded
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);// Wait for element before throwing an exception 
		
		
		//Get the Web Element corresponding and answer radio type question
		WebElement Radio = driver.findElement(By.xpath("//label[contains(.,'Todas as anteriores')]"));
		Radio.click();
		System.out.println("Answer radio type question");
		
		//Wait for the web element to be loaded
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);// Wait for element before throwing an exception 
		
		
		//Answer the question 2
		WebElement Question2 = driver.findElement(By.name("nf-field-14"));
		Question2.sendKeys("JAVA , Python");
		System.out.println("Answer Question no. 2");
		
		//Wait for the web element to be loaded
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);// Wait for element before throwing an exception 
		
		
		//Answer the question 3
		WebElement Question3 = driver.findElement(By.name("nf-field-15"));
		Question3.sendKeys("My short term career plan is to get recruited in Rocket.Chat and my long term career plan is to be at higher position in the same organisation");
		System.out.println("Answer Question no. 3 ");
		
		//Wait for the web element to be loaded
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);// Wait for element before throwing an exception 
		
		
		//Get the Web Element of submit button
		WebElement Submit = driver.findElement(By.xpath("//input[@value=\"Enviar\"]"));
		Submit.click();
		System.out.println("Form submitted successfully");
		
		
		//Verify form is submitted successfully
		Thread.sleep(5000); //wait for page elements to get loaded
		WebElement SuccessMsg1 = driver.findElement(By.xpath("//p[contains(.,'Your form has been successfully submitted.')]"));
		SuccessMsg1.isDisplayed();
		System.out.println("Verified success message is displayed");
		
		WebElement SuccessMsg2 = driver.findElement(By.xpath("//p[contains(.,'Pesquisa para o profissional da área de Qualidade:')]"));
		SuccessMsg2.isDisplayed();
		System.out.println("Verified success message is displayed");
		
		
		//Verify the title of the page whether on the correct page or not
		System.out.println("Page title is : " + driver.getTitle());
		
		String expected3 ="Pesquisa – QA – VV Test";
		Assert.assertEquals(driver.getTitle(),expected3 );
		System.out.println("Assertion Passed successfully"); // Title is verified
		
	}
	 
	  	 
}


