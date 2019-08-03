package sts.com.vn;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map.Entry;

import sts.com.vn.dao.InformationDao;
import sts.com.vn.entity.Column;
import sts.com.vn.util.EntityGen;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub

		InformationDao dao = new InformationDao();

		EntityGen entity = new EntityGen();
		for (Entry<String, List<Column>> entry : dao.tables.entrySet()) {

			// System.out.println("Key = " + entry.getKey() + ", Value = " +
			// entry.getValue());

			entity.gen(entry);
		}

		System.out.println(System.getProperty("user.dir"));

	}

}
