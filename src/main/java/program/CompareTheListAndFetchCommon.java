package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheListAndFetchCommon {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("HP", "Lenovo", "Dell", "Mac", "Acer");
		List<String> list2 =  Arrays.asList("HP", "Mac", "Acer");

		ArrayList<String> commonList = new ArrayList<String>(list1);
//		commonList.retainAll(list2);
//		System.out.println(commonList);

		for (int i = 0; i < list2.size(); i++) {
			if (list1.contains(list2.get(i))) {
				System.out.print(list1.get(i) + " ");
			}
		}
	}
}
