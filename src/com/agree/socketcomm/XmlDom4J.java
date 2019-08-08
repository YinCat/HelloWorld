package com.agree.socketcomm;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;



public class XmlDom4J {
//	private static Logger logger = Logger.getLogger(XmlDom4J.class);z
	public static void readXML(String str) {
		try {
			Document document = DocumentHelper.parseText(str);
			Element element = document.getRootElement();
			elementIt(element,"");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readXML(String str, String node) {
		try {
			Document document = DocumentHelper.parseText(str);
			Element element = document.getRootElement();
			elementIt(element,node);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readXML(File file, String node) {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			Element element = document.getRootElement();
			elementIt(element,node);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void elementIt(Element element, String node) {
//		BasicConfigurator.configure();
//		logger.setLevel(Level.DEBUG);
		Iterator<?> it = element.elementIterator();
		int count = 0;
		while (it.hasNext()) {
			Element e = (Element) it.next();
			elementIt(e,node);
			count++;
		}
		if (count == 0) {
			if ("".equals(node)) {
//				logger.info(element.getPath()+": ["+element.getStringValue()+"]");
				System.out.println(element.getPath()+": ["+element.getStringValue()+"]");
			}else if (element.getPath().indexOf(node) >= 0) {
//				logger.info(element.getPath()+": ["+element.getStringValue()+"]");
				System.out.println(element.getPath()+": ["+element.getStringValue()+"]");
			}
		}
	}
	public static String formatXML(String xmlstr) {
		Document document;
		
		try {
			document = DocumentHelper.parseText(xmlstr);
			OutputFormat formater=OutputFormat.createPrettyPrint();
			formater.setEncoding("UTF-8");
			StringWriter out=new StringWriter();
			XMLWriter writer=new XMLWriter(out,formater);
			writer.write(document);
			writer.close();
			return out.toString();
		} catch (DocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;  
	}
	public static String formatXML(File file) {
		Document document;
		SAXReader reader = new SAXReader();
		try {
			document = reader.read(file);
			OutputFormat formater=OutputFormat.createPrettyPrint();
			formater.setEncoding("UTF-8");
			StringWriter out=new StringWriter();
			XMLWriter writer=new XMLWriter(out,formater);
			writer.write(document);
			writer.close();
			return out.toString();
		} catch (DocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;  
	}
	public static void main(String[] args) {
		System.out.println(formatXML(new File("E:\\GRCB\\Test\\UpbsTool\\message\\AGAF\\A0003.xml")));
	}
	public static void readXML(File file) {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			Element element = document.getRootElement();
			elementIt(element,"");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}