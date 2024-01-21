package Encode_Decode_program;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class Encode_Decode_p {

//defult method
String decode(String id){
		
	byte[] decode = Base64.decodeBase64(id);
	return(new String (decode));
	//System.out.println(new String (decode));
	
	
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//EnCode programs 
		String name = "Raju@123";
		
		byte[] encode = Base64.encodeBase64(name.getBytes());
		
		System.out.println("EnCode :- "+encode);
		
		//DeCode programs
		
		byte[] decode = Base64.decodeBase64(encode);
		
		System.out.println("DeCode :- "+new String (decode));
		
		
		//object create
		Encode_Decode_p obj = new Encode_Decode_p();
		//String str= obj.decode("hujEzAb");
		//System.out.println(str);
	
	}

}
