package com.agree.test;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.agree.socketcomm.TcpClient;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TcpClient t1 = new TcpClient("0.0.0.0",600000);
//		TcpClient t2 =t1;
//		System.out.println(t1.equals(t2));
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		System.out.println(df.format(new Date()));
//		System.out.println(0x20);
//		String abContent = "<![CDATA[1.02018100220223000000001202010000000000955                                  01唐果                          42118119941030663X]]>";
//		
//		String head=abContent.substring(0,26);
//		String totalcount=abContent.substring(26,34);
//		String successcount=abContent.substring(26,34);
//		String failcount="00000000";
//		String qfjg="贵州省贵阳公安机关                                ";
//		String result="00";
//		String num=abContent.substring(26,34).replace("0","");
//		String list_tmp = null;
//		for(int i=0;i<Integer.parseInt(num);i++){
//				byte[] bInt = null;
//				try {
//					bInt = abContent.getBytes("gbk");
//				} catch (UnsupportedEncodingException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				int len = 30;
//				int len1 = 18;
//				byte[] bt1 = new byte[30];
//				byte[] bt2 = new byte[18];
//				System.arraycopy(bInt, 0, bt1, 0, 5);
//				System.arraycopy(bInt, 0, bt2, 0, 10);
//				//System.arrayCopy(bInt, 88+48*i, bt1, 0, 30);
//				//System.arrayCopy(bInt, 118+48*i, bt2, 0, 18);
//				String name = null;
//				try {
//					name = new String(bt1, "gbk");
//				} catch (UnsupportedEncodingException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				String idnumber = null;
//				try {
//					idnumber = new String(bt2, "gbk");
//				} catch (UnsupportedEncodingException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
////				logger.info("----------:"+name);
////				logger.info("----------:"+idnumber);
//				list_tmp=list_tmp+name+idnumber+qfjg+result+"\n";
//		}
//
//		String list=head+totalcount+successcount+failcount+"\n"+list_tmp+"]]>";
//		System.out.println(list);
//		String data = "2.0";
//		String data1 = "2";
//		String s = null;
//		System.out.println(s.isEmpty());
//		Long l = Long.parseLong("2.0");
//		System.out.println(new BigDecimal("1.000").stripTrailingZeros().toPlainString());
//		System.out.println(new BigDecimal("0.100").toString());
//		System.out.println(String.valueOf(new BigDecimal("0.100")));
		outer:for (int i = 0; i < 5; i++) {
			System.out.println(i);
			for (int j = 10; j < 15; j++) {
				System.out.println(j);
				if (j == 13) {
					break outer;
				}
			}
		}
	}
}
