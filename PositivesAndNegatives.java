// Website with full Kata: https://edabit.com/challenges/java
// Create a function which validates whether a given array alternates between positive and negative numbers.
// 
//  Notes
//  Lists can be of any length.
//  It doesn't matter if an array begins/ends with a positive or negative, as long as it alternates.
//  If a list contains 0, return false (as it is neither positive nor negative).


public class AlternatingArrayValidator {
    public boolean validate(int[] numbers){

        for(int index = 1; index < numbers.length; index++){

            int firstNumber     = numbers[index-1];
            int secondNumber    = numbers[index];

            if (bothNumbersAreNegative(firstNumber, secondNumber)){
                return false;
            }
            else if (bothNumbersArePositive(firstNumber, secondNumber)){
                return false;
            }
            else if (firstNumber == 0){
                return false;
            }
        }
        return true;
    }

    boolean bothNumbersArePositive(int number1, int number2){

        return number1 > 0 && number2 > 0;
    }

    boolean bothNumbersAreNegative(int number1, int number2){

        return number1 < 0 && number2 < 0;
    }
}
