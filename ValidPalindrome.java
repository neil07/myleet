public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s==null) return false;
        s = extractLetter(s);
        int len = s.length();
        if(len<=1) return true;
        for (int i = 0; i < len / 2; i++) {
    		if (s.charAt(i) != s.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
        
    }
    
    public String extractLetter(String s) {
    	s = s.toLowerCase();
		StringBuilder res = new StringBuilder();
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if (isAlpha(tmp))
				res.append(tmp);
		}
		return res.toString();
	}
    
    public boolean isAlpha(char a){
        if (a>='a' && a<='z') return true;
        else if (a>='0' && a<='9') return true;
        return false;
    }
}
