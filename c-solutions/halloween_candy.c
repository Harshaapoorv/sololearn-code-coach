#include <stdio.h>
#include <math.h>

int main() {
//  This problem is a classic case of probability
//  Let's consider 4 houses out of which 1 would be candy, 2 would be dollar bills 
//  and 1 would be toothbrush

//  So the probability of dollar bills is 2 in 4 (number_of_houses)

    int number_of_houses;

    scanf("%d", &number_of_houses);

    int a = ceil((2.0 / number_of_houses) * 100);

    printf("%d", a);

    return 0;
}