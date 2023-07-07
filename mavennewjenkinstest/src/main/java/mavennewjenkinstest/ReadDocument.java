package mavennewjenkinstest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDocument {
	XSSFSheet Sheet;
	ReadDocument() throws InvalidFormatException, IOException {
		File Spreadsheet = new File("home/shabana/Documents/SAMPLEEXCEL.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(Spreadsheet);
		Sheet= Workbook.getSheet("Sheet one");
	}
public void readfile() {
	XSSFRow row= Sheet.getRow(30);
	XSSFCell cell= row.getCell(30) ;
	System.out.println(cell.getNumericCellValue());
}
public static void main (String arg[]) throws InvalidFormatException, IOException {
	ReadDocument read= new ReadDocument();
	read.readfile();
	System.out.println("The values are");
}

}

