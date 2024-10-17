package com.coding.java.datastructure.scaler.Array.OneD.intermediate;
/*

Problem Description
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.
ChatGPT said:
ChatGPT
To solve the problem of finding the majority element in an array, we need an efficient approach that finds the element appearing more than ⌊N/2⌋ times. The majority element always exists in the array, so we are guaranteed that there is a solution.

Approach:
One efficient way to solve this is by using Boyer-Moore Voting Algorithm. This algorithm works in two passes:

First Pass: Find a candidate element that could be the majority.
Second Pass: Verify if the candidate is indeed the majority element by counting its occurrences.
Boyer-Moore Voting Algorithm Explanation:
Initialize a candidate element and a count variable.
Traverse the array:
If the count is 0, assign the current element as the candidate and set count to 1.
If the current element is the same as the candidate, increment the count.
If the current element is different from the candidate, decrement the count.
After the first pass, the candidate will hold the majority element.
In the second pass (if needed for verification), count the occurrences of the candidate to ensure it appears more than ⌊N/2⌋ times.


Explanation:
First Pass (to find the candidate):
We traverse the array and try to find the majority candidate.
If the current number is the same as the candidate, we increment the count. Otherwise, we decrement the count.
When the count reaches zero, we change the candidate to the current number and reset the count to 1.
Second Pass (optional):
Since the problem guarantees that the majority element always exists, we don't need a second pass to verify. If verification were required, we would need to count the occurrences of the candidate and ensure it appears more than ⌊N/2⌋ times.
Time Complexity:
The time complexity of this solution is O(N) because we make one pass through the array.
Space Complexity:
The space complexity is O(1) since we only use a few extra variables (count and candidate).

Example:
Input:

A = [2, 2, 1, 1, 1, 2, 2]
Output:

2
Explanation: The element 2 appears 4 times, which is more than ⌊7/2⌋ = 3. Thus, 2 is the majority element.
 */
public class MajorityElement {

    // Function to find the majority element
    public static int findMajorityElement(int[] A) {
        int candidate = A[0];  // Initial candidate
        int count = 1;         // Initial count

        // First pass: Find candidate
        for (int i = 1; i < A.length; i++) {
            if (A[i] == candidate) {
                count++;  // Same as candidate, increment count
            } else {
                count--;  // Different, decrement count
                if (count == 0) {
                    candidate = A[i];  // Update candidate
                    count = 1;         // Reset count
                }
            }
        }

        // Validate the candidate
        count = 0;
        for (int num : A) {
            if (num == candidate) {
                count++;
            }
        }

        int n = A.length;
        // If count is greater than n / 2, return the candidate; otherwise, return -1
        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }

        // The candidate is guaranteed to be the majority element since it always exists in the array
        //return candidate;
    }

    public static void main(String[] args) {
        //int[] A = {2, 2, 1, 1, 1, 2, 2};
       // int result = findMajorityElement(A);
        //System.out.println(result);  // Output: 2
        int [] A ={1, 1, 2, 1, 3, 5, 1};
        int result = findMajorityElement(A);
        System.out.println(result);  // Output: 1

    }
}
