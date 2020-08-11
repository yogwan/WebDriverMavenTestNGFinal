package listenerTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {

@Test
public void doLogin() {


System.out.println("Capture Screenshot");

Assert.fail("Failing the Login Test");
	
}

}
