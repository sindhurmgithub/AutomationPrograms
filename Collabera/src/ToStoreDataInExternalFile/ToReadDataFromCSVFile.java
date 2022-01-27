package ToStoreDataInExternalFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ToReadDataFromCSVFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("./testResources/testData.csv");
		
		CSVReader csvReader=new CSVReader(fr);
		
		//readAll()
		//List<String[]> usernameData=csvReader.readAll();
		//System.out.println(usernameData.size());
		//String[] linedata=usernameData.get(2); //row 3
		//System.out.println(linedata[1]); //2 part mobile,3625t789(part 2)
		
		//readNext()
		String[] usernameData=csvReader.readNext();
		System.out.println(usernameData[2]);
		
		

	}

}
