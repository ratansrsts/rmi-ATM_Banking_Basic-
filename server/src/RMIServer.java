
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1641368BJ
 */
public class RMIServer extends UnicastRemoteObject implements RMI{
public RMIServer() throws RemoteException
{
    
super();

}
   
 public static void main(String args[])
 {
     try{
         Registry reg=LocateRegistry.createRegistry(1234);
         
         reg.rebind("server",new RMIServer());
         
         System.out.println("Serevr is ready"); 
     }catch(Exception e)
     {
         System.out.println(e);
         }
 }

    @Override
    public String getData(String text) throws RemoteException {
    return null;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int withdraw(int wd, int amt) throws RemoteException {
    
        amt=amt-wd;
        return amt;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deposit(int dp, int amt) throws RemoteException {
        amt=amt+dp;
    return amt;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int balance(int amt) throws RemoteException {
    return amt;
         //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
