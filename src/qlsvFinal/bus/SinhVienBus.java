package qlsvFinal.bus;


import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import qlsvFinal.dao.SinhVienDao;
import qlsvFinal.dto.SinhVienDto;

public class SinhVienBus {
	@FXML private TextField txtMaSinhVien, txtTenSinhVien;
	@FXML private DatePicker dpNgaySinh;
	@FXML private Button btnThem, btnLuu, btnSua, btnXoa;
	@FXML private Button btnOpenCSDL,btnTimKiem, btnThoat, btnHuy;
	@FXML private TableView<SinhVienDto> tableView;
	@FXML private TableColumn<SinhVienDto, String> maSinhVienColumn,tenSinhVienColumn,ngaySinhColumn;
	@FXML private HBox hBoxOpenFile, hBoxOpenCSDL, hBoxCloseFile;
	
	private TablePosition tablePosition;
	private Alert alert = new Alert(AlertType.INFORMATION);
	private Alert alertConfirmation = new Alert(AlertType.CONFIRMATION);
	private ArrayList<SinhVienDto> arrSinhVienDto = new ArrayList<>();
	private int row;
	private SinhVienDto sinhviendto = new SinhVienDto();
	
	@FXML protected void them(ActionEvent event)
	{
		
	}
	
	@FXML protected void luu(ActionEvent event)
	{
		
	}
	
	@FXML protected void sua(ActionEvent event)
	{
		
	}
	
	@FXML protected void xoa(ActionEvent event)
	{
		
	}
	
	
	@FXML protected void huy(ActionEvent event)
	{
		
	}
	
	@FXML protected void thoat(ActionEvent event)
	{
		
	}
	
	@FXML protected void moCSDL(ActionEvent event)
	{
		this.arrSinhVienDto.clear();
		this.arrSinhVienDto = SinhVienDao.getStudentFromDatabase();
		if(this.arrSinhVienDto.size() > 0){
			this.tableView.getItems().clear();
			this.alert.setTitle("Message");
			this.alert.setHeaderText(null);
			this.alert.setContentText("Open the database successfully");
			this.alert.showAndWait();
			this.txtMaSinhVien.setText("");
			this.txtTenSinhVien.setText("");
			this.dpNgaySinh.setValue(null);
			this.btnThem.setDisable(false);
			this.btnLuu.setDisable(false);
			this.btnSua.setDisable(true);
			this.btnXoa.setDisable(true);
			this.btnOpenCSDL.setDisable(true);
			this.btnTimKiem.setDisable(false);
			for(SinhVienDto student : this.arrSinhVienDto)
				this.tableView.getItems().add(student);
		}
		else{
			this.alert.setTitle("Message");
			this.alert.setHeaderText(null);
			this.alert.setContentText("Errors database connection");
			this.alert.showAndWait();
		}
	}
	
	@FXML protected void timkiem(ActionEvent event)
	{
		
	}
	
	
	@FXML protected void handleMouseClick(MouseEvent event){
		this.tablePosition = this.tableView.getSelectionModel().getSelectedCells().get(0);
		row = this.tablePosition.getRow();
		this.sinhviendto = this.tableView.getItems().get(this.row);
		this.txtMaSinhVien.setText(this.sinhviendto.getMaSinhVien());
		this.txtTenSinhVien.setText(this.sinhviendto.getTenSinhVien());
		//this.dpBrithday.setValue();
		this.btnThem.setDisable(true);
		this.btnLuu.setDisable(true);
		this.btnSua.setDisable(false);
		this.btnXoa.setDisable(false);
	}
	{
		
	}
	
}
