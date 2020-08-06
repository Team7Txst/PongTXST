import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args) throws Exception
    {
        try {
            ServerSocket ss = new ServerSocket(39485); //server socket
            Socket cs = ss.accept();
            DataOutputStream out = new DataOutputStream(cs.getOutputStream());
            DataInputStream in = new DataInputStream(cs.getInputStream());
            out.writeInt(123456);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
