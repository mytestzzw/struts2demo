package LX01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.opensymphony.xwork2.Action;

public class MyUploadAction implements Action{
    private File myFile;
    private String myFileFileName;
    private String myFileContentType;
    
	@Override
	public String execute() throws Exception  {
		System.out.println(myFileFileName+":" +myFileContentType);
		FileInputStream is = null;
		FileOutputStream os = null; 

		try {
			is = new FileInputStream(myFile);
			os = new FileOutputStream("e:/temp1/"+myFileFileName);
			byte[] b = new byte[1024];
			int length = 0;
			while((length = is.read(b))>0) {
				os.write(b, 0, length);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	
		return SUCCESS;
	}
	
	public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}
	public String getMyFileFileName() {
		return myFileFileName;
	}
	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
	public String getMyFileContentType() {
		return myFileContentType;
	}
	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

}
