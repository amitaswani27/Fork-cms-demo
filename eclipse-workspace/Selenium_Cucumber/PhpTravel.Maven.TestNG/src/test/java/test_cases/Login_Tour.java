package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import core.Core;
import web_pages.BlogDraft;
import web_pages.BlogPublished;
import web_pages.LoginPage;

/**
 * LoginSuccessfully Class will have all the test cases which is used to perform
 * all the expected steps, on Login, Blog Draft and Blog Published page.
 * 
 * @author Amit Aswani
 * 
 */

public class Login_Tour extends Core{
	
	@Test
	public void Login() 
	{
	LoginPage Login = PageFactory.initElements(driver, LoginPage.class);	
	Login.Login();
	
	BlogDraft BlogDraft = PageFactory.initElements(driver, BlogDraft.class);
	BlogDraft.DraftBlog();
	
	BlogPublished BlogPublished = PageFactory.initElements(driver, BlogPublished.class);
	BlogPublished.PublishBlog();
	
	}
}
