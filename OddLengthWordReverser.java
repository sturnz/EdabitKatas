// Website with full Kata: https://edabit.com/challenge/p5kyThBZDR7oJhjR7
// Given a string, reverse all the words which have odd length. The even length words are not changed.
// There is exactly one space between each word and no punctuation is used.


public class WordReverser {

    public String reverseOdd(String input){

        String      delimiter   = " ";
        String[]    sentence    = input.split(delimiter);

        for(int word = 0; word < sentence.length; word++){
            if(sentence[word].length() % 2 != 0){
                sentence[word] = new StringBuilder(sentence[word]).reverse().toString();
            }
        }
        return String.join(delimiter, sentence);
    }
}
