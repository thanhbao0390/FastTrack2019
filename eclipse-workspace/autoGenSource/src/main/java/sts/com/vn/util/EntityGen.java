package sts.com.vn.util;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import sts.com.vn.entity.Column;

public class EntityGen {

	long startLine = 0;
	long endLine = 0;

	public String gen(Entry<String, List<Column>> entry) throws IOException {

		System.out.println("Entity Gen.....");
		// gen Entity
		String packageName = Constants.packageName + ".entity";
		String pathDest = Constants.pathRootDest + packageName.replace(".", "\\");
		String className = ConvertUtil.convertClassName(entry.getKey());
		String tableName = "";
		String columnName = "";
		String propertiesType = "";
		String propertiesName = "";
		String getMethod = "";
		String setMethod = "";
		String isKey = "@Id";

		List<Column> columns = entry.getValue();
		// read file
		List<String> contentsBody = IOUtil.readFile(Constants.pathSourceEntityBody);
		StringBuffer sbBody = new StringBuffer();
		for (Column c : columns) {
			// System.out.println(column.COLUMN_NAME);
			columnName = c.COLUMN_NAME;
			propertiesType = c.getType();
			propertiesName = c.getPropertiesName();
			getMethod = c.getGetMethodName();
			setMethod = c.getGetMethodName();
			tableName = c.getTABLE_NAME();
			for (String s : contentsBody) {
				s = s.replaceAll("s-build:packageName", packageName).replaceAll("s-build:className", className)
						.replaceAll("s-build:columnName", columnName)
						.replaceAll("s-build:propertiesType", propertiesType)
						.replaceAll("s-build:propertiesName", propertiesName).replaceAll("s-build:getMethod", getMethod)
						.replaceAll("s-build:setMethod", setMethod);
				if (c.isKey())
					s = s.replaceAll("s-build:isKey", isKey);
				else
					s = s.replaceAll("s-build:isKey", "");
				sbBody.append(s);
			}
		}

		// read file
		List<String> contents = IOUtil.readFile(Constants.pathSourceEntity);

		// change data
		// contents.replace(start, end, str);
		// contents = new
		// StringBuffer(contents.toString().replaceAll("s-build:packageName",
		// Constants.packageName));
		StringBuffer sb = new StringBuffer();
		for (String string : contents) {
			string = string.replaceAll("s-build:packageName", packageName).replaceAll("s-build:className", className)
					.replaceAll("s-mode:body1", sbBody.toString()).replaceAll("s-build:tableName", tableName);
			sb.append(string);
		}

		// create directory
		IOUtil.createFolder(pathDest);

		// write file
		String fullPath = pathDest + "\\" + className + ".java";
		IOUtil.writeFile(fullPath, sb);

		System.out.println("Entity Gen.....done");
		return "done";
	}

}
