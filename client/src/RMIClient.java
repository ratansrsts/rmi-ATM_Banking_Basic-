
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class RMIClient {
    public static void main(String args[])
    {
        RMIClient client = new RMIClient();
        client.connectserver();
    }

    private void connectserver() {
    int ch;    
   try{
       
       Registry r=LocateRegistry.getRegistry("127.0.0.1",1234);
       RMI rmi=(RMI) r.lookup("server");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("\nEnter the UserName:"); 
String s=br.readLine(); 
System.out.println("\nEnter the Account Number:"); 
int ac=Integer.parseInt(br.readLine()); 
System.out.println("\nEnter the Initial Amount:"); 
int amt=Integer.parseInt(br.readLine()); 
do 
{ 
System.out.println("\n\t1.Withdraw\n\t2.Deposit\n\t3.Balance\n\t4.Exit");	
System.out.println("\nEnter your choice:"); 
ch=Integer.parseInt(br.readLine()); 
switch(ch) 
{ 
case 1: 
System.out.println("\nEnter amount of Withdraw:"); 
int wd=Integer.parseInt(br.readLine()); 
System.out.println("\nUserName:"+s); 
System.out.println("Account Number:"+ac); 
if(wd>amt) 
System.out.println("Balance less unable to proceed withdraw"); 
else 
{ 
amt=rmi.withdraw(wd,amt); 
System.out.println("Balance:"+amt); 
} 
break; 
case 2: 
System.out.println("\nEnter amount of deposit:"); 
int dp=Integer.parseInt(br.readLine()); 
System.out.println("\nUserName:"+s); 
System.out.println("Account Number:"+ac); 
amt=rmi.deposit(dp,amt); 
System.out.println("Balance:"+amt); 
break; 
case 3: 
System.out.println("\nUserName:"+s); 
System.out.println("Account Number:"+ac); 
amt=rmi.balance(amt); 
System.out.println("Balance:"+amt); 
break; 
} 
}while(ch<4); 
} catch(NotBoundException | IOException | NumberFormatException e) 
{ 
System.out.println("Exception :"+e); 
} 
} 
} 