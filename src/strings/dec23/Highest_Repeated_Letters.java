//23 December 2024

package strings.dec23;

public class Highest_Repeated_Letters {
	public static void main(String[] args) {
		String str="aab ccddd";

		int maxWord=0;
		String result="";
		for (int left=0;left<str.length();){
			int right=left+1;
			while (right<str.length() && str.charAt(right)!=' '){
				right++;
			}
			int[] freq=new int[26];
			int currentMax=0;
			for (int j=left;j<right;j++){
				freq[str.charAt(j)-'a']++;
			}

			for (int i=0;i<26;i++){
				if (freq[i]>1)
					currentMax++;
			}
			if (currentMax>maxWord){
				maxWord=currentMax;
				result="";
				for (int j=left;j<right;j++){
					result+=str.charAt(j);
//					System.out.println(result);
				}
			}
			left=right+1;
		}

		if (result.isEmpty()){
			System.out.println("-1");
		}else {
			System.out.println(result);
		}

	}
}