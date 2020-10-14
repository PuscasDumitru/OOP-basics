public class main {

    public static void main(String[] args) {
        String text =
                "The quick, brown fox jumps over a lazy dog. " +
                        "DJs flock by when MTV ax quiz prog. " +
                        "Junk MTV quiz graced by fox whelps. " +
                        "Bawds jog, flick quartz, vex nymphs. " +
                        "Waltz, bad nymph, for quick jigs vex! " +
                        "Fox nymphs grab quick-jived waltz. " +
                "Brick quiz whangs jumpy veldt fox. " +
                "Bright vixens jump; dozy fowl quack. " +
                        "Quick wafting zephyrs vex bold Jim. " +
                "Quick zephyrs blow, vexing daft Jim. " +
                "Sex-charged fop blew my junk TV quiz. " +
                "How quickly daft jumping zebras vex. " +
                "Two driven jocks help fax my big quiz.";


        counterS perform = new counterS(text);


        System.out.println("Number of sentences in the text  -> " + perform.NumberOfSentences());
        System.out.println("Number of words in the text      -> " + perform.NumberOfWords());


        System.out.println("Number of letters in the text    -> " + perform.NumberOfLetters());
        System.out.println("Number of vowels in the text     -> " + perform.NumberOfVowels());
        System.out.println("Number of consonants in the text -> " + perform.NumberOfConsonants());


        System.out.println("Longest word in the text         -> " +  perform.LongestWord() + "\n");
        perform.MostUsedWords();

    }
}