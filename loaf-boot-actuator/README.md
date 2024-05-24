# GRACEFUL-BOOT-ACTUATOR

## 简介

基于actuator的监控组件，提供默认配置

## 快速入门

step1: 直接在pom中引入

step2: 根据需要提供配置

## 默认配置

```yaml
spring:
  lifecycle:
    timeout-per-shutdown-phase: 1m
management:
  server:
    port: 8081
  endpoints:
    web:
      #修改访问路径 2.0之前默认是/; 2.0默认是/actuator可以通过这个属性值修改
      base-path: /actuator
      exposure:
        #默认值访问health,info端点  用*可以包含全部端点
        include: "*"
  endpoint:
    shutdown:
      enabled: true #打开shutdown端点
    health:
      show-details: always #获得健康检查中所有指标的详细信息
server:
  shutdown: "graceful"

```
