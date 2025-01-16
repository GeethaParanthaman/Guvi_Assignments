package fileoperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOpearations2_NotCorrect {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String filePath="FileReadandWrite";
		
		writeDatatoExcelFile(filePath);
		readDatatoExcelFile(filePath);

	}
	public static void writeDatatoExcelFile(String filePath) throws FileNotFoundException, IOException
	{
		//create a workbook
		Workbook workbook=new XSSFWorkbook();
		//create a sheet
		Sheet sheet=workbook.createSheet("Sheet1");
		
		//define data
		String[][] data= {
				{"Name", "Age", "Email"},
	            {"John Doe", "30", "john@test.com"},
	            {"Jane Doe", "28", "jane@test.com"},
	            {"Bob Smith","35","jacky@example.com"},
	            {"Swapnil","37","swapnil@example.com"},
	        };
		//write the data to the sheet
		for(int i=0;i<data.length;i++)
		{
			//create a row
			Row row =sheet.createRow(i);
			
			for(int j=0;j<data[i].length;j++)
			{
				//create a cell
				Cell cell=row.createCell(j);
				//set the value
				cell.setCellValue(data[i][j]);
			}
			
		}
		//adjust the column width
		for(int i=0;i<data[0].length;i++)
		{
			sheet.autoSizeColumn(i);
		}
		//save the workbook to a file
		try(FileOutputStream fos=new FileOutputStream(filePath))
		{
			workbook.write(fos);
			System.out.println("Data written to excel file successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				workbook.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void readDatatoExcelFile(String filePath)
	{
		try(FileInputStream fs=new FileInputStream(filePath))
		{
			;
			//open the workbook
			Workbook workbook=new XSSFWorkbook(fs);
			//Get the sheet by name
			Sheet sheet=workbook.getSheet("Sheet1");
			
			//iterate the rows & cells
			for(Row row:sheet) {
				for(Cell cell:row)
				{
					//print the cell's value based on its type
					switch(cell.getCellType())
					{
					case STRING:
						System.out.print(cell.getStringCellValue()+"\t");
						
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue()+"\t");
					case BLANK:
						System.out.print("BLANK\t");
						break;
						
					}
				}
				workbook.close();
				System.out.println("");
				
					
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
