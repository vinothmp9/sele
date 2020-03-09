package important;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Happy";
		String reverse = "";
	
		//method 1
		int length = word.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		System.out.print(reverse);
 
		
		//method 2:
		StringBuffer rev=new StringBuffer(word);
		System.out.println(rev.reverse());
		System.out.println(rev.reverse());
	}
}
