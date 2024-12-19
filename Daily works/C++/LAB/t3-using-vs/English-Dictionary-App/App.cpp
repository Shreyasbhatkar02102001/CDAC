#include <iostream>
#include <fstream>
#include <string>
#include <map>
#include <nlohmann/json.hpp>

using namespace std;
using json = nlohmann::json;

// Function to load dictionary data from a JSON file
void loadData(json& dictionary) {
    ifstream file("word.json");
    if (file.is_open()) {
        file >> dictionary;
        file.close();
    } else {
        cout << "Error opening file!" << endl;
    }
}

// Function to save dictionary data to a JSON file
void saveData(const json& dictionary) {
    ofstream file("word.json");
    if (file.is_open()) {
        file << dictionary.dump(4);  // pretty print with 4 spaces indentation
        file.close();
    } else {
        cout << "Error opening file!" << endl;
    }
}

// Function to find meaning of a word (handles arrays of meanings)
string findMeaning(const string& word, const json& dictionary) {
    auto it = dictionary.find(word);
    if (it != dictionary.end()) {
        // Return all meanings in the array
        string result = "Meanings:\n";
        for (const string& meaning : it->second) {
            result += "- " + meaning + "\n";
        }
        return result;
    } else {
        return "The word doesn't exist. Please double check it.";
    }
}

// Function to display the menu
void displayMenu() {
    cout << "\nEnter the operations number you want to execute: \n";
    cout << "1: Add new word\n";
    cout << "2: Find the meaning\n";
    cout << "3: Update a word\n";
    cout << "4: Exit\n";
    cout << "Option: ";
}

int main() {
    json dictionary;  // A JSON object to store words and their meanings (as arrays)
    loadData(dictionary);  // Load dictionary data from file

    cout << "\n\t:: Welcome to the English Dictionary ::\n";
    cout << "*****************************************************\n";

    int option;
    while (true) {
        displayMenu();
        cin >> option;

        if (option == 1) {
            // Add new word and meaning
            string word, meaning;
            cout << "Enter a word: ";
            cin >> word;
            cin.ignore();  // To ignore the newline left by cin
            cout << "Enter the meaning: ";
            getline(cin, meaning);

            dictionary[word].push_back(meaning);  // Add meaning to the array for this word
            saveData(dictionary);  // Save updated dictionary to file
            cout << "Word added successfully!\n";
        }
        else if (option == 2) {
            // Find the meaning of a word
            string word;
            cout << "Enter the word: ";
            cin >> word;
            cout << findMeaning(word, dictionary) << endl;
        }
        else if (option == 3) {
            // Update a word's meaning
            string word, meaning;
            cout << "Enter the word to update: ";
            cin >> word;
            cin.ignore();  // To ignore the newline left by cin
            cout << "Enter the new meaning: ";
            getline(cin, meaning);

            if (dictionary.find(word) != dictionary.end()) {
                dictionary[word] = {meaning};  // Replace old meanings with the new one (as a single-element array)
                saveData(dictionary);  // Save updated dictionary to file
                cout << "Word updated successfully!\n";
            } else {
                cout << "The word doesn't exist. Please double check it.\n";
            }
        }
        else if (option == 4) {
            cout << "\n*****  Thanks for using English Dictionary  *****\n";
            cout << "*****  Hope you have a nice day  *****\n";
            break;
        } else {
            cout << "Invalid option! Please try again.\n";
        }
    }

    return 0;
}
