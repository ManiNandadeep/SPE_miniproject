import java.util.Scanner;

public class miniproject {

    public static double MySQRT(double x){
        return (double) Math.sqrt(x);
    }
    public static int MyFactorial(int x){
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double MyLog(double x){
        return (double) Math.log(x);
    }

    public static double MyPow(double x, double b){
        return (double) Math.pow(x, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Scientific Calculator Menu");
            System.out.println("--------------------------");
            System.out.println("1. Square root function ");
            System.out.println("2. Factorial function ");
            System.out.println("3. Natural logarithm (base е) ");
            System.out.println("4. Power function ");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter x: ");
                    double x1 = sc.nextDouble();
                    double sqrt = MySQRT(x1);
                    System.out.println("Square root of " + x1 + " is " + sqrt);
                    break;

                case 2:
                    System.out.print("Enter x: ");
                    int x2 = sc.nextInt();
                    int factorial = MyFactorial(x2);
                    System.out.println(x2 + "! = " + factorial);
                    break;

                case 3:
                    System.out.print("Enter x: ");
                    double x3 = sc.nextDouble();
                    double ln = MyLog(x3);
                    System.out.println("Natural logarithm of " + x3 + " is " + ln);
                    break;

                case 4:
                    System.out.print("Enter x: ");
                    double x4 = sc.nextDouble();
                    System.out.print("Enter b: ");
                    double b = sc.nextDouble();

                    double power = MyPow(x4,b);
                    System.out.println(x4 + "^" + b + " = " + power);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();

        } while (choice != 0);

        sc.close();

    }

}
