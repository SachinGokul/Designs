import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.SwagDemo.PageActions.LoginActionsPage;
import com.SwagDemo.Startup.BaseTest;

public class TestCase_No1 extends BaseTest{
	Logger log = Logger.getLogger(TestCase_No1.class);
	
	@Test
	public void Login()
	{
		LoginActionsPage loginActionsPage = new LoginActionsPage();
		loginActionsPage.LoginActivites();
		
	}
	
	
	@Test
	public void TestCase2()
	{
		log.info("The TestCase2 succeed");
	}
	@Test
	public void TestCase3()
	{
		log.info("The TestCase3 succeed");
	}
	@Test
	public void TestCase4()
	{
		log.info("The TestCase4 succeed");
	}

}


