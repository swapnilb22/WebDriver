package scripts.resources;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Propi_Login_Test {
	Propi_Login agentLogin;
	@Before
	public void setUp() throws Exception {
		agentLogin = new Propi_Login();
		agentLogin.get();
	}

	
	@After
	public void tearDown() throws Exception {
	
	}

	
	@Test
	public void Propi_Login_Test() {
	agentLogin.login("abhishekyadav@benchmarkitsolutions.com","abhi2018$$");	
//	assertEquals("Propi - Anti Money Laundering", 
	
	}
	}


