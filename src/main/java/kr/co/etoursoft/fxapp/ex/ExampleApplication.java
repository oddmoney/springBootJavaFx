package kr.co.etoursoft.fxapp.ex;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kr.co.etoursoft.fxapp.SpringBootJavaFxApplication;
import kr.co.etoursoft.fxapp.ex.controller.ExampleController;
import net.rgielen.fxweaver.core.FxWeaver;

public class ExampleApplication extends Application {
    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
    	//String[] args = getParameters().getRaw().toArray(new String[0]);
        //this.applicationContext = new SpringApplicationBuilder()
        //        .sources(SpringBootJavaFxApplication.class).run(args);
        this.applicationContext = new SpringApplicationBuilder()
                .sources(SpringBootJavaFxApplication.class).run();
    }

    @Override
    public void start(Stage stage) {
    	FxWeaver fxWeaver = applicationContext.getBean(FxWeaver.class);
        Parent root = fxWeaver.loadView(ExampleController.class);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }
}