package com.example.designpatterns.singleton;

public class ConfigurationManager {

    private static ConfigurationManager instance;
    private String configuration;

    private ConfigurationManager() {
        // Load configuration settings from a file or environment
        this.configuration = "Default Configuration";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}