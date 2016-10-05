package qlsvFinal.dto;

import javafx.beans.property.SimpleStringProperty;

public class SinhVienDto {
	private final SimpleStringProperty maSinhVien = new SimpleStringProperty("");
	private final SimpleStringProperty tenSinhVien = new SimpleStringProperty("");
	private final SimpleStringProperty ngaySinh = new SimpleStringProperty("");
	
	public SinhVienDto(){
		this("","","");
	}
	
	public SinhVienDto(String maSinhVien, String tenSinhVien, String ngaySinh){
			setMaSinhVien(maSinhVien);
			setTenSinhVien(tenSinhVien);
			setNgaySinh(ngaySinh);
	}

	public String getMaSinhVien() {
		return maSinhVien.get();
	}

	public String getTenSinhVien() {
		return tenSinhVien.get();
	}

	public String getNgaySinh() {
		return ngaySinh.get();
	}
	
	public void setMaSinhVien(String maSinhVien)
	{
		this.maSinhVien.set(maSinhVien);
	}
	
	public void setTenSinhVien(String tenSinhVien)
	{
		this.tenSinhVien.set(tenSinhVien);
	}
	
	public void setNgaySinh(String ngaySinh)
	{
		this.ngaySinh.set(ngaySinh);
	}
	
	
}
	