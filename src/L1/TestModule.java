package L1;

import com.opensymphony.xwork2.Action;

public class TestModule implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("test module");
		return SUCCESS;
	}

}
