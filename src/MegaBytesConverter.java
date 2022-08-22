//program to convert kilobytes into megabytes and kilobytes.

import java.util.Scanner;

public class MegaBytesConverter {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a value in kilobytes");
        int kiloBytes= sc.nextInt();
        sc.nextLine();
        printMegaBytesAndKiloBytes(kiloBytes);

    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        int xx=0;
        int yy=0;
        int zz=0;
        if(kiloBytes<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            xx=kiloBytes;
            zz=kiloBytes%1024;
            yy=kiloBytes/1024;
            System.out.println(xx+" KB = "+yy+" MB and "+zz+" KB");
        }
    }
}
