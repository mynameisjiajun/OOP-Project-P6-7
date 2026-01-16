package com.group.project.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.group.project.engine.main.EngineCore;

// This is the specific launcher for Desktop (PC/Mac)
public class DesktopLauncher {
    public static void main (String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setForegroundFPS(60);
        config.setTitle("OOP Group Project");
        
        // Launch the LibGDX application using our EngineCore
        new Lwjgl3Application(new EngineCore(), config);
    }
}
