#include <iostream>
#include <windows.h> // For colors
using namespace std;

// Function for setting console text color
void setColor(int color) {
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), color);
}

int main() {
    int score = 0;
    int ans;

    setColor(14);
    cout << "===== 🎮 Welcome to the C++ Quiz Game 🎮 =====\n\n";

    // Q1
    setColor(11);
    cout << "Q1. Which symbol is used to end a statement in C++?\n";
    cout << "1. . \n2. ; \n3. : \n4. ,\n";
    setColor(7); cout << "Your Answer (1-4): ";
    cin >> ans;
    if(ans == 2) { setColor(10); cout << "✅ Correct!\n\n"; score++; }
    else { setColor(12); cout << "❌ Wrong! Correct: 2. ;\n\n"; }

    // Q2
    setColor(11);
    cout << "Q2. Which keyword is used to create a new variable in C++?\n";
    cout << "1. define \n2. var \n3. int/float/etc. \n4. new\n";
    setColor(7); cout << "Your Answer (1-4): ";
    cin >> ans;
    if(ans == 3) { setColor(10); cout << "Correct!\n\n"; score++; }
    else { setColor(12); cout << "Wrong! Correct: 3. int/float/etc.\n\n"; }

    // Q3
    setColor(11);
    cout << "Q3. Which of these is used to take input from user in C++?\n";
    cout << "1. cout \n2. cin \n3. printf \n4. input\n";
    setColor(7); cout << "Your Answer (1-4): ";
    cin >> ans;
    if(ans == 2) { setColor(10); cout << "Correct!\n\n"; score++; }
    else { setColor(12); cout << "Wrong! Correct: 2. cin\n\n"; }

    // Q4
    setColor(11);
    cout << "Q4. Which of the following is used to insert a new line in C++?\n";
    cout << "1. \\n \n2. endl \n3. Both 1 and 2 \n4. None\n";
    setColor(7); cout << "Your Answer (1-4): ";
    cin >> ans;
    if(ans == 3) { setColor(10); cout << "Correct!\n\n"; score++; }
    else { setColor(12); cout << "Wrong! Correct: 3. Both 1 and 2\n\n"; }

    // Q5
    setColor(11);
    cout << "Q5. Which header file is needed for cout and cin?\n";
    cout << "1. iostream \n2. stdio.h \n3. conio.h \n4. cstdio\n";
    setColor(7); cout << "Your Answer (1-4): ";
    cin >> ans;
    if(ans == 1) { setColor(10); cout << "Correct!\n\n"; score++; }
    else { setColor(12); cout << "Wrong! Correct: 1. iostream\n\n"; }

    // Q6
    setColor(11);
    cout << "Q6. What is the default return type of main() in C++?\n";
    cout << "1. void \n2. int \n3. float \n4. char\n";
    setColor(7); cout << "Your Answer (1-4): ";
    cin >> ans;
    if(ans == 2) { setColor(10); cout << "Correct!\n\n"; score++; }
    else { setColor(12); cout << "Wrong! Correct: 2. int\n\n"; }

    // Q7
    setColor(11);
    cout << "Q7. Which operator is used for scope resolution in C++?\n";
    cout << "1. -> \n2. . \n3. :: \n4. #\n";
    setColor(7); cout << "Your Answer (1-4): ";
    cin >> ans;
    if(ans == 3) { setColor(10); cout << "Correct!\n\n"; score++; }
    else { setColor(12); cout << "Wrong! Correct: 3. ::\n\n"; }

    // Q8
    setColor(11);
    cout << "Q8. Which of these is the correct way to declare a constant in C++?\n";
    cout << "1. const int x = 10; \n2. int const x = 10; \n3. Both 1 and 2 \n4. None\n";
    setColor(7); cout << "Your Answer (1-4): ";
    cin >> ans;
    if(ans == 3) { setColor(10); cout << "Correct!\n\n"; score++; }
    else { setColor(12); cout << "Wrong! Correct: 3. Both 1 and 2\n\n"; }

    // Final Score
    setColor(14);
    cout << "=====  Quiz Finished  =====\n";
    setColor(10);
    cout << "Your Score = " << score << " / 8\n";

    if(score == 8) {
        setColor(2);
        cout << "Excellent! You are a C++ Pro!\n";
    } else if(score >= 5) {
        setColor(6);
        cout << "Good Job! Keep Practicing.\n";
    } else {
        setColor(12);
        cout << "You need more practice. Don't give up!\n";
    }

    setColor(7); // Reset to white
    return 0;
}
