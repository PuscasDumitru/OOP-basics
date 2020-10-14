import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class counterS
{
    String text;


    public counterS(String text)
    {
        this.text = text;
    }


    public int NumberOfSentences()
    {
        int cnt = 0;

        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == '?' || text.charAt(i) == '!' || text.charAt(i) == '.')
                cnt++;
        }

        return cnt;
    }


    public int NumberOfWords()
    {
        int cnt = 0;

        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == ' ')
                cnt++;
        }

        return cnt + 1;
    }


    public int NumberOfLetters()
    {
        char ch;
        int cnt = 0;
        for (int i=0; i < this.text.length(); i++)
        {
            ch = this.text.charAt(i);
            if (Character.isLetter(ch)) {
                cnt++;
            }
        }
        return cnt;
    }


    public int NumberOfVowels()
    {
        int cnt = 0;
        String vowels = "aeiouAEIOU";
        char ch;

        for (int i = 0; i < this.text.length(); i++)
        {
            ch = this.text.charAt(i);
            if (vowels.contains(Character.toString(ch)))
            {
                cnt++;
            }
        }
        return cnt;
    }


    public int NumberOfConsonants()
    {
        int cnt = 0;
        String consonants = "bcdfghjklmnpqrstvwxzyBCDFGHJKLMNPQRSTVWXZY";
        char ch;
        for (int i = 0; i < this.text.length(); i++)
        {
            ch = this.text.charAt(i);
            if (consonants.contains(Character.toString(ch)))
            {
                cnt++;
            }
        }
        return cnt;
    }


    public String LongestWord()
    {
        String longestWord = "";
        int Maxlen = 0;
        int CurrentLen = 0;
        String [] words = this.text.split("\\W+");
        for (int i = 0; i < words.length; i++)
        {
            CurrentLen = words[i].length();

            if (CurrentLen > Maxlen) {
                Maxlen = CurrentLen;
                longestWord = words[i];
            }
        }
        return longestWord;
    }


    public void MostUsedWords()
    {

        String [] words = this.text.split("\\W+");

        LinkedHashMap<String, Integer> word_freq = new LinkedHashMap();

        int cnt = 1;


        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j]) && i!=j) {
                    cnt++;
                }
            }

            word_freq.put(words[i], cnt);
            cnt=1;
        }


        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>( word_freq.entrySet() );


        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue() - entry1.getValue();
            }
        });


        System.out.println("The 5 most used words of the text are:");
        for (int i=0; i<5; i++)
        {
            System.out.println("The word <" + entries.get(i).getKey() + "> has been encountered for " + entries.get(i).getValue() + " times");
        }
    }

}