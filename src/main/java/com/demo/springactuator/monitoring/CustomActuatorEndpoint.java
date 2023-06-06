package com.demo.springactuator.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "custom-endpoint")
public class CustomActuatorEndpoint {

  @ReadOperation
  public Object customEndpoint(String username) {  // needs a parameter -> http://localhost:8080/actuator/custom-endpoint?username=alex
    Map<String, String> map = new HashMap<>();
    map.put("key", "value");
    map.put("Username", username);
    return map;
  }
}
