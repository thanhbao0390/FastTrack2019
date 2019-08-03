package sts.com.vn.util;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import sts.com.vn.entity.Column;

public class EntityGen {

	// gen Entity
	String packageName = "sts.com.vn.test";
	String className = "className";
	String columnName = "columnName";
	String propertiesType = "propertiesType";
	String propertiesName = "propertiesName";
	String getMethod = "getMethod";
	String setMethod = "setMethod";

	long startLine = 0;
	long endLine = 0;

	public String gen(Entry<String, List<Column>> entry) throws IOException {

		String packageName = Constants.packageName + ".entity";
		String pathDest = Constants.pathRootDest + packageName.replace(".", "\\");
		String className = ConvertUtil.convertClassName(entry.getKey());

		List<Column> columns = entry.getValue();
		for (Column column : columns) {
			// System.out.println(column.COLUMN_NAME);
		}

		// read file
		StringBuffer contents = IOUtil.readFile(Constants.pathSourceEntity);

		// create directory
		IOUtil.createFolder(pathDest);

		// write file
		String fullPath = pathDest + "\\" + className + ".java";
		IOUtil.writeFile(fullPath, contents);

		return "done";
	}

}
