package datadriveninselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkBookExample {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\Admin\\Desktop\\New folder\\datadriven.xlsx";
		try
		{
			File file=new File(filePath);
			FileInputStream fis=new FileInputStream(file);
			String fileName="datadriven.xlsx";
			int index=fileName.indexOf(".");
			String fileType=fileName.substring(index);
			System.out.println(fileType);
			if(fileType.equals(".xlsx"))
			{
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				XSSFSheet sheet=wb.getSheetAt(0);
//				String value=sheet.getRow(0).getCell(0).getStringCellValue();
//				System.out.println(value);
				System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
			}
			else
			{
				System.out.println("Unsupported File");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
