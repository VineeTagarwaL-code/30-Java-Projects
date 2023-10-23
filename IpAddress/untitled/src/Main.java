import java.net.InetAddress;
import java.net.UnknownHostException;
public class Main {
    public static void main(String[] args) throws  UnknownHostException {
     getHost();

    }

    static void getHost() throws UnknownHostException{
        InetAddress ip = InetAddress.getLocalHost();

        System.out.println("Host :" +ip.getHostName());
        System.out.println("IP Address  :" +ip.getHostAddress());
    }
}