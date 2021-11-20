import java.util.Scanner;
import java.util.InputMismatchException;

public class Task4{
    public static void main (String [] args) {
        int a=0;
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер месяца:");
            a = in.nextInt();
            in.close();}
        catch(InputMismatchException e){
            System.out.println("Данная программа может работать только с целыми числами");
            System.exit(1);}
        switch (a){
            case 1,2,12:
                System.out.println("Время года - зима");
                break;
            case 3,4,5:
                System.out.println("Время года - весна");
                break;
            case 6,7,8:
                System.out.println("Время года - лето");
                break;
            case 9,10,11:
                System.out.println("Время года - осень");
                break;
            default:
                System.out.println("Не существует месяца с заданным номером");
                break;
        }
    }
}
