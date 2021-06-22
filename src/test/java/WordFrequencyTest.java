import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class WordFrequencyTest extends TestCase {


    public int countOccurrences(String [] a, String word)
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



    // assigning the values
    protected void setUp(){
        //arrange

        //act

        //assert
    }

    // test method to add two values
    @Test
    public void testIsCountTrue() throws IOException {
       //arrange


        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream seedFile = classloader.getResourceAsStream("testfile.txt");
        InputStreamReader seedinput = new InputStreamReader(seedFile);
        BufferedReader seedreader = new BufferedReader(seedinput);
        String line;
        int actualcount=0;
        //Act
        while((line = seedreader.readLine()) != null)
        {
            String[] wordList = line.split("\\s+");
             actualcount=countOccurrences(wordList,"hakuna");

        }
      //ASSERT
        assertEquals(1,actualcount);

    }



    }
