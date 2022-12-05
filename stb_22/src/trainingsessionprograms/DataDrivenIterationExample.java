package datadriveninselenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenIterationExample {

	public static void main(String[] args) {
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
				Iterator<Row> rows=sheet.rowIterator();
				rows.next();
				while(rows.hasNext())
				{
					XSSFRow row=(XSSFRow) rows.next();
					
					Iterator<Cell> cells=row.cellIterator();
					while(cells.hasNext())
					{
						XSSFCell cell=(XSSFCell) cells.next();
						System.out.print(cell.getStringCellValue()+"  ");
						
					}
					System.out.println(" ");
				}
			}
			else
			{
				System.out.println("Unsupported File");
			}
			fis.close();
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}
		

	}

}
