import java.util.Scanner;
import java.util.InputMismatchException;

public class Task1 {
    public static void main (String [] args){
        int a=0;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое целое число:");
            a = in.nextInt();}
        catch(InputMismatchException e){
            System.out.println("Данная программа может работать только с целыми числами");
            System.exit(1);}
        int b=0;
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Введите второе целое число:");
            b = in.nextInt();}
        catch(InputMismatchException e){
            System.out.println("Данная программа может работать только с целыми числами");
            System.exit(1);}
        int c=0;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите третье целое число:");
            c = in.nextInt();}
        catch(InputMismatchException e){
            System.out.println("Данная программа может работать только с целыми числами");
            System.exit(1);}
        int d=0;
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Введите четвертое целое число:");
            d = in.nextInt();
            in.close();}
        catch(InputMismatchException e){
            System.out.println("Данная программа может работать только с целыми числами");
            System.exit(1);}
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