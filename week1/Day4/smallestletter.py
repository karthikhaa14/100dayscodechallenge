class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        st=letters[0]
        list.sort(letters)
        for i in letters:
            if(i==target or i<target):
                continue
            else:
                st=i
                break
        return st
