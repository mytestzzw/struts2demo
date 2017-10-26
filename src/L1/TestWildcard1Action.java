package L1;

import com.opensymphony.xwork2.Action;

public class TestWildcard1Action implements  Action{

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public String method1() throws Exception {
		System.out.println("TestWildcard1Action.method1");
		return SUCCESS;
	}
}
