/**
 * 
 */
package rmidemoapp;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author siboubib
 *
 */
public interface RMIDemo extends Remote {
	public String doCommunicate(String name) throws RemoteException;

}
