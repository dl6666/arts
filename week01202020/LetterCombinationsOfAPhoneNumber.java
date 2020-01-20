package com.coderdi.blogs.arts.week01202020;

import java.util.ArrayList;
import java.util.List;

/**
 * Given string consisting chars of '2'~'9', output all possible combination of
 * the chars.
 * Problem: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 *
 */
public class LetterCombinationsOfAPhoneNumber {
  private static final String[] DIGIT_CHAR_MAP = {
      /*0=*/"",
      /*1=*/"",
      /*2=*/"abc",
      /*3=*/"def",
      /*4=*/"ghi",
      /*5=*/"jkl",
      /*6=*/"mno",
      /*7=*/"pqrs",
      /*8=*/"tuv",
      /*9=*/"wxyz"
  };

  public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();
    appendToPrefixes(new StringBuilder(), digits, res);
    return res;
  }

  private void appendToPrefixes(StringBuilder prefix,
                                String remaining,
                                List<String> output) {
    if(remaining.isEmpty()) {
      output.add(prefix.toString());
      return;
    }
    char cur = remaining.charAt(0);
    String chars = digitToChars(cur);
    for (int i = 0; i < chars.length(); i++) {
      char curDigit = chars.charAt(i);
      prefix.append(curDigit);
      appendToPrefixes(prefix, remaining.substring(1), output);
      prefix.deleteCharAt(prefix.length() - 1);
    }
  }

  private String digitToChars(char c) {
    if (c > '9' || c < '0') {
      return "";
    }
    return DIGIT_CHAR_MAP[c - '0'];
  }
}
