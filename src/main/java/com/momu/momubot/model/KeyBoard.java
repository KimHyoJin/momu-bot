package com.momu.momubot.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;
import lombok.Data;

@Data
public class KeyBoard {

  private String type;
  @JsonInclude(Include.NON_EMPTY)
  private List<String> buttons;

}
