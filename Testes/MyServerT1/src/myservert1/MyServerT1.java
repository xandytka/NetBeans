/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myservert1;
import java.io.*;
import java.net.*;

/**
 *
 * @author Xandy
 */
public class MyServerT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hostname = "192.168.0.12";               //Declaração do Host
        int port = 8910;            			//Declaração da porta
        ServerSocket serverSocket;  			//Declaração do ServerSocket
        Socket socket;              			//Declaração do Socket
        OutputStream output;				//Declaração da Saida (byte)
        InputStream input;				//Declaração da Entrada (byte)
        BufferedOutputStream bufferedOutputStream;	//Declaração da Saida (linha de texto)
        BufferedInputStream bufferedInputStream;	//Declaração da Entrada (linha de texto)
        BufferedReader reader;
        PrintWriter writer;
        String texto = "";
        
        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);
            while (!texto.equals("bye")) {
                socket = serverSocket.accept();

                System.out.println("New client connected");

                input = socket.getInputStream();
                reader = new BufferedReader(new InputStreamReader(input));

                texto = reader.readLine();

                System.out.println(texto);

                output = socket.getOutputStream();
                writer = new PrintWriter(output, true);

                writer.println(texto);
            }
            
        }catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
        
    
}
