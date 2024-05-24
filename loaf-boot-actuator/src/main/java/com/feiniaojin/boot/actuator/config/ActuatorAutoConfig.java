package com.feiniaojin.boot.actuator.config;

import com.feiniaojin.boot.commons.MultipleYamlPropertySourceFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@AutoConfiguration
@Configuration
@PropertySources({
        @PropertySource(value = "classpath:actuator.yaml", factory = MultipleYamlPropertySourceFactory.class)})
public class ActuatorAutoConfig {

}
