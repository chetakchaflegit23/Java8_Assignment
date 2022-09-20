package com.yash.java2;

import java.util.Arrays;

public class Demo
{
	public static void main(String[] args) {
        String given[] = {"Taj is situated in Agra"};
        String find="ast";
        boolean Match = Arrays.stream(given).anyMatch(s->s.contains(find));
       
        if(Match==true) {
            System.out.println(find+" String found");
        }
        else {
        System.out.println(find+" String not found");
        }
        
}

}
