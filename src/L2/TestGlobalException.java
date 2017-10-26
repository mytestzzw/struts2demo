package L2;

import com.opensymphony.xwork2.Action;

public class TestGlobalException implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("test global exception");
		String[] a = new String[1];
		a[2] = "3";
		return null;
	}

}
