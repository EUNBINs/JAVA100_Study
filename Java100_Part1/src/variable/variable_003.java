package variable;

public class variable_003 {
	public static void main(String[] args) {
		
		//byte, short, int, long, char
		System.out.println("byte \t:" + Byte.BYTES + "(����Ʈ)-->" + Byte.SIZE + "(��Ʈ)\t" +  Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short \t:" + Short.BYTES + "(����Ʈ)-->" + Short.SIZE + "(��Ʈ)\t" +  Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("int \t:" + Integer.BYTES + "(����Ʈ)-->" + Integer.SIZE + "(��Ʈ)\t" +  Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("long \t:" + Long.BYTES + "(����Ʈ)-->" + Long.SIZE + "(��Ʈ)\t" +  Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("char \t:" + Character.BYTES + "(����Ʈ)-->" + Character.SIZE + "(��Ʈ)\t" +  (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);
	}
}
