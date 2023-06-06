package com.demo.springactuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {

  private final String LOGGER_SERVICE = "Logger Service";

  @Override
  public Health health() {
    if (isLoggerHealthGood()) {
      return Health.up().withDetail(LOGGER_SERVICE, "Logger is running").build();
    }
    return Health.down().withDetail(LOGGER_SERVICE, "Logger is not available").build();
  }

  private boolean isLoggerHealthGood() {
    // TODO: logic
    return true;
  }
}
