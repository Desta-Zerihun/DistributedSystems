import java.rmi.*;  

public class RMIClient{  
public static void main(String args[]){  
try{  
RemoteInvocation remoteRef=(RemoteInvocation)Naming.lookup("rmi://localhost:1096/calcServer");  
System.out.println(stub.add(10,5));  
}catch(Exception e){}  
}  
}  
