package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {
	// protected si la classe ConversionServer existe dans le meme packaga
	public ConversionImpl() throws RemoteException {
		super();
	}

	@Override
	public double convMontant(double mnt) throws RemoteException {

		return mnt * 3.3;
	}

}
