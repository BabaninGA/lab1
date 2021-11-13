import java.util.Scanner;

public class Task1 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int a = in.nextInt();
        System.out.println("Введите второе целое число");
        int b = in.nextInt();
        System.out.println("Введите третье целое число");
        int c = in.nextInt();
        System.out.println("Введите четвертое целое число");
        int d = in.nextInt();
        if ( (a<=b) &(a<=c) & (a<=d) ) {
            System.out.println("Наименьшее число среди введенных четырех чисел:"+a);
        }
        else if ( (b<=a) &(b<=c) & (b<=d) ) {
            System.out.println("Наименьшее число среди введенных четырех чисел:"+b);
        }
        else if ( (c<=a) &(c<=b) & (c<=d) ) {
            System.out.println("Наименьшее число среди введенных четырех чисел:"+c);
        }
        else if ( (d<=a) &(d<=b) & (d<=c) ) {
            System.out.println("Наименьшее число среди введенных четырех чисел:"+d);
        }
    }
}