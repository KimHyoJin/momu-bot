package com.momu.momubot.route;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

import com.momu.momubot.handler.Handlers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Routes {

  @Bean
  public RouterFunction<ServerResponse> routerFunction(Handlers handlers) {
    return RouterFunctions.route(GET("/api/info"), handlers::getInfo);

  }
}
