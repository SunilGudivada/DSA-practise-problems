package codechef.CDRV21C;

import java.util.Scanner;

/**
 * A string S is called Chef's favourite if every substring chef in S must have a substring code before it.
 *
 * You are given a string S of size N that contains both code and chef as a substring. Please determine if S is Chef's favourite.
 *
 * Note: A substring is a continuous part of string which can be obtained by deleting some (may be none) character's from the beginning and some (may be none) character's from the end.
 *
 * Input Format
 * The first line of the input contains an integer T - the number of test cases. The test cases then follow.
 * The first line of each test contains an integer N - the size of the string.
 * The second line of each test contains a string S.
 * Output Format
 * For each test case, output on a single line AC if S is Chef's favourite, or WA otherwise.
 *
 * Constraints
 * 1≤T≤10
 * 1≤N≤10^4
 * |S|=N
 * S consists only of lowercase English characters
 * Both code and chef appear as a substring at least once in S
 * Sample Input 1
 * 4
 * 8
 * codechef
 * 8
 * chefcode
 * 14
 * sxycodeghychef
 * 21
 * sxychefvsvcodehghchef
 * Sample Output 1
 * AC
 * WA
 * AC
 * WA
 * Explanation
 * Test case 1: Substring code is present before chef.
 * Test case 2: Substring code is not present before chef.
 * Test case 3: Substring code is present before chef.
 * Test case 4: There is no code substring present before the first occurrence of chef.
 */
public class CHEFFAV {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int num = sc.nextInt();
            String s = sc.next();

            int codeIndex = s.indexOf("code");
            int chefIndex = s.indexOf("chef");

            if(codeIndex < chefIndex){
                System.out.println("AC");
            }else{
                System.out.println("WA");
            }

        }
    }
}
