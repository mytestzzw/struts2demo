package L2;

import com.opensymphony.xwork2.Action;

public class TestGlobalResultAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("testglobalresult");
		return "testglobalresult";
	}

}
