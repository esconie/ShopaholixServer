package server;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

//Client to test server

public class Client {
    
    public static void main(String[] args) throws Exception {
    	client();
    }
    
    public static void client() throws Exception{
    	Socket sock = new Socket("localhost", 789);
        BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));        
        //SEND REQUEST AND PRINT RESPONSE
        System.out.println("Client initialized. Type commands below...");
        while(true){
	        String input = br.readLine();
	        out.println(input);
	        out.flush();
	        String response = in.readLine() + "\n";
	        String thisLine = "";
	        while(true){
	        	thisLine = in.readLine();
	        	if(thisLine == null || thisLine.trim().length() <= 0)
	        		break;
	        	response += thisLine + "\n";
	        }
	        System.out.println(response);
        }
    }
}