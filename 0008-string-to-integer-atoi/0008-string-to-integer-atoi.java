class Solution {  
    public int myAtoi(String s) {  
        int sign = 1;  
        long result = 0;  
        int digit;  
        boolean started = false;  
 
        for (int i = 0; i < s.length(); i++) {  

            
            if (s.charAt(i) == ' ') {  
                if (!started) {  
                    continue;  
                } else {  
                    break;  
                }  
            }  

            
            if (!started && s.charAt(i) == '+') {  
                started = true;  
                continue;  
            } 
            else if (!started && s.charAt(i) == '-') {  
                sign = -1;  
                started = true;  
                continue;  
            }  

            
            if (!Character.isDigit(s.charAt(i))) {  
                break;  
            }  

            started = true;  
            digit = s.charAt(i) - '0';  

            
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 &&
                 digit > (sign == 1 ? 7 : 8))) {

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;  
        }  

        return (int)(result * sign);  
    }  
}