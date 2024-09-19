#include <iostream>
using namespace std;

int main() {
    int number_of_friends;

    cin >> number_of_friends; // Number of friends who want to order with you

    // Each friends needs 9 candles, so for 'x' friends it will be 9x candles
    // And 9 candles for you. In total 9x + 9
    // So total = (x + 1) * 9

    cout << 9 * (number_of_friends + 1);

    return 0;
}