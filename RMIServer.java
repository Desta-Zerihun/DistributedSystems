import java.rmi.registry.*;  
public class RMIServer{  
public static void main(String args[]){  
try{  
RemoteImpl stub=new RemoteImpl();  
Naming.rebind("CalcServer",stub);
System.out.println("The server is up and running");
}catch(Exception e){System.out.println(e);}  
}  

}  
