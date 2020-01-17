/*
 * Binita Shah
 * Student ID: 991549124
 * SYST10199 - Web Programming
 */
package week1fosd;

import java.util.Scanner;


public class ArrayExample {
    public static void main(String[] args)
    {
        System.out.println("please enter a word ");
        Scanner input=new Scanner(System.in);
        String word=input.next();
        char[] store = new char[word.length()];
        for(int i=0; i<word.length(); i++){
            store[i]=word.charAt(i);
        }
        for(int i=store.length-1;i>=0;i--){
            System.out.println(store[i]);
        }
        
        
        
         
      
    }}

