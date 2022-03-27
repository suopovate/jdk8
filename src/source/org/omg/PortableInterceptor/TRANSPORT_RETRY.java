package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/TRANSPORT_RETRY.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macos-aarch64/zulu-src/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, January 13, 2022 6:45:12 AM PST
*/

public interface TRANSPORT_RETRY
{

  /**
     * Indicates a Transport Retry reply status. One possible value for 
     * <code>RequestInfo.reply_status</code>.
     * @see RequestInfo#reply_status
     * @see SUCCESSFUL
     * @see SYSTEM_EXCEPTION
     * @see USER_EXCEPTION
     * @see LOCATION_FORWARD
     */
  public static final short value = (short)(4);
}