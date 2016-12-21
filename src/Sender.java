import java.math.BigInteger;

public class Sender extends Speaker {

    private RSA rsa;

    public Sender(String name) {
        super(name);
        rsa = new RSA();
    }

    public BigInteger encrypt(BigInteger m) {
        return decrypt(m, rsa.getD(), rsa.getN());
    }

}
