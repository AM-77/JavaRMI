package main_packaget;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TheServer {

	public static void main(String args[]){
		
		
		try {
			System.setSecurityManager(new SecurityManager());
			IPerson person = new Person();
			
			Registry r = LocateRegistry.createRegistry(1099);
			r.rebind("person", person);
			
			System.out.println("The server is running ...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	
	}
}
