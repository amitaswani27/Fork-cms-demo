package Web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.CommonDriver;

/**
 * BlogDraft class refers to drafting the blog for the Fork-cms-demo website
 *
 */

public class BlogDraft {
	
	WebDriver driver;
	
	public BlogDraft (WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath = "/html/body/div[5]/div[1]/div[1]/nav/ul/li[4]/a") 
	WebElement Modules;
	
	@FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/nav/ul/li[4]/a")
	WebElement Blog;
	
	@FindBy(xpath = ".//*[@id='content']/div/div[1]/div/div/div[2]/div/div/a")
	WebElement AddArticle;
	
	@FindBy(xpath = ".//*[@id='title']")
	WebElement inputTitle;
	
	@FindBy(tagName = "iframe")
	WebElement iframe;
	
	@FindBy(tagName="body")
	WebElement MainContent;
	
	@FindBy(name="saveAsDraft")
	WebElement SaveDraft;
	
	/**
	 * DraftBlog method will get all the required details
	 * It will also Draft the Blog.
	 * 
	 */

	public void DraftBlog() 
	{
		
		String input_Title = CommonDriver.getProperties("InputTitleD");
		String mainContent = CommonDriver.getProperties("MainContentD");
		
		Modules.click();
		
		Blog.click();
			
		AddArticle.click();
	
		inputTitle.sendKeys(input_Title);

		driver.switchTo().frame(iframe);
		
		MainContent.clear();
		
		MainContent.sendKeys(mainContent);
		
		driver.switchTo().defaultContent();
		
		SaveDraft.click();
		
		System.out.println("Draft has been saved");
		
		}
}
