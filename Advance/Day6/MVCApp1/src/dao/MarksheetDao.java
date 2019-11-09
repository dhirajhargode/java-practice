package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.MyConn;
import dto.Marksheet;

public class MarksheetDao {
	private Connection con;
	public int createMarksheet(Marksheet marksheet) {
		int i = 0;
		try {
			con = new MyConn().getMyConn();
			PreparedStatement s = con.prepareStatement
					("insert into mark_sheet values(?,?,?,?,?)");
			s.setInt(1, marksheet.getRno());
			s.setString(2, marksheet.getStudentName());
			s.setFloat(3, marksheet.getPhysics());
			s.setFloat(4, marksheet.getChemistry());
			s.setFloat(5, marksheet.getMaths());
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public ArrayList<Marksheet> selectAll() {
		ArrayList<Marksheet> list = new ArrayList<>();
		try {
			con = new MyConn().getMyConn();
			PreparedStatement s = con.prepareStatement
					("select * from mark_sheet");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				Marksheet m = new Marksheet();
				m.setRno(rs.getInt(1));
				m.setStudentName(rs.getString(2));
				m.setPhysics(rs.getFloat(3));
				m.setChemistry(rs.getFloat(4));
				m.setMaths(rs.getFloat(5));
				list.add(m);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int removeMarksheet(int rno) {
		int i = 0;
		try {
			con = new MyConn().getMyConn();
			PreparedStatement s = con.prepareStatement
					("delete from mark_sheet where rno = ?");
			s.setInt(1, rno);
			
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public Marksheet selectMarksheet(int rno) {
		Marksheet m = new Marksheet();
		try {
			con = new MyConn().getMyConn();
			PreparedStatement s = con.prepareStatement
					("select * from mark_sheet where rno = ?");
			s.setInt(1, rno);
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				m.setRno(rs.getInt(1));
				m.setStudentName(rs.getString(2));
				m.setPhysics(rs.getFloat(3));
				m.setChemistry(rs.getFloat(4));
				m.setMaths(rs.getFloat(5));	
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}
	
	public int modifyMarksheet(Marksheet marksheet) {
		int i = 0;
		try {
			con = new MyConn().getMyConn();
			PreparedStatement s = con.prepareStatement
					("update mark_sheet set student_name = ?, physics = ?, chemistry = ?, maths = ? where rno = ?");
			
			s.setString(1, marksheet.getStudentName());
			s.setFloat(2, marksheet.getPhysics());
			s.setFloat(3, marksheet.getChemistry());
			s.setFloat(4, marksheet.getMaths());
			s.setInt(5, marksheet.getRno());
			i = s.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	
}
