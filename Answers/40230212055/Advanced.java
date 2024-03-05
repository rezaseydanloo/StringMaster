import java.util.Objects;
import java.util.Scanner;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){


        String[] sentence1 = sentence.split(" ");

        int size = sentence1.length;

        String word1 = word;


        for(int i =0 ; i<size ; i++)
        {
            if (sentence1[i].equals(word1))
            {
                sentence1[i] = newWord;
                break;
            }
        }

        for(int i =1 ; i<size ; i++)
        {
           sentence1[0]+=" ";
           sentence1[0]+=sentence1[i];
        }
//****
return sentence1[0];


    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){

        String firstname1 = firstName;
        String lastname1 = lastName;
        String [] firstname = firstname1.split("");
        String [] lastname = lastname1.split("");
        int size1 =firstname.length;
        int size2 =lastname.length;


        for (int i=0 ; i<size1 ; i++)
        {
            if (i==0)
            {
                firstname[0]=firstname[0].toUpperCase();
                continue;
            }
            firstname[i]=firstname[i].toLowerCase();
            firstname[0]+=firstname[i];
        }
        if(lastName==" ")
            return firstname[0];

        for (int i=0 ; i<size2 ; i++)
        {
            if (i==0)
            {
                lastname[0]=lastname[0].toUpperCase();
                continue;
            }
            lastname[i]=lastname[i].toLowerCase();
            lastname[0]+=lastname[i];
        }
        if (firstName==" ")
            return lastname[0];
        firstname[0]+=" ";
        firstname[0]+=lastname[0];

        return firstname[0];
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {


        String [] str2 = word.split("");
        int size = str2.length;
        String final1;

        int a=str2[1].codePointAt(0);

        for (int i=1 ; i<size-1 ; i++)
        {
            int shomaresh=0;
            for(int j=i+1 ; j<size ; j++)
            {
                if (str2[i].codePointAt(0)==str2[j].codePointAt(0))
                {
                    shomaresh++;
                }
                if(str2[i].codePointAt(0)!=str2[j].codePointAt(0))
                {
                    str2[0]+=str2[i];
                    i+=shomaresh;
                    break;
                }
            }

        }
        str2[0]+=str2[size-1];


        return str2[0];
    }
}

