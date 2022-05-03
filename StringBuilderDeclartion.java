import java.util.*;
public class StringBuilderDeclartion {
	public static void main(String args[]) {
		StringBuilder sb =new StringBuilder("sunil");
		System.out.println(sb);
		System.out.println(sb.charAt(3));// printing at index 0 in string s as output.
		// set charAt index
		sb.setCharAt(0, 'H');  // it set that charater in index to another character.
		System.out.println(sb);
		// insert
		sb.insert(0, 'S');  // from that  index to insert to character like that.
		System.out.println(sb);
		//delete
		sb.delete(1, 2); // from where you want to delete  at last index.
		System.out.println(sb);
		// append
		sb.append("K");
		sb.append("U");
		System.out.println(sb);
	}

}
