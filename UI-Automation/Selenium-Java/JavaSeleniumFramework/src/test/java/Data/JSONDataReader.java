package Data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONDataReader {
	
	public List<HashMap<String, String>> getJSONHashMap(String filePath) throws IOException {
		
		// Storing the JSON file data in a string using .readFileToString 
		// .readFileToString this method needs JSON file path and and the format of file
		String JSONData = FileUtils.readFileToString(new File (filePath), StandardCharsets.UTF_8);
		
		// To convert this string into hash map --> Using Jackson Databind
		// Need to import one dependency of Jackson Databind in pom.xml file
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(JSONData, new TypeReference<List<HashMap<String, String>>>() {});
		return data;
		
	}

}
