import java.util.*;

public class GeneratePare{
	/* Print all valid combinations of n pairs of parentheses
	 *	
	 */	
		 
	public static ArrayList<String> generateParen(int n) {
		ArrayList<String> result = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		parenHelper(0, n, n, sb, result);
		return result;
	}
	
	public static void parenHelper(int n, int left, int right, StringBuffer sb, ArrayList<String> result) {
		if (left < 0 || right < left)  return;
		
		if (left == 0 && right == 0) {
			result.add(sb.toString());
		} else {
			if (left > 0) {
				sb.append('(');
				parenHelper(n + 1, left - 1, right, sb, result);
				sb.deleteCharAt(sb.length() - 1);
			}
			
			if (right > 0) {
				sb.append(')');
				parenHelper(n + 1, left, right - 1, sb, result);
				sb.deleteCharAt(sb.length() - 1);
			}
		}
	}
	

		
	public static void main(String[] str) {
		System.out.println(generateParen(3));
	}	
}
