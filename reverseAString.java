// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        //stack takes o(n) space complexity - so not a good solution
        //using backward traversal
        StringBuilder result=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        return result.toString();//as result is a string builder , we need to convert it to String
        
       
    }
}