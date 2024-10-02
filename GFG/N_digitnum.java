package GFG;

import java.util.ArrayList;
import java.util.Scanner;

public class N_digitnum {
 

    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Base case
        if (n == 1) {
            for (int i = 0; i <= 9; i++) {
                result.add(i);
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                GenerateNum(i, n, result);
            }
        }
        return result;
    }

    private static void GenerateNum(int curr, int n, ArrayList<Integer> result) {
        if (n == 1) {
            result.add(curr);
            return;
        }
        for (int next = curr % 10 + 1; next <= 9; next++) {
            GenerateNum(curr * 10 + next, n - 1, result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> result = increasingNumbers(n);
        System.out.println(result);
        sc.close();
    }
}


