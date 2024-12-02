package application;
import java.util.ArrayList;

public class Array_Users {
	private ArrayList<User> Users=new ArrayList<User>();
	private ArrayList<Integer>  IDs=new ArrayList<Integer>();
	
	public ArrayList<User> getUsers() {
		return Users;
	}

	public void setUsers(ArrayList<User> users) {
		Users = users;
	}
	public void addUser(User u,String name,String username,String pass) {
		u.setID();
		u.setInfo(name, username);
		u.setPassword(pass);
		Users.add(u);
		IDs.add(u.getID());
	}
	public int removeUser(User u) {
		if(IDs.contains(u.getID())) {
			Users.remove(u);
			return 1;
		}
		return 0;
	}
	//return 1 if oepration is succesful else 0
	public int  changeUserName(User u,String new_name) {
		if(IDs.contains(u.getID())) {
			u.setUsername(new_name);
			return 1;
		}
		return 0;
		
	}
	//same for changing the name and all the rest of the attributes
	public int changeName(User u,String new_name) {
		if(IDs.contains(u.getID())) {
			u.setName(new_name);
			return 1;
		}
		return 0;
	}
	public int changePass(User u,String new_password) {
		if(IDs.contains(u.getID())) {
			u.setPassword(new_password);
			return 1;
		}
		return 0;
	}
	
	
}
