package com.vega.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringitProperties {

    /**
     * This is our welcome message
     */
    private String welcomMsg = "Hello World";

    public String getWelcomMsg() {
        return welcomMsg;
    }

    public void setWelcomMsg(String welcomMsg) {
        this.welcomMsg = welcomMsg;
    }
}
