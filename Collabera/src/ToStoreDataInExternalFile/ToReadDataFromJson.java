package ToStoreDataInExternalFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ToReadDataFromJson {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		
		FileReader fr=new FileReader("./testResources/testData.json");
		JSONParser parser=new JSONParser();
		JSONObject jsonObj=(JSONObject)parser.parse(fr);
		System.out.println(jsonObj.get("subject").toString());
	}

}
