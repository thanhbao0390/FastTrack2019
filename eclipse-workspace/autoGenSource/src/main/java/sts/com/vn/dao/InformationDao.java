package sts.com.vn.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import sts.com.vn.entity.Column;
import sts.com.vn.entity.Table;
import sts.com.vn.util.ConnectionUtil;
import sts.com.vn.util.Constants;

public class InformationDao {

	public Map<String, List<Column>> tables = new HashMap<String, List<Column>>();

	public InformationDao() throws ClassNotFoundException, SQLException {

//		List<Table> tables = listTables();
//		HashMap<String, List<Column>> listTable = new HashMap<String, List<Column>>();
//		tables.forEach(e -> listTable.put(e.TABLE_NAME, null));

		List<Column> columns = listColumns();
		tables = columns.stream().collect(Collectors.groupingBy(Column::getTABLE_NAME));
	}

	public List<Table> listTables() throws ClassNotFoundException, SQLException {

		List<Table> list = new ArrayList<Table>();
		Table obj;

		Connection con = ConnectionUtil.connectDBRoot();
		Statement stmt = con.createStatement();

		String sql = "SELECT * FROM `TABLES` WHERE TABLE_SCHEMA = '" + Constants.dbname + "'";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			obj = new Table();
//			obj.TABLE_CATALOG = rs.getString("TABLE_CATALOG");
//			obj.TABLE_SCHEMA = rs.getString("TABLE_SCHEMA");
			obj.TABLE_NAME = rs.getString("TABLE_NAME");
//			obj.TABLE_TYPE = rs.getString("TABLE_TYPE");
//			obj.ENGINE = rs.getString("ENGINE");
//			obj.VERSION = rs.getString("VERSION");
//			obj.ROW_FORMAT = rs.getString("ROW_FORMAT");
//			obj.TABLE_ROWS = rs.getString("TABLE_ROWS");
//			obj.AVG_ROW_LENGTH = rs.getString("AVG_ROW_LENGTH");
//			obj.DATA_LENGTH = rs.getString("DATA_LENGTH");
//			obj.MAX_DATA_LENGTH = rs.getString("MAX_DATA_LENGTH");
//			obj.INDEX_LENGTH = rs.getString("INDEX_LENGTH");
//			obj.DATA_FREE = rs.getString("DATA_FREE");
//			obj.AUTO_INCREMENT = rs.getString("AUTO_INCREMENT");
//			obj.CREATE_TIME = rs.getString("CREATE_TIME");
//			obj.UPDATE_TIME = rs.getString("UPDATE_TIME");
//			obj.CHECK_TIME = rs.getString("CHECK_TIME");
//			obj.TABLE_COLLATION = rs.getString("TABLE_COLLATION");
//			obj.CHECKSUM = rs.getString("CHECKSUM");
//			obj.CREATE_OPTIONS = rs.getString("CREATE_OPTIONS");
//			obj.TABLE_COMMENT = rs.getString("TABLE_COMMENT");

			list.add(obj);
		}

		rs.close();
		stmt.close();
		con.close();

		return list;
	}

	public List<Column> listColumns() throws ClassNotFoundException, SQLException {

		List<Column> list = new ArrayList<Column>();
		Column obj;

		Connection con = ConnectionUtil.connectDBRoot();
		Statement stmt = con.createStatement();

		String sql = "SELECT * FROM `COLUMNS` WHERE TABLE_SCHEMA = '" + Constants.dbname + "'";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			obj = new Column();
			obj.TABLE_CATALOG = rs.getString("TABLE_CATALOG");
			obj.TABLE_SCHEMA = rs.getString("TABLE_SCHEMA");
			obj.TABLE_NAME = rs.getString("TABLE_NAME");
			obj.COLUMN_NAME = rs.getString("COLUMN_NAME");
			obj.ORDINAL_POSITION = rs.getString("ORDINAL_POSITION");
			obj.COLUMN_DEFAULT = rs.getString("COLUMN_DEFAULT");
			obj.IS_NULLABLE = rs.getString("IS_NULLABLE");
			obj.DATA_TYPE = rs.getString("DATA_TYPE");
			obj.CHARACTER_MAXIMUM_LENGTH = rs.getString("CHARACTER_MAXIMUM_LENGTH");
			obj.CHARACTER_OCTET_LENGTH = rs.getString("CHARACTER_OCTET_LENGTH");
			obj.NUMERIC_PRECISION = rs.getString("NUMERIC_PRECISION");
			obj.NUMERIC_SCALE = rs.getString("NUMERIC_SCALE");
			obj.DATETIME_PRECISION = rs.getString("DATETIME_PRECISION");
			obj.CHARACTER_SET_NAME = rs.getString("CHARACTER_SET_NAME");
			obj.COLLATION_NAME = rs.getString("COLLATION_NAME");
			obj.COLUMN_TYPE = rs.getString("COLUMN_TYPE");
			obj.COLUMN_KEY = rs.getString("COLUMN_KEY");
			obj.EXTRA = rs.getString("EXTRA");
			obj.PRIVILEGES = rs.getString("PRIVILEGES");
			obj.COLUMN_COMMENT = rs.getString("COLUMN_COMMENT");

			list.add(obj);
		}

		rs.close();
		stmt.close();
		con.close();

		return list;
	}

}
