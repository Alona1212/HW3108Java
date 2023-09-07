import java.sql.SQLOutput;
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.
public class HW_3108 {
    public static void main(String[] args) {
compare(11,17);
    }
    public static void compare(int a, int b){
        if (Math.abs (a-10) < Math.abs (b-10)) System.out.println("Первое число близжайшее к 10");
        else if (Math.abs(a-10)==Math.abs(b-10)) System.out.println("Оба числа одинаково близко к 10");
        else System.out.println("Второе число близжайшее к 10");
    }
}
