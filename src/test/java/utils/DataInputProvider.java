package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import wrappers.GenericWrappers;

public class DataInputProvider extends GenericWrappers {

	public static int requiredRow = 0;
	/**
	 * @author -Dharama
	 */
	public static String[][] getSheet(String dataSheetName) {

		String[][] data = null;
		try {
			FileInputStream fis = new FileInputStream(new File("./data/" + dataSheetName + ".xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			// get the number of rows
			int rowCount = sheet.getLastRowNum();
			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][columnCount];
			// loop through the rows
			for (int i = 1; i < rowCount + 1; i++) {
				try {
					XSSFRow row = sheet.getRow(i);
					for (int j = 0; j < columnCount; j++) { // loop through the
															// columns
						try {
							String cellValue = "";
							try {
								cellValue = row.getCell(j).getStringCellValue();
							} catch (NullPointerException e) {
								cellValue = "";
							}
							data[i - 1][j] = cellValue; // add to the data array
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	/**
	 * @author -QATeam
	 * @param - This method getting data from Excel Sheet for PF feature Roll Mapping
	 */
	public static String[][] getSheet1(String dataSheetName, String requiredData) throws IOException {
		String[][] data = null;
		FileInputStream fis = new FileInputStream(new File("./data/" + dataSheetName + ".xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);

		// get the number of rows
		int rowCount = sheet.getLastRowNum();

		// get the number of columns
		int columnCount = sheet.getRow(0).getLastCellNum();

		data = new String[1][3];

		Iterator<Row> rowIterator = sheet.iterator();
		boolean flag = false;
		String cellValue = "";
		 L1:for (int i = 1; i < rowCount + 1; i++) {
			try {
				XSSFRow row = sheet.getRow(i);
				L:for (int j = 0; j < columnCount; j++) { // loop through the
														// columns
					try {

						try {
							cellValue = row.getCell(j).getStringCellValue();
							if (j == 0) {
								if (cellValue.equals(requiredData)) {
									cellValue = row.getCell(1).getStringCellValue();
									data[0][0] = cellValue;
									cellValue = row.getCell(2).getStringCellValue();
									data[0][1] = cellValue;
									cellValue = row.getCell(3).getStringCellValue();
									data[0][2] = cellValue;
									flag = true;
									break L;
								} else {
									break;
								}
							}

						} catch (NullPointerException e) {
							cellValue = "";
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if (flag) {
//					for (int j = 0; j < columnCount; j++) {
//						cellValue = row.getCell(j).getStringCellValue();
//						data[0][j] = cellValue;
//					}
				break L1;
				}
			} catch (Exception e) {
				e.printStackTrace();
				fis.close();
			}
		}
		return data;
	}


	public static XSSFSheet getsheetdata(String  file, String Sheetname) throws IOException {
		File obj=new File(file);
		FileInputStream excel=new FileInputStream(obj);
		XSSFWorkbook workbook=new XSSFWorkbook(excel);
		return workbook.getSheet(Sheetname);
		
	}
}
