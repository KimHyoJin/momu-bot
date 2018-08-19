package com.momu.momubot.model.request;

import lombok.Data;

@Data
public class MsgReqParam {

  private String userKey;
  private MsgType type;
  private String content;
}
