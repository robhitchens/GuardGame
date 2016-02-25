package io.zipcoder;
import static java.lang.Math.toIntExact;
/**
 * Created by roberthitchens3 on 2/25/16.
 */
public class GuardGame {
    private long input;
    private int result;
    public GuardGame(Long input){
        result = -1;
        this.input = input;
        result = toIntExact(calcSingleDigit(input));
    }
    public int calcSingleDigit(Long input){
        if(input >0 && input <10){
            return toIntExact(input);
        }else{
            return calcSingleDigit(calcSingleDigitHelper(input));
        }
    }
    public long calcSingleDigitHelper(Long inputToSingleDigit){
        long temp = inputToSingleDigit;
        long sum = 0;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        return sum;
    }
    //public long calcSingleDigitHelperHelper(Long input)//maybe?


    public int getResult(){return result;}
}
