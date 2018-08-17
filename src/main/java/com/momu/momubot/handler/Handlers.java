package com.momu.momubot.handler;

import com.momu.momubot.model.ResultContainer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class Handlers {

  public Mono<ServerResponse> getInfo(ServerRequest request) {
    log.debug("Request for getInfo api");
    ResultContainer<String> result = new ResultContainer<String>("This is a bot for momo & mumu");
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(Mono.just(result), ResultContainer.class);
  }
}
