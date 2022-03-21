//сортировка чисел из строки
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
public class Main {
	public static void main(String[] args) throws IOException {
	    		 try (PrintWriter out = new PrintWriter("output.txt")) {
	 	List<String> lines = Files.readAllLines(Paths.get("input.txt"));
	    			 Collections.sort(lines);
	    		        for(String str: lines) {
	    		        	out.println(str.replaceAll("[0-9]", ""));
	    		        }        
	  }
	}
 
}
