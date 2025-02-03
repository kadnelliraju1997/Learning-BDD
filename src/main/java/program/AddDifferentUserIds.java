package program;

import java.util.ArrayList;
import java.util.List;

public class AddDifferentUserIds {

	public static void main(String[] args) {
		List<UserData> userDataList = new ArrayList<UserData>();

		UserData data1 = new UserData();
		data1.addUser(new User("1"));
		data1.addUser(new User("2"));
		data1.addUser(new User("3"));
		data1.addUser(new User("4"));
		data1.addUser(new User("5"));
		userDataList.add(data1);

		UserData data2 = new UserData();
		data2.addUser(new User("6"));
		data2.addUser(new User("7"));
		data2.addUser(new User("8"));
		data2.addUser(new User("9"));
		userDataList.add(data2);

		UserData data3 = new UserData();
		data3.addUser(new User("10"));
		data3.addUser(new User("11"));
		data3.addUser(new User("12"));
		data3.addUser(new User("14"));
		data3.addUser(new User("15"));
		userDataList.add(data3);

		UserData data4 = new UserData();
		data4.addUser(new User("16"));
		data4.addUser(new User("17"));
		data4.addUser(new User("18"));
		data4.addUser(new User("19"));
		userDataList.add(data4);

		UserData data5 = new UserData();
		data5.addUser(new User("20"));
		data5.addUser(new User("21"));
		data5.addUser(new User("22"));
		userDataList.add(data5);

		List<UserData> result = new ArrayList<UserData>();

		for (UserData data : userDataList) {
			if (data.users.size() == 5) {
				result.add(data);
			}
		}

		UserData finalResult = null;
		for (UserData data : result) {
			if (data.users.get(0).id.equals("10")) {
				finalResult = data;
//				break;
			}
		}
		if (finalResult != null) {
			for (User user : finalResult.users) {
				System.out.println(user.id);
			}
		}

	}

}
