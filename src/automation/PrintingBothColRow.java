package automation;

import java.io.FileInputStream;


import jxl.Sheet;
import jxl.Workbook;

public class PrintingBothColRow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
FileInputStream f = new FileInputStream("C:\\Users\\prath\\OneDrive\\Desktop\\testdatadrive.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		
		int rc = s.getRows();
		int cr = s.getColumns();
		
		for (int i=0; i<rc; i++) {
			
			for (int j=0; j<cr; j++) {
				
				System.out.print(s.getCell(j,i).getContents()+ "   ");
			}
			System.out.println();
		}
			

	}
	
	
	
	

}
