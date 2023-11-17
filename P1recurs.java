
package com.mycompany.p1recurs;

public class P1recurs {
    
    private static String[] digitWords = {"zero", "one", "two", "three", "four"};
    public static String convertNumberToString(int number) {
        if (number == 0) {
            return digitWords[0];
        } else {
            return convertNumberToStringRecursive(number);
        }
    }
    private static String convertNumberToStringRecursive(int number) {
        if (number == 0) {
            return "";
        } else {
            int lastDigit = number % 10;
            return convertNumberToStringRecursive(number / 10) + digitWords[lastDigit] + " ";
        }
    }
    public static void main(String[] args) {
        int number = 432;
        String result = convertNumberToString(number);
        System.out.println(result.trim());

}

}
















//convert is the name of method which conert intger to string 
//step1.    call function
//step2.    if num>0  then
//           set n=num%10
//           num=num\10
//           abc(num)
//          [end of stp2 statment]
//step3.Exit













