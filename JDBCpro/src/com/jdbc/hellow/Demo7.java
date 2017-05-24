package com.jdbc.hellow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

import util.DbUtil;

public class Demo7 {
	public static void main(String[] args) throws Exception{
		
		DbUtil dbutil = new DbUtil();
		Connection con = dbutil.getCon();
		/*DatabaseMetaData dmd = con.getMetaData();
		System.out.println(dmd.getDatabaseProductName());
		System.out.println(dmd.getDriverMajorVersion());
		System.out.println(dmd.getDriverMinorVersion());
		con.close();*/
		
		String sql = "select * from t_book";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSetMetaData rs = pstmt.getMetaData();
		int num = rs.getColumnCount();
		System.out.println(num);
		for(int i = 1;i<num;i++){
			System.out.println(rs.getColumnTypeName(i) + "|" + rs.getColumnName(i));
		}
		
	}
}
