package citeck;

public class Solve3 {
    /**
     * 3.Написать алгоритм, как в целом числе самый правый ноль превратить в единицу не используя циклы и рекурсию.
     */
    public void zeroToOne(int number) {
        System.out.println("Задача-3");
        int tmpNumber = number;
        int shift = 0;
        System.out.println(Integer.toBinaryString(number) + "-заданное число");
        while ((tmpNumber & 1) != 0) {
            tmpNumber >>= 1;
            shift++;
        }
        int resNum = number + (1 << shift);
        System.out.println(Integer.toBinaryString(resNum) + "-решение");
        System.out.println();
    }
}
