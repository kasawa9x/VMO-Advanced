package LambdaExpressions.LamdaDemo;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2, 3, 5,4, 1, 3, 4,5, 4, 5,9,7,0,11, 13,10,23};
        System.out.println(
                "Sum of elements that are primes in array:" + sumPrime(array));
    }
    private static int sumPrime (int [] array) {
        int sum = 0;
        for( int i : array) {
            if (isPrimeNumber(i)) {
                sum = sum + i ;
            }
        }
        return sum;
    }
//    public static boolean isPrimeNumber(int n) {
//        if (n < 2) {
//            return false;
//        }
//        int squareRoot = (int) Math.sqrt(n);
//        for (int i = 2; i <= squareRoot; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
    //Use Lamda
    private static boolean isPrimeNumber(int number) {
        return number > 1
                && IntStream.range(2, number).noneMatch(
                index -> number % index == 0);
        //IntStream là một chuỗi các phần tử có giá trị
        // kiểu int hỗ trợ các tiến trình tổng hợp tuần tự và song song.
    }
}

