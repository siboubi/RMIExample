package rmidemoapp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIDemoClient {

	/**
	 * @param args
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		if(args.length == 2){
			String url=new String("rmi://"+args[0]+"/RMIDemo");
			RMIDemo rMIDemo = (RMIDemo)Naming.lookup(url);
			String serverReply = rMIDemo.doCommunicate(args[1]);
			System.out.println("Server Reply: "+serverReply);
		} else {
			System.err.println("Usage: RMIDemoClient <server> <name>");
		}

	}

}
