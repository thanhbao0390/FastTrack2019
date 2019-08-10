package sts.com.vn.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOUtil {

	public static List<String> readFile(String path) {
		BufferedReader reader;
		// StringBuffer contents = new StringBuffer();
		List<String> contents = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader(path));
			String line = reader.readLine();
			while (line != null) {
				// System.out.println(line);
				// read next line
				contents.add(line + System.lineSeparator());
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return contents;
	}

	public static void writeFile(String path, StringBuffer contents) throws IOException {

		// write the content in file
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
			bufferedWriter.write(contents.toString());
		} catch (IOException e) {
			throw e;
		}
	}

	public static void createFolder(String directoryName) {
		File directory = new File(directoryName);
		if (!directory.exists()) {
			directory.mkdirs();
			// If you require it to make the entire directory path including parents,
			// use directory.mkdirs(); here instead.
		}
	}
}
