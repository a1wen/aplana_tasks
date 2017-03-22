package ru.aplana.homework.lesson3.task1;

/**
 * Created by a1wen on 23.03.2017.
 */
public class Range {
    public static void main(String[] args) {
        final int MIN = 10;
        final int MAX = 99;
        int[][] buff = new int[8][5];
        for (int i = 0; i<8; i++){
            for (int j = 0; j<5; j++) {
                int random = rnd(MIN,MAX);
                buff[i][j] = random;
                System.out.print(" "+buff[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int rnd(int min, int max){
        max-=min;
        return (int)(Math.random()*++max)+min;
    }
}
