package ACM;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static final byte[] computteMD5(byte[] content){
        try{
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return md5.digest(content);
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
}
