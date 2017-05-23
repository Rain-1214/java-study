package com.jdbc.hellow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DbUtil;

public class Demo5 {
	
	private static DbUtil dbUtil = new DbUtil();
	
	private static int addBook(Book book) throws Exception{
		Connection con = dbUtil.getCon();
		String sql = "insert into t_book values(null,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, book.getBookName());
		pstmt.setFloat(2, book.getPrice());
		pstmt.setString(3, book.getAuthor());
		pstmt.setInt(4, book.getBookTypeId());
		File context = book.getContext();
		InputStream inputStream = new FileInputStream(context);
		pstmt.setAsciiStream(5, inputStream,context.length());
		
		
		int result = pstmt.executeUpdate();
		dbUtil.close(pstmt, con);
		return result;
		
	}
	
	private static int addBook2(Book book) throws Exception{
		Connection con = dbUtil.getCon();
		String sql = "insert into t_book values(null,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, book.getBookName());
		pstmt.setFloat(2, book.getPrice());
		pstmt.setString(3, book.getAuthor());
		pstmt.setInt(4, book.getBookTypeId());
		File context = book.getContext();
		InputStream inputStream = new FileInputStream(context);
		pstmt.setAsciiStream(5, inputStream,context.length());
		
		File pic = book.getPic();
		InputStream inputStream2 = new FileInputStream(pic);
		pstmt.setAsciiStream(6, inputStream2,pic.length());
		
		int result = pstmt.executeUpdate();
		dbUtil.close(pstmt, con);
		return result;
		
	}
	
	private static void getBook(int id) throws Exception{
		Connection con = dbUtil.getCon();
		String sql = "select * from t_book where id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()){
			
			/*Clob c = rs.getClob("context");
			String context = c.getSubString(1, (int) c.length());
			
			System.out.println(context);*/
			
			Blob b = rs.getBlob("piv");
			FileOutputStream out = new FileOutputStream(new File("d:/ace.png"));
			out.write(b.getBytes(1, (int) b.length()));
			out.close();
		}
		
		dbUtil.close(pstmt, con);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		/*File context = new File("d:/test.txt");
		File pic = new File("d:/p1.png");
		Book book = new Book("��2",11,"wo",1,context,pic);
		int i = addBook2(book);
		
		if (i == 1) {
			System.out.println("success");
		}else{
			System.out.println("fail");
		}*/
		
		getBook(110022);
		
		
	}
}
