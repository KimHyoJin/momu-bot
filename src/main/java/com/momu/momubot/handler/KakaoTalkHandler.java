package com.momu.momubot.handler;

import com.momu.momubot.model.KeyBoard;
import com.momu.momubot.model.Message;
import com.momu.momubot.model.MsgResParam;
import com.momu.momubot.model.request.MsgReqParam;
import com.momu.momubot.support.KeyBoardUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class KakaoTalkHandler {

  private final static Logger ACCESS_LOG = LoggerFactory.getLogger("accessLog");


  /**
   * Get the keyboard button which required for kakaoTalk bot. Show buttons when user enters the 1:1
   * chat room with bot
   *
   * @param request server request
   * @return keyboard
   */
  public Mono<ServerResponse> getKeyboardButtons(ServerRequest request) {
    log.debug("Request for keyboard button api");
    KeyBoard keyBoard = KeyBoardUtils.getDefaultTextKeyBoard();
    return ServerResponse.ok()
        .contentType(MediaType.APPLICATION_JSON)
        .body(Mono.just(keyBoard), KeyBoard.class);
  }


  public Mono<ServerResponse> getMessage(ServerRequest request) {
    log.debug("Request for message api");
    Message msg = new Message();
    msg.setText("This is a bot for momo & mumu");
    MsgResParam result = new MsgResParam();
    result.setMessage(msg);
    return ServerResponse.ok()
        .contentType(MediaType.APPLICATION_JSON)
        .body(Mono.just(result), MsgResParam.class);
  }
}
