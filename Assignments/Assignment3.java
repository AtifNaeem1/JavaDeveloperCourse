package Assignments;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Assignment3 {
    public static void sendPingRequest(String domainName)
    {
        try {
            InetAddress hostIP = InetAddress.getByName(domainName);
            System.out.println(hostIP); //Printing IP address of the domain
            System.out.println("Sending Ping Request to " + domainName);
            if (hostIP.isReachable(5000))
                System.out.println("Host is reachable");
            else
                System.out.println("Sorry ! We can't reach to this host");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    // Driver code
    public static void main(String[] args)
            throws UnknownHostException, IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the domain you want to ping");
        String ipAddress = keyboard.nextLine();
        sendPingRequest(ipAddress);
    }
}
