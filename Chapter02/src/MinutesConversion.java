//MinutesConversion.java
import java.util.Scanner;
class MinutesConversion
{
    public static void main(String[] args)
    {
        int minutes, hours, days;
        final int MIN_IN_HOUR = 60;
        final int HRS_IN_DAY = 24;
            Scanner input = new Scanner (System.in);
                System.out.print("Enter the minutes to convert >");
                    minutes = input.nextInt();
                    hours = minutes/MIN_IN_HOUR;
                    days = hours/HRS_IN_DAY;
                System.out.println (" ' "+minutes+ " ' " + "minutes equal"+ " ' "+ hours +
                        " ' "+ "hours and equals"+ " ' "+ days + " ' "+ "days.");
    }
}
