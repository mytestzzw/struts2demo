package L2;

import com.opensymphony.xwork2.Action;

public class TestCustomResultAction implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("TestCustomResultAction");
		return "aaa";
	}

}
