package com.musala.gm.model;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gateway {

	private static final Logger LOGGER = LoggerFactory.getLogger(Gateway.class);
	
	private final String serialNumber;
	private final String ident;
	private final Inet4Address ipAddress;
	private Peripheral[] peripherals;

	public Gateway(String serialNumber, String ident, byte[] ipAddress){
		this.serialNumber = serialNumber;
		this.ident = ident;
		this.ipAddress = makeIPAddress(ipAddress);
		peripherals = new Peripheral[10];
	}
	
	public void addPeripheral(Peripheral peripheral) {
		peripherals[peripherals.length-1] = peripheral;
	}
	
	public void addPeripheral(int uID, String vendor) {
		peripherals[peripherals.length-1] = new Peripheral(uID, vendor);
	}
	
	public String getIdent() {
		return ident;
	}
	
	public String getIpAddress() {
		return ipAddress.getHostAddress();
	}

	public Peripheral[] getPeripherals() {
		return peripherals;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public boolean isValid() {
		return this.ipAddress != null;
	}

	private Inet4Address makeIPAddress(byte[] ipAddress) {
		Inet4Address retVal = null;
		try {
			retVal = (Inet4Address) Inet4Address.getByAddress(ipAddress);
		} catch (UnknownHostException e) {
			LOGGER.error("Failed creating an IP address");
		}		
		return retVal;
	}
}