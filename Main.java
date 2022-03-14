import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt")) ;
	    		PrintWriter out = new PrintWriter("output.txt")){
			List<String> lines = Files.readAllLines(Paths.get("input.txt"));
			int i = 0;
			int s = lines.size();
			int[] arr = new int[s];
			Pattern p = Pattern.compile("(\\d+)");
			for(String line: lines){
					Matcher m = p.matcher(line);
					while(m.find() && i < s)
					{
					    String a = m.group(1);
					    int f = Integer.parseInt(a);
					    arr[i] = f;
					    i++;
					}
			}
			for (i= 0 ; i< s ; i++) {
				Arrays.sort(arr);
				out.print(arr[i] + " ");
			}
	  }
	}

}
