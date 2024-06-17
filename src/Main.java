public class Main {
    public static void main(String[] args) {

        for (int i=1; i <=10; i=i+1) {
            System.out.println("Числа от 1 до 10: " + i);
        }

        for (int f=10; f>=1; f=f-1) {
            System.out.println("Числа от 10 до 1: " + f);
        }

        for (int s = 0; s<=17 && s>=0; s=s+2) {
            System.out.println("Чётные числа от 0 до 17: " + s);
        }
        for (int d = 10; d<=10 && d>=-10; d=d-1) {
            System.out.println("Числа от 10 до -10: " + d);
        }

        for (int h = 1904; h<=2096; h=h+4) {
            System.out.println(h + " год является високосным");
        }

        for (int k=7; k<=98; k=k+7) {
            System.out.println("Все числа последовательности от 7 до 98 с разницей +7: " + k);
        }

        for (int j = 1; j<=512; j=j*2) {
            System.out.println("Последовательность чисел от 1 до 512 с умножением на 2: " + j);
        }

        int whole = 0;
        int start = 29000;
        for (int m=1; m<=12; m++) {

            whole = whole + start;
            System.out.println("Месяц " + m + " сумма накоплений равна" + whole + " рублей");

        }


    }
}