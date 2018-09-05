

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public FileInputStream fis=null;
	private XSSFWorkbook workbook=null;
	private XSSFSheet sheet=null;
	
	String path=null;
	
	//Constructor
	public ExcelReader() throws IOException {
		path=System.getProperty("User.dir")+"\\TestData\\TestData.xlsx";
		fis=new FileInputStream(path);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheetAt(0);
	}
	public int getSheetRows(String sheetname) {
	int index=workbook.getSheetIndex(sheetname);
	sheet=workbook.getSheetAt(index);
	return(sheet.getLastRowNum()+1);
		
	}
	public static void main(String args) throws IOException {
		ExcelReader reader=new ExcelReader();
	System.out.println(reader.getSheetRows("mail"));
	}

}



