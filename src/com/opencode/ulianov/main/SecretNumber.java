package com.opencode.ulianov.main;

import java.util.concurrent.ThreadLocalRandom;
//Step 1
public class SecretNumber {
    private int[] realNumber;
    private int[] expectedNumber;
    private int bull;
    private  int cow;
    public SecretNumber(){
        realNumber=new int[4];
        for(int i=0;i<4;i++){
            realNumber[i]= ThreadLocalRandom.current().nextInt(0,10);
            if(i>0){
                for(int j=0;j<i;j++) {
                    while (realNumber[i] == realNumber[j]) {
                        realNumber[i] = ThreadLocalRandom.current().nextInt(0, 10);
                    }
                }
            }
        }
    }

    public String getRealNumber() {
        String rlNumber = "";
        for (int x:
             realNumber) {
            rlNumber += x;
        }
        return rlNumber;
    }
    private boolean isEqualPosition(int numberIndex){
        if(realNumber[numberIndex]==expectedNumber[numberIndex]) return true;
        return false;
    }
    private boolean isBelongNumber(int expectedNumberIndex){
        for(int i=0;i<4;i++){
            if(realNumber[i]==expectedNumber[expectedNumberIndex]) return true;
        }
        return false;
    }
    public void calculate(){
        bull=0;
        cow=0;
        int expectedNumberIndex=0;
        while(expectedNumberIndex<4){
            if(isEqualPosition(expectedNumberIndex)) {bull++;}
            else if(isBelongNumber(expectedNumberIndex)) cow++;
            expectedNumberIndex++;
        }
    }
    //test methods
    public void setExpectedNumber(int[] expectedNumber) {
        this.expectedNumber = expectedNumber;
    }
    public String getScore(){
        return "B: "+bull+" C: "+cow;

    }
}
