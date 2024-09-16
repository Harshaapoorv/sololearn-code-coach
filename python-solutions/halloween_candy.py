import math

# This problem is a classic case of probability
# Let's consider 4 houses out of which 1 would be candy, 2 would be dollar bills 
# and 1 would be toothbrush

# So the probability of dollar bills is 2 in 4 (number_of_houses)

number_of_houses = int(input())

a = math.ceil(2 / number_of_houses * 100)

print(a)