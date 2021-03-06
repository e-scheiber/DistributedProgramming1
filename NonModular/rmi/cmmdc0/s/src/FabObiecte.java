package cmmdc.rmi.s;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import cmmdc.rmi.i.IFabObiecte;
import cmmdc.rmi.i.ICmmdc0;

public class FabObiecte implements IFabObiecte{

  public ICmmdc0 getCmmdc() throws RemoteException{
    ServerCmmdc cmmdc=new ServerCmmdc();
    return cmmdc;
  }
  
  public static void main(String args[]){
    String host="localhost";
    int port=1099;
    if(args.length>0)
      port=Integer.parseInt(args[0]);
    try{
      FabObiecte obj=new FabObiecte();
      IFabObiecte stub=(IFabObiecte)UnicastRemoteObject.exportObject(obj,0);
      Registry registry=LocateRegistry.getRegistry(host,port);
      registry.bind("ObjectFactory",stub);
      System.out.println("ObjectFactory ready");
      System.out.println("Press Enter to finish !");
      System.in.read();
    }
    catch(Exception e){
      System.out.println("Factory err "+e.getMessage());
    }
  }
}
