try: 
    from sympy.mpmath import mp
except ImportError:
    from mpmath import mp

inp = int(input())
mp.dps = 1001
print(str(mp.pi)[inp + 1])