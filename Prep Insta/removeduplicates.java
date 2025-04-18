package Practice;

public class removeduplicates {
	public static void remove(String str,int idx,StringBuilder newstr,boolean map[]) {
		//basecase
		if(idx == str.length()) {
			System.out.println(newstr);
			return;
		}
		//kaam
		char currchar = str.charAt(idx);
		if(map[currchar-'a']=true) {
			//duplicate
			remove(str, idx+1, newstr, map);
		}else {
			map[currchar-'a']=true;
			remove(str, idx+1,newstr.append(currchar), map);
		}
	}

	public static void main(String[] args) {
		String str = "apnaacollege";
		remove(str,0,new StringBuilder(""),new boolean[26]);

	}

}
