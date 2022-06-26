package variable;

public class variable_003 {
	public static void main(String[] args) {
		
		//byte, short, int, long, char
		System.out.println("byte \t:" + Byte.BYTES + "(바이트)-->" + Byte.SIZE + "(비트)\t" +  Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short \t:" + Short.BYTES + "(바이트)-->" + Short.SIZE + "(비트)\t" +  Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("int \t:" + Integer.BYTES + "(바이트)-->" + Integer.SIZE + "(비트)\t" +  Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("long \t:" + Long.BYTES + "(바이트)-->" + Long.SIZE + "(비트)\t" +  Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("char \t:" + Character.BYTES + "(바이트)-->" + Character.SIZE + "(비트)\t" +  (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);
	}
}
