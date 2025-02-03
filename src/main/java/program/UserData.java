package program;

import java.util.ArrayList;
import java.util.List;

public class UserData {

	List<User> users;
	public UserData() {
		this.users=new ArrayList<User>();
	}
	public void addUser(User users) {
		this.users.add(users);
	}
}
