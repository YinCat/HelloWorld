package com.agree.socketcomm;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		//开发环境
//		TcpClient tcp = new TcpClient("172.31.231.27", 9102);
//		tcp.chat(new File("E:\\GRCB\\Test\\UpbsTool\\message\\AGAF\\F0002.xml"));
		//sitesb
//		TcpClient tcp = new TcpClient("172.31.233.253", 10046);
//		tcp.chat(new File("C:\\Users\\Yinlong\\Desktop\\TMP\\test.xml"));
		//sitafa
//		TcpClient tcp = new TcpClient("172.31.233.39", 9102);
//		tcp.chat(new File("E:\\GRCB\\Test\\UpbsTool\\message\\AGAF\\B0002_sit.xml"));
//		tcp.chat(new File("E:\\GRCB\\Test\\UpbsTool\\message\\AGAF\\F0001_sit.xml"));
//		tcp.chat(new File("E:\\GRCB\\Test\\UpbsTool\\message\\AGAF\\S0001_sit.xml"));
//		tcp.chat(new File("E:\\GRCB\\Test\\UpbsTool\\message\\AGAF\\F0002_sit.xml"));
		//开发环境
//		TcpClient tcp = new TcpClient("172.31.231.27", 9004);
//		tcp.chat(new File("E:\\GRCB\\Test\\UpbsTool\\message\\AGAF\\C0001.tim"),"");
		//开发环境
		TcpClient tcp = new TcpClient("172.31.234.72", 9102);
		tcp.chat(new File("E:\\GRCB\\Test\\UpbsTool\\message\\AGAF\\B0002_sit.xml"));
	}
}
