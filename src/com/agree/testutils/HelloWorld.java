package com.agree.testutils;

import java.sql.Clob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;

public class HelloWorld {
	public static void main(String[] args) {
		String s = "123";
		try {
			Clob c = new SerialClob(s.toCharArray());
			System.out.println(c.toString());
		} catch (SerialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
