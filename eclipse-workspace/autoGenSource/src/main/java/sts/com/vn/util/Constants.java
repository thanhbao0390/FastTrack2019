package sts.com.vn.util;

public class Constants {

	public static final String url = "jdbc:mysql://localhost:3306/";
	public static final String dbroot = "information_schema";
	public static final String dbname = "db-cafes";
	public static final String user = "root";
	public static final String password = "";

	public static final String pathSource = System.getProperty("user.dir");
	public static final String pathSourceEntity = pathSource + "/src/main/resources/template/TmpEntity.java";
	public static final String pathSourceEntityBody = pathSource + "/src/main/resources/template/TmpEntityBody_1.java";

	public static final String pathSourceRepository = pathSource + "/src/main/resources/template/TmpRepository.java";

	public static final String pathSourceController = pathSource + "/src/main/resources/template/TmpController.java";
	public static final String pathSourceControllerBody = pathSource
			+ "/src/main/resources/template/TmpControllerBody_1.java";

	public static final String packageName = "spring.ft.edu.vn.core";

	public static final String pathRootDest = "F:\\Project\\FastTrack2019\\eclipse-workspace\\springBoot\\core\\coreAPI\\src\\main\\java\\";

}
