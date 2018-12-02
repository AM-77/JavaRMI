package main_packaget;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TheClient {

	public static void main (String args[]){
		try {
			Registry r = LocateRegistry.getRegistry(1099);
			IPerson p = (IPerson)r.lookup("person");
			
			p.setAge(77);
			System.out.println(p.age());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
