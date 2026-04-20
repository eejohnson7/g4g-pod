/*
Given a number n, find the total number of Derangements of elements from 1 to n. A Derangement is a permutation of n elements, 
such that no element appears in its original position, i.e., 1 should not be the first element, 2 should not be second, etc. 
For example, [5, 3, 2, 1, 4] is a Derangement of first 5 elements.
 */

class CountDerangements {
    public int derangeCount(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (derangeCount(n - 1) + derangeCount(n - 2)) * (n - 1);
        }
    }
};