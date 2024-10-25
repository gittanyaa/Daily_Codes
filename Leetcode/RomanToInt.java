package Leetcode;

public class RomanToInt {
   
        public int romanToInt(String s) {
           
            int result = 0;
            int length = s.length();
            
            for (int i = 0; i < length; i++) {
                int current = getValue(s.charAt(i));
                if (i < length - 1 && current < getValue(s.charAt(i + 1))) {
                    result -= current;
                } else {
                    result += current;
                }
            }
            
            return result;
        }
    
        private int getValue(char roman) {
            switch (roman) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0; 
        }
        }}
    
    
    

