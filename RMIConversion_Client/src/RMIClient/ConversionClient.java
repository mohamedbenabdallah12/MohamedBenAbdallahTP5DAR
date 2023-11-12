package RMIClient;

import java.rmi.Naming;

import rmiService.IConversion;

public class ConversionClient {

	public static void main(String[] args) {
		try {
			IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1099/objetDistant");
			System.out.println(stub.convMontant(1565.00));
			System.out.println(stub.convMontant(1234.00));	
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
