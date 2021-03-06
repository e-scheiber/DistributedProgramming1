package CmmdcApp;


/**
* CmmdcApp/CmmdcPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cmmdc.idl
* Thursday, November 2, 2017 11:15:53 AM EET
*/

public abstract class CmmdcPOA extends org.omg.PortableServer.Servant
 implements CmmdcApp.CmmdcOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("cmmdc", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CmmdcApp/Cmmdc/cmmdc
       {
         long a = in.read_longlong ();
         long b = in.read_longlong ();
         long $result = (long)0;
         $result = this.cmmdc (a, b);
         out = $rh.createReply();
         out.write_longlong ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CmmdcApp/Cmmdc:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Cmmdc _this() 
  {
    return CmmdcHelper.narrow(
    super._this_object());
  }

  public Cmmdc _this(org.omg.CORBA.ORB orb) 
  {
    return CmmdcHelper.narrow(
    super._this_object(orb));
  }


} // class CmmdcPOA
