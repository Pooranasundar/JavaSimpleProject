import java.util.Scanner;

public class sampleProject2 {

    public static int addition(int n1, int n2)
    {
        return n1 + n2;
    }

    public static int subraction(int n1, int n2)
    {
        return n1-n2;
    }

    public static int multiplication(int n1, int n2)
    {
        return n1*n2;
    }

    public static int division(int n1, int n2)
    {
        return n1/n2;
    }

    public static int modulo(int n1, int n2)
    {
        return n1 % n2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi Welcome to Calculator");
        System.out.println("Please Enter your First value : ");

        int n1 = sc.nextInt();
        System.out.println("Please enter your Second value : ");

        int n2 = sc.nextInt();

        System.out.println("1.Addion\n2.Subraction\n3.Multiplication\n4.Division\n5.Modulo");
        System.out.println("Please Select your opration : ");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                int add = addition(n1, n2);

                System.out.println("Your "+ n1 + " and " + n2 +" addition value is : " + add);
                break;

            case 2:
                int sub = subraction(n1, n2);

                System.out.println("Your "+ n1 + " and " + n2 +" addition value is : " + sub);
                break;

            case 3:
                int mul = multiplication(n1, n2);

                System.out.println("Your "+ n1 + " and " + n2 +" addition value is : " + mul);
                break;

            case 4:
                int div = division(n1, n2);

                System.out.println("Your "+ n1 + " and " + n2 +" addition value is : " + div);
                break;

            case 5:
                int mod = modulo(n1, n2);

                System.out.println("Your "+ n1 + " and " + n2 +" addition value is : " + mod);
                break;
        
            default:
                break;
        }


        
    }
    
}
