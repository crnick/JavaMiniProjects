
//in NP connection sent a FIN flag in order to close the connection
//both C and S have a socket API
// on S side you have socket.listen () and accept() -> when request is accepted.
// single thread only 1 client is served at a time.
// in multithread once I accept a request I would create a thread, in that thread it opens a socket
//context switching to switch threads 
public class MultithreadServer {
}
