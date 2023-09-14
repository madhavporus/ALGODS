import java.util.ArrayList;
public class PrimeNumbers{
    public static void main(String args[]){
    //checkGivenNumberIsPrimeOrNot(4);
    primeNumbersBetween(1,500 );
    }
    public static void primeNumbersBetween(int firstnumber, int lastnumber){
        System.out.println("PRIME NUMBERS BETWEEN"+firstnumber+ " & " +lastnumber);
        ArrayList<Integer> primeList = new ArrayList<>();
        int counter = 0;
        int primen = 0;
        //Below for loop iterates through the range of numbers user has provided.
        for(int i = firstnumber; i<=lastnumber; i++ ){
            // we need to find out the factors of each number from given range, if count of factors is 2, then thats a prome number.
            // Since the "The factor of a number is always less than or equal to the given number.", we take each number
            // from the given range, and iterate from 1 until each number.
            for( int j = 1; j<=i; j++){
                if( i %  j == 0){
                    counter++;
                }
            }
             if (counter == 2){
                       primen = i;
            primeList.add(primen);
            }
            counter = 0;
        }
        
        for(int i: primeList){
            System.out.print(i);
            System.out.print(","); 
        }
    }


    // Print if a given number is a prime number or not

    public static void checkGivenNumberIsPrimeOrNot(int givenNumber){
        int counter = 0;
        for(int i = 1; i <= givenNumber; i++){
            if(givenNumber % i == 0){
                counter++;
            }
         }
         System.out.println("Counter is:"+ counter);
         if (counter > 2){
            System.out.println("Given number is NOT a prime number ");
         } else {
            System.out.println("Given number is A prime number ");
         }


        } 


    public static void checkPrimeNumber1(int givenNumber){
        if(givenNumber == 2){
            System.out.println("Given number a is prime number");
        } else if(givenNumber%givenNumber == 0 && givenNumber % 1 == 0 && givenNumber % 2 != 0){
            System.out.println(givenNumber + " is NOT a prime number");
        } else {
            System.out.println(givenNumber + " is prime number");
        }

        }  
    }



    /* NOTES - LEARNING
     * What are prime numbers: Prime numbers are the whole numbers with only TWO factors.
        * Source: https://www.youtube.com/watch?v=5gBtzdM5M5k&ab_channel=MathwithMr.J
     * What are Factors: The factor of a number, in math, is a divisor of the given number that divides it completely, without leaving any remainder.
     * Source: https://www.cuemath.com/numbers/factors/
     * 
     */