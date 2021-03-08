package com.company;

public class Main {

    public static void main(String[] args) {
	    GenericPair<Integer> gp = new GenericPair<>(5, 6);
        System.out.println(gp.toString());
        gp.setA(8);
        System.out.println(gp.toString());
    }
}
