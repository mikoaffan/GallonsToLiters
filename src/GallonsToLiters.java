import java.util.Scanner;

public class GallonsToLiters
{
    public static void main( String [] args )
    {
// deklarasi data
        double liters; // jumlah dalam liter
        double gallons; // jumlah dalam galon U.S.
// input data
        Scanner in = new Scanner( System.in );
        System.out.print( "Berapa banyak Galon U.S ? " );
        gallons = in.nextDouble( );
// 3.785 L = 1 U.S. gal.
        liters = gallons * 3.785;
// hasil output
        System.out.print( liters + " Liter = " );
        System.out.println( gallons + " Galon U.S." );
    }
}
