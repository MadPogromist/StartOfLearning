import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i1 = input.nextInt();
        double d1 = input.nextDouble();
        float f1 = input.nextFloat();
        Boolean b1 = input.nextBoolean();
        System.out.println(i1 + " " + d1 + " " +f1 + " " + b1);
        double res = i1 - f1;
        System.out.println(res);
    }
    }
