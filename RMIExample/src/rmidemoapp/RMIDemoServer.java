package rmidemoapp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class RMIDemoServer {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		RMIDemoImpl rMIDemoImpl = new RMIDemoImpl();
		Naming.rebind("RMIDemo", rMIDemoImpl);
		System.out.println("RMIDemo object bound to the name 'RMIDemo' and is ready for use... ");

	}

}
