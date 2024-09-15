#include <iostream>

using namespace std;

int main() {
    int siblings, popsicles;

    cin >> siblings;
    cin >> popsicles;

    if (popsicles % siblings == 0) {
        cout << "give away";
    } else {
        cout << "eat them yourself";
    }

    return 0;
}