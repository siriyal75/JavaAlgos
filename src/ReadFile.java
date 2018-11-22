import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		readFile("/Users/seesari/ibngseleniumautomation/pom.xml");
	}
	
	public static void readFile(String filePath) throws FileNotFoundException {
		
		FileReader fr = new FileReader(filePath);
		BufferedReader fbr = new BufferedReader(fr);
		//StringBuffer sbr = new StringBuffer();
		
		try {
			
			while(fbr.readLine()!=null) {
			
				System.out.println(fbr.readLine());
				Thread.sleep(100);
			}
			
			fbr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
