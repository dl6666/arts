package com.coderdi.blogs.arts.week01202020;


import org.junit.Test;

public class LetterCombinationsOfAPhoneNumberTest {
  @Test
  public void testLetterCombinations() {
    LetterCombinationsOfAPhoneNumber combinator =
        new LetterCombinationsOfAPhoneNumber();
    System.out.println(combinator.letterCombinations("234"));
  }
}