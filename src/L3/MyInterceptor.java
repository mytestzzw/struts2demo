package L3;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {
    private String myInterceptorparam;
	@Override
	public void destroy() {
		System.out.println("My interceptor destory");
		
	}

	@Override
	public void init() {
		System.out.println("My interceptor init");
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("My interceptor begin intercept");
		System.out.println("myInterceptorparam:"+myInterceptorparam);
		System.out.println("Action name:" + arg0.getAction().getClass().getName());
		System.out.println("Action method:" + arg0.getProxy().getMethod());
		String rsc = arg0.invoke();
		System.out.println("Result code:" + rsc);
		return rsc;
	}

	public String getMyInterceptorparam() {
		return myInterceptorparam;
	}

	public void setMyInterceptorparam(String myInterceptorparam) {
		this.myInterceptorparam = myInterceptorparam;
	}

}
