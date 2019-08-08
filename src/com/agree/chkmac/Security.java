package com.agree.chkmac;

import java.io.UnsupportedEncodingException;

import com.union.api.UnionCSSP;
import com.union.api.UnionCSSP.Recv;

public class Security {
	static UnionCSSP cssp = new UnionCSSP();

	public static String keyVersion = "1";
	public static String mode = "1";
	public static String keyValue = "";
	public static String algorithmID = "1";
	public static String fillMode = "1";
	public static String dataType = "1";
	public static String macKey = "GYNS.IBP-SM4.zak";
	
	public static Recv servE151(byte[] reqData,String mac) {
		Recv recv = cssp.servE151_GYNS(keyVersion, mode, macKey, keyValue, algorithmID, fillMode, dataType, reqData, mac);
		return recv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pkg = "test";
		String mac = "123432";
		Recv r = null;
		try {
			r = servE151(pkg.getBytes("utf-8"), mac);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(r.getResponseCode());
		System.out.println(r.getResponseRemark());
	}

}
