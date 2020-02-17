package com.practice.dhiraj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {

	public static void main(String[] args) {

		// Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a blank sheet
		XSSFSheet sheet = workbook.createSheet("Jenkins Report");

		String jsonFile = "{\r\n" + "	\"people\": {\r\n" + "		\"_class\": \"model.view.\",\r\n"
				+ "		\"user\": [{\r\n" + "			\"lastChange\": 151565626156,\r\n"
				+ "			\"project\":{\r\n" + "				\"color\": \"red\",\r\n"
				+ "				\"displayName\": \"project1\",\r\n" + "				\"name\": \"project1\",\r\n"
				+ "				\"_class\": \"project1\",\r\n" + "				\"url\": \"project1url\"\r\n"
				+ "			},\r\n" + "			\"user\":{\r\n" + "				\"absoluteUrl\": \"prje1\",\r\n"
				+ "				\"fullName\": \"abc\"\r\n" + "			}\r\n" + "		},{\r\n"
				+ "			\"lastChange\": 123456789,\r\n" + "			\"project\":{\r\n"
				+ "				\"color\": \"green\",\r\n" + "				\"displayName\": \"project2\",\r\n"
				+ "				\"name\": \"project2\",\r\n" + "				\"_class\": \"project2\",\r\n"
				+ "				\"url\": \"project2url\"\r\n" + "			},\r\n" + "			\"user\":{\r\n"
				+ "				\"absoluteUrl\": \"prje2\",\r\n" + "				\"fullName\": \"xyz\"\r\n"
				+ "			}\r\n" + "		}\r\n" + "		]\r\n" + "	}\r\n" + "}";

		JSONParser parser = new JSONParser();
		Integer rowNumber = 1;
		Map<Integer, Object[]> data = new TreeMap<Integer, Object[]>();
		data.put(rowNumber,
				new Object[] { "lastChange", "color", "displayName", "Name", "url", "absoluteUrl", "fullName" });

		Object obj;
		try {
			obj = parser.parse(jsonFile);

			JSONObject jsonObj = (JSONObject) obj;
			JSONObject people = (JSONObject) jsonObj.get("people");
			JSONArray users = (JSONArray) people.get("user");

			for (Object user : users) {
				JSONObject jsonUser = (JSONObject) user;
				Long lastChanged = (Long) jsonUser.get("lastChange");
				String lastChange = lastChanged.toString();
				// System.out.println("lastChange :" + lastChange);

				JSONObject projectObj = (JSONObject) jsonUser.get("project");
				String color = (String) projectObj.get("color");
				String displayName = (String) projectObj.get("displayName");
				String name = (String) projectObj.get("name");
				String url = (String) projectObj.get("url");
				String _class = (String) projectObj.get("_class");
				// System.out.println(color +" "+ displayName +" "+ name +" "+ url +" "+ _class
				// );
				// JSONArray projectObj = (JSONArray) jsonUser.get("project");

				JSONObject userObj = (JSONObject) jsonUser.get("user");
				String fullName = (String) userObj.get("fullName");
				String absoluteUrl = (String) userObj.get("absoluteUrl");

				System.out.println(lastChange + " " + color + " " + displayName + " " + displayName + " " + url + " "
						+ _class + " " + fullName + " " + absoluteUrl);
				// System.out.println("user :" + userObj.toJSONString());
				rowNumber++;
				data.put(rowNumber, new Object[] { lastChange, color, displayName, name, url, absoluteUrl, fullName, });
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Set<Integer> keyset = data.keySet();
		int rownum = 0;
		for (Integer key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object sheetObj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (sheetObj instanceof String)
					cell.setCellValue((String) sheetObj);
				else if (sheetObj instanceof Integer)
					cell.setCellValue((Integer) sheetObj);
			}
		}
		try {
			// Write the workbook in file system
			FileOutputStream out = new FileOutputStream(new File("jenkins-report.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("jenkins-report.xlsx written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
