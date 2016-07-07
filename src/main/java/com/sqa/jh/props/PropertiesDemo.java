package com.sqa.jh.props;

import java.io.*;
import java.util.*;

public class PropertiesDemo {

	public static void main(String[] args) {
		String fileLocation = "src/main/resources/";
		String fileName = "props.properties";

		// TODO Auto-generated method stub

		// ArrayList<String> dataLines = new ArrayList<String>();
		Map<String, String> props = readPropertiesFile(fileLocation, fileName);
		Properties propsUpdated = readPropertiesFileUpdated(fileLocation, fileName);
		// propsUpdated.setProperty("baseURL", "http://amazon.com");
		// propsUpdated.setProperty("username", "jameshamilton");
		propsUpdated.setProperty("password", "pass1234");
		writeProperties(fileLocation, "updated-" + fileName, propsUpdated);

	}

	/**
	 * @param fileLocation
	 * @param fileName
	 */
	private static Map<String, String> readPropertiesFile(String fileLocation, String fileName) {
		Map<String, String> props = new HashMap<String, String>();

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileLocation + fileName);
			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// Create String to hold current line
			String line = bufferedReader.readLine();
			// While there is a line to read or not null line
			// (also setting line to current line)
			while (line != null) {
				// Pass current line to the gatherDataString Method
				// dataLines.add(line);
				props.put(line.split("=")[0].trim(), line.split("=")[1].trim());
				line = bufferedReader.readLine();
			}
			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("I will create a test for " + props.get("baseURL"));
		System.out.println("I will search for " + props.get("searchterm"));
		System.out.println("I will locate images at least " + props.get("minSize") + "px wide");
		return props;
	}

	/**
	 * @param fileLocation
	 * @param fileName
	 * @return
	 */
	private static Properties readPropertiesFileUpdated(String fileLocation, String fileName) {
		Properties props = new Properties();

		try {
			// FileReader reads text files in the default encoding.
			InputStream inputStream = new FileInputStream(fileLocation + fileName);
			props.load(inputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I will create a test for " + props.get("baseURL"));
		System.out.println("I will search for " + props.get("searchterm"));
		System.out.println("I will locate images at least " + props.get("minSize") + "px wide");

		return props;
	}

	/**
	 * @param fileLocation
	 * @param string
	 * @param propsUpdated
	 */
	private static void writeProperties(String fileLocation, String fileName, Properties propsUpdated) {

		try {
			OutputStream outputStream = new FileOutputStream(fileLocation + fileName);
			propsUpdated.store(outputStream, "JH New Properties File");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
