import org.apache.commons.codec.binary.Base64;
public class encode{

    public static void main(String args[]) throws IOException {
        String orig = "core";
        byte[] encoded = Base64.encodeBase64(orig.getBytes());     
       System.out.println("Original String: " + orig );
        System.out.println("Base64 Encoded String : " + new String(encoded));
        }
}


Read more: http://javarevisited.blogspot.com/2012/02/how-to-encode-decode-string-in-java.html#ixzz5ANVkyE4u
