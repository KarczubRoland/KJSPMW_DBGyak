import java.io.*;
import java.util.Scanner;

public class KRFileOlvas {
    public static void main(String[] args) throws IOException
    {
        int[] db;
        int sum = 0;
        File file = new File("C:\\Roland\\Egyetem\\Adatbazisok\\KJSPMW_0920\\Csomag\\src\\karczub.txt");

        db = intOlvas(file);

        System.out.println("Number of datas: "+db.length);

        for( int i = 0; i < db.length; i++)
        {
            System.out.println(i+".data:"+db[i]);
            sum += db[i];
        }

        System.out.println("SUM: "+sum);
    }

    public static int[] intOlvas(File file) throws IOException
    {
        int[] out = new int[2];
        int i = 0;
        Scanner reader = new Scanner(file);

        do
        {
            String data = reader.nextLine();
            out[i] = Integer.parseInt(data);
            i++;
        }while (reader.hasNextLine());
        reader.close();

        return out;
    }
}
