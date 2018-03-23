/**
 * 
 */
package bin;

import java.io.IOException;
import java.util.LinkedList;

/**
 * @author ab.srivastava
 *
 */
public class Wrapper {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		LinkedList<Request> objectRequest  = null;
		try {
			  objectRequest=	ExcelEngine.readExcel("/home/ab.srivastava/Desktop/abc.xls","Sheet1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Request a:objectRequest) {
			System.out.println(a.getApiName());
			
		}
	
	}

}
