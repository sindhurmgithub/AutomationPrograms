package ToStoreDataInExternalFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./testResources/local.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		//Workbook workbook=new HSSFWorkbook(); extension .xls
		
		//String data = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
		//System.out.println(data);
		
	//	boolean data1=workbook.getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
	//	System.out.println(data1);	
		
		//double data4=workbook.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		//System.out.println(data4);
		
		 LocalDateTime data3 = workbook.getSheet("Sheet1").getRow(0).getCell(0).getLocalDateTimeCellValue();
		 System.out.println(data3);
				System.out.println(data3.getMonth().name()); //DECEMBER
			
				
		
				
				//double data4 = workbook.getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue();
				//System.out.println(data4); //returns number in double
				
				
				//To Read Multiple Information About Excel
				//Sheet sheetOne=workbook.getSheet("Sheet1");One
				//sheetOne.getRow(4).getCell(1);
				//Row rowOne=sheetOne.getRow(1);
				//rowOne.getCell(0);
				//rowOne.getCell(1);

	}

}
