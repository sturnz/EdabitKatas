// Website with full Kata: https://edabit.com/challenge/CKqfEowjmSTw2jsso
// Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array.
// Otherwise, return "there is no 7 in the array".


import java.util.ArrayList;
import java.util.List;

public class SevenBoom {
    List<Integer> validatedNumbers = new ArrayList<>();

    public int[] validateNumbers(int[] numbers){

        for(int number : numbers){
            if(containsSeven(number)){
                validatedNumbers.add(number);
            }
        }
        return validatedNumbers.stream().mapToInt(x->x).toArray();
    }

    boolean containsSeven(int number){

        return Integer.toString(number).contains("7");
    }
}
