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
    }
}