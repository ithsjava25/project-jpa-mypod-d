package org.example;

import javafx.application.Application;

/**
 * Application entry point for the myPod application.
 *
 * <p>This class contains the {@code main} method and is responsible for
 * bootstrapping the JavaFX runtime. It delegates control to the
 * {@link MyPod} JavaFX {@link Application} implementation.</p>
 *
 * <p>No application logic is handled here; this class exists solely to
 * provide a clean and explicit startup entry point.</p>
 */
public class App {

    /**
     * Launches the JavaFX application.
     *
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        Application.launch(MyPod.class, args);
    }
}
