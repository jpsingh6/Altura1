package com.report;

import java.awt.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class MyReporterListenerAdapter  implements IReporter {
	
		public void generateReport(List xml, List suites, String outdir) {}

		@Override
		public void generateReport(java.util.List<XmlSuite> xmlSuites,
				java.util.List<ISuite> suites, String outputDirectory) {
			// TODO Auto-generated method stub
			
		}
	
}
