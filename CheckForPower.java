/*
Given two positive integers x and y, determine if y is a power of x. 
If y is a power of x, return true. Otherwise, return false.
 */

public class CheckForPower {
    public boolean isPower(int x, int y) {
        if (x == 1) {
            return y == 1;
        }
        if (y == 1) {
            return true;
        }
        if (y % x != 0) {
            return false;
        }
        return isPower(x, y / x);
    }
}
