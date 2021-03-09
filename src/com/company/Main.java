package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//	      Test1();
//        Test2();
//        Test3();
//        Test4();
        Test5();
    }

    public static void Test5(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;++i){
            list.add((int)(Math.random()*100));
        }
        System.out.print("Initialized: \t");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("Minimal element: " + min(list));
    }

    public static <E extends Comparable<E> > E min(ArrayList<E> list){
        E min = list.get(0);
        for(int i=1;i<list.size();++i){
            if(min.compareTo(list.get(i)) > 0){
                min = list.get(i);
            }
        }
        return min;
    }

    public static void Test4(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;++i){
            list.add(i);
        }
        System.out.print("Initialized: \t");
        System.out.println(Arrays.toString(list.toArray()));
        shuffle(list);
        System.out.print("Shuffled: \t\t");
        System.out.println(Arrays.toString(list.toArray()));
        sort(list);
        System.out.print("Sorted: \t\t");
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static <E extends Comparable<E> > void sort(ArrayList<E> list){
        Collections.sort(list);
    }

    public static void Test3(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<10;++i){
            arrayList.add(i);
        }
        shuffle(arrayList);
        for(int i=0;i<10;++i){
            System.out.print(arrayList.get(i)+" ");
        }
    }

    public static <E> void shuffle(ArrayList<E> list){
        for(int i=0;i<list.size();++i){
            int n = (int)(Math.random()*list.size());
            Collections.swap(list, i, n);
        }
    }

    public static void Test2(){
        GenericQueue<Integer> gq = new GenericQueue<>();
        gq.push(-4);
        gq.push(2);
        gq.push(1);
        while(!gq.empty()){
            System.out.println(gq.front());
            gq.pop();
        }
    }

    public static void Test1(){
        GenericPair<Integer> gp = new GenericPair<>(5, 6);
        System.out.println(gp.toString());
        gp.setA(8);
        System.out.println(gp.toString());
    }
}
