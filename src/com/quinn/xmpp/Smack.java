package com.quinn.xmpp;


/**
 * 
 * @author Quinn
 * @date 2015-1-28
 */
public interface Smack{
	
	public boolean connect(String ip, int port,String service);
	public boolean login(String account, String passoword);
}
