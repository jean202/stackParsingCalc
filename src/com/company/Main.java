package com.company;

public class Main {

    public static void main(String[] args) {
	    String exp [] = {"2+3=5*6+8/2", "9+4*2#7"};

	    Calculator cal;

	    for (int i = 0; i < exp.length; i++){
            cal = new Calculator(exp[i]);
        }

    }
}
