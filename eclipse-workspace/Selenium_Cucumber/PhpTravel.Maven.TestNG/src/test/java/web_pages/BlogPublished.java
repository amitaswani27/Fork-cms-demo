package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonDriver;

public class BlogPublished {
	
WebDriver driver;
	
	public BlogPublished (WebDriver driver)
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
	
	@FindBy(name="publish")
	WebElement Publish;
	
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[1]")
	WebElement GetFirstPublishTitle;
	
	/**
	 * PublishBlog method will get all the required details
	 * It will also publish the blog and verify it in published blog section
	 * 
	 */

	public void PublishBlog() 
	{
		
		String input_Title = CommonDriver.getProperties("InputTitleP");
		String mainContent = CommonDriver.getProperties("MainContentP");
		
		Modules.click();
		
		Blog.click();
			
		AddArticle.click();
	
		inputTitle.sendKeys(input_Title);

		driver.switchTo().frame(iframe);
		
		MainContent.clear();
		
		MainContent.sendKeys(mainContent);
		
		driver.switchTo().defaultContent();
		
		Publish.click();
		
		/**
		 * Below if else method will verify that the blog has been published and is visible in published article section
		 * 
		 */
		
		String MyPublishedBlog = GetFirstPublishTitle.getText();
        System.out.println("My newly added Blog = " + "'"+MyPublishedBlog+ "'");
        
        if (MyPublishedBlog.contentEquals(input_Title)){
            System.out.println("The blog has been published successfully");
        } else {
            System.out.println("The blog has not been published");
        }
			    
	 	}

}
