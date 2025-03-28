import java.io.IOException;
import java.net.ServerSocket;

//in NP connection sent a FIN flag in order to close the connection
//both C and S have a socket API
// on S side you have socket.listen () and accept() -> when request is accepted.
// single thread only 1 client is served at a time.
// in multithread once I accept a request I would create a thread, in that thread it opens a socket
//context switching to switch threads has different algorithms round robin, FIFO
//everytime you spawn a thread it has a thread block (created by OS) it has id state, CPU info, registers (cpus closed storage space.) priority
//if you create 10k threads it will eat into memory
//we are already creating 100 threads in a thread pool (ready threads) threadPoolexecutor, and use a queue to line up tasks if threads are busy
public class MultithreadServer {
    public void run() throws IOException {
        int port = 8010; //define a socket on which server will listen to requests.
        ServerSocket server = new ServerSocket(port); //creating a server socket bounded to a port.
        server.setSoTimeout(10000); //will close the connection after waiting.
        while(true){
            System.out.println("Server is listing on port"+port);
        }

    }
    public static void main(String[] arg){

    }
}
