package sts.com.vn.util;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import sts.com.vn.entity.Column;

public class RepositoryGen {

	long startLine = 0;
	long endLine = 0;

	public String gen(Entry<String, List<Column>> entry) throws IOException {

		System.out.println("Repository Gen.....");
		// gen Repository
		String packageName = Constants.packageName + ".repository";
		String pathDest = Constants.pathRootDest + packageName.replace(".", "\\");
		String classEntityName = ConvertUtil.convertClassName(entry.getKey());
		String className = classEntityName + "Repository";
		String packageEntityName = Constants.packageName + ".entity." + classEntityName;
		String typeOfKey = "String";

		List<Column> columns = entry.getValue();
		for (Column c : columns) {
			// System.out.println(column.COLUMN_NAME);

			if (c.isKey())
				typeOfKey = c.getType();
		}

		// read file
		List<String> contents = IOUtil.readFile(Constants.pathSourceRepository);

		// change data
		StringBuffer sb = new StringBuffer();
		for (String s : contents) {
			s = s.replaceAll("s-build:packageName", packageName).replaceAll("s-build:className", className)
					.replaceAll("s-build:packageEntityName", packageEntityName)
					.replaceAll("s-build:classEntityName", classEntityName)
					.replaceAll("s-build:propertiesType", typeOfKey);
			sb.append(s);
		}

		// create directory
		IOUtil.createFolder(pathDest);

		// write file
		String fullPath = pathDest + "\\" + className + ".java";
		IOUtil.writeFile(fullPath, sb);

		System.out.println("Repository Gen.....done");
		return "done";
	}

}
