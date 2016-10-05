package qlsvFinal.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SinhVienGui {
	private Stage stage;
	private Scene scene;
	public SinhVienGui(){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("SinhVienGui.fxml"));
			this.scene = new Scene(root);
			this.stage = new Stage();
			this.stage.setTitle("Quan Ly Sinh Vien Final");
			this.stage.setScene(scene);
			this.stage.setResizable(false);
			this.stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
