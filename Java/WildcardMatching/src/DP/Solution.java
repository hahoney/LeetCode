package DP;

/***
 *    Consider the problem as a multipack problem. Chose
 *    p as "items" and string s as the pack. * matches
 *    multiple times and . match one time. Be careful of
 *    the base case state[0]. It changes with p.charAt(i)
 */

public class Solution {
    public boolean isMatch(String s, String p) {

        boolean[] state = new boolean[s.length() + 1];

        state[0] = true; // s == "" p == "" is matching
        // Initialize dp array
        for (int i = 1; i < s.length() + 1; i++) {
            state[i] = false;
        }

        /*
        process cases when len(p) - len(* in p) > len(s)
        return false immediately
        */
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) != '*') {
                count++;
            }
        }
        if (count > s.length()) {
            return false;
        }

        /*
        DP loop. The problem is similar to multi-pack problem
        (1) * matches a sequence of characters for multiple times
        (2) ? and other single character matches only once
        Therefore the problem is a mixed onezero and complete pack problem
        for 1 .. N items  if *: complete pack problem;
        else one zero problem
        */
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*') { // match multiple times
                for (int j = 1; j < s.length() + 1; j++) {
                    state[j] = state[j - 1] | state[j];
                }
            } else {
                for (int j = s.length(); j > 0; j--) { // match one time only
                    if (p.charAt(i) == '?') {
                        state[j] = state[j - 1];
                    } else {
                        state[j] = state[j - 1] & (p.charAt(i) == s.charAt(j - 1));
                    }
                }
            }

            /*
            This is the key of the problem
            the base value of state[] that depends on the matching from
            empty p to s. if the current char in p is '*' and the prev state[0] matches,
            then the current state[0] should match
            */
            state[0] = state[0] & (p.charAt(i) == '*');
        }

        return state[s.length()];
    }
}