package codechef.CDRV21C;

import java.util.*;

/**
 * @docs https://www.codechef.com/CDRV21C/problems/KLXOR
 * You may have solved a lot of problems related to XOR and we are sure that you liked them, so here is one more problem for you.
 *
 * You are given a binary string S of length N. Let string T be the result of taking the XOR of all substrings of size K of S. You need to find the number of 1 bits in T.
 *
 * Note:
 *
 * A substring is a continuous part of string which can be obtained by deleting some (may be none) character's from the beginning and some (may be none) character's from the end.
 * XOR of many similar-sized strings is defined here.
 * Input Format
 * The first line of the input contains an integer T - the number of test cases. The test cases then follow.
 * The first line of each test case contains two integers N and K.
 * The second line of each test case contains a binary string S of size N.
 * Output Format
 * For each test case, output on a single line number of 1 bits in the XOR of all substrings of size K of S.
 *
 * Constraints
 * 1≤T≤10
 * 1≤K≤N≤2⋅105
 * |S|=N
 * S only contains characters 0 and 1.
 * Sample Input 1
 * 4
 * 4 1
 * 1010
 * 4 2
 * 1001
 * 4 3
 * 1111
 * 4 4
 * 0110
 * Sample Output 1
 * 0
 * 2
 * 0
 * 2
 * Explanation
 * Test case 1: All 1-sized substrings of S are:
 * 0
 * 1
 * 1
 * 0
 * The XOR of these strings is 0, therefore the number of 1 bits is 0.
 *
 * Test case 2: All 2-sized substrings of S are:
 * 10
 * 00
 * 01
 * The XOR of these strings is 11, therefore the number of 1 bits is 2.
 *
 * Test case 3: All 3-sized substrings of S are:
 * 111
 * 111
 * The XOR of these strings is 000, therefore the number of 1 bits is 0.
 *
 * Test case 4: All 4-sized substrings of S are:
 * 0110
 * The XOR of these strings is 0110, therefore the number of 1 bits is 2.
 *
 *
 */
public class KLXOR {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int length = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int count = 0;
            int fxor = s.charAt(0) - '0';
            int[] mas = new int[length];
            mas[0] = fxor;
            for (int i = 1; i < length; i++) {
                fxor ^= (s.charAt(i) - '0');
                mas[i] = fxor;
            }

            for (int i = 0; i < k; i++) {
                int xor = fxor;
                for (int j = length-k+1+i; j < length; j++) {
                    xor ^= (s.charAt(j) - '0');
                }
                if(i>0){
                    xor ^= mas[i-1];
                }
//                for (int j = 0; j <i; j++) {
//                    xor ^= (s.charAt(j) - '0');
//                }
                if (xor == 1) count++;
            }

            System.out.println(count);


        }
    }
}
