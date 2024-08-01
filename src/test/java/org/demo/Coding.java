package org.demo;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Coding {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader file = new FileReader("C:\\Users\\Avila Theresa\\Desktop\\Java Selenium Course\\selenium\\Jproject\\src\\test\\resources\\file.json");
		
		JSONParser jsonparser = new JSONParser();

		Object parse = jsonparser.parse(file);
		
		JSONObject jsonObject = (JSONObject)parse;
		
		System.out.println(jsonObject.get("Name"));
		
		System.out.println(jsonObject.get("Age"));
		
		System.out.println(jsonObject.get("Mobile no"));
		
		System.out.println(jsonObject.get("Status"));
		
		System.out.println(jsonObject.get("Percentage"));
		
		System.out.println(jsonObject.get("Address"));
		
		
	}
	
	

}
