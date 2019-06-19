package ft.edu.vn.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import ft.edu.vn.advance.entitys.HocSinh;

public class BTSortObject {

	public static void main(String[] args) {

		// Bài tập
		//
		// Create 1 class HocSinh extend from Comparable.
		// Object have properties is { float toan }
		// Tao mot danh sach kieu List<HocSinh> gom 20 HocSinh , diem toan thi random
		//
		// In ra danh sách truoc va sau khi đã được sắp xếp giảm dần điểm toan.

		List<HocSinh> list = new ArrayList<HocSinh>();
		HocSinh hs;

		// 1. them 20 hoc sinh
		for (int i = 0; i < 30; i++) {
			hs = new HocSinh();
			hs.setToan(new Random().nextInt(10));
			list.add(hs);
		}

		// 2. in danh sach truoc khi sap xep
		System.out.println("\r\nIn danh sach");
		for (HocSinh s : list) {
			System.out.print(s.getToan() + "\t");
		}

		// 3. Sort
		Collections.sort(list);

		// 4. in danh sach sau khi sap xep
		System.out.println("\r\nIn danh sach");
		for (HocSinh s : list) {
			System.out.print(s.getToan() + "\t");
		}
		
		//Collections.sort(list,Comparator.comparing(HocSinh::getToan()));

	}

}
