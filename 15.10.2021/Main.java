import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-5600,-5640,-1075,-3240,-1440,-1543,-1234,-1120};
        double max = -1.0/0.0;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i] && nums[i]%2!=0) max = nums[i];
        }
        System.out.println(max);

        /*int[] nums = {4,5,5,5,5,5,5};
        int summ = 0;
        for (int i = 0; i < nums.length; i++) {
            summ = summ + nums[i];
        }
        System.out.println((double) summ/nums.length);*/
        /*
        String[] cars = {"bmw","audi","kia"};
        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
        int a = 5;
        System.out.println(a--); // 5 (a=4)
        System.out.println(--a); // 3 (a=3)
        System.out.println(a);   // 3*/
        /*
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars.length);*/
        /*int i = 0;
        while (i<3){
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("Значение переменной i = "+i);*/
        /*
        do{
            System.out.println(i);
            i = i + 1;
        }while (i<3);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scanner.nextLine();

        if (login.equals("admin") && pass.equals("123456"))
            System.out.println("Доступ разрешен для Admin");
        else if (login.equals("user") && pass.equals("654321"))
            System.out.println("Доступ разрешен для User");
        else
            System.out.println("Доступ запрещен");*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a>b)
            System.out.println("Число "+a+" больше числа "+b);
        else
            System.out.println("Число "+b+" больше числа "+a);*/
    }
}
