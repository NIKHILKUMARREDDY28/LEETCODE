class Solution:
    def defangIPaddr(self, address: str) -> str:
        lis = address.split(".")
        st = "[.]".join(lis)
        return st
        