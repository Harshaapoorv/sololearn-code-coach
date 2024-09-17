#include <iostream>
using namespace std;

int main() {
    int number_of_fruits;

    cin >> number_of_fruits;// Number of fruit pieces in the bowl

    // As the number of fruits is even and half of them are apples and the other half are bananas

    int number_of_apples = number_of_fruits / 2;

    // Now for each pie we have three apples
    cout << number_of_apples / 3;

    return 0;
}