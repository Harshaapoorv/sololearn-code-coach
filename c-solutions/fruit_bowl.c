#include <stdio.h>

int main() {
    int number_of_fruits;

    scanf("%d", &number_of_fruits);

    int number_of_apples = number_of_fruits / 2;

    printf("%d", number_of_apples / 3);
    
    return 0;
}