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
			String[] r = new String[s]; 
			int [] number =  new int[s];
			
			for(String line: lines){
				Pattern p = Pattern.compile("(\\d+)");
					Matcher m = p.matcher(line);
					while(m.find() && i < s)
					{
					    String a = m.group(1);
					    int f = Integer.parseInt(a);
					    arr[i] = f;
					    r[i] = line;
					    i++;
					}
			}
			for (i=0; i< s ; i++) {
				number[i]=i+1;
			}
			for (int j= 0 ; j < s; j ++) {
				i = j -1;
				// String.valueOf(arr[i] ) - исправить
				while ( i >= 0 && r[i].contains(String.valueOf(arr[i])) && arr[i] > number[i] ){
					String temp = r[i];
					r[i]= r[i+1];
					r[i+1] = temp;
					i--;
				}
				 }
			for (i= 0 ; i< s ; i++) {
				System.out.println(r[i] + "  " + arr[i] + " " + number[i] + " " );
			}
	  }
	}
 
}

Как должно выглядеть по идее :
	// объявить сканнера
	// объявить массив (с неизвестной длиной)
	// объявить строковую перпеменную (с нулевым значением)
	// создать цикла для ввода строк при неизвестном заранее количестве итераций, работающий до ввода Stop
	// определить длины массива с учетом нулевой ячейки (минус 1)
	// объявить пустой массив
	// создать цикл с длиной без ячейки Stop
	// объявить переменную х и присваиваем ей значение числа (отфильтровываем)
	// объявить переменную у и присваиваем ей значение НЕчисла (отфильтровываем)
	// сформировать (заданным образом) ячейку и заносим в массив
	// выводим циклом в новый файл полученный результат
	
