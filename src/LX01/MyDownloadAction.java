package LX01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class MyDownloadAction extends ActionSupport {
	public InputStream getInputStream() throws Exception {
		return new FileInputStream(new File("e:/mmm.txt"));
	}

}
