package L1;

import com.opensymphony.xwork2.Action;

public class TestWildcard2Action implements Action{

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public String method2() throws Exception {
		System.out.println("TestWildcard2Action.method2");
		return SUCCESS;
	}
}
