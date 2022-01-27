package ToStoreDataInExternalFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToStoreMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./testResources/testingData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheetFive=workbook.getSheet("Sheet1");
		int rowCount=sheetFive.getPhysicalNumberOfRows();
		int colCount=sheetFive.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowCount);
		System.out.println(colCount);
		
		String[][] sarr=new String[rowCount][colCount];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				sarr[i][j]=sheetFive.getRow(i).getCell(j).toString();
			}
		}
		for(String[] arr:sarr) {
			for(String s:arr) {
				System.out.println(s+",");
			}
			System.out.println();
			}
				
		
		}

	}


