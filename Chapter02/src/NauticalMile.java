//NauticalMile.java
class NauticalMile
{
    public static void main(String[] args)
    {
        final double KM_IN_NAUTICAL_MILE = 1.852;
        final double MILES_IN_NAUTICAL_MILE = 1.150779;
        double nauticalMiles = 250;
        double km = nauticalMiles*KM_IN_NAUTICAL_MILE;
        double miles = nauticalMiles*MILES_IN_NAUTICAL_MILE;
            System.out.println(nauticalMiles + "nautical miles equal to"+ km + "kilometers or" +
            miles + "miles.");
    }
}
