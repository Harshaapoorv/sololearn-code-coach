#include <stdio.h>

int main() {
    int number_of_friends;

    scanf("%d", &number_of_friends); // Number of friends who want to order with you

    // Each friends needs 9 candles, so for 'x' friends it will be 9x candles
    // And 9 candles for you. In total 9x + 9
    // So total = (x + 1) * 9

    printf("%d", 9 * (number_of_friends + 1));

    return 0;
}