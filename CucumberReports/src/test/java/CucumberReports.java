import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CucumberReports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\dmahindrakar\\Desktop\\Expleo Java Training\\Selenium\\seleniumProject\\Selenium_Jenkins\\CucumberReports\\src\\main\\resources\\demo.properties");
		
		FileInputStream fileInput  = null;
		
		try {
			fileInput = new FileInputStream(file);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();

	//load properties file
	
	try {
		prop.load(fileInput);
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	}
}
