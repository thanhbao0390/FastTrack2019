package ft.edu.vn.advance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class BTArrayList {

	public static void main(String[] args) {
		
		// Bài tập
		// 
		// Tao mot danh sach kieu List
		// Thuc hien cac cong viec ben duoi
		// 1. Thêm Random 30 phần tử vào list
		// 2. In danh sách list 
		// 3. Remove phần tử chia hết cho 2
		// 4. In danh sách list
		// 5. Sắp xếp tăng dần
		// 6. In danh sách list
		// 

		List<Integer> list = new ArrayList<Integer>();
		
		// 1. them 30 phan tu
		for (int i = 0; i < 30; i++) {
			list.add(new Random().nextInt(10));
		}
		
		// 2. in danh sach
		System.out.println("\r\nIn danh sach");
		for (Integer integer : list) {
			System.out.print(integer + "\t");
		}
		
		Iterator<Integer> iter = list.listIterator();
		while (iter.hasNext()) {
			Integer integer = (Integer) iter.next();
			if(integer % 2 == 0) {
				iter.remove();
			}
		}

		// 2. in danh sach
		System.out.println("\r\nIn danh sach da remove");
		for (Integer integer : list) {
			System.out.print(integer + "\t");
		}

		

	}

}
