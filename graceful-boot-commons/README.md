# GRACEFUL-BOOT-COMMONS

## 简介

框架通用包，存放公用类

## 快速入门

step1: 直接在pom中引入

## 工具类介绍

- MultipleYamlPropertySourceFactory

用于yaml加载

示例：

```java
@AutoConfiguration
@Configuration
@PropertySources({
        @PropertySource(value = "classpath:actuator.yaml", 
                factory = MultipleYamlPropertySourceFactory.class)})
public class ActuatorAutoConfig {

}
```
