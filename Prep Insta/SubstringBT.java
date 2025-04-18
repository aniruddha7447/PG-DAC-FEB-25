package Practice;

public class SubstringBT {
	public static void substring(String str,String ans,int i) {
		//base case
		if(str.length()==i) {
			if(ans.length()==0) {
				System.out.println("null");
			}else {
			System.out.println(ans);
			}
			return;
		}
		//recursion
		//yeschoice
		substring(str,ans+str.charAt(i),i+1);
		//no choice
		substring(str,ans,i+1);
	}

	public static void main(String[] args) {
		/*
		 * "abc"
		 * a,b,c,ab,bc,ac,abc,cba
		 * i=character indx
		 */
		String str = "abc";
		substring(str,"",0);
		}
	}

