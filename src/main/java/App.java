import java.time.*;
import java.util.*;


public class App {
    public static void main(String[] args) {
        Palindrome palindromeClass = new Palindrome();
        palindromeClass.findLargestPalindrome();
    }

    static List<Long> terms = new ArrayList<Long>();

    static void doPrimeFactorsfull(){
        Long numToFactor = 600851475143L;
        //numToFactor = 1787866L;
        /*List<Long> factors = getPrimeFactors(numToFactor);
        factors.forEach(factor -> {
            System.out.print(factor.toString() + " ");
            if(isPrimeFactor(factor)){
                System.out.println(factor);
            }
        });
        */
        //factors.stream().max(factor -> factor);

        //Long primeFactor = getLargestPrimeFactor(numToFactor);
        Instant start = Instant.now();
        System.out.println("###Starting factor....");
        System.out.printf("Largest prime factor of number '%d' is %d %n", numToFactor, largestPrimeFactor(numToFactor));
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.printf("Time Elapsed: %n", timeElapsed);
        //System.out.print(primeFactor.toString() + " ");
    }
    static List<Long> getPrimeFactors(Long numToFactor) {
        List<Long> factors = new ArrayList<>(0);
        for (Long i = numToFactor - 1L; i > 1; i--) {
            if (numToFactor % i == 0 && isPrimeFactor(numToFactor)) {
                factors.add(i);
                return factors;
            }
        }
        return factors;

    }

    static Long getLargestPrimeFactor(Long numToFactor) {
        //List<Long> factors = new ArrayList<>(0);
        Long retVal = 1L;
        for (Long i = numToFactor - 1L; i > 1; i--) {
            if (numToFactor % i == 0 && isPrimeFactor(i)) {
                return i;
            }
        }
        return retVal;
        //return factors;

    }

    public static int largestPrimeFactor(long number) {
        int i;
        long copyOfInput = number;
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }
        return i;
    }


    static boolean isPrimeFactor(Long factor) {
        for (Long i = 2L; i < factor; i++) {
            if (factor % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void doFibFull() {
        Long termValue = 0L;
        Long alpha;
        Long bravo;
        Long charlie = 0L;
        System.out.println("####starting fib####");
        for (Long i = 0L; i < 4000001; i++) {
            termValue = fibNew(i);
            if (termValue > 4000000) {
                break;
            }
            terms.add(termValue);
            if (termValue % 2 == 0) {
                charlie += termValue;
            }
        }

        System.out.println("###Count is: " + terms.size());
        terms.forEach(term -> System.out.print(term.toString() + " "));
        System.out.println("###Final Sum is: " + charlie.toString());
    }

    static Long fib(Long n) {
        //terms.add(n);
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    static Long fibNew(Long n) {
        /* Declare an array to store Fibonacci numbers. */
        Long f[] = new Long[n.intValue() + 2]; // 1 extra to handle case, n = 0
        Long i;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0L;
        f[1] = 1L;

        for (i = 2L; i <= n; i++) {
       /* Add the previous 2 numbers in the series
         and store it */
            f[i.intValue()] = f[i.intValue() - 1] + f[i.intValue() - 2];
        }

        return f[n.intValue()];
    }


}
