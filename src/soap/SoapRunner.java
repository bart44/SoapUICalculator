package soap;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.iface.Submit.Status;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class SoapRunner {

	@Test
	public void add() throws XmlException, IOException, SoapUIException {
		// grab project
		WsdlProject proj = new WsdlProject("C:\\Users\\Bartek\\Documents\\calculator-soapui-project.xml");
		// grab testsuite from project
		WsdlTestSuite testSuite = proj.getTestSuiteByName("Testing");

		WsdlTestCase testCase = testSuite.getTestCaseByName("Add");
		TestRunner runner = testCase.run(new PropertiesMap(), false);
		Assert.assertEquals(String.valueOf(Status.FINISHED), String.valueOf(runner.getStatus()));

	}

	@Test
	public void subAndDiv() throws XmlException, IOException, SoapUIException {
		// grab project
		WsdlProject proj = new WsdlProject("C:\\Users\\Bartek\\Documents\\calculator-soapui-project.xml");
		// grab testsuite from project
		WsdlTestSuite testSuite = proj.getTestSuiteByName("Testing");

		WsdlTestCase testCase = testSuite.getTestCaseByName("Substract&Div");
		TestRunner runner = testCase.run(new PropertiesMap(), false);
		Assert.assertEquals(String.valueOf(Status.FINISHED), String.valueOf(runner.getStatus()));

	}
	
	@Test
	public void divide() throws XmlException, IOException, SoapUIException {
		// grab project
		WsdlProject proj = new WsdlProject("C:\\Users\\Bartek\\Documents\\calculator-soapui-project.xml");
		// grab testsuite from project
		WsdlTestSuite testSuite = proj.getTestSuiteByName("Testing");

		WsdlTestCase testCase = testSuite.getTestCaseByName("Divide");
		TestRunner runner = testCase.run(new PropertiesMap(), false);
		Assert.assertEquals(String.valueOf(Status.FINISHED), String.valueOf(runner.getStatus()));

	}
	
	@Test
	public void multiply() throws XmlException, IOException, SoapUIException {
		// grab project
		WsdlProject proj = new WsdlProject("C:\\Users\\Bartek\\Documents\\calculator-soapui-project.xml");
		// grab testsuite from project
		WsdlTestSuite testSuite = proj.getTestSuiteByName("Testing");

		WsdlTestCase testCase = testSuite.getTestCaseByName("Multiply");
		TestRunner runner = testCase.run(new PropertiesMap(), false);
		Assert.assertEquals(String.valueOf(Status.FINISHED), String.valueOf(runner.getStatus()));

	}
	
}
