package de.tum.in.ase.eist;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.apache.logging.log4j.*;

public class UniversityApp extends Application {

	private static final Logger LOGGER = LogManager.getLogger(UniversityApp.class);

	private static final String TITLE = "University App";
	private static final int SCENE_WIDTH = 300;
	private static final int SCENE_HEIGHT = 250;


	@Override
	public void start(Stage primaryStage) {

		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane, SCENE_WIDTH, SCENE_HEIGHT);

		Button button = new Button();
		button.setText(getButtonText());
		button.setOnAction(event -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle(TITLE);
			alert.setContentText(button.getText());
			alert.showAndWait();
		});

		stackPane.getChildren().add(button);

		primaryStage.setTitle(TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// TODO 1: Fix the returned String
	public String getButtonText() {
		return "EIST";
	}

	public static void startApp(String[] args) {
		LOGGER.info("UniversityApp is starting");
		// TODO 4: Log the start of the app at the info level

		launch(args);
	}
}
