package spring.security;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JasyptApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void jasypt() {
        String googleId = "";
        String googleSecret = "";

        System.out.println(jasyptEncoding(googleId));
        System.out.println(jasyptEncoding(googleSecret));
    }

    public String jasyptEncoding(String value) {

        String key = "kim_yu_rim";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }

}
