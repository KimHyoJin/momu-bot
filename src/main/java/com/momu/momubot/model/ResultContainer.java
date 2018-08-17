package com.momu.momubot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultContainer<T> {

  private int code;
  private String message;
  private T result;

  public ResultContainer(T result) {
    this.code = 200;
    this.message = "success";
    this.result = result;
  }

  public ResultContainer() {
    this.code = 200;
    this.message = "success";
  }
}
