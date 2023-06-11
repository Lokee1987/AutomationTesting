package automation;

import java.io.FileInputStream;


import jxl.Sheet;
import jxl.Workbook;

public class DataDrivenTesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		FileInputStream f = new FileInputStream("C:\\Users\\prath\\OneDrive\\Desktop\\testdatadrive.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		
		System.out.println(s.getCell(0,0).getContents());
		System.out.println(s.getCell(1,0).getContents());
		System.out.println(s.getCell(2,0).getContents());
		System.out.println(s.getCell(3,0).getContents());
		
	}

}
