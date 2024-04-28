import java.util.Scanner;

public class sampleProject3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Car Showroom :) ");

        System.out.println("BMW \nHonda City \nInnova \nEritga \nFerrari ");

        System.out.println("Please Select the Car ");

        String str = sc.nextLine();

        CarList list = new CarList();

        if (str.equalsIgnoreCase("BMW"))
            list.bmw();

        else if (str.equalsIgnoreCase("HondaCity")) 
            list.hondaCity();

        else if (str.equalsIgnoreCase("Innova")) 
            list.innova();

        else if (str.equalsIgnoreCase("Eritga"))
            list.eritga();

        else if (str.equalsIgnoreCase("Ferrari"))
            list.ferrari();

        else
            System.out.println("Please enter Correct value ");
    }
    
}

class CarList
{
    public void bmw()
    {
        System.out.println("Welcome to BMW Cars, Please check out the Car details "); 
        int price = 400000;
        int mileage = 9;
        String madeIn = "Germany";

        System.out.println("Car Price : " + price + "\nMileage : " +mileage + "\nMade In : " +madeIn);
    }

    public void hondaCity()
    {
        
        System.out.println("Welcome to HondaCity Cars, Please check out the Car details "); 
        int price = 130000;
        int mileage = 22;
        String madeIn ="India";

        System.out.println("Car Price : " + price + "\nMileage : " +mileage + "\nMade In : " +madeIn);
    }

    public void innova()
    {

        System.out.println("Welcome to Innova Cars, Please check out the Car details "); 
        int price = 270000;
        int mileage = 20;
        String madeIn = "Japan";

        System.out.println("Car Price : " + price + "\nMileage : " +mileage + "\nMade In : " +madeIn);
    }

    public void eritga()
    {
        System.out.println("Welcome to Eritga Cars, Please check out the Car details "); 
        int price = 110000;
        int mileage = 25;
        String madeIn = "India";

        System.out.println("Car Price : " + price + "\nMileage : " +mileage + "\nMade In : " +madeIn);
    }

    public void ferrari()
    {
        System.out.println("Welcome to Ferrari Cars, Please check out the Car details "); 
        int price = 950000;
        int mileage = 7;
        String madeIn = "America";

        System.out.println("Car Price : " + price + "\nMileage : " +mileage + "\nMade In : " +madeIn);
    }

}

