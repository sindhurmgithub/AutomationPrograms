package ToStoreDataInExternalFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reexecute {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./testResources/testData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		String data=workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(data);
		
     boolean data1=workbook.getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
   System.out.println(data1);
  
  
    LocalDateTime data3=workbook.getSheet("Sheet1").getRow(2).getCell(0).getLocalDateTimeCellValue();
    System.out.println(data3.getMonth().name());


	}

}
