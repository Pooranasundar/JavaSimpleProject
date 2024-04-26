import java.util.Scanner;

public class sampleProject4 {
    
    public static void main(String[] args) {

        System.out.println("Welcome to Student Percentage Calculator");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of Subject ");

        int totalSub = sc.nextInt();

        int[] arr = new int[totalSub];

        System.out.println("Please Enter the values ");
        
        for(int i=0; i < totalSub; i++)
        {
            arr[i] = sc.nextInt();
        }

        int totalOfSum = 0;

        for (int i = 0; i < arr.length; i++) {
            
            totalOfSum += arr[i];
        }

        int percentageCal = totalOfSum/totalSub;

        System.out.println("Total mark is " + totalOfSum + " And Your Percentage is : " + percentageCal +"%");
    }
}

