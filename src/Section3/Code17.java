package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code17 {	// 텍스트 파일 단어 개수 구하기 수정할 부분 많음
	
	static String[] words = new String[100000];
	static int[] count = new int[100000];
	static int n = 0;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("read")) {
				String fileName = kb.next();
				makeIndex(fileName);
			}
			else if(command.equals("find")) {
				String keyword = kb.next();
				int index = findWord(keyword);
				if(index > -1)
					System.out.println("The word " + words[index] + " appears " + count[index] + " times.");
				else
					System.out.println("The word " + keyword + " doesn't appear");
			}
			else if(command.equals("saveAs")) {
				String fileName = kb.next();
				saveAs(fileName);
			}
			else if(command.equals("exit"))
				break;
		}
		kb.close();
		
		for(int i = 0; i < n; i++)
			System.out.println(words[i] + " " + count[i]);
	}
	
	public static void makeIndex(String fileName) {
		try {
			Scanner theFile = new Scanner(new File(fileName));
			while(theFile.hasNext()) {
				String word = theFile.next();
				addWord(word);
			}
			theFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not exist!");
		}
	}
	
	public static void addWord(String word) {
		int index = findWord(word);
		if(index != -1) {
			count[index]++;
		}
		else {
			words[n] = word;
			count[n] = 1;
			n++;
		}
	}
	
	public static int findWord(String keyword) {
		for(int i = 0; i < n; i++)
			if(words[i].equalsIgnoreCase(keyword))
				return i;
		return -1;
	}
	
	public static void saveAs(String fileName) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter(fileName));
			for(int i = 0; i < n; i++) {
				out.println(words[i] + " " + count[i]);
			}
			out.close();
		} catch (IOException e) {
			System.out.println("Save failed. Don't ask me why!");
			return;	// return 쓰나 안 쓰나 끝나는 부분이기에 상관없다
		}
	}
}
