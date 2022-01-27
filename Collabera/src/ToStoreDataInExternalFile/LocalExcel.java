package ToStoreDataInExternalFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LocalExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
	FileInputStream fis=new FileInputStream("./testResources/local.xlsx");
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		LocalDateTime data=workbook.getSheet("Sheet1").getRow(0).getCell(0).getLocalDateTimeCellValue();
		System.out.println(data);
		//System.out.println(data.getMonth().name());

	}

}
