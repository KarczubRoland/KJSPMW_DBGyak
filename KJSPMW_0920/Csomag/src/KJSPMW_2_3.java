import java.io.*;
import java.util.Scanner;

public class KJSPMW_2_3 {
    public static void main(String[] args) throws IOException
    {
        input();

    }

    public static void input() throws IOException
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the name of file: ");
        String fileName = reader.nextLine();

        FileWriter fileWriter = new FileWriter(fileName);

        do
        {
            System.out.println("Type the next line");
            String temp = reader.nextLine();
            fileWriter.write(temp+"\n");
        }
        while(!reader.nextLine().equals("end"));

        reader.close();
        fileWriter.close();

    }

}
