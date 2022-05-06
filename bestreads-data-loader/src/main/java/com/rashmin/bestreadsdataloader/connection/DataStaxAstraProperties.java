package com.rashmin.bestreadsdataloader.connection;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;

// Expose the secure bundle as a property
@ConfigurationProperties(prefix = "datastax.astra")
public class DataStaxAstraProperties {
    private File secureConnectBundle;

    public File getSecureConnectBundle() {
        return secureConnectBundle;
    }

    public void setSecureConnectBundle(File secureConnectBundle) {
        this.secureConnectBundle = secureConnectBundle;
    }
}
