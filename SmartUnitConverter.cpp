#include <iostream>
#include <windows.h>
using namespace std;

void setColor(int color) {
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), color);
}

void loadingScreen() {
    setColor(14);
    cout << "===== SMART UNIT CONVERTER =====\nLoading";
    for(int i=0; i<5; i++) {
        cout << ".";
        Sleep(500);
    }
    cout << "\n\n";
    setColor(7);
}

void lengthConverter() {
    double cm;
    setColor(11); cout << "Enter length in cm: ";
    cin >> cm;
    setColor(10);
    cout << cm << " cm = " << cm/100 << " m" << endl;
    cout << cm << " cm = " << cm/100000 << " km" << endl;
    cout << cm << " cm = " << cm/2.54 << " inches" << endl;
}

void weightConverter() {
    double kg;
    setColor(11); cout << "Enter weight in kg: ";
    cin >> kg;
    setColor(10);
    cout << kg << " kg = " << kg*1000 << " g" << endl;
    cout << kg << " kg = " << kg*2.205 << " pounds" << endl;
    cout << kg << " kg = " << kg*35.274 << " ounces" << endl;
}

void tempConverter() {
    double c;
    setColor(11); cout << "Enter temperature in Celsius: ";
    cin >> c;
    setColor(10);
    cout << c << " °C = " << (c*9/5)+32 << " °F" << endl;
    cout << c << " °C = " << c+273.15 << " K" << endl;
}
 
int main() {
    int choice;
    char again;
    loadingScreen();

    do {
        setColor(14);
        cout << "===== MENU =====\n";
        cout << "1. Length (cm ==> m, km, inches)\n";
        cout << "2. Weight (kg ==> g, pounds, ounces)\n";
        cout << "3. Temperature (C ==> F, K)\n";
        setColor(11);
        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice) {
            case 1: lengthConverter(); break;
            case 2: weightConverter(); break;
            case 3: tempConverter(); break;
            default: setColor(12); cout << "Invalid choice!\n";
        }

        setColor(14);
        cout << "\nDo you want to convert again? (y/n): ";
        cin >> again;
        cout << "\n";

    } while(again=='y' || again=='Y');

    setColor(10);
    cout << "Thank you for using Smart Unit Converter!\n";
    setColor(7);
    return 0;
}
