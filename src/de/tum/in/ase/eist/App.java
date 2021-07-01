package de.tum.in.ase.eist;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;

public final class App {

	private App() {
	}

	public static void main(String[] args) {
		Configurator.setRootLevel(Level.INFO);
		// TODO 4: Make sure to use the Configurator to configure the loggers root level

		//This is a workaround for a known issue when starting JavaFX applications 
		UniversityApp.startApp(args);
	}
}
