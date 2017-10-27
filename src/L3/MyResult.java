package L3;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;

public class MyResult implements Result {

	@Override
	public void execute(ActionInvocation arg0) throws Exception {
		System.out.println("my result");
		
	}

}
