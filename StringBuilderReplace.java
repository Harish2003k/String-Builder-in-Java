import java.util.*;
public class StringBuilderReplace {
	public static void main(String args[]) {
		StringBuilder sb=new StringBuilder("java is programming language.");
		sb.replace(8, 20, "Computer");
		System.out.println(sb);
	}

}
