import java.rmi.*; 
import java.rmi.server.*; 
public abstract class BankImpl extends UnicastRemoteObject implements RMI 
{ 
public BankImpl()throws RemoteException 
{} 

    @Override
public int withdraw(int a,int amt)throws RemoteException 
{ 
amt=amt-a; 
return(amt); 
} 

@Override
public int deposit(int b,int amt)throws RemoteException 
{ 
amt=amt+b; 
return(amt); 
} 
@Override
public int balance(int amt)throws RemoteException 
{ 
return(amt); 
} 

    
} 