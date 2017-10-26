package L1;

import com.opensymphony.xwork2.Action;

public class TestNamespace implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("test namespace");
		return SUCCESS;
	}

}
