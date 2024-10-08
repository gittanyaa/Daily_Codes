package Leetcode;

public class maximumRemovals {
    
        public int maximumRemoval(String s, String p, int[] rem) {
            int left = 0;
            int right = rem.length;
    
            // Create a map to store the removal indices
            int[] removalMap = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                removalMap[i] = rem.length;
            }
    
            // Populate the removal map
            for (int i = 0; i < rem.length; ++i) {
                removalMap[rem[i]] = i;
            }
    
            // Perform binary search to find the maximum removals
            while (left < right) {
                int mid = (left + right + 1) / 2;
                int matchCount = 0;
    
                // Check if the substring of s matches p with the current removals
                for (int i = 0; i < s.length() && matchCount < p.length(); ++i) {
                    if (removalMap[i] >= mid && s.charAt(i) == p.charAt(matchCount)) {
                        matchCount++;
                    }
                }
    
                // If the substring matches, update the left boundary
                if (matchCount == p.length()) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
    
            return left;
        }
    
    }

