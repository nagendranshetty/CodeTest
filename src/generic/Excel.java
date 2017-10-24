package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getCellValue(String path, String sheet, int r, int c) throws Exception {
		String v = "";
		
			FileInputStream file = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(file);
			v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
			//System.out.println(v);
		
		return v;

	}
	public static int rowCount(String sheet,String path)
	{
		int rc=0;
		try
		{
			FileInputStream file = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(file);
			rc=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		return rc;
	}
}
