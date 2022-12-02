package datadriveninselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenUsingForLoop {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\Admin\\Desktop\\New folder\\datadriven.xlsx";
		File file=new File(filePath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<2;j++)
			{
				XSSFCell cell=row.getCell(j);
				//if(cell.getCellType()==XSSFCell)
				System.out.print(cell+""+"\t");
			}
			System.out.println("");
			
		}

	}

}
