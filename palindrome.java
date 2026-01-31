class Solution {
    boolean isPalindrome(String s) {
        // code here
        //using 2 pointer 
        int len=s.length();
        int mid =len/2;
       
        
        for(int i=0, j=len-1;i<mid && j>=mid;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            
        }
        return true;
    }
}