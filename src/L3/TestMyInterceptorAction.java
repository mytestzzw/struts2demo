package L3;

import com.opensymphony.xwork2.Action;

public class TestMyInterceptorAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("TestMyInterceptorAction");
		return SUCCESS;
	}

}
