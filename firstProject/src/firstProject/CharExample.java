package firstProject;

public class CharExample {
	public static void main(String[] args) {
		// int, String, boolean, char
		// byte(1byte) < char, short(2byte) < int < long
		char myFirstCharType = 97;
		
		System.out.println(myFirstCharType);
		
		byte b1 = 10; // 1byte(8bit) ||
		// 0 0 0 0 0 0 0 0 = 1byte
		// 2*1 2*2 2*3 2*8 => 256°¡Áö. (-128 ~ 127)
		b1 = 127;
		b1++; // b1 = b1 + 1;
		
		System.out.println(b1);
		
		short s1 = 0;
		// short -32768 ~ 32767
		int result = (int)(b1 + s1); // -128 + 0 , short + short
		System.out.println(Integer.MAX_VALUE);
		
		long fakeLong = 2147483648L;
	}
}
