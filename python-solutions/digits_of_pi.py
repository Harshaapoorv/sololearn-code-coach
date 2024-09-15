from mpmath import mp

inp = int(input())
mp.dps = 1001
print(str(mp.pi)[inp + 1])