package kk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class hello {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
           String sent = "swiss";
           int[] freq = new int[256];
           
           
        	   for(int i = 0 ; i< sent.length(); i++) {
        		   char ch = sent.charAt(i);
        				   freq[ch]++;
        	   } 
           
        	   char mostFreqChar = 0;
               char leastFreqChar = 0;
               int max = Integer.MIN_VALUE;
               int min = Integer.MAX_VALUE;
    
    for (int i = 0; i < 256 ; i++) {
        if (freq[i] > 0) {
            if (freq[i] > max) {
                max = freq[i];
                mostFreqChar = (char) i;
            }
            if (freq[i] < min) {
                min = freq[i];
                leastFreqChar = (char) i;
            }
        }
    }

    System.out.println("Most frequent character: " + mostFreqChar);
    System.out.println("Least frequent character: " + leastFreqChar);
}
}