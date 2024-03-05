import java.util.Scanner;

public class   Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        System.out.print("sentence: ");

        String [] str = sentence.split(" ");

        int size = str.length;
        if (size<number)
        {
            return " Number = " +number+ " is out Of Bound" ;
        }
        else
        return str[number-1];
        //tanrin 1
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {


        int number2 = Integer.parseInt(number) ;
        int number3 = number2;
        int shomaresh=0 ;

        while(true)
        {

            if (number2==0)
                break;
            number2 = number2/10;
            shomaresh ++;

        }

        boolean status1 = searchForEven;

        if (status1==true)
        {
            int even=0;
            for (int i=1 ; i<=shomaresh ; i++)
            {

                if(number3%2==0)
                {
                    even++;
                }
                number3/=10;

            }
            return even;
        }

        else
        {
            int odd=0;

            for (int i=1 ; i<=shomaresh ; i++)
            {

                if(number3%2==1)
                {
                    odd++;
                }

                number3/=10;

            }
//tamrin 2
            return  odd;

        }



    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {


        String string11 =wordA;
        String string22 =wordB;
        String[] str1 = string11.split("");
        String[] str2 = string22.split("");


        int i=0;
        int b1=string11.length();
        int b2=string22.length();

        while(true)
        {
          /*  if (str1[i]=="\0" && str2[i]!="\0")
            {
                System.out.println(string11);
                break;
            }
            else if (str1[i]!="\0" && str2[i]=="\0")
            {
                System.out.println(string22);
                break;

            }
            else
            {
                System.out.println(string22);

            }
*/
            if ((i)==b1)
            {
                return (string11);
            }
            if ((i)==b2)
            {
                return (string22);
            }

            if (str1[i].compareTo(str2[i])<0)
            {

                return (string11);
            }

            else if (str1[i].compareTo(str2[i])>0)
            {

                return (string22);

            }

            else
                i++;

        }



    }
}
