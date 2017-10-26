package L2;

import com.opensymphony.xwork2.Action;

public class TestLocalExceptionAction implements Action {

	@Override
	public String execute() throws Exception {
		int a = 5/0;
		return SUCCESS;
	}

}
