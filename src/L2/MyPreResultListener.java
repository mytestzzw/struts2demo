package L2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class MyPreResultListener implements PreResultListener {

	@Override
	public void beforeResult(ActionInvocation arg0, String arg1) {
		System.out.println("before result");
		
	}

}
