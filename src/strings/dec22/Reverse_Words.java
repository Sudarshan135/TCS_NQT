//23 December 2024
package strings.dec22;

public class Reverse_Words {
	public static void main(String[] args) {
		String str="this is an amazing program";

		String [] words=str.split(" ");
		StringBuffer ans=new StringBuffer();
		for (int i=words.length-1;i>=0;i--){
			ans.append(words[i]+" ");

		}
		System.out.println(ans);
	}
}