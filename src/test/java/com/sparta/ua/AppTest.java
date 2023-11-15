package com.sparta.ua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    String[] ddd = {"blld","woow","looool","stood","SuuuuuuuuuuS"};
    String[] sss = {"melt","fine","mum","dad","poooop"};
    String[] aaa = {"HELP","STOP","WOOW","stood","TOOO0T"};

    @Test
    public void brow() {
        Assertions.assertEquals(false, App.isPalindrome("brow"));
        Assertions.assertEquals(false, App.isPalindrome2("brow"));

    }
    @Test
    public void brown() {
        Assertions.assertEquals(false, App.isPalindrome("brow"));
        Assertions.assertEquals(false, App.isPalindrome2("browN"));
    }
    @Test
    public void soos() {
        Assertions.assertEquals(true, App.isPalindrome("soos"));
        Assertions.assertEquals(true, App.isPalindrome2("soos"));
    }
    @Test
    public void meem() {
        Assertions.assertEquals(true, App.isPalindrome("meem"));
        Assertions.assertEquals(true, App.isPalindrome2("meem"));
    }

    public void ddd() {
        Assertions.assertEquals("SuuuuuuuuuuS", App.getLongestPalindrome(ddd));
        Assertions.assertEquals("poooop", App.getLongestPalindrome(sss));
        Assertions.assertEquals("TOOOOT", App.getLongestPalindrome(aaa));
    }

}
