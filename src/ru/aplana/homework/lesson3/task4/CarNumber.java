package ru.aplana.homework.lesson3.task4;

/**
 * Created by a1wen on 22.03.2017.
 */
public class CarNumber {

    public static int rnd(int length){
        return (int)(Math.random()*length);
    }

    public static void main(String[] args) {
        char[] b = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'X', 'У'};
        char part1, part3[] = new char[2];
        int part2, part4;
        int i = CarNumber.rnd(b.length);
        part1 = b[i];
        part2 = rnd(999);
        part3[0] = b[rnd(b.length)];
        part3[1] = b[rnd(b.length)];
        part4 = rnd(199);
        System.out.println(part1 +" "+part2 + " "+part3[0]+part3[1] + " "+ part4);

    }
}