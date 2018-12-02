package main_packaget;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Person extends UnicastRemoteObject implements IPerson{

	protected Person() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	private String _name;
	private int _age;
	
	@Override
	public void setName(String name) throws RemoteException{
		this._name = name;
	}
	
	@Override
	public void setAge(int age) throws RemoteException{
		this._age = age; 
	}
	
	@Override
	public String name() throws RemoteException{
		return this._name;
	}

	@Override
	public int age() throws RemoteException{
		return this._age;
	}

}
