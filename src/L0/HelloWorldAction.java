package L0;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("Hello World!");
		return SUCCESS;
	}
	
}
