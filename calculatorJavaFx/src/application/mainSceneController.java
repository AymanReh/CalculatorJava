package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class mainSceneController {
	@FXML
	private Button btn;
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btnplus;
	@FXML
	private Button btn3;
	@FXML
	private Button btn4;
	@FXML
	private Button btn5;
	@FXML
	private Button btn6;
	@FXML
	private Button btn7;
	@FXML
	private Button btn8;
	@FXML
	private Button btn9;
	@FXML
	private Button btn0;
	@FXML
	private Button btnminus;
	@FXML
	private Button btndivide;
	@FXML
	private Button btnmul;
	@FXML
	private TextArea txt;

	// Event Listener on Button[#btn].onAction
	@FXML
	public void btnOkClick(ActionEvent event) {
		String num = txt.getText();
		String[] splitter = num.split("[+-/*]");
		String firstN = splitter[0];
		String secondN = splitter[1];
		
		if(num.contains("+")) {
			double calc = Integer.valueOf(firstN) + Integer.valueOf(secondN);
			txt.setText(String.valueOf(calc));
		}
		if(num.contains("-")) {
			double calc = Integer.valueOf(firstN) - Integer.valueOf(secondN);
			txt.setText(String.valueOf(calc));
		}
		if(num.contains("/")) {
			double calc = Integer.valueOf(firstN) / Integer.valueOf(secondN);
			txt.setText(String.valueOf(calc));
		}
		if(num.contains("*")) {
			double calc = Integer.valueOf(firstN) * Integer.valueOf(secondN);
			txt.setText(String.valueOf(calc));
		}
		
		
		
	}
	// Event Listener on Button[#btn1].onAction
	@FXML
	public void btn1C(ActionEvent event) {
		String num1 = btn1.getText();
		txt.appendText(num1);
	}
	// Event Listener on Button[#btn2].onAction
	@FXML
	public void btn2c(ActionEvent event) {
		String num2 = btn2.getText();
		txt.appendText(num2);
	}
	// Event Listener on Button[#btnplus].onAction
	@FXML
	public void btnplusc(ActionEvent event) {
		String numplus = btnplus.getText();
		txt.appendText(numplus);
	}
	// Event Listener on Button[#btn3].onAction
	@FXML
	public void btn3c(ActionEvent event) {
		String num3 = btn3.getText();
		txt.appendText(num3);
	}
	// Event Listener on Button[#btn4].onAction
	@FXML
	public void btn4c(ActionEvent event) {
		String num4 = btn4.getText();
		txt.appendText(num4);
	}
	// Event Listener on Button[#btn5].onAction
	@FXML
	public void btn5c(ActionEvent event) {
		String num5 = btn5.getText();
		txt.appendText(num5);
	}
	// Event Listener on Button[#btn6].onAction
	@FXML
	public void btn6c(ActionEvent event) {
		String num6 = btn6.getText();
		txt.appendText(num6);
	}
	// Event Listener on Button[#btn7].onAction
	@FXML
	public void btn7c(ActionEvent event) {
		String num7 = btn7.getText();
		txt.appendText(num7);
	}
	// Event Listener on Button[#btn8].onAction
	@FXML
	public void btn8c(ActionEvent event) {
		String num8 = btn8.getText();
		txt.appendText(num8);
	}
	// Event Listener on Button[#btn9].onAction
	@FXML
	public void btn9c(ActionEvent event) {
		String num9 = btn9.getText();
		txt.appendText(num9);
	}
	// Event Listener on Button[#btn0].onAction
	@FXML
	public void btn0c(ActionEvent event) {
		String num0 = btn0.getText();
		txt.appendText(num0);
	}
	// Event Listener on Button[#btnminus].onAction
	@FXML
	public void btnminusc(ActionEvent event) {
		String numminus = btnminus.getText();
		txt.appendText(numminus);
	}
	// Event Listener on Button[#btndivide].onAction
	@FXML
	public void btndividec(ActionEvent event) {
		String numdivide = btndivide.getText();
		txt.appendText(numdivide);
	}
	// Event Listener on Button[#btnmul].onAction
	@FXML
	public void btnmulc(ActionEvent event) {
		String nummultiply = btnmul.getText();
		txt.appendText(nummultiply);
	}
@FXML
	public void btnCC(ActionEvent event) {
		txt.setText("");
	}
}
