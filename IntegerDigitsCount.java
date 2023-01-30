// Website with full Kata: https://edabit.com/challenge/dreQhsnZJ7HGtsts5
// Create a function that recursively counts the integer's number of digits.


public class DigitCounter {

    int sumOfDigits = 0;

    public int countDigits(int number){

        if (number <= 0){
            return sumOfDigits;
        } else {
            sumOfDigits ++;
            return countDigits(number / 10);
        }
    }
}
