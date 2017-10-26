package L2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class TestPreResultListenerAction extends ActionSupport{
	
	public String execute() throws Exception {
		System.out.println("TestPreResultListenerAction");
		PreResultListener pr = new MyPreResultListener();
		ActionContext.getContext().getActionInvocation().addPreResultListener(pr);
		return SUCCESS;
	}
}
