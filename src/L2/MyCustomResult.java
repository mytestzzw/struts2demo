package L2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;

public class MyCustomResult implements Result{

	@Override
	public void execute(ActionInvocation arg0) throws Exception {
		System.out.println(arg0.getResultCode());
		
	}

}
