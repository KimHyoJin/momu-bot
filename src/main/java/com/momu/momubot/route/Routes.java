package com.momu.momubot.route;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

import com.momu.momubot.handler.KakaoTalkHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Routes {

  /**
   * Basic apis which needed for kakaoTalk plus friends
   *
   * @param handlers KakaoTalkHandler
   * @return server response
   */
  @Bean
  public RouterFunction<ServerResponse> kakaoTalkRouterFunction(KakaoTalkHandler handlers) {
    return RouterFunctions.route(GET("/keyboard"), handlers::getKeyboardButtons)
        .andRoute(POST("/message"), handlers::getMessage);

  }
}
