// Task
// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of  to , print Not Weird
// If  is even and in the inclusive range of  to , print Weird
// If  is even and greater than , print Not Weird
// Input Format

// A single line containing a positive integer, .

// Constraints

// Output Format

// Print Weird if the number is weird. Otherwise, print Not Weird.

// Sample Input 0

// 3
// Sample Output 0

// Weird
// Explanation 0


//  is odd and odd numbers are weird, so print Weird.

// Sample Input 1

// 24
// Sample Output 1

// Not Weird
// Explanation 1


//  and  is even, so it is not weird.

import java.util.Scanner;

public class Main {
    prublic static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 ! = 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
