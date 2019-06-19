package ft.edu.vn.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import ft.edu.vn.advance.entitys.HocSinh2;

public class BTSortObjectMutiCondition {

	public static void main(String[] args) {

		// Bài tập
		//
		// Create 1 class HocSinh2 extend from Comparable.
		// Object have properties is { float toan, float ly }
		// Tao mot danh sach kieu List<HocSinh2> gom 20 HocSinh2 , diem toan, dien ly thi random
		//
		// In ra danh sách truoc va sau khi đã được sắp xếp giảm dần điểm toan.
		// Truong hop dien toan bang nhau thi sap xep diem ly giam dan

		List<HocSinh2> list = new ArrayList<HocSinh2>();
		HocSinh2 hs;

		// 1. them 20 hoc sinh
		for (int i = 0; i < 30; i++) {
			hs = new HocSinh2();
			hs.setToan(new Random().nextInt(10));
			hs.setLy(new Random().nextInt(10));
			list.add(hs);
		}

		// 2. in danh sach truoc khi sap xep
		System.out.println("\r\nIn danh sach");
		for (HocSinh2 s : list) {
			System.out.println(s.getToan() + "-" + s.getLy() + "");
		}

		// 3. Sort
		Collections.sort(list);

		// 4. in danh sach sau khi sap xep
		System.out.println("\r\nIn danh sach");
		for (HocSinh2 s : list) {
			System.out.println(s.getToan() + "-" + s.getLy() + "");
		}

	}

}
