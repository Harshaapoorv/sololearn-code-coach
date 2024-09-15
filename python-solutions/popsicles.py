siblings = int(input()) # Take input for number of siblings
popsicles = int(input()) # Take input for number of popsicles

# If popsicles can be divided by the number of siblings without a remainder
# We can print "give away" if not "eat them yourself"

if (popsicles % siblings == 0) : # (% or modulus) operator gives the remainder 
    print("give away")
else:
    print("eat them yourself")
