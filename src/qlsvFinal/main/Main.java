package qlsvFinal.main;
	
import javafx.application.Application;
import javafx.stage.Stage;
import qlsvFinal.gui.SinhVienGui;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		new SinhVienGui();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
