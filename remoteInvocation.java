java.rmi.*;
public interface RMIInvocation extends Remote
{
int add (int x, int y) throws RemoteException;
int mult(int x, int y) throws RemoteException;
}
