import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client
{
    public static void main(String[] args) throws Exception
    {
        try {
            String ip = Inet4Address.getByName("My IP address").getCanonicalHostName();
            System.out.println(ip);
            InetSocketAddress sa = new InetSocketAddress(ip, 39485);
            Socket cs = new Socket();
            cs.connect(sa);
            DataOutputStream out = new DataOutputStream(cs.getOutputStream());
            DataInputStream in = new DataInputStream(cs.getInputStream());
            System.out.println("received : " + in.readInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
