package qlsvFinal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import qlsvFinal.dto.SinhVienDto;

import qlsvFinal.util.ConnectionUtil;

public class SinhVienDao {
	public static ArrayList<SinhVienDto> getStudentFromDatabase(){
		ArrayList<SinhVienDto> arrStudentDTO = new ArrayList<>();
		ConnectionUtil connUtil = ConnectionUtil.getInstance();		
		String sql = "select maSinhVien, tenSinhVien, ngaySinh from sinhvienfinal";
		Connection conn = connUtil.getMyConnection();
		try {
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				SinhVienDto sinhvienDto = new SinhVienDto(rs.getString("maSinhVien"), rs.getString("tenSinhVien"), rs.getString("ngaySinh"));
				arrStudentDTO.add(sinhvienDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			connUtil.returnMySQLConnection();
		}
		
		return arrStudentDTO;
	}	
}
