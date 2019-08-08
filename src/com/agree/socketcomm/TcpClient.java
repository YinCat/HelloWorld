package com.agree.socketcomm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	private String ip = "172.0.0.1";
	private int port = 8000;
	public int timeout = 60000;
	
	public TcpClient() {
		// TODO Auto-generated constructor stub
	}
	public TcpClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	public void chat(File file) {
		disableAccessWarnings();
		String str = readFile(file);
		try {
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(ip, port), timeout);
			try {
				OutputStream out = new BufferedOutputStream(socket.getOutputStream());
				DataInputStream in = new DataInputStream(new BufferedInputStream(
						             socket.getInputStream()));
				System.out.println("===============发送请求报文=====================");
				XmlDom4J.readXML(file,"/Req/");
				out.write(str.substring(0, 8).getBytes());
				out.flush();
				out.write(str.substring(8).getBytes());
				out.flush();
				System.out.println("===============接收响应报文=====================");
				byte[] b = new byte[8];
				in.read(b);
				byte[] b1 = new byte[Integer.parseInt(new String(b))];
				in.read(b1);
				System.out.println(XmlDom4J.formatXML(new String(b1,"utf-8")));
				System.out.println("===============解析响应信息=====================");
				XmlDom4J.readXML(new String(b1,"utf-8"),"/Resp/");
				out.close();
				in.close();
			} finally {
				// TODO: handle finally clause
				socket.close();
				System.out.println("\nsocket closed!");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void chat(File file,String s) {
		disableAccessWarnings();
		String str = readFile(file);
		try {
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(ip, port), timeout);
			try {
				OutputStream out = new BufferedOutputStream(socket.getOutputStream());
				DataInputStream in = new DataInputStream(new BufferedInputStream(
						             socket.getInputStream()));
				System.out.println("===============发送请求报文=====================");
//				XmlDom4J.readXML(file,"/Req/");
				out.write(str.substring(0, 8).getBytes());
				out.flush();
				out.write(str.substring(8).getBytes());
				out.flush();
				System.out.println("===============接收响应报文=====================");
//				byte[] b = new byte[8];
//				in.read(b);
//				byte[] b1 = new byte[Integer.parseInt(new String(b))];
//				in.read(b1);
//				System.out.println(XmlDom4J.formatXML(new String(b1,"utf-8")));
				System.out.println("===============解析响应信息=====================");
//				XmlDom4J.readXML(new String(b1,"utf-8"),"/Resp/");
				out.close();
				in.close();
			} finally {
				// TODO: handle finally clause
				socket.close();
				System.out.println("\nsocket closed!");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String readFile(File file) {
		String outstr = "";
		try {
			FileReader read = new FileReader(file);
			int len = (int) file.length();
			char[] cbuf = new char[len];
			read.read(cbuf);
			String lenstr = String.format("%08d", len);
			String info = new String(cbuf);
			outstr = lenstr + info;
			return outstr;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outstr;
	}
	@SuppressWarnings("unchecked")
	 public static void disableAccessWarnings() {
	     try {
	            Class unsafeClass = Class.forName("sun.misc.Unsafe");
	            Field field = unsafeClass.getDeclaredField("theUnsafe");
	            field.setAccessible(true);
	            Object unsafe = field.get(null);

	            Method putObjectVolatile = unsafeClass.getDeclaredMethod("putObjectVolatile", Object.class, long.class, Object.class);
	            Method staticFieldOffset = unsafeClass.getDeclaredMethod("staticFieldOffset", Field.class);

	            Class loggerClass = Class.forName("jdk.internal.module.IllegalAccessLogger");
	            Field loggerField = loggerClass.getDeclaredField("logger");
	            Long offset = (Long) staticFieldOffset.invoke(unsafe, loggerField);
	            putObjectVolatile.invoke(unsafe, loggerClass, offset, null);
	        } catch (Exception ignored) {
	    }
	}
}
