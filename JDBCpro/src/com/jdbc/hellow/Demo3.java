package com.jdbc.hellow;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DbUtil;

public class Demo3 {
	
	private static DbUtil dbUtil = new DbUtil();
	
	private static int addBook(Book book) throws Exception{
		Connection con = dbUtil.getCon();
		String sql = "insert into t_book values(null,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, book.getBookName());
		pstmt.setFloat(2, book.getPrice());
		pstmt.setString(3, book.getAuthor());
		pstmt.setInt(4, book.getBookTypeId());
		int result = pstmt.executeUpdate();
		dbUtil.close(pstmt, con);
		return result;
		
	}
	
	private static int delectBook(Book book) throws Exception{
		Connection con = dbUtil.getCon();
		String sql = "delete from t_book where id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, book.getId());
		int result = pstmt.executeUpdate();
		dbUtil.close(pstmt, con);
		return result;
		
	}
	
	private static int updateBook(Book book) throws Exception{
		Connection con = dbUtil.getCon();
		String sql = "update t_book set bookName=?,price=?,author=?,bookTypeId=? where id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, book.getBookName());
		pstmt.setFloat(2, book.getPrice());
		pstmt.setString(3, book.getAuthor());
		pstmt.setInt(4, book.getBookTypeId());
		pstmt.setInt(5, book.getId());
		int result = pstmt.executeUpdate();
		dbUtil.close(pstmt, con);
		return result;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Book book = new Book(110016,"��˹�ٷ�",20,"eee",1);
		Book book2 = new Book(110016,"��˹�ٷ�",20,"eee",1);
		//int i = addBook(book);
		int i = delectBook(book2);
		
		if(i == 1){
			System.out.println("success");
		}else{
			System.out.println("fail");
		}
		
	}
	

}
