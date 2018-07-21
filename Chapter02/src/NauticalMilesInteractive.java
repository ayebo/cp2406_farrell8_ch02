//NauticalMilesInteractive
import java.util.Scanner;
class NauticalMilesInteractive
{
    public static void main(String[] args)
    {
      final double KM_IN_NAUTICAL_MILE = 1.852;
      final double MILES_IN_NAUTICAL_MILE = 1.150779;
      double nauticalMiles;
        Scanner input = new Scanner(System.in);
            System.out.println("Enter the nautical miles>>");
        nauticalMiles = input.nextDouble();
        double km = nauticalMiles*KM_IN_NAUTICAL_MILE;
        double mile = nauticalMiles*MILES_IN_NAUTICAL_MILE;
            System.out.println(nauticalMiles + "nautical miles equal to" + km + "kilometers or" + mile + "miles.");
    }
}
