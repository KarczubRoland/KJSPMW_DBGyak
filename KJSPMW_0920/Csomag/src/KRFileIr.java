import java.io.*;
import java.util.Scanner;

public class KRFileIr {
    public static void main(String[] args) throws IOException
    {
        int[] data = input();

        FileWriter fileWriter = new FileWriter("C:\\Roland\\Egyetem\\Adatbazisok\\KJSPMW_0920\\Csomag\\src\\karczub.txt");

        for(int i : data)
        {
            fileWriter.write(i+"\n");
        }
        fileWriter.close();

        System.out.println("Datas writing out into karczub.txt file.");

        for(int i : data)
        {
            System.out.println(i);
        }

    }

    public static int[] input() throws IOException
    {
        Scanner reader = new Scanner(System.in);
        int db = 0;
        System.out.println("Numbers of data:");
        db = reader.nextInt();

        int[] out = new int[db];
        int i = 0;
        do
        {
            System.out.println(i+".data = ");
            int data = reader.nextInt();
            out[i] = data;
            i++;
        }while (i != db);
        reader.close();

        return out;
    }

}
