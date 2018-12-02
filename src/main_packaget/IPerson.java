package main_packaget;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPerson extends Remote {

	public String name() throws RemoteException;
	public int age() throws RemoteException;
	public  void setName(String name) throws RemoteException;
	public void setAge(int age) throws RemoteException;
}
