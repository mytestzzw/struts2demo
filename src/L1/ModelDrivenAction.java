package L1;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class ModelDrivenAction implements Action,ModelDriven{
    private User user = new User();
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.getAccount());
		System.out.println(user.getPassword());
		return SUCCESS;
	}

	@Override
	public Object getModel() {
		return user;
	}

}
