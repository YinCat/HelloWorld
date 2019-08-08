package com.agree.aftcli;

import cn.com.agree.aft4c.sdk.api.model.local.TransferArgs;
import cn.com.agree.aft4c.sdk.api.model.local.UploadFile;

public class aftcli {
	private UploadFile uploadFile;
	private TransferArgs transferArgs;
	
	public String user = "admin";
	public String passwd = "testPw123";
	
	public static String R_APP = "base";
	public aftcli() {
		// TODO Auto-generated constructor stub
	}
	public aftcli(UploadFile uploadFile, TransferArgs transferArgs) {
		// TODO Auto-generated constructor stub
		this.uploadFile = uploadFile;
		this.transferArgs = transferArgs;
	}
}
