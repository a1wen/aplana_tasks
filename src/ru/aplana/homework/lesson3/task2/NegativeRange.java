package ru.aplana.homework.lesson3.task2;

/**
 * Created by a1wen on 23.03.2017.
 */
public class NegativeRange {
    public static void main(String[] args) {
        int[][] buff = new int[5][8];
        for (int i = 0; i<5; i++){
            for (int j = 0; j<8; j++) {
                buff[i][j] = rnd();
                System.out.print("   "+buff[i][j]+"   ");
            }
            System.out.println();
        }
    }

    public static int rnd(){
        return (int)(Math.round(Math.random()*199)-99);
    }
}
