package com.momu.momubot.support;

import com.momu.momubot.model.KeyBoard;
import java.util.Arrays;
import java.util.List;

public class KeyBoardUtils {

  private final static String DEFAULT_TYPE = "buttons";
  private final static List<String> DEFAULT_BUTTONS = Arrays.asList("모모", "무무");

  public static KeyBoard getDefaultKeyBoard() {
    KeyBoard keyBoards = new KeyBoard();
    keyBoards.setType(DEFAULT_TYPE);
    keyBoards.setButtons(DEFAULT_BUTTONS);
    return keyBoards;
  }

}
