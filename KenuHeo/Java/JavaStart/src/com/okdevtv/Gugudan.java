package com.okdevtv;

import java.util.Scanner;

public class Gugudan {

    public static void main(String[] args) {

        System.out.println("gugudan = from : ");
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();

        Gugudan gugudan = new Gugudan();
        for(int i=i1; i<=9; i++){
            gugudan.printDan(i);
        }
    }

    private void printDan(int i) {
        for(int j=1; j<=9; j++){
            int k= i *j;
            System.out.println(i + "*" + j + "=" + k);
        }
    }

}
