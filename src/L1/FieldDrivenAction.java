package L1;

import com.opensymphony.xwork2.Action;

public class FieldDrivenAction implements Action {
    /*field driven 1*/
	private String account;
	private String password;
	/*field driven 2*/
	private User user;
	
	@Override
	public String execute() throws Exception {
		System.out.println("account:" + account);
		System.out.println("password:" + password);
		System.out.println("user.account:" + user.getAccount());
		System.out.println("user.password:" + user.getPassword());
		return SUCCESS;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
