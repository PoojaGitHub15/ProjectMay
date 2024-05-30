package testCasesForWritingTestCases;
import org.testng.annotations.Test;
import pageObjectforIdentifyTheWebElelents.BasePage;
import pageObjectforIdentifyTheWebElelents.DashboardPage;
import testBaseForBaseClass.BaseClass;

public class TC_002_OpenNewAccount extends BaseClass{
		
		@Test
		public void NewAccount() throws InterruptedException {
			Thread.sleep(5000);
			DashboardPage dp=new DashboardPage(BasePage.driver);
			dp.click_openaccount();
			logger.info("****Clicked on New Account*****");
			Thread.sleep(5000);
			
			
		}
	}


