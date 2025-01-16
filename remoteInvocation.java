java.rmi.*;
public interface RMIDemo extends Remote
{
int add (int x, int y) throws RemoteException;
int mult(int x, int y) throws RemoteException;
}
