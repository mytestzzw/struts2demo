package L2;

import com.opensymphony.xwork2.Action;

public class TestWildcardAndGetValueAction implements Action{
    private String folder;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return NONE;
	}

	public String method()  {
		setFolder("testfolder");
		System.out.println("test wildcard and get value");
		return "testsuccess";
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}
	
}
