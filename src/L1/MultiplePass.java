package L1;

import java.util.List;

import com.opensymphony.xwork2.Action;

public class MultiplePass implements Action {
    private String[] array;
    private List<String> list;
    private List<User> users;
    
	@Override
	public String execute() throws Exception {
		System.out.println("array:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("------------------------");
		System.out.println("list:");
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		System.out.println("list for object:");
		for(User user:users) {
			System.out.println(user.toString());
		}
		return SUCCESS;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	
}
