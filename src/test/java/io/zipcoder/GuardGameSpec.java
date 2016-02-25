package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/25/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class GuardGameSpec {
    GuardGame guardGame;
    @Test
    public void testCalcSingleDigit(){
        guardGame = new GuardGame(1235L);
        int expected = 2;
        int actual = guardGame.getResult();
        assertEquals("", expected, actual);
    }
    @Test
    public void testCalcSingleDigit2(){
        guardGame = new GuardGame(13L);
        int expected = 4;
        int actual = guardGame.getResult();
        assertEquals("", expected, actual);
    }
    @Test
    public void testCalcSingleDigit3(){
        guardGame = new GuardGame(123456789L);
        int expected = 9;
        int actual = guardGame.getResult();
        assertEquals("", expected, actual);
    }
    @Test
    public void testCalcSingleDigit4(){
        guardGame = new GuardGame(2147483647L);
        int expected = 1;
        int actual = guardGame.getResult();
        assertEquals("", expected, actual);
    }
    @Test
    public void testCalcSingleDigit5(){
        guardGame = new GuardGame(112345678945L);
        int expected = 1;
        int actual = guardGame.getResult();
        assertEquals("", expected, actual);
    }
}
