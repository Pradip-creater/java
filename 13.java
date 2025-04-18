import java.net.*;

public class URLInfo {
    public static void main(String[] args) {
        try {
            // Create URL object
            URL url = new URL("http://www.msbte.org.in");

            // Retrieve and display components
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host    : " + url.getHost());
            System.out.println("Port    : " + url.getPort()); // -1 if default port
            System.out.println("File    : " + url.getFile());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL!");
        }
    }
}
