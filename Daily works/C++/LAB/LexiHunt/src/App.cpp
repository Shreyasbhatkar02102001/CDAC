//#include <iostream>
//#include <fstream>
//#include <string>
//#include <vector>
//#include <ctime>
//#include <cstdlib>
//#include <algorithm>
//#include <unordered_set>  // For tracking unique meanings
//#include "../nlohmann/json.hpp" // Include the nlohmann/json.hpp header
//
//
//using namespace std;
//using json = nlohmann::json;
//
//// Function to get 3 random meanings and return them along with the correct one
//vector<std::string> getRandomMeanings(const json& data, const string& correctWord, string& correctAnswer) {
//    vector<std::string> options;
//    vector<std::string> allMeanings;
//    unordered_set<std::string> uniqueMeanings;  // To track unique meanings
//
//    // Gather all meanings from other words
//    for (json::const_iterator it = data.begin(); it != data.end(); ++it) {
//        if (it.key() != correctWord) {
//            // Remove the reference warning by copying the string, not binding to it
//            for (auto meaning : it.value()) {  // Using auto to avoid the reference
//                if (uniqueMeanings.find(meaning) == uniqueMeanings.end()) {
//                    allMeanings.push_back(meaning);
//                    uniqueMeanings.insert(meaning);  // Mark as used
//                }
//            }
//        }
//    }
//
//    // Pick 3 random meanings from other words, ensuring no duplicates
//    while (options.size() < 3 && !allMeanings.empty()) {
//        int randIndex = rand() % allMeanings.size();
//        string randomMeaning = allMeanings[randIndex];
//
//        // Avoid duplicates in options
//        if (find(options.begin(), options.end(), randomMeaning) == options.end()) {
//            options.push_back(randomMeaning);
//        }
//    }
//
//    // Add the correct meaning to the options
//    for (auto meaning : data.at(correctWord)) {  // Again using auto here
//        correctAnswer = meaning;  // Set the correct answer
//        options.push_back(meaning);
//    }
//
//    // Shuffle the options to randomize the order
//    random_shuffle(options.begin(), options.end());
//
//    // Ensure only 4 options are returned
//    if (options.size() > 4) {
//        options.resize(4);
//    }
//
//    return options;
//}
//
//
//int main() {
//    // Initialize the random seed
//    srand(time(0));
//
//    // Load the JSON data from file
//    std::ifstream file("word.txt");
//    json data;
//    file >> data;  // Parse the JSON file into the data variable
//
//    // Select 5 random words to quiz the player
//    vector<string> keys;
//    for (json::const_iterator it = data.begin(); it != data.end(); ++it) {
//        keys.push_back(it.key());
//    }
//
//    // Randomly shuffle the words and pick the first 5
//    random_shuffle(keys.begin(), keys.end());
//    keys.resize(5);  // Get 5 random words
//
//    int score = 0;
//    char answer;
//
//    // Start the game
//    for (int i = 0; i < 5; ++i) {
//        string word = keys[i];
//        cout << "*******************************\n";
//        cout << "Word: " << word << endl;
//        cout << "*******************************\n";
//
//        // Get 4 options (3 random and 1 correct)
//        string correctAnswer;
//        vector<string> options = getRandomMeanings(data, word, correctAnswer);
//
//        // Display the options like the multiple-choice format
//        char optionLabel = 'A';
//        for (size_t j = 0; j < options.size(); ++j) {  // Use size_t to match vector size type
//            cout << optionLabel++ << ": " << options[j] << endl;
//        }
//
//        // Ask for the player's input
//        cout << "Select the correct meaning (A, B, C, or D): ";
//        cin >> answer;
//        answer = toupper(answer);
//
//        // Find the selected answer's option index
//        int selectedIndex = answer - 'A';
//
//        // Check if the selected answer matches the correct answer
//        if (options[selectedIndex] == correctAnswer) {
//            cout << "CORRECT\n";
//            score++;
//        } else {
//            cout << "WRONG!\n";
//            cout << "Answer: " << correctAnswer << endl;
//        }
//        cout << endl;
//    }
//
//    // Final score
//    cout << "*******************************\n";
//    cout << "*           RESULTS           *\n";
//    cout << "*******************************\n";
//    cout << "CORRECT GUESSES: " << score << endl;
//    cout << "# of QUESTIONS: 5" << endl;
//    cout << "SCORE: " << (score / 5.0) * 100 << "%" << endl;
//
//    return 0;
//}


#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <ctime>
#include <cstdlib>
#include <algorithm>
#include <unordered_set>  // For tracking unique meanings
#include "../include/nlohmann/json.hpp" // Include the nlohmann/json.hpp header

using namespace std;
using json = nlohmann::json;

vector<string> getRandomMeanings(const json& data, const string& correctWord, string& correctAnswer) {
    vector<string> options;
    vector<string> allMeanings;
    unordered_set<string> uniqueMeanings;  // To track unique meanings

    // Gather all meanings from other words
    for (json::const_iterator it = data.begin(); it != data.end(); ++it) {
        if (it.key() != correctWord) {
            for (const std::string& meaning : it.value()) {  // Explicitly use std::string
                if (uniqueMeanings.find(meaning) == uniqueMeanings.end()) {
                    allMeanings.push_back(meaning);
                    uniqueMeanings.insert(meaning);  // Mark as used
                }
            }
        }
    }

    // Pick 3 random meanings from other words, ensuring no duplicates
    while (options.size() < 3 && !allMeanings.empty()) {
        int randIndex = rand() % allMeanings.size();
        const string& randomMeaning = allMeanings[randIndex];

        if (find(options.begin(), options.end(), randomMeaning) == options.end()) {
            options.push_back(randomMeaning);
        }
    }

    // Add the correct meaning to the options
    for (const std::string& meaning : data.at(correctWord)) {  // Explicitly use std::string
        correctAnswer = meaning;  // Set the correct answer
        options.push_back(meaning);
    }

    // Shuffle the options to randomize the order
    random_shuffle(options.begin(), options.end());

    // Ensure only 4 options are returned
    if (options.size() > 4) {
        options.resize(4);
    }

    return options;
}

int main() {
    // Initialize the random seed
    srand(static_cast<unsigned>(time(0)));

    // Load the JSON data from file
    std::ifstream file("word.txt");
    if (!file.is_open()) {
        cerr << "Error: Could not open file 'word.txt'." << endl;
        return 1;
    }

    json data;
    file >> data;  // Parse the JSON file into the data variable

    // Select 5 random words to quiz the player
    vector<string> keys;
    for (json::const_iterator it = data.begin(); it != data.end(); ++it) {
        keys.push_back(it.key());
    }

    // Randomly shuffle the words and pick the first 5
    random_shuffle(keys.begin(), keys.end());
    keys.resize(5);  // Get 5 random words

    int score = 0;
    char answer;

    // Start the game
    for (int i = 0; i < 5; ++i) {
        string word = keys[i];
        cout << "*****************\n";
        cout << "Word: " << word << endl;
        cout << "*****************\n";

        // Get 4 options (3 random and 1 correct)
        string correctAnswer;
        vector<string> options = getRandomMeanings(data, word, correctAnswer);

        // Display the options like the multiple-choice format
        char optionLabel = 'A';
        for (size_t j = 0; j < options.size(); ++j) {
            cout << optionLabel++ << ": " << options[j] << endl;
        }

        // Ask for the player's input
        cout << "Select the correct meaning (A, B, C, or D): ";
        cin >> answer;
        answer = toupper(answer);

        // Find the selected answer's option index
        int selectedIndex = answer - 'A';

        // Check if the selected answer matches the correct answer
        if (selectedIndex >= 0 && selectedIndex < options.size() && options[selectedIndex] == correctAnswer) {
            cout << "CORRECT\n";
            score++;
        } else {
            cout << "WRONG!\n";
            cout << "Answer: " << correctAnswer << endl;
        }
        cout << endl;
    }

    // Final score
    cout << "*******************************\n";
    cout << "*           RESULTS           *\n";
    cout << "*******************************\n";
    cout << "CORRECT GUESSES: " << score << endl;
    cout << "# of QUESTIONS: 5" << endl;
    cout << "SCORE: " << (score / 5.0) * 100 << "%" << endl;

    return 0;
}
