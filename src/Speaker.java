import java.math.BigInteger;

public class Speaker {

    private String name;

    public Speaker(String name) {
        this.name = name;
    }

    protected BigInteger decrypt(BigInteger m, BigInteger e, BigInteger n) {
        return m.pow(e.intValue()).mod(n);
    }
}
