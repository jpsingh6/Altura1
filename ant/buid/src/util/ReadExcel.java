package util;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;

public class ReadExcel {
	static File f=new File(".//Datafile//loginandRegistration.xls");
	
	@DataProvider(name="testdata")
	public static Object[][] readExcel() throws BiffException, IOException{
		
		Workbook wb= Workbook.getWorkbook(f);
		Sheet s= wb.getSheet(1);
		int rows=s.getRows();
		int column=s.getColumns();
		String [][]inputdata=new String [rows][column];
		for(int i=0;i<rows;i++)
		{
			for(int j=0; j<column;j++){
				Cell c=s.getCell(j,i);
				inputdata[i][j]=c.getContents();
				System.out.print("  "+inputdata[i][j]);
				
			}
			System.out.println();
		}
		return inputdata;
	
	}
	@DataProvider(name="loginTestdata")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = readExcel1("login");
		return arrayObject;
	}

	///Read Excel
		public static String[][] readExcel1(String SheetName) throws BiffException, IOException
		{
			Workbook wb= Workbook.getWorkbook(f);
			Sheet s= wb.getSheet(SheetName);
			int rows=s.getRows();
			int column=s.getColumns();
			String [][]inputdata=new String [rows-1][column];
			for(int i=1;i<rows;i++)
			{
				for(int j=0; j<column;j++){
					Cell c=s.getCell(j,i);
					inputdata[i-1][j]=c.getContents();
					System.out.print("  "+inputdata[i-1][j]);
					
				}
				System.out.println();
			}
			return inputdata;
		}
		public static void main(String [] arg) 
		{
			
			try {
				System.out.println(readExcel1("login"));
			} catch (BiffException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("what is the message "+e);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e);
			}
		}
		public static String[][] readExcel3(String SheetName) throws BiffException, IOException{ 
			{
				Workbook wb= Workbook.getWorkbook(f);
				
				// TO get the access to the sheet
				Sheet s= wb.getSheet( SheetName);
				
				// To get the number of rows present in sheet
				int rows=s.getRows();
				
				// To get the number of columns present in sheet
				int column=s.getColumns();
				String [][]inputdata=new String [rows-(rows-1)][column];
				for(int i=rows-1;i<rows;i++)
				{
					for(int j=0; j<column;j++){
						
						Cell c=s.getCell(j,i);
						inputdata[i-(rows-1)][j]=c.getContents();
						System.out.print("  "+inputdata[i-(rows-1)][j]);
						
					}
					
				}
				return inputdata;
			}
		}
}
