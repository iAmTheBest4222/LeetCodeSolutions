class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1=""
        for i in s:
            if i.isalnum():
                s1+=i.lower()
        s2=s1
        s1=s1[::-1]
        print(s1,s2)
        return s1==s2