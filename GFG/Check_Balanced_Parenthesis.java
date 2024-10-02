package GFG;

import java.util.Scanner;

public class Check_Balanced_Parenthesis {
   

    public static char findClosing(char c) {
        if (c == '(') return ')';
        if (c == '{') return '}';
        if (c == '[') return ']';
        return '0';
    }

    public static boolean check(char[] expr, int n) {
        if (n == 0) return true;
        if (n == 1) return false;
        if (expr[0] == ')' || expr[0] == '}' || expr[0] == ']') return false;

        char closing = findClosing(expr[0]);
        int i;
        for (i = 1; i < n; i++) {
            if (expr[i] == expr[0]) return false;
            if (expr[i] == closing) {
                if (check(new String(expr, 1, i - 1).toCharArray(), i - 1)) {
                    return check(new String(expr, i + 1, n - i - 1).toCharArray(), n - i - 1);
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String input = scanner.nextLine();

        if (check(input.toCharArray(), input.length())) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
        scanner.close();
    }
}


