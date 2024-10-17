package com.coding.java.datastructure.scaler.Array.OneD.intermediate;

/*
Title: Length of longest consecutive ones ( Swap)
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


TC: O(N)
SC: O(1)

 */
public class LongestConsecutiveOnesSwap_Keshav_Approach {
    
    public static int longestConsecutiveOnes(String A) {

        //count the number of 1s
        int cnt=0;
        int N= A.length();

        for(int i=0; i<N;i++){
            if(A.charAt(i)=='1' ){
                cnt ++;
            }
        }
        //edge cases
        if(cnt==0){
            return 0;//as there wont be any 1s to swap with
        }
        if(cnt==N){
            return N;
        }

        int ans=0;
        for(int i=0;i<N;i++){

            if(A.charAt(i)== '0' ){//halt only at a zero
                int l=0;
                int curr=i-1;

                while(curr>=0 && A.charAt(curr)=='1'){//count consecutive 1s on left and break after encountering '0'
                    l++;
                    curr--;
                }

                int r=0;
                int curr_r=i+1;
                while(curr_r<N && A.charAt(curr_r)=='1' ){//count consecutive 1s on right and break after encountering '0'
                    curr_r++;
                    r++;
                }

                if(l+r == cnt){
                    ans = Math.max(ans, l+r);
                }
                else{
                    ans=Math.max(ans,l+r+1);

                }


            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] A = {"101101","110111"}; // O/p: 4,5
        for(String str : A){
            System.out.println(longestConsecutiveOnes(str));

        }
    }
}
