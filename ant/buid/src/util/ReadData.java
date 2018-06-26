package util;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.testng.annotations.DataProvider;

import jxl.BooleanFormulaCell;
import jxl.Cell;
import jxl.CellType;
import jxl.DateCell;
import jxl.LabelCell;
import jxl.NumberCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadData{
	static File f=new File(".//Datafile//AlturaTestData.xls");
	//@DataProvider(name="news")
	public static Object[][] readExcel2() throws BiffException, IOException{ 
		{
			Workbook wb= Workbook.getWorkbook(f);
			Sheet s= wb.getSheet(2);
			int rows=s.getRows();
		//	int cellPosition = 1;
			
			
			int column=s.getColumns();
			Object [][]inputdata=new String [rows][column];
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
			/*for(int i=1;i<rows;i++)
			{
				for(int j=0; j<column;j++)
				{
					//Cell cell;
					Cell c=s.getCell(j,i-1);
					System.out.println("this is "+c.getType());
					
					
					switch (c.getType().toString().toLowerCase()) {
                    case "label":
                    	 LabelCell labelCell = (LabelCell)c;
					      inputdata[i-1][j] = labelCell.getContents();
					      
					      System.out.println(""+"["+(i)+"]"+"["+j+"]"+inputdata[i-1][j]);
					      
                        break;
					case "number":                                                    
                    	NumberCell numCell = (NumberCell)c;
					      inputdata[i-1][j]= numCell.getContents();
					      System.out.println(""+"["+(i)+"]"+"["+j+"]"+inputdata[i-1][j]);                                               
					      break;
                    case "date":
                    	DateCell dateCell = (DateCell)c;
                    	inputdata[i-1][j] = (Date) dateCell.getDate();
					      
					      System.out.println(inputdata[i][j]);
					      break;
                    case "boolean_formula":
                    	BooleanFormulaCell boolFormulaCell = (BooleanFormulaCell)c;
                    	inputdata[i][j] = boolFormulaCell.getValue();
					    System.out.println(inputdata[i][j]);
					    break;                                            

                    default:
                        System.out.println("Inside default");
        }
					
				
					if (c.getType() == CellType.LABEL) {
					      
					      LabelCell labelCell = (LabelCell) c;
					      inputdata[i][j] = labelCell.getString();
					      
					      System.out.println(inputdata);
					      
					    } else if (c.getType() == CellType.NUMBER) {
					      
					      NumberCell numCell = (NumberCell) c;
					      double num = numCell.getValue();
					      
					      System.out.println(num);
					      
					    } else if (c.getType() == CellType.DATE) {
					      
					      DateCell dateCell = (DateCell) c;
					      Date date = (Date) dateCell.getDate();
					      
					      System.out.println(date);
					      
					    } else if (c.getType() == CellType.BOOLEAN_FORMULA) {
					      
					      BooleanFormulaCell boolFormulaCell = (BooleanFormulaCell) c;
					      boolean value = boolFormulaCell.getValue();
					      
					      System.out.println(value);
					    }
				    }  
					
				}
			
			}
*/			
		}
		
				
		}
	@DataProvider(name="ClinicalTrail")
	public static Object[][] excelForCT() throws BiffException, IOException{ 
		{
			Workbook wb= Workbook.getWorkbook(f);
			Sheet s= wb.getSheet(3);
			int rows=s.getRows();
		//	int cellPosition = 1;
			
			
			int column=s.getColumns();
			Object [][]inputdata=new String [rows][column];
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
	}
	//@DataProvider(name="addProvider")
	public static String[][] adminlogin(String SheetName) throws BiffException, IOException{ 
		{
			Workbook wb= Workbook.getWorkbook(f);
			
			// TO get the access to the sheet
			Sheet s= wb.getSheet(SheetName);
			int rows=s.getRows();
		//	int cellPosition = 1;
			
			
			int column=s.getColumns();
			String [][]inputdata=new String [rows-1][column];
			for(int i=1;i<rows;i++)
			{
				for(int j=0; j<column;j++){
					
					Cell c=s.getCell(j,i);
					inputdata[i-1][j]=c.getContents();
					System.out.print("  "+inputdata[i-1][j]);
					
				}
				
			}
			return inputdata;
		}
	}
	//@DataProvider(name="AddNewUser")
	public static String[][] excelRead(String SheetName) throws BiffException, IOException{ 
		{
			Workbook wb= Workbook.getWorkbook(f);
			
			// TO get the access to the sheet
			Sheet s= wb.getSheet(SheetName);
			
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
	public static String[][] excelReadFromStart(String SheetName) throws BiffException, IOException{ 
		{
			Workbook wb= Workbook.getWorkbook(f);
			
			// TO get the access to the sheet
			Sheet s= wb.getSheet(SheetName);
			
			// To get the number of rows present in sheet
			int rows=s.getRows();
			
			// To get the number of columns present in sheet
			int column=s.getColumns();
			String [][]inputdata=new String [rows-3][column];
			for(int i=3;i<rows;i++)
			{
				for(int j=0; j<column;j++){
					
					Cell c=s.getCell(j,i);
					inputdata[i-3][j]=c.getContents();
					System.out.print("  "+inputdata[i-3][j]);
					
				}
				
			}
			return inputdata;
		}
	}
	public static void main(String [] arg) 
	{
		
		try {
			System.out.println(adminlogin("AddProvider"));
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
}