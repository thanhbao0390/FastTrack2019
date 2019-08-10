package sts.com.vn;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map.Entry;

import sts.com.vn.dao.InformationDao;
import sts.com.vn.entity.Column;
import sts.com.vn.util.ControllerGen;
import sts.com.vn.util.EntityGen;
import sts.com.vn.util.RepositoryGen;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub

		InformationDao dao = new InformationDao();

		EntityGen entity = new EntityGen();
		RepositoryGen repo = new RepositoryGen();
		ControllerGen controller = new ControllerGen();
		for (Entry<String, List<Column>> entry : dao.tables.entrySet()) {

			// System.out.println("Key = " + entry.getKey() + ", Value = " +
			// entry.getValue());
//			for (Column col : entry.getValue()) {
//				System.out.println(col.COLUMN_KEY);
//			}

			System.out.println("Gen=====>" + entry.getKey());
			entity.gen(entry);
			repo.gen(entry);
			controller.gen(entry);
		}

		System.out.println(System.getProperty("user.dir"));

	}

}
