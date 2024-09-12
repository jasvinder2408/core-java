import java.lang.*;
import java.util.*;

public class LengthOfString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for(int i=1; i<= testCases; i++){

            String str = sc.next();



            checkLengthOfString(str);
        }


    }

    private static void checkLengthOfString(String str){

        int count=0;

        char[] charStr = str.toCharArray();

        for(char c : charStr){

            count++;

        }

        System.out.println(count);
    }




}