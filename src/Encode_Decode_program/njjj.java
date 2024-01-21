package Encode_Decode_program;

import org.apache.commons.codec.binary.Base64;

public class njjj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "zakir";
	

		byte[] code = Base64.encodeBase64(id.getBytes());

		System.out.println(code);
		
		String s = new String(code);

		byte[] code1 = Base64.decodeBase64(s);

		System.out.println(new String(code1));
	}
}
