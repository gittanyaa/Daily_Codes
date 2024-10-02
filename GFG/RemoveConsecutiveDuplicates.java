package GFG;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String S) {
        if (S == null || S.length() <= 1) {
            return S;
        }

        StringBuilder result = new StringBuilder();
        result.append(S.charAt(0));

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                result.append(S.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String result = removeConsecutiveDuplicates(inputString);
        System.out.println("Resultant string: " + result);
        
        scanner.close();
    }
}
