package codechef.CDRV21C;

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */

/**
 * @docs https://www.codechef.com/CDRV21C/problems/FRGAME
 *
 * Nitin and Sobhagya were playing a game with coins. If Sobhagya has more coins then he is winning, otherwise Nitin is winning. Note that this means if both Nitin and Sobhagya have the same number of coins, then Nitin is winning.
 *
 * Initially Nitin has A coins while Sobhagya has B coins. Then Ritik came and gave his C coins to the player who is not winning currently, after which Satyarth came and repeated the same process (gave his D coins to the player who is not winning currently).
 *
 * Find the final winner of the game.
 *
 * Input Format
 * The first line of the input contains an integer T - the number of test cases. The test cases then follow.
 * The only line of each test case contains four space-separated integers A, B, C, and D.
 * Output Format
 * For each test case, output on a single line N if Nitin is the final winner of the game, or S if Sobhagya is the final winner of the game.
 *
 * Constraints
 * 1≤T≤1000
 * 0≤A,B,C,D≤10^6
 * Sample Input 1
 * 3
 * 2 3 4 5
 * 3 3 3 3
 * 2 3 1 2
 * Sample Output 1
 * S
 * N
 * S
 * Explanation
 * Test case 1:
 * Initially, Nitin has 2 coins and Sobhagya has 3 coins, so Sobhagya is winning.
 * Then, Ritik gives his 4 coins to Nitin. Now Nitin has 6 coins and Sobhagya has 3 coins, so Nitin is winning.
 * Then, Satyarth gives his 5 coins to Sobhagya. Finally Nitin has 6 coins and Sobhagya has 8 coins, so Sobhagya is the final winner.
 * Test case 2:
 * Initially, Nitin has 3 coins and Sobhagya has 3 coins, so Nitin is winning.
 * Then, Ritik gives his 3 coins to Sobhagya. Now Nitin has 3 coins and Sobhagya has 6 coins, so Sobhagya is winning.
 * Then, Satyarth gives his 3 coins to Nitin. Finally Nitin has 6 coins and Sobhagya has 6 coins, so Nitin is the final winner.
 */
class FRGAME
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char currentWin = 'N';

            int[] arr = new int[4];

            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            if(arr[0] < arr[1]){
                arr[0] = arr[0] + arr[2];
            }else{
                arr[1] += arr[2];
            }

            if(arr[0] < arr[1]){
                arr[0] = arr[0] + arr[3];
            }else{
                arr[1] += arr[3];
            }

            if(arr[0] < arr[1]){
                System.out.println('S');
            }else{
                System.out.println('N');
            }
        }
    }
}
