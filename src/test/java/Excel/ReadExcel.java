package Excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public String path;
	public XSSFSheet sheet1;
	public XSSFWorkbook book;
	public FileInputStream fis;

	public ReadExcel(String path) {
		this.path = path;

		try { // excel load korar jonno
			fis = new FileInputStream(path);
			book = new XSSFWorkbook(fis); // xcel reader
			sheet1 = book.getSheetAt(0);

		} catch (Exception e) {
			System.out.println("not found");

		}

	}

	public Object[][] getExcelData() { // data read korba
		int rowcount = sheet1.getLastRowNum()+1; // it will count rown number
		int coloumCount = sheet1.getRow(1).getLastCellNum(); // it will count cell number

		Object data[][] = new Object[rowcount][coloumCount];

		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < coloumCount; j++) {

				data[i][j] = sheet1.getRow(i).getCell(j).getStringCellValue();

				System.out.println(data[i][j]);

			}

		}
		return data;

	}
}


