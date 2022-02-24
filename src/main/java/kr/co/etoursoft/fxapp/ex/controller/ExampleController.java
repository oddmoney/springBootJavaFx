package kr.co.etoursoft.fxapp.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import kr.co.etoursoft.fxapp.ex.service.ExampleService;
import net.rgielen.fxweaver.core.FxmlView;

@Component
@FxmlView("/fxml/example.fxml")
public class ExampleController {

	@FXML
	private Label weatherLabel;
	
	@Autowired
	private ExampleService exampleService;
	
	@FXML
	public void loadWeatherForecast(ActionEvent actionEvent) {
	    this.weatherLabel.setText(exampleService.getWeatherForecast());
	}
	
}
