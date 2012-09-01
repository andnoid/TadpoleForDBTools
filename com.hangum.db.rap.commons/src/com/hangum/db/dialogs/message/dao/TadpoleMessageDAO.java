/*******************************************************************************
 * Copyright (c) 2012 Cho Hyun Jong.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cho Hyun Jong - initial API and implementation
 ******************************************************************************/
package com.hangum.db.dialogs.message.dao;

import java.util.Date;

/**
 * system message dao
 * 
 * @author hangum
 *
 */
public class TadpoleMessageDAO  {
	
	/** 실행시간*/
	Date dateExecute;
	/** sql text */
	String strMessage;

	public TadpoleMessageDAO(Date dateExecute, String strMessage) {
		this.dateExecute = dateExecute;
		this.strMessage = strMessage;
	}

	public Date getDateExecute() {
		return dateExecute;
	}

	public void setDateExecute(Date dateExecute) {
		this.dateExecute = dateExecute;
	}

	public String getStrMessage() {
		return strMessage;
	}

	public void setStrMessage(String strMessage) {
		this.strMessage = strMessage;
	}
	
	
}
