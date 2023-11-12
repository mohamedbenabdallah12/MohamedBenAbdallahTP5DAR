package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversion extends Remote {
	public double convMontant (double mnt ) throws RemoteException ;
}
