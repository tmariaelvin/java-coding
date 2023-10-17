package main.Testing;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class network {
    public static void main(String[] args) {
     /*try{
             URL url = new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
             System.out.println(" get protocol "+url.getProtocol());
             System.out.println(" get Host  "+url.getHost());
             System.out.println(" get port "+url.getPort());
             System.out.println(" get path "+url.getPath());
             System.out.println("  getAuthority "+url.getAuthority());
             System.out.println("  getFile "+url.getFile());
             System.out.println("  getQuery "+url.getQuery());
             System.out.println("  getRef "+url.getRef());
             System.out.println("  getUserInfo "+url.getUserInfo());
             System.out.println("  getContent "+url.getContent());
             System.out.println("  getDefaultPort "+url.getDefaultPort());

        }catch (Exception e){
            System.out.println(e);

        }*/
        try{
            URL url=new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int i;
            while((i=stream.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){System.out.println(e);}

    }
}
