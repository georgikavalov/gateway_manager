package com.musala.gm.model;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Peripheral {
	private static final Logger LOGGER = LoggerFactory.getLogger(Peripheral.class);
	private final int uID;
	private final String vendor;
	private final Date creationDate;
	private boolean onlineStatus;

	public Peripheral(int uID, String vendor) {
		super();
		this.uID = uID;
		this.vendor = vendor;
		creationDate = new Date(System.currentTimeMillis());
		onlineStatus = false;
	}

	public Peripheral(int uID, String vendor, Date creationDate, boolean onlineStatus) {
		super();
		this.uID = uID;
		this.vendor = vendor;
		this.creationDate = creationDate;
		this.onlineStatus = onlineStatus;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public int getUID() {
		return uID;
	}

	public String getVendor() {
		return vendor;
	}

	public boolean isOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(boolean onlineStatus) {
		this.onlineStatus = onlineStatus;
		if (this.onlineStatus) {
			LOGGER.info("Peripheral {} is online", uID);
		} else {
			LOGGER.info("Peripheral {} is offline", uID);
		}
	}
}
