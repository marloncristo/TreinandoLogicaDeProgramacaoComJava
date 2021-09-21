package br.com.ChronosAcademy.LogicaProgramacao;

public class Multiplos {
    public static void main(String[] args) {
//        x mod 3 = Fizz
//        x mod 5 = Buzz
//        x mod 15 = FizzBuzz
//        else print x

        for( int i = 1;
        i <= 30;
        i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else
            System.out.println(i + ": não é multiplo de 3 ou 5 ou de ambos");
        }
    }
}
