package sts.com.vn.util;

import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import sts.com.vn.entity.Column;

public class ControllerGen {

	long startLine = 0;
	long endLine = 0;

	public String gen(Entry<String, List<Column>> entry) throws IOException {

		System.out.println("Controller Gen.....");
		// gen Repository
		String packageName = Constants.packageName + ".controller";
		String pathDest = Constants.pathRootDest + packageName.replace(".", "\\");
		String classEntityName = ConvertUtil.convertClassName(entry.getKey());
		String className = classEntityName + "Controller";
		String classRepositoryName = classEntityName + "Repository";
		String packageEntityName = Constants.packageName + ".entity." + classEntityName;
		String packageRepositoryName = Constants.packageName + ".repository." + classRepositoryName;
		String requestUrl = classEntityName.toLowerCase();
		String typeOfKey = "String";

		List<Column> columns = entry.getValue();
		// read file
		List<String> contentsBody = IOUtil.readFile(Constants.pathSourceControllerBody);
		StringBuffer sbBody = new StringBuffer();
		for (Column c : columns) {
			// System.out.println(column.COLUMN_NAME);

			String getMethod = c.getGetMethodName();
			String setMethod = c.getGetMethodName();
			for (String s : contentsBody) {
				s = s.replaceAll("s-build:getMethod", getMethod).replaceAll("s-build:setMethod", setMethod);
				sbBody.append(s);
			}

			if (c.isKey())
				typeOfKey = c.getType();
		}

		// read file
		List<String> contents = IOUtil.readFile(Constants.pathSourceController);

		// change data
		StringBuffer sb = new StringBuffer();
		for (String s : contents) {
			s = s.replaceAll("s-build:packageName", packageName).replaceAll("s-build:className", className)
					.replaceAll("s-build:packageEntityName", packageEntityName)
					.replaceAll("s-build:classEntityName", classEntityName)
					.replaceAll("s-build:classRepositoryName", classRepositoryName)
					.replaceAll("s-build:packageRepositoryName", packageRepositoryName)
					.replaceAll("s-build:requestUrl", requestUrl).replaceAll("s-mode:body1", sbBody.toString())
					.replaceAll("s-build:propertiesType", typeOfKey);
			sb.append(s);
		}

		// create directory
		IOUtil.createFolder(pathDest);

		// write file
		String fullPath = pathDest + "\\" + className + ".java";
		IOUtil.writeFile(fullPath, sb);

		System.out.println("Controller Gen.....done");
		return "done";
	}

}
