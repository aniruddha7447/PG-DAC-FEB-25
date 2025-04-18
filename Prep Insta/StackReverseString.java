package Practice;

import java.util.*;

public class StackReverseString {
	public static String StackReverseString(String str) {
		Stack<Character>s = new Stack<>();
		int idx =0;
		while(idx<str.length()){
			s.push(str.charAt(idx));
			idx++;
		}
		StringBuilder result = new StringBuilder("");
		while(!s.empty()) {
			char curr = s.pop();
			result.append(curr);
		}
		return result.toString();
	}
					

	public static void main(String[] args) {
		String str = "ABC";
		String Result = StackReverseString(str);
		System.out.println(Result);
	}
}

