import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static String intToIp(long i) {
        long b0 = (i >> 24) & 0xFF;
        long b1 = (i >> 16) & 0xFF;
        long b2 = (i >> 8) & 0xFF;
        long b3 = i & 0xFF;
        return b0 + "." + b1 + "." + b2 + "." + b3;
    }

    public static long ipToInt(String ip) throws UnknownHostException {
        return new BigInteger(1, InetAddress.getByName(ip).getAddress()).longValue();
    }


    public static void main(String[] args) throws UnknownHostException {
        String ip1 = "127.255.255.251";
        String ip2 = "128.0.0.4";

        long arr1int = ipToInt(ip1);
        long arr2int = ipToInt(ip2);

        for(long i = arr1int; i <= arr2int; i++) {
            System.out.println(intToIp(i));
        }

    }
}
