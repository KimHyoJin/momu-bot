package com.momu.momubot.support;

import com.momu.momubot.model.KeyBoard;
import java.util.Arrays;
import java.util.List;

public class KeyBoardUtils {
  private final static String BUTTON_TYPE = "buttons";
  private final static String TEXT_TYPE = "text";
  private final static List<String> DEFAULT_BUTTONS = Arrays.asList("모모", "무무");

  public static KeyBoard getDefaultButtonKeyBoard() {
    KeyBoard keyBoards = new KeyBoard();
    keyBoards.setType(BUTTON_TYPE);
    keyBoards.setButtons(DEFAULT_BUTTONS);
    return keyBoards;
  }

  public static KeyBoard getDefaultTextKeyBoard() {
    KeyBoard keyBoards = new KeyBoard();
    keyBoards.setType(TEXT_TYPE);
    return keyBoards;
  }

}
