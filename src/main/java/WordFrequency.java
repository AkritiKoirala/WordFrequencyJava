import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class WordFrequency {

    static int countOccurrences(String [] a, String word)
    {
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }
    public static void main(String[] args) throws IOException, IOException {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the Filename : \n");
        String fileName= sc.nextLine(); //reads string.
        InputStream seedFile = classloader.getResourceAsStream(fileName);
        InputStreamReader seedinput = new InputStreamReader(seedFile);
        BufferedReader seedreader = new BufferedReader(seedinput);
        String seedline;
        while((seedline = seedreader.readLine()) != null)
        {
            System.out.println(seedline);
            InputStream file = classloader.getResourceAsStream(seedline);
            InputStreamReader input = new InputStreamReader(file);
            BufferedReader reader = new BufferedReader(input);
            String line;
            while((line=reader.readLine())!=null)
            {
                    String[] wordList = line.split("\\s+");
                    System.out.println(Arrays.toString(wordList));
                    for(int idx=0;idx<wordList.length;idx++)
                    {
                        int countOccur= countOccurrences(wordList,wordList[idx]);
                        System.out.println(wordList[idx]+" : "+countOccur);
                    }
                }
            }
        System.out.println("Program has been terminated");

        }

    }

