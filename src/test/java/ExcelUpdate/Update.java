package ExcelUpdate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Update {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
//		FileOutputStream file = new FileOutputStream("C:\\Users\\MANRAKES\\Desktop\\eclipse\\Book1.xlsx");
		FileInputStream file = new FileInputStream("C:\\Users\\MANRAKES\\Desktop\\eclipse\\Book1.xlsx");		
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Resourse list");
		
		String name=sheet.getRow(4).getCell(1).toString();
		System.out.println(name);
			
		}
		
		

	

}
