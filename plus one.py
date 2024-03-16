class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        cary=0
        for i in range(-1,-(len(digits)+1),-1):
            if digits[i]==9:
                carry=1
                digits[i]=0
            else:
                carry=0
                digits[i]+=1
                break
        if carry:
            digits=[1]+digits
        return digits
