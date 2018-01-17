
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1641368BJ
 */
public interface RMI extends Remote {
    public String getData (String text) throws RemoteException;
    
int withdraw(int a,int amt)throws RemoteException; 
int deposit(int b,int amt)throws RemoteException; 
int balance(int amt)throws RemoteException; 

 
    
}
