package com.example.androidapps;

public class QuizArray {
    public static String[][] Question = new String[100][6];
    public  static  String[][] ReviewQuiz = new String[20][7];
    public static  int[] Multiple_Quiz_Cheek = new int [20];
    public  static  int QuestionType =0;

    public static  boolean Multiple_Question_Cheek(int number){
        for(int x=0;x<=Quiz.currentquestion;x++){
            if(number==Multiple_Quiz_Cheek[x]){
                return false;
            }
        }
        return true;
    }

    public static void QuestionAdd(){
        // Question 0
        Question[0][0] = "Which is Bangladesh Country?";
        Question[0][1] = "Chittagong";
        Question[0][2] = "Sylhet";
        Question[0][3] = "Lakshmipur";
        Question[0][4] = "Dhaka";
        Question[0][5] = "Dhaka";

// Question 1
        Question[1][0] = "Who is Bangladesh Prime Minister?";
        Question[1][1] = "Dr. Yunis";
        Question[1][2] = "Shek Hasina";
        Question[1][3] = "Tariq Rahman";
        Question[1][4] = "Shek Mujib";
        Question[1][5] = "Dr. Yunis";

// Question 2
        Question[2][0] = "Bangladesh became independent in what year?";
        Question[2][1] = "2024";
        Question[2][2] = "1952";
        Question[2][3] = "1971";
        Question[2][4] = "2020";
        Question[2][5] = "1971";

// Question 3
        Question[3][0] = "What is the capital of France?";
        Question[3][1] = "Berlin";
        Question[3][2] = "Madrid";
        Question[3][3] = "Paris";
        Question[3][4] = "Rome";
        Question[3][5] = "Paris";

// Question 4
        Question[4][0] = "Which planet is known as the Red Planet?";
        Question[4][1] = "Earth";
        Question[4][2] = "Mars";
        Question[4][3] = "Jupiter";
        Question[4][4] = "Saturn";
        Question[4][5] = "Mars";

// Question 5
        Question[5][0] = "Which is the largest ocean on Earth?";
        Question[5][1] = "Atlantic Ocean";
        Question[5][2] = "Indian Ocean";
        Question[5][3] = "Arctic Ocean";
        Question[5][4] = "Pacific Ocean";
        Question[5][5] = "Pacific Ocean";

// Question 6
        Question[6][0] = "Who wrote 'Hamlet'?";
        Question[6][1] = "Charles Dickens";
        Question[6][2] = "William Shakespeare";
        Question[6][3] = "Mark Twain";
        Question[6][4] = "Jane Austen";
        Question[6][5] = "William Shakespeare";

// Question 7
        Question[7][0] = "What is the smallest prime number?";
        Question[7][1] = "1";
        Question[7][2] = "2";
        Question[7][3] = "3";
        Question[7][4] = "5";
        Question[7][5] = "2";

// Question 8
        Question[8][0] = "Which country is known as the Land of the Rising Sun?";
        Question[8][1] = "China";
        Question[8][2] = "Japan";
        Question[8][3] = "South Korea";
        Question[8][4] = "Thailand";
        Question[8][5] = "Japan";

// Question 9
        Question[9][0] = "Which chemical element has the symbol 'O'?";
        Question[9][1] = "Osmium";
        Question[9][2] = "Oxygen";
        Question[9][3] = "Oganesson";
        Question[9][4] = "Ozone";
        Question[9][5] = "Oxygen";

// Question 10
        Question[10][0] = "What is the tallest mountain in the world?";
        Question[10][1] = "K2";
        Question[10][2] = "Mount Everest";
        Question[10][3] = "Kangchenjunga";
        Question[10][4] = "Lhotse";
        Question[10][5] = "Mount Everest";

// Question 11
        Question[11][0] = "Which is the largest continent by area?";
        Question[11][1] = "Africa";
        Question[11][2] = "Asia";
        Question[11][3] = "Europe";
        Question[11][4] = "South America";
        Question[11][5] = "Asia";

// Question 12
        Question[12][0] = "Who discovered penicillin?";
        Question[12][1] = "Marie Curie";
        Question[12][2] = "Alexander Fleming";
        Question[12][3] = "Isaac Newton";
        Question[12][4] = "Louis Pasteur";
        Question[12][5] = "Alexander Fleming";

// Question 13
        Question[13][0] = "What is the currency of Japan?";
        Question[13][1] = "Yuan";
        Question[13][2] = "Won";
        Question[13][3] = "Yen";
        Question[13][4] = "Rupee";
        Question[13][5] = "Yen";

// Question 14
        Question[14][0] = "Which planet is closest to the sun?";
        Question[14][1] = "Venus";
        Question[14][2] = "Mercury";
        Question[14][3] = "Earth";
        Question[14][4] = "Mars";
        Question[14][5] = "Mercury";

// Question 15
        Question[15][0] = "Which river is the longest in the world?";
        Question[15][1] = "Amazon";
        Question[15][2] = "Nile";
        Question[15][3] = "Yangtze";
        Question[15][4] = "Mississippi";
        Question[15][5] = "Nile";

// Question 16
        Question[16][0] = "Who painted the Mona Lisa?";
        Question[16][1] = "Vincent van Gogh";
        Question[16][2] = "Pablo Picasso";
        Question[16][3] = "Leonardo da Vinci";
        Question[16][4] = "Claude Monet";
        Question[16][5] = "Leonardo da Vinci";

// Question 17
        Question[17][0] = "Which gas is most abundant in the Earth's atmosphere?";
        Question[17][1] = "Oxygen";
        Question[17][2] = "Nitrogen";
        Question[17][3] = "Carbon dioxide";
        Question[17][4] = "Helium";
        Question[17][5] = "Nitrogen";

// Question 18
        Question[18][0] = "Which country hosted the 2016 Summer Olympics?";
        Question[18][1] = "China";
        Question[18][2] = "Brazil";
        Question[18][3] = "United Kingdom";
        Question[18][4] = "Japan";
        Question[18][5] = "Brazil";

// Question 19
        Question[19][0] = "What is the square root of 64?";
        Question[19][1] = "6";
        Question[19][2] = "7";
        Question[19][3] = "8";
        Question[19][4] = "9";
        Question[19][5] = "8";

// Question 20
        Question[20][0] = "What is the largest mammal in the world?";
        Question[20][1] = "Elephant";
        Question[20][2] = "Blue Whale";
        Question[20][3] = "Giraffe";
        Question[20][4] = "Hippopotamus";
        Question[20][5] = "Blue Whale";

// Question 21
        Question[21][0] = "Which metal is liquid at room temperature?";
        Question[21][1] = "Gold";
        Question[21][2] = "Silver";
        Question[21][3] = "Mercury";
        Question[21][4] = "Lead";
        Question[21][5] = "Mercury";

// Question 22
        Question[22][0] = "Which country is the largest producer of coffee in the world?";
        Question[22][1] = "Vietnam";
        Question[22][2] = "Brazil";
        Question[22][3] = "Colombia";
        Question[22][4] = "Ethiopia";
        Question[22][5] = "Brazil";

// Question 23
        Question[23][0] = "Which is the smallest country in the world by area?";
        Question[23][1] = "Monaco";
        Question[23][2] = "Nauru";
        Question[23][3] = "Vatican City";
        Question[23][4] = "Malta";
        Question[23][5] = "Vatican City";

// Question 24
        Question[24][0] = "Which element has the atomic number 1?";
        Question[24][1] = "Helium";
        Question[24][2] = "Oxygen";
        Question[24][3] = "Hydrogen";
        Question[24][4] = "Carbon";
        Question[24][5] = "Hydrogen";

// Question 25
        Question[25][0] = "Who invented the telephone?";
        Question[25][1] = "Nikola Tesla";
        Question[25][2] = "Thomas Edison";
        Question[25][3] = "Alexander Graham Bell";
        Question[25][4] = "Guglielmo Marconi";
        Question[25][5] = "Alexander Graham Bell";

// Question 26
        Question[26][0] = "What is the capital of Canada?";
        Question[26][1] = "Toronto";
        Question[26][2] = "Vancouver";
        Question[26][3] = "Montreal";
        Question[26][4] = "Ottawa";
        Question[26][5] = "Ottawa";

// Question 27
        Question[27][0] = "Which country is the Great Wall of China located in?";
        Question[27][1] = "India";
        Question[27][2] = "China";
        Question[27][3] = "Mongolia";
        Question[27][4] = "Nepal";
        Question[27][5] = "China";

// Question 28
        Question[28][0] = "Which ocean is Bermuda located in?";
        Question[28][1] = "Pacific Ocean";
        Question[28][2] = "Indian Ocean";
        Question[28][3] = "Atlantic Ocean";
        Question[28][4] = "Southern Ocean";
        Question[28][5] = "Atlantic Ocean";

// Question 29
        Question[29][0] = "Who was the first man to walk on the moon?";
        Question[29][1] = "Buzz Aldrin";
        Question[29][2] = "Yuri Gagarin";
        Question[29][3] = "Neil Armstrong";
        Question[29][4] = "Michael Collins";
        Question[29][5] = "Neil Armstrong";

// Question 30
        Question[30][0] = "Which planet is known as the Earth's twin?";
        Question[30][1] = "Mars";
        Question[30][2] = "Venus";
        Question[30][3] = "Jupiter";
        Question[30][4] = "Saturn";
        Question[30][5] = "Venus";

// Question 31
        Question[31][0] = "What is the hardest natural substance on Earth?";
        Question[31][1] = "Iron";
        Question[31][2] = "Gold";
        Question[31][3] = "Diamond";
        Question[31][4] = "Platinum";
        Question[31][5] = "Diamond";

// Question 32
        Question[32][0] = "Which country gifted the Statue of Liberty to the USA?";
        Question[32][1] = "United Kingdom";
        Question[32][2] = "France";
        Question[32][3] = "Spain";
        Question[32][4] = "Germany";
        Question[32][5] = "France";

// Question 33
        Question[33][0] = "Which is the longest bone in the human body?";
        Question[33][1] = "Tibia";
        Question[33][2] = "Fibula";
        Question[33][3] = "Femur";
        Question[33][4] = "Humerus";
        Question[33][5] = "Femur";

// Question 34
        Question[34][0] = "Which continent has the most countries?";
        Question[34][1] = "Asia";
        Question[34][2] = "Africa";
        Question[34][3] = "Europe";
        Question[34][4] = "South America";
        Question[34][5] = "Africa";

// Question 35
        Question[35][0] = "Which is the smallest planet in our solar system?";
        Question[35][1] = "Mars";
        Question[35][2] = "Mercury";
        Question[35][3] = "Venus";
        Question[35][4] = "Pluto";
        Question[35][5] = "Mercury";

// Question 36
        Question[36][0] = "What is the boiling point of water at sea level in Celsius?";
        Question[36][1] = "50°C";
        Question[36][2] = "100°C";
        Question[36][3] = "150°C";
        Question[36][4] = "200°C";
        Question[36][5] = "100°C";

// Question 37
        Question[37][0] = "Who discovered America?";
        Question[37][1] = "Leif Erikson";
        Question[37][2] = "Christopher Columbus";
        Question[37][3] = "Amerigo Vespucci";
        Question[37][4] = "Ferdinand Magellan";
        Question[37][5] = "Christopher Columbus";

// Question 38
        Question[38][0] = "Which is the second largest country by area in the world?";
        Question[38][1] = "Russia";
        Question[38][2] = "Canada";
        Question[38][3] = "China";
        Question[38][4] = "USA";
        Question[38][5] = "Canada";

// Question 39
        Question[39][0] = "Which is the chemical symbol for gold?";
        Question[39][1] = "Ag";
        Question[39][2] = "Au";
        Question[39][3] = "Pb";
        Question[39][4] = "Fe";
        Question[39][5] = "Au";

// Question 40
        Question[40][0] = "Which country has the most population in the world?";
        Question[40][1] = "India";
        Question[40][2] = "USA";
        Question[40][3] = "China";
        Question[40][4] = "Indonesia";
        Question[40][5] = "China";

// Question 41
        Question[41][0] = "Who is the author of 'The Catcher in the Rye'?";
        Question[41][1] = "F. Scott Fitzgerald";
        Question[41][2] = "J.D. Salinger";
        Question[41][3] = "Ernest Hemingway";
        Question[41][4] = "Mark Twain";
        Question[41][5] = "J.D. Salinger";

// Question 42
        Question[42][0] = "What is the main ingredient in guacamole?";
        Question[42][1] = "Tomato";
        Question[42][2] = "Avocado";
        Question[42][3] = "Lemon";
        Question[42][4] = "Onion";
        Question[42][5] = "Avocado";

// Question 43
        Question[43][0] = "Which country is famous for its fjords?";
        Question[43][1] = "Sweden";
        Question[43][2] = "Norway";
        Question[43][3] = "Finland";
        Question[43][4] = "Denmark";
        Question[43][5] = "Norway";

// Question 44
        Question[44][0] = "What is the chemical formula for water?";
        Question[44][1] = "CO2";
        Question[44][2] = "H2O";
        Question[44][3] = "O2";
        Question[44][4] = "NaCl";
        Question[44][5] = "H2O";

// Question 45
        Question[45][0] = "Who is the founder of Microsoft?";
        Question[45][1] = "Steve Jobs";
        Question[45][2] = "Bill Gates";
        Question[45][3] = "Elon Musk";
        Question[45][4] = "Larry Page";
        Question[45][5] = "Bill Gates";

// Question 46
        Question[46][0] = "Which planet has the most moons?";
        Question[46][1] = "Jupiter";
        Question[46][2] = "Saturn";
        Question[46][3] = "Uranus";
        Question[46][4] = "Neptune";
        Question[46][5] = "Saturn";

// Question 47
        Question[47][0] = "Which country won the FIFA World Cup in 2018?";
        Question[47][1] = "Brazil";
        Question[47][2] = "Germany";
        Question[47][3] = "France";
        Question[47][4] = "Argentina";
        Question[47][5] = "France";

// Question 48
        Question[48][0] = "Which is the longest river in the USA?";
        Question[48][1] = "Mississippi River";
        Question[48][2] = "Missouri River";
        Question[48][3] = "Colorado River";
        Question[48][4] = "Rio Grande";
        Question[48][5] = "Missouri River";

// Question 49
        Question[49][0] = "What is the national flower of Japan?";
        Question[49][1] = "Rose";
        Question[49][2] = "Sakura (Cherry Blossom)";
        Question[49][3] = "Lotus";
        Question[49][4] = "Tulip";
        Question[49][5] = "Sakura (Cherry Blossom)";

// Question 50
        Question[50][0] = "Which country is known as the Land of a Thousand Lakes?";
        Question[50][1] = "Norway";
        Question[50][2] = "Canada";
        Question[50][3] = "Finland";
        Question[50][4] = "Sweden";
        Question[50][5] = "Finland";

// Question 51
        Question[51][0] = "What is the fastest land animal?";
        Question[51][1] = "Lion";
        Question[51][2] = "Cheetah";
        Question[51][3] = "Leopard";
        Question[51][4] = "Tiger";
        Question[51][5] = "Cheetah";

// Question 52
        Question[52][0] = "Which is the largest desert in the world?";
        Question[52][1] = "Sahara";
        Question[52][2] = "Arabian";
        Question[52][3] = "Gobi";
        Question[52][4] = "Kalahari";
        Question[52][5] = "Sahara";

// Question 53
        Question[53][0] = "Which country is known for the Eiffel Tower?";
        Question[53][1] = "Italy";
        Question[53][2] = "Spain";
        Question[53][3] = "France";
        Question[53][4] = "Germany";
        Question[53][5] = "France";

// Question 54
        Question[54][0] = "Who is the author of '1984'?";
        Question[54][1] = "George Orwell";
        Question[54][2] = "Aldous Huxley";
        Question[54][3] = "Ray Bradbury";
        Question[54][4] = "Jules Verne";
        Question[54][5] = "George Orwell";

// Question 55
        Question[55][0] = "Which element has the atomic number 6?";
        Question[55][1] = "Carbon";
        Question[55][2] = "Nitrogen";
        Question[55][3] = "Oxygen";
        Question[55][4] = "Fluorine";
        Question[55][5] = "Carbon";

// Question 56
        Question[56][0] = "Which is the largest island in the world?";
        Question[56][1] = "Australia";
        Question[56][2] = "Greenland";
        Question[56][3] = "New Guinea";
        Question[56][4] = "Borneo";
        Question[56][5] = "Greenland";

// Question 57
        Question[57][0] = "Who was the first President of the United States?";
        Question[57][1] = "Thomas Jefferson";
        Question[57][2] = "Abraham Lincoln";
        Question[57][3] = "George Washington";
        Question[57][4] = "John Adams";
        Question[57][5] = "George Washington";

// Question 58
        Question[58][0] = "What is the largest organ in the human body?";
        Question[58][1] = "Heart";
        Question[58][2] = "Liver";
        Question[58][3] = "Skin";
        Question[58][4] = "Brain";
        Question[58][5] = "Skin";

// Question 59
        Question[59][0] = "Which planet is known as the Morning Star?";
        Question[59][1] = "Mercury";
        Question[59][2] = "Venus";
        Question[59][3] = "Mars";
        Question[59][4] = "Jupiter";
        Question[59][5] = "Venus";

// Question 60
        Question[60][0] = "Which is the smallest continent by area?";
        Question[60][1] = "Europe";
        Question[60][2] = "Australia";
        Question[60][3] = "Antarctica";
        Question[60][4] = "South America";
        Question[60][5] = "Australia";

// Question 61
        Question[61][0] = "Who was the first woman to win a Nobel Prize?";
        Question[61][1] = "Marie Curie";
        Question[61][2] = "Mother Teresa";
        Question[61][3] = "Rosalind Franklin";
        Question[61][4] = "Dorothy Hodgkin";
        Question[61][5] = "Marie Curie";

// Question 62
        Question[62][0] = "What is the most common gas in the Earth's atmosphere?";
        Question[62][1] = "Oxygen";
        Question[62][2] = "Carbon Dioxide";
        Question[62][3] = "Nitrogen";
        Question[62][4] = "Helium";
        Question[62][5] = "Nitrogen";

// Question 63
        Question[63][0] = "Which planet is known as the Blue Planet?";
        Question[63][1] = "Mars";
        Question[63][2] = "Neptune";
        Question[63][3] = "Earth";
        Question[63][4] = "Uranus";
        Question[63][5] = "Earth";

// Question 64
        Question[64][0] = "What is the capital of Italy?";
        Question[64][1] = "Milan";
        Question[64][2] = "Venice";
        Question[64][3] = "Rome";
        Question[64][4] = "Florence";
        Question[64][5] = "Rome";

// Question 65
        Question[65][0] = "Which ocean is the largest?";
        Question[65][1] = "Indian Ocean";
        Question[65][2] = "Atlantic Ocean";
        Question[65][3] = "Arctic Ocean";
        Question[65][4] = "Pacific Ocean";
        Question[65][5] = "Pacific Ocean";

// Question 66
        Question[66][0] = "Which country is the smallest by population?";
        Question[66][1] = "Monaco";
        Question[66][2] = "Vatican City";
        Question[66][3] = "San Marino";
        Question[66][4] = "Liechtenstein";
        Question[66][5] = "Vatican City";

// Question 67
        Question[67][0] = "What is the name of the largest desert in Africa?";
        Question[67][1] = "Kalahari Desert";
        Question[67][2] = "Sahara Desert";
        Question[67][3] = "Namib Desert";
        Question[67][4] = "Libyan Desert";
        Question[67][5] = "Sahara Desert";

// Question 68
        Question[68][0] = "Who was the first man to reach the South Pole?";
        Question[68][1] = "Robert Falcon Scott";
        Question[68][2] = "Roald Amundsen";
        Question[68][3] = "Ernest Shackleton";
        Question[68][4] = "Douglas Mawson";
        Question[68][5] = "Roald Amundsen";

// Question 69
        Question[69][0] = "What is the capital of Australia?";
        Question[69][1] = "Sydney";
        Question[69][2] = "Melbourne";
        Question[69][3] = "Canberra";
        Question[69][4] = "Perth";
        Question[69][5] = "Canberra";

// Question 70
        Question[70][0] = "Which country is the largest by area?";
        Question[70][1] = "Canada";
        Question[70][2] = "China";
        Question[70][3] = "Russia";
        Question[70][4] = "USA";
        Question[70][5] = "Russia";

// Question 71
        Question[71][0] = "Which is the tallest building in the world?";
        Question[71][1] = "Shanghai Tower";
        Question[71][2] = "Burj Khalifa";
        Question[71][3] = "One World Trade Center";
        Question[71][4] = "Taipei 101";
        Question[71][5] = "Burj Khalifa";

// Question 72
        Question[72][0] = "Which is the largest desert in Asia?";
        Question[72][1] = "Karakum Desert";
        Question[72][2] = "Gobi Desert";
        Question[72][3] = "Thar Desert";
        Question[72][4] = "Arabian Desert";
        Question[72][5] = "Gobi Desert";

// Question 73
        Question[73][0] = "What is the speed of light in a vacuum?";
        Question[73][1] = "299,792,458 m/s";
        Question[73][2] = "150,000,000 m/s";
        Question[73][3] = "250,000,000 m/s";
        Question[73][4] = "500,000,000 m/s";
        Question[73][5] = "299,792,458 m/s";

// Question 74
        Question[74][0] = "Which is the largest island country in the world by area?";
        Question[74][1] = "Australia";
        Question[74][2] = "Greenland";
        Question[74][3] = "Madagascar";
        Question[74][4] = "New Guinea";
        Question[74][5] = "Australia";

// Question 75
        Question[75][0] = "Who was the first woman in space?";
        Question[75][1] = "Sally Ride";
        Question[75][2] = "Valentina Tereshkova";
        Question[75][3] = "Mae Jemison";
        Question[75][4] = "Peggy Whitson";
        Question[75][5] = "Valentina Tereshkova";

// Question 76
        Question[76][0] = "Which is the most populous city in the world?";
        Question[76][1] = "New York";
        Question[76][2] = "Tokyo";
        Question[76][3] = "Shanghai";
        Question[76][4] = "Delhi";
        Question[76][5] = "Tokyo";

// Question 77
        Question[77][0] = "Which element is the most abundant in the Earth's crust?";
        Question[77][1] = "Oxygen";
        Question[77][2] = "Silicon";
        Question[77][3] = "Aluminum";
        Question[77][4] = "Iron";
        Question[77][5] = "Oxygen";

// Question 78
        Question[78][0] = "What is the currency of the United Kingdom?";
        Question[78][1] = "Euro";
        Question[78][2] = "Dollar";
        Question[78][3] = "Pound Sterling";
        Question[78][4] = "Franc";
        Question[78][5] = "Pound Sterling";

// Question 79
        Question[79][0] = "What is the largest internal organ in the human body?";
        Question[79][1] = "Liver";
        Question[79][2] = "Heart";
        Question[79][3] = "Lung";
        Question[79][4] = "Kidney";
        Question[79][5] = "Liver";

// Question 80
        Question[80][0] = "Which is the smallest country in the world by area?";
        Question[80][1] = "Monaco";
        Question[80][2] = "San Marino";
        Question[80][3] = "Liechtenstein";
        Question[80][4] = "Vatican City";
        Question[80][5] = "Vatican City";

// Question 81
        Question[81][0] = "Which city is known as the Big Apple?";
        Question[81][1] = "Chicago";
        Question[81][2] = "Los Angeles";
        Question[81][3] = "New York City";
        Question[81][4] = "San Francisco";
        Question[81][5] = "New York City";

// Question 82
        Question[82][0] = "Which is the largest mammal in the world?";
        Question[82][1] = "Elephant";
        Question[82][2] = "Whale Shark";
        Question[82][3] = "Blue Whale";
        Question[82][4] = "Giraffe";
        Question[82][5] = "Blue Whale";

// Question 83
        Question[83][0] = "Which river flows through Paris?";
        Question[83][1] = "Thames";
        Question[83][2] = "Seine";
        Question[83][3] = "Danube";
        Question[83][4] = "Tiber";
        Question[83][5] = "Seine";

// Question 84
        Question[84][0] = "Which country is known as the Land of the Rising Sun?";
        Question[84][1] = "South Korea";
        Question[84][2] = "Japan";
        Question[84][3] = "China";
        Question[84][4] = "Vietnam";
        Question[84][5] = "Japan";

// Question 85
        Question[85][0] = "What is the capital of Spain?";
        Question[85][1] = "Barcelona";
        Question[85][2] = "Seville";
        Question[85][3] = "Madrid";
        Question[85][4] = "Valencia";
        Question[85][5] = "Madrid";

// Question 86
        Question[86][0] = "Which is the largest country in Africa by area?";
        Question[86][1] = "Egypt";
        Question[86][2] = "Nigeria";
        Question[86][3] = "Algeria";
        Question[86][4] = "Sudan";
        Question[86][5] = "Algeria";

// Question 87
        Question[87][0] = "Who wrote the play 'Romeo and Juliet'?";
        Question[87][1] = "Charles Dickens";
        Question[87][2] = "William Shakespeare";
        Question[87][3] = "Jane Austen";
        Question[87][4] = "Leo Tolstoy";
        Question[87][5] = "William Shakespeare";

// Question 88
        Question[88][0] = "Which country is the largest exporter of oil in the world?";
        Question[88][1] = "Russia";
        Question[88][2] = "Saudi Arabia";
        Question[88][3] = "USA";
        Question[88][4] = "Canada";
        Question[88][5] = "Saudi Arabia";

// Question 89
        Question[89][0] = "What is the chemical formula for table salt?";
        Question[89][1] = "H2O";
        Question[89][2] = "CO2";
        Question[89][3] = "NaCl";
        Question[89][4] = "O2";
        Question[89][5] = "NaCl";

// Question 90
        Question[90][0] = "Who was the first person to win two Nobel Prizes?";
        Question[90][1] = "Albert Einstein";
        Question[90][2] = "Marie Curie";
        Question[90][3] = "Linus Pauling";
        Question[90][4] = "Niels Bohr";
        Question[90][5] = "Marie Curie";

// Question 91
        Question[91][0] = "What is the most spoken language in the world?";
        Question[91][1] = "Spanish";
        Question[91][2] = "English";
        Question[91][3] = "Mandarin";
        Question[91][4] = "Hindi";
        Question[91][5] = "Mandarin";

// Question 92
        Question[92][0] = "Which is the largest volcano in the world?";
        Question[92][1] = "Mount Etna";
        Question[92][2] = "Mauna Loa";
        Question[92][3] = "Mount Vesuvius";
        Question[92][4] = "Krakatoa";
        Question[92][5] = "Mauna Loa";

// Question 93
        Question[93][0] = "Which continent is known as the Dark Continent?";
        Question[93][1] = "Asia";
        Question[93][2] = "Africa";
        Question[93][3] = "South America";
        Question[93][4] = "Australia";
        Question[93][5] = "Africa";

// Question 94
        Question[94][0] = "What is the currency of Japan?";
        Question[94][1] = "Won";
        Question[94][2] = "Yuan";
        Question[94][3] = "Yen";
        Question[94][4] = "Rupee";
        Question[94][5] = "Yen";

// Question 95
        Question[95][0] = "Which is the second most populous country in the world?";
        Question[95][1] = "USA";
        Question[95][2] = "India";
        Question[95][3] = "Indonesia";
        Question[95][4] = "Brazil";
        Question[95][5] = "India";

// Question 96
        Question[96][0] = "What is the smallest bone in the human body?";
        Question[96][1] = "Stapes";
        Question[96][2] = "Incus";
        Question[96][3] = "Malleus";
        Question[96][4] = "Femur";
        Question[96][5] = "Stapes";

// Question 97
        Question[97][0] = "Which river is the longest in the world?";
        Question[97][1] = "Amazon River";
        Question[97][2] = "Nile River";
        Question[97][3] = "Yangtze River";
        Question[97][4] = "Mississippi River";
        Question[97][5] = "Nile River";

// Question 98
        Question[98][0] = "Who was the first person to climb Mount Everest?";
        Question[98][1] = "Edmund Hillary";
        Question[98][2] = "Tenzing Norgay";
        Question[98][3] = "George Mallory";
        Question[98][4] = "Reinhold Messner";
        Question[98][5] = "Edmund Hillary";

// Question 99
        Question[99][0] = "Which country is the largest producer of coffee in the world?";
        Question[99][1] = "Colombia";
        Question[99][2] = "Vietnam";
        Question[99][3] = "Brazil";
        Question[99][4] = "Ethiopia";
        Question[99][5] = "Brazil";
    }
    public  static  void  InternationalQuestionAdd(){
        Question[0][0] = "Who is the 1st President of USA?";
        Question[0][1] = "Neilia Hunter Biden";
        Question[0][2] = "Hunter Biden";
        Question[0][3] = "George Washington";
        Question[0][4] = "Barack Obama";
        Question[0][5] = "George Washington";

        Question[1][0] = "Who is the Prime Minister of Bangladesh?";
        Question[1][1] = "Dr. Yunis";
        Question[1][2] = "Sheikh Hasina";
        Question[1][3] = "Tariq Rahman";
        Question[1][4] = "Sheikh Mujib";
        Question[1][5] = "Dr. Yunis";

        Question[2][0] = "Which country is known as the Land of the Rising Sun?";
        Question[2][1] = "China";
        Question[2][2] = "Japan";
        Question[2][3] = "South Korea";
        Question[2][4] = "Thailand";
        Question[2][5] = "Japan";

        Question[3][0] = "What is the capital of France?";
        Question[3][1] = "Rome";
        Question[3][2] = "Berlin";
        Question[3][3] = "Paris";
        Question[3][4] = "Madrid";
        Question[3][5] = "Paris";

        Question[4][0] = "Which river flows through Egypt?";
        Question[4][1] = "Amazon";
        Question[4][2] = "Nile";
        Question[4][3] = "Yangtze";
        Question[4][4] = "Ganges";
        Question[4][5] = "Nile";

        Question[5][0] = "What is the largest continent by area?";
        Question[5][1] = "Africa";
        Question[5][2] = "Europe";
        Question[5][3] = "Asia";
        Question[5][4] = "North America";
        Question[5][5] = "Asia";

        Question[6][0] = "Which language is primarily spoken in Brazil?";
        Question[6][1] = "Spanish";
        Question[6][2] = "Portuguese";
        Question[6][3] = "English";
        Question[6][4] = "French";
        Question[6][5] = "Portuguese";

        Question[7][0] = "Which country won the 2018 FIFA World Cup?";
        Question[7][1] = "Brazil";
        Question[7][2] = "Argentina";
        Question[7][3] = "France";
        Question[7][4] = "Germany";
        Question[7][5] = "France";

        Question[8][0] = "What is the national currency of Japan?";
        Question[8][1] = "Dollar";
        Question[8][2] = "Rupee";
        Question[8][3] = "Yen";
        Question[8][4] = "Won";
        Question[8][5] = "Yen";

        Question[9][0] = "Which ocean is the largest?";
        Question[9][1] = "Atlantic";
        Question[9][2] = "Indian";
        Question[9][3] = "Arctic";
        Question[9][4] = "Pacific";
        Question[9][5] = "Pacific";

        Question[10][0] = "Which country has the most population?";
        Question[10][1] = "India";
        Question[10][2] = "USA";
        Question[10][3] = "China";
        Question[10][4] = "Russia";
        Question[10][5] = "China";

        Question[11][0] = "Which country is famous for the Eiffel Tower?";
        Question[11][1] = "Germany";
        Question[11][2] = "Spain";
        Question[11][3] = "France";
        Question[11][4] = "Italy";
        Question[11][5] = "France";

        Question[12][0] = "Which is the longest river in the world?";
        Question[12][1] = "Amazon";
        Question[12][2] = "Mississippi";
        Question[12][3] = "Nile";
        Question[12][4] = "Yangtze";
        Question[12][5] = "Nile";

        Question[13][0] = "In which year did World War II end?";
        Question[13][1] = "1940";
        Question[13][2] = "1945";
        Question[13][3] = "1950";
        Question[13][4] = "1939";
        Question[13][5] = "1945";

        Question[14][0] = "Which country is known for its maple syrup?";
        Question[14][1] = "USA";
        Question[14][2] = "Canada";
        Question[14][3] = "Finland";
        Question[14][4] = "Denmark";
        Question[14][5] = "Canada";

        Question[15][0] = "Which is the smallest country in the world?";
        Question[15][1] = "Monaco";
        Question[15][2] = "Vatican City";
        Question[15][3] = "Luxembourg";
        Question[15][4] = "Liechtenstein";
        Question[15][5] = "Vatican City";

        Question[16][0] = "Who is the current President of the USA (2024)?";
        Question[16][1] = "Joe Biden";
        Question[16][2] = "Donald Trump";
        Question[16][3] = "Barack Obama";
        Question[16][4] = "George Bush";
        Question[16][5] = "Joe Biden";

        Question[17][0] = "Which country is famous for the Great Wall?";
        Question[17][1] = "Japan";
        Question[17][2] = "India";
        Question[17][3] = "China";
        Question[17][4] = "Korea";
        Question[17][5] = "China";

        Question[18][0] = "Which city is known as the Big Apple?";
        Question[18][1] = "Los Angeles";
        Question[18][2] = "San Francisco";
        Question[18][3] = "New York City";
        Question[18][4] = "Chicago";
        Question[18][5] = "New York City";

        Question[19][0] = "What is the national animal of Australia?";
        Question[19][1] = "Koala";
        Question[19][2] = "Kangaroo";
        Question[19][3] = "Platypus";
        Question[19][4] = "Emu";
        Question[19][5] = "Kangaroo";

        Question[20][0] = "What is the capital of Canada?";
        Question[20][1] = "Toronto";
        Question[20][2] = "Vancouver";
        Question[20][3] = "Ottawa";
        Question[20][4] = "Montreal";
        Question[20][5] = "Ottawa";

        Question[21][0] = "Which country hosted the 2016 Summer Olympics?";
        Question[21][1] = "USA";
        Question[21][2] = "Brazil";
        Question[21][3] = "UK";
        Question[21][4] = "China";
        Question[21][5] = "Brazil";

        Question[22][0] = "Who painted the Mona Lisa?";
        Question[22][1] = "Pablo Picasso";
        Question[22][2] = "Vincent van Gogh";
        Question[22][3] = "Leonardo da Vinci";
        Question[22][4] = "Michelangelo";
        Question[22][5] = "Leonardo da Vinci";

        Question[23][0] = "Which is the largest desert in the world?";
        Question[23][1] = "Gobi";
        Question[23][2] = "Kalahari";
        Question[23][3] = "Sahara";
        Question[23][4] = "Antarctic";
        Question[23][5] = "Antarctic";

        Question[24][0] = "What is the official language of Egypt?";
        Question[24][1] = "English";
        Question[24][2] = "French";
        Question[24][3] = "Arabic";
        Question[24][4] = "Spanish";
        Question[24][5] = "Arabic";

        Question[25][0] = "Which European country is famous for its canals?";
        Question[25][1] = "Spain";
        Question[25][2] = "France";
        Question[25][3] = "Netherlands";
        Question[25][4] = "Italy";
        Question[25][5] = "Netherlands";

        Question[26][0] = "What is the largest island in the world?";
        Question[26][1] = "Madagascar";
        Question[26][2] = "Borneo";
        Question[26][3] = "Greenland";
        Question[26][4] = "Iceland";
        Question[26][5] = "Greenland";

        Question[27][0] = "Which country is famous for inventing pizza?";
        Question[27][1] = "France";
        Question[27][2] = "Italy";
        Question[27][3] = "Spain";
        Question[27][4] = "Mexico";
        Question[27][5] = "Italy";

        Question[28][0] = "What is the official currency of the United Kingdom?";
        Question[28][1] = "Euro";
        Question[28][2] = "Pound Sterling";
        Question[28][3] = "Dollar";
        Question[28][4] = "Franc";
        Question[28][5] = "Pound Sterling";

        Question[29][0] = "Which country is home to the tallest mountain in the world, Mount Everest?";
        Question[29][1] = "Nepal";
        Question[29][2] = "China";
        Question[29][3] = "India";
        Question[29][4] = "Pakistan";
        Question[29][5] = "Nepal";

        Question[30][0] = "Which city hosted the 2020 Summer Olympics?";
        Question[30][1] = "Tokyo";
        Question[30][2] = "London";
        Question[30][3] = "Rio de Janeiro";
        Question[30][4] = "Beijing";
        Question[30][5] = "Tokyo";

        Question[31][0] = "Which country is famous for tulips and windmills?";
        Question[31][1] = "Denmark";
        Question[31][2] = "Netherlands";
        Question[31][3] = "Sweden";
        Question[31][4] = "Norway";
        Question[31][5] = "Netherlands";

        Question[32][0] = "What is the capital of Australia?";
        Question[32][1] = "Sydney";
        Question[32][2] = "Melbourne";
        Question[32][3] = "Canberra";
        Question[32][4] = "Brisbane";
        Question[32][5] = "Canberra";

        Question[33][0] = "Which country has the largest rainforest?";
        Question[33][1] = "Congo";
        Question[33][2] = "Brazil";
        Question[33][3] = "Indonesia";
        Question[33][4] = "Australia";
        Question[33][5] = "Brazil";

        Question[34][0] = "Which is the smallest continent by area?";
        Question[34][1] = "Antarctica";
        Question[34][2] = "Europe";
        Question[34][3] = "Australia";
        Question[34][4] = "South America";
        Question[34][5] = "Australia";

        Question[35][0] = "Who was the first human to step on the Moon?";
        Question[35][1] = "Buzz Aldrin";
        Question[35][2] = "Yuri Gagarin";
        Question[35][3] = "Neil Armstrong";
        Question[35][4] = "Michael Collins";
        Question[35][5] = "Neil Armstrong";

        Question[36][0] = "What is the capital of Egypt?";
        Question[36][1] = "Cairo";
        Question[36][2] = "Alexandria";
        Question[36][3] = "Luxor";
        Question[36][4] = "Giza";
        Question[36][5] = "Cairo";

        Question[37][0] = "Which country is known for the pyramids?";
        Question[37][1] = "Mexico";
        Question[37][2] = "Egypt";
        Question[37][3] = "Peru";
        Question[37][4] = "Sudan";
        Question[37][5] = "Egypt";

        Question[38][0] = "Which country is known for the Colosseum?";
        Question[38][1] = "Spain";
        Question[38][2] = "Italy";
        Question[38][3] = "Greece";
        Question[38][4] = "Portugal";
        Question[38][5] = "Italy";

        Question[39][0] = "What is the main religion of India?";
        Question[39][1] = "Islam";
        Question[39][2] = "Buddhism";
        Question[39][3] = "Hinduism";
        Question[39][4] = "Christianity";
        Question[39][5] = "Hinduism";

        Question[40][0] = "Which is the deepest ocean in the world?";
        Question[40][1] = "Atlantic";
        Question[40][2] = "Pacific";
        Question[40][3] = "Indian";
        Question[40][4] = "Southern";
        Question[40][5] = "Pacific";

        Question[41][0] = "What is the most spoken language in the world?";
        Question[41][1] = "English";
        Question[41][2] = "Mandarin";
        Question[41][3] = "Spanish";
        Question[41][4] = "Hindi";
        Question[41][5] = "Mandarin";

        Question[42][0] = "What is the capital of Japan?";
        Question[42][1] = "Osaka";
        Question[42][2] = "Kyoto";
        Question[42][3] = "Tokyo";
        Question[42][4] = "Nagoya";
        Question[42][5] = "Tokyo";

        Question[43][0] = "Which country is famous for Oktoberfest?";
        Question[43][1] = "Belgium";
        Question[43][2] = "Germany";
        Question[43][3] = "Austria";
        Question[43][4] = "Switzerland";
        Question[43][5] = "Germany";

        Question[44][0] = "Which country produces the most coffee in the world?";
        Question[44][1] = "Colombia";
        Question[44][2] = "Vietnam";
        Question[44][3] = "Brazil";
        Question[44][4] = "Indonesia";
        Question[44][5] = "Brazil";

        Question[45][0] = "Which country is known for the Taj Mahal?";
        Question[45][1] = "Pakistan";
        Question[45][2] = "India";
        Question[45][3] = "Bangladesh";
        Question[45][4] = "Sri Lanka";
        Question[45][5] = "India";

        Question[46][0] = "Which is the largest lake in the world?";
        Question[46][1] = "Lake Victoria";
        Question[46][2] = "Caspian Sea";
        Question[46][3] = "Lake Superior";
        Question[46][4] = "Lake Baikal";
        Question[46][5] = "Caspian Sea";

        Question[47][0] = "Which country is known for its fjords?";
        Question[47][1] = "Sweden";
        Question[47][2] = "Norway";
        Question[47][3] = "Finland";
        Question[47][4] = "Iceland";
        Question[47][5] = "Norway";

        Question[48][0] = "What is the national flower of Japan?";
        Question[48][1] = "Cherry Blossom";
        Question[48][2] = "Lotus";
        Question[48][3] = "Rose";
        Question[48][4] = "Tulip";
        Question[48][5] = "Cherry Blossom";

        Question[49][0] = "Which country is famous for the Carnival festival?";
        Question[49][1] = "Mexico";
        Question[49][2] = "Brazil";
        Question[49][3] = "Argentina";
        Question[49][4] = "Peru";
        Question[49][5] = "Brazil";

        Question[50][0] = "Which country is known for the kangaroo?";
        Question[50][1] = "Australia";
        Question[50][2] = "New Zealand";
        Question[50][3] = "Papua New Guinea";
        Question[50][4] = "South Africa";
        Question[50][5] = "Australia";

        Question[51][0] = "Which European city is known for the Acropolis?";
        Question[51][1] = "Rome";
        Question[51][2] = "Athens";
        Question[51][3] = "Istanbul";
        Question[51][4] = "Paris";
        Question[51][5] = "Athens";

        Question[52][0] = "Which country is the largest producer of tea in the world?";
        Question[52][1] = "India";
        Question[52][2] = "China";
        Question[52][3] = "Sri Lanka";
        Question[52][4] = "Kenya";
        Question[52][5] = "China";

        Question[53][0] = "Which country has the highest number of volcanoes?";
        Question[53][1] = "Japan";
        Question[53][2] = "Indonesia";
        Question[53][3] = "USA";
        Question[53][4] = "Russia";
        Question[53][5] = "Indonesia";

        Question[54][0] = "Which country is home to the Amazon rainforest?";
        Question[54][1] = "Peru";
        Question[54][2] = "Colombia";
        Question[54][3] = "Brazil";
        Question[54][4] = "Venezuela";
        Question[54][5] = "Brazil";

        Question[55][0] = "What is the national language of Brazil?";
        Question[55][1] = "Spanish";
        Question[55][2] = "Portuguese";
        Question[55][3] = "French";
        Question[55][4] = "English";
        Question[55][5] = "Portuguese";

        Question[56][0] = "Which is the smallest country in the world?";
        Question[56][1] = "Monaco";
        Question[56][2] = "Malta";
        Question[56][3] = "Vatican City";
        Question[56][4] = "San Marino";
        Question[56][5] = "Vatican City";

        Question[57][0] = "Which country is home to the Sahara Desert?";
        Question[57][1] = "Algeria";
        Question[57][2] = "Egypt";
        Question[57][3] = "Morocco";
        Question[57][4] = "Sudan";
        Question[57][5] = "Algeria";

        Question[58][0] = "Which country is famous for its maple syrup?";
        Question[58][1] = "Canada";
        Question[58][2] = "USA";
        Question[58][3] = "France";
        Question[58][4] = "Switzerland";
        Question[58][5] = "Canada";

        Question[59][0] = "Which country is known for the Eiffel Tower?";
        Question[59][1] = "Italy";
        Question[59][2] = "Germany";
        Question[59][3] = "France";
        Question[59][4] = "Spain";
        Question[59][5] = "France";

        Question[60][0] = "Which is the coldest continent on Earth?";
        Question[60][1] = "Asia";
        Question[60][2] = "Antarctica";
        Question[60][3] = "North America";
        Question[60][4] = "Europe";
        Question[60][5] = "Antarctica";

        Question[61][0] = "What is the capital of Russia?";
        Question[61][1] = "St. Petersburg";
        Question[61][2] = "Moscow";
        Question[61][3] = "Kazan";
        Question[61][4] = "Sochi";
        Question[61][5] = "Moscow";

        Question[62][0] = "Which country is known for the Great Wall?";
        Question[62][1] = "Japan";
        Question[62][2] = "China";
        Question[62][3] = "Mongolia";
        Question[62][4] = "India";
        Question[62][5] = "China";

        Question[63][0] = "Which country is famous for sushi?";
        Question[63][1] = "China";
        Question[63][2] = "Japan";
        Question[63][3] = "South Korea";
        Question[63][4] = "Thailand";
        Question[63][5] = "Japan";

        Question[64][0] = "Which country is known for its samurai history?";
        Question[64][1] = "China";
        Question[64][2] = "Japan";
        Question[64][3] = "South Korea";
        Question[64][4] = "Thailand";
        Question[64][5] = "Japan";

        Question[65][0] = "What is the most populous country in the world?";
        Question[65][1] = "USA";
        Question[65][2] = "India";
        Question[65][3] = "China";
        Question[65][4] = "Russia";
        Question[65][5] = "China";

        Question[66][0] = "What is the national sport of Canada?";
        Question[66][1] = "Hockey";
        Question[66][2] = "Lacrosse";
        Question[66][3] = "Basketball";
        Question[66][4] = "Soccer";
        Question[66][5] = "Lacrosse";

        Question[67][0] = "Which country is famous for the Parthenon?";
        Question[67][1] = "Italy";
        Question[67][2] = "Greece";
        Question[67][3] = "Turkey";
        Question[67][4] = "Egypt";
        Question[67][5] = "Greece";

        Question[68][0] = "Which country is known for kangaroos?";
        Question[68][1] = "Australia";
        Question[68][2] = "New Zealand";
        Question[68][3] = "Papua New Guinea";
        Question[68][4] = "Indonesia";
        Question[68][5] = "Australia";

        Question[69][0] = "Which country is the birthplace of the Olympic Games?";
        Question[69][1] = "Italy";
        Question[69][2] = "Greece";
        Question[69][3] = "France";
        Question[69][4] = "Germany";
        Question[69][5] = "Greece";

        Question[70][0] = "Which river is the longest in the world?";
        Question[70][1] = "Amazon";
        Question[70][2] = "Nile";
        Question[70][3] = "Yangtze";
        Question[70][4] = "Mississippi";
        Question[70][5] = "Nile";

        Question[71][0] = "Which country is famous for its cherry blossoms?";
        Question[71][1] = "China";
        Question[71][2] = "Japan";
        Question[71][3] = "South Korea";
        Question[71][4] = "Thailand";
        Question[71][5] = "Japan";

        Question[72][0] = "Which country is known for its pyramids?";
        Question[72][1] = "Mexico";
        Question[72][2] = "Egypt";
        Question[72][3] = "Peru";
        Question[72][4] = "Sudan";
        Question[72][5] = "Egypt";

        Question[73][0] = "Which country is the world's largest producer of olive oil?";
        Question[73][1] = "Spain";
        Question[73][2] = "Italy";
        Question[73][3] = "Greece";
        Question[73][4] = "Turkey";
        Question[73][5] = "Spain";

        Question[74][0] = "Which country is known for Mount Fuji?";
        Question[74][1] = "China";
        Question[74][2] = "Japan";
        Question[74][3] = "South Korea";
        Question[74][4] = "Thailand";
        Question[74][5] = "Japan";

        Question[75][0] = "Which country is known for Big Ben?";
        Question[75][1] = "France";
        Question[75][2] = "Germany";
        Question[75][3] = "United Kingdom";
        Question[75][4] = "Spain";
        Question[75][5] = "United Kingdom";

        Question[76][0] = "Which continent is the Sahara Desert located on?";
        Question[76][1] = "Asia";
        Question[76][2] = "Australia";
        Question[76][3] = "Africa";
        Question[76][4] = "South America";
        Question[76][5] = "Africa";

        Question[77][0] = "Which is the longest river in the world?";
        Question[77][1] = "Amazon River";
        Question[77][2] = "Yangtze River";
        Question[77][3] = "Nile River";
        Question[77][4] = "Mississippi River";
        Question[77][5] = "Nile River";

        Question[78][0] = "Which country is the Eiffel Tower located in?";

        Question[78][1] = "Italy";
        Question[78][2] = "Germany";
        Question[78][3] = "France";
        Question[78][4] = "Spain";
        Question[78][5] = "France";

        Question[79][0] = "What is the official language of Brazil?";

        Question[79][1] = "English";
        Question[79][2] = "Spanish";
        Question[79][3] = "Portuguese";
        Question[79][4] = "French";
        Question[79][5] = "Portuguese";

        Question[80][0] = "Which country gifted the Statue of Liberty to the USA?";

        Question[80][1] = "Germany";
        Question[80][2] = "France";
        Question[80][3] = "Italy";
        Question[80][4] = "Spain";
        Question[80][5] = "France";
        Question[81][0] = "Who was the British Prime Minister during World War II?";

        Question[81][1] = "Winston Churchill";
        Question[81][2] = "Neville Chamberlain";
        Question[81][3] = "Clement Attlee";
        Question[81][4] = "Margaret Thatcher";
        Question[81][5] = "Winston Churchill";
        Question[82][0] = "Which currency is used in Japan?";

        Question[82][1] = "Dollar";
        Question[82][2] = "Euro";
        Question[82][3] = "Yen";
        Question[82][4] = "Won";
        Question[82][5] = "Yen";
        Question[83][0] = "Which ocean is the largest by surface area?";

        Question[83][1] = "Indian Ocean";
        Question[83][2] = "Atlantic Ocean";
        Question[83][3] = "Pacific Ocean";
        Question[83][4] = "Southern Ocean";
        Question[83][5] = "Pacific Ocean";
        Question[84][0] = "Who was the first woman to become Prime Minister of the United Kingdom?";

        Question[84][1] = "Margaret Thatcher";
        Question[84][2] = "Theresa May";
        Question[84][3] = "Angela Merkel";
        Question[84][4] = "Indira Gandhi";
        Question[84][5] = "Margaret Thatcher";
        Question[85][0] = "Which country has the largest population in the world?";

        Question[85][1] = "United States";
        Question[85][2] = "India";
        Question[85][3] = "China";
        Question[85][4] = "Russia";
        Question[85][5] = "China";
        Question[86][0] = "In which year did the Titanic sink?";

        Question[86][1] = "1905";
        Question[86][2] = "1912";
        Question[86][3] = "1920";
        Question[86][4] = "1930";
        Question[86][5] = "1912";
        Question[87][0] = "Which country won the FIFA World Cup in 2018?";

        Question[87][1] = "Brazil";
        Question[87][2] = "Germany";
        Question[87][3] = "France";
        Question[87][4] = "Argentina";
        Question[87][5] = "France";
        Question[88][0] = "Which country is known as the Land of the Rising Sun?";

        Question[88][1] = "China";
        Question[88][2] = "South Korea";
        Question[88][3] = "Japan";
        Question[88][4] = "Thailand";
        Question[88][5] = "Japan";
        Question[89][0] = "Which European city hosted the 2016 Summer Olympics?";

        Question[89][1] = "Paris";
        Question[89][2] = "London";
        Question[89][3] = "Rio de Janeiro";
        Question[89][4] = "Athens";
        Question[89][5] = "Rio de Janeiro";
        Question[90][0] = "Which country is home to the Great Barrier Reef?";

        Question[90][1] = "New Zealand";
        Question[90][2] = "Australia";
        Question[90][3] = "Fiji";
        Question[90][4] = "Indonesia";
        Question[90][5] = "Australia";
        Question[91][0] = "What is the currency of the United Kingdom?";

        Question[91][1] = "Euro";
        Question[91][2] = "Pound Sterling";
        Question[91][3] = "Dollar";
        Question[91][4] = "Franc";
        Question[91][5] = "Pound Sterling";
        Question[92][0] = "Which country has the most time zones?";

        Question[92][1] = "China";
        Question[92][2] = "United States";
        Question[92][3] = "Russia";
        Question[92][4] = "Brazil";
        Question[92][5] = "Russia";
        Question[93][0] = "Which mountain is the highest in the world?";

        Question[93][1] = "Mount Everest";
        Question[93][2] = "K2";
        Question[93][3] = "Kangchenjunga";
        Question[93][4] = "Mount Kilimanjaro";
        Question[93][5] = "Mount Everest";
        Question[94][0] = "Which city is known as the Big Apple?";

        Question[94][1] = "Los Angeles";
        Question[94][2] = "Chicago";
        Question[94][3] = "New York City";
        Question[94][4] = "San Francisco";
        Question[94][5] = "New York City";
        Question[95][0] = "Who was the first person to walk on the Moon?";

        Question[95][1] = "Yuri Gagarin";
        Question[95][2] = "Buzz Aldrin";
        Question[95][3] = "Neil Armstrong";
        Question[95][4] = "Michael Collins";
        Question[95][5] = "Neil Armstrong";
        Question[96][0] = "Which country has the largest land area?";

        Question[96][1] = "Canada";
        Question[96][2] = "United States";
        Question[96][3] = "Russia";
        Question[96][4] = "China";
        Question[96][5] = "Russia";
        Question[97][0] = "What is the name of the longest wall in the world?";

        Question[97][1] = "Berlin Wall";
        Question[97][2] = "Great Wall of China";
        Question[97][3] = "Hadrian's Wall";
        Question[97][4] = "Western Wall";
        Question[97][5] = "Great Wall of China";
        Question[98][0] = "Which planet is known as the Red Planet?";

        Question[98][1] = "Venus";
        Question[98][2] = "Mars";
        Question[98][3] = "Jupiter";
        Question[98][4] = "Saturn";
        Question[98][5] = "Mars";
        Question[99][0] = "What is the national animal of Canada?";

        Question[99][1] = "Moose";
        Question[99][2] = "Beaver";
        Question[99][3] = "Grizzly Bear";
        Question[99][4] = "Bison";
        Question[99][5] = "Beaver";
    }
    public  static  void ScienceQuestionAdd() {

        Question[0][0] = "What is the chemical symbol for boron?";
        Question[0][1] = "Bo";
        Question[0][2] = "B";
        Question[0][3] = "Br";
        Question[0][4] = "Bn";
        Question[0][5] = "B";

        Question[1][0] = "What is the chemical symbol for water?";
        Question[1][1] = "Wa";
        Question[1][2] = "H2O";
        Question[1][3] = "Wo";
        Question[1][4] = "O2H";
        Question[1][5] = "H2O";

        Question[2][0] = "What is the speed of light in a vacuum?";
        Question[2][1] = "300,000 km/s";
        Question[2][2] = "150,000 km/s";
        Question[2][3] = "500,000 km/s";
        Question[2][4] = "200,000 km/s";
        Question[2][5] = "300,000 km/s";

        Question[3][0] = "What is the chemical symbol for gold?";
        Question[3][1] = "Go";
        Question[3][2] = "Au";
        Question[3][3] = "Gd";
        Question[3][4] = "Ag";
        Question[3][5] = "Au";

        Question[4][0] = "What is the powerhouse of the cell?";
        Question[4][1] = "Nucleus";
        Question[4][2] = "Mitochondria";
        Question[4][3] = "Ribosome";
        Question[4][4] = "Endoplasmic reticulum";
        Question[4][5] = "Mitochondria";

        Question[5][0] = "What is the value of Pi (π) to two decimal places?";
        Question[5][1] = "3.16";
        Question[5][2] = "3.14";
        Question[5][3] = "3.12";
        Question[5][4] = "3.18";
        Question[5][5] = "3.14";

        Question[6][0] = "What is the chemical symbol for oxygen?";
        Question[6][1] = "Ox";
        Question[6][2] = "O";
        Question[6][3] = "Og";
        Question[6][4] = "Om";
        Question[6][5] = "O";

        Question[7][0] = "What is the largest planet in our solar system?";
        Question[7][1] = "Saturn";
        Question[7][2] = "Jupiter";
        Question[7][3] = "Neptune";
        Question[7][4] = "Uranus";
        Question[7][5] = "Jupiter";

        Question[8][0] = "What is the chemical symbol for silver?";
        Question[8][1] = "Si";
        Question[8][2] = "Ag";
        Question[8][3] = "Sv";
        Question[8][4] = "Ar";
        Question[8][5] = "Ag";

        Question[9][0] = "What is the process by which plants make their own food?";
        Question[9][1] = "Respiration";
        Question[9][2] = "Photosynthesis";
        Question[9][3] = "Transpiration";
        Question[9][4] = "Digestion";
        Question[9][5] = "Photosynthesis";

        Question[10][0] = "What is the formula for the area of a circle?";
        Question[10][1] = "2πr";
        Question[10][2] = "πr^2";
        Question[10][3] = "πd";
        Question[10][4] = "πr";
        Question[10][5] = "πr^2";

        Question[11][0] = "What is the chemical symbol for nitrogen?";
        Question[11][1] = "Ni";
        Question[11][2] = "N";
        Question[11][3] = "Nt";
        Question[11][4] = "No";
        Question[11][5] = "N";

        Question[12][0] = "What is the name of our galaxy?";
        Question[12][1] = "Andromeda";
        Question[12][2] = "Milky Way";
        Question[12][3] = "Triangulum";
        Question[12][4] = "Sombrero";
        Question[12][5] = "Milky Way";

        Question[13][0] = "What is the chemical symbol for iron?";
        Question[13][1] = "Ir";
        Question[13][2] = "Fe";
        Question[13][3] = "In";
        Question[13][4] = "Fn";
        Question[13][5] = "Fe";

        Question[14][0] = "What is the basic unit of heredity?";
        Question[14][1] = "Cell";
        Question[14][2] = "Gene";
        Question[14][3] = "Tissue";
        Question[14][4] = "Organ";
        Question[14][5] = "Gene";

        Question[15][0] = "What is the formula for Ohm's Law?";
        Question[15][1] = "E = IR";
        Question[15][2] = "I = ER";
        Question[15][3] = "R = EI";
        Question[15][4] = "V = IC";
        Question[15][5] = "E = IR";

        Question[16][0] = "What is the chemical symbol for carbon?";
        Question[16][1] = "Ca";
        Question[16][2] = "C";
        Question[16][3] = "Co";
        Question[16][4] = "Cr";
        Question[16][5] = "C";

        Question[17][0] = "What is the closest star to Earth?";
        Question[17][1] = "Sirius";
        Question[17][2] = "Proxima Centauri";
        Question[17][3] = "Alpha Centauri A";
        Question[17][4] = "The Sun";
        Question[17][5] = "The Sun";

        Question[18][0] = "What is the chemical symbol for copper?";
        Question[18][1] = "Co";
        Question[18][2] = "Cu";
        Question[18][3] = "Cp";
        Question[18][4] = "Cr";
        Question[18][5] = "Cu";

        Question[19][0] = "What is the main gas in Earth's atmosphere?";
        Question[19][1] = "Oxygen";
        Question[19][2] = "Nitrogen";
        Question[19][3] = "Carbon Dioxide";
        Question[19][4] = "Hydrogen";
        Question[19][5] = "Nitrogen";

        Question[20][0] = "What is the formula for speed?";
        Question[20][1] = "Distance × Time";
        Question[20][2] = "Distance / Time";
        Question[20][3] = "Time / Distance";
        Question[20][4] = "1/2 × Distance × Time";
        Question[20][5] = "Distance / Time";

        Question[21][0] = "What is the chemical symbol for hydrogen?";
        Question[21][1] = "Hy";
        Question[21][2] = "H";
        Question[21][3] = "Hd";
        Question[21][4] = "Hg";
        Question[21][5] = "H";

        Question[22][0] = "What is Earth's natural satellite?";
        Question[22][1] = "Mars";
        Question[22][2] = "The Moon";
        Question[22][3] = "Venus";
        Question[22][4] = "Jupiter";
        Question[22][5] = "The Moon";

        Question[23][0] = "What is the chemical symbol for helium?";
        Question[23][1] = "He";
        Question[23][2] = "Hm";
        Question[23][3] = "Hl";
        Question[23][4] = "Hn";
        Question[23][5] = "He";

        Question[24][0] = "What is the process of water turning into vapor?";
        Question[24][1] = "Condensation";
        Question[24][2] = "Evaporation";
        Question[24][3] = "Precipitation";
        Question[24][4] = "Sublimation";
        Question[24][5] = "Evaporation";

            Question[25][0] = "What is the chemical symbol for water?";
            Question[25][1] = "Wa";
            Question[25][2] = "H2O";
            Question[25][3] = "Wo";
            Question[25][4] = "O2H";
            Question[25][5] = "H2O";

            Question[26][0] = "What is the speed of light in a vacuum?";
            Question[26][1] = "300,000 km/s";
            Question[26][2] = "150,000 km/s";
            Question[26][3] = "500,000 km/s";
            Question[26][4] = "200,000 km/s";
            Question[26][5] = "300,000 km/s";

            Question[27][0] = "What is the chemical symbol for gold?";
            Question[27][1] = "Go";
            Question[27][2] = "Au";
            Question[27][3] = "Gd";
            Question[27][4] = "Ag";
            Question[27][5] = "Au";

            Question[28][0] = "What is the powerhouse of the cell?";
            Question[28][1] = "Nucleus";
            Question[28][2] = "Mitochondria";
            Question[28][3] = "Ribosome";
            Question[28][4] = "Endoplasmic reticulum";
            Question[28][5] = "Mitochondria";

            Question[29][0] = "What is the value of Pi (π) to two decimal places?";
            Question[29][1] = "3.16";
            Question[29][2] = "3.14";
            Question[29][3] = "3.12";
            Question[29][4] = "3.18";
            Question[29][5] = "3.14";

            Question[30][0] = "What is the chemical symbol for oxygen?";
            Question[30][1] = "Ox";
            Question[30][2] = "O";
            Question[30][3] = "Og";
            Question[30][4] = "Om";
            Question[30][5] = "O";

            Question[31][0] = "What is the largest planet in our solar system?";
            Question[31][1] = "Saturn";
            Question[31][2] = "Jupiter";
            Question[31][3] = "Neptune";
            Question[31][4] = "Uranus";
            Question[31][5] = "Jupiter";

            Question[32][0] = "What is the chemical symbol for silver?";
            Question[32][1] = "Si";
            Question[32][2] = "Ag";
            Question[32][3] = "Sv";
            Question[32][4] = "Ar";
            Question[32][5] = "Ag";

            Question[33][0] = "What is the process by which plants make their own food?";
            Question[33][1] = "Respiration";
            Question[33][2] = "Photosynthesis";
            Question[33][3] = "Transpiration";
            Question[33][4] = "Digestion";
            Question[33][5] = "Photosynthesis";

            Question[34][0] = "What is the formula for the area of a circle?";
            Question[34][1] = "2πr";
            Question[34][2] = "πr^2";
            Question[34][3] = "πd";
            Question[34][4] = "πr";
            Question[34][5] = "πr^2";

            Question[35][0] = "What is the chemical symbol for nitrogen?";
            Question[35][1] = "Ni";
            Question[35][2] = "N";
            Question[35][3] = "Nt";
            Question[35][4] = "No";
            Question[35][5] = "N";

            Question[36][0] = "What is the name of our galaxy?";
            Question[36][1] = "Andromeda";
            Question[36][2] = "Milky Way";
            Question[36][3] = "Triangulum";
            Question[36][4] = "Sombrero";
            Question[36][5] = "Milky Way";

            Question[37][0] = "What is the chemical symbol for iron?";
            Question[37][1] = "Ir";
            Question[37][2] = "Fe";
            Question[37][3] = "In";
            Question[37][4] = "Fn";
            Question[37][5] = "Fe";

            Question[38][0] = "What is the basic unit of heredity?";
            Question[38][1] = "Cell";
            Question[38][2] = "Gene";
            Question[38][3] = "Tissue";
            Question[38][4] = "Organ";
            Question[38][5] = "Gene";

            Question[39][0] = "What is the formula for Ohm's Law?";
            Question[39][1] = "E = IR";
            Question[39][2] = "I = ER";
            Question[39][3] = "R = EI";
            Question[39][4] = "V = IC";
            Question[39][5] = "E = IR";

            Question[40][0] = "What is the chemical symbol for carbon?";
            Question[40][1] = "Ca";
            Question[40][2] = "C";
            Question[40][3] = "Co";
            Question[40][4] = "Cr";
            Question[40][5] = "C";

            Question[41][0] = "What is the closest star to Earth?";
            Question[41][1] = "Sirius";
            Question[41][2] = "Proxima Centauri";
            Question[41][3] = "Alpha Centauri A";
            Question[41][4] = "The Sun";
            Question[41][5] = "The Sun";

            Question[42][0] = "What is the chemical symbol for copper?";
            Question[42][1] = "Co";
            Question[42][2] = "Cu";
            Question[42][3] = "Cp";
            Question[42][4] = "Cr";
            Question[42][5] = "Cu";

            Question[43][0] = "What is the main gas in Earth's atmosphere?";
            Question[43][1] = "Oxygen";
            Question[43][2] = "Nitrogen";
            Question[43][3] = "Carbon Dioxide";
            Question[43][4] = "Hydrogen";
            Question[43][5] = "Nitrogen";

            Question[44][0] = "What is the formula for speed?";
            Question[44][1] = "Distance × Time";
            Question[44][2] = "Distance / Time";
            Question[44][3] = "Time / Distance";
            Question[44][4] = "1/2 × Distance × Time";
            Question[44][5] = "Distance / Time";

            Question[45][0] = "What is the chemical symbol for hydrogen?";
            Question[45][1] = "Hy";
            Question[45][2] = "H";
            Question[45][3] = "Hd";
            Question[45][4] = "Hg";
            Question[45][5] = "H";

            Question[46][0] = "What is Earth's natural satellite?";
            Question[46][1] = "Mars";
            Question[46][2] = "The Moon";
            Question[46][3] = "Venus";
            Question[46][4] = "Jupiter";
            Question[46][5] = "The Moon";

            Question[47][0] = "What is the chemical symbol for helium?";
            Question[47][1] = "He";
            Question[47][2] = "Hm";
            Question[47][3] = "Hl";
            Question[47][4] = "Hn";
            Question[47][5] = "He";

            Question[48][0] = "What is the process of water turning into vapor?";
            Question[48][1] = "Condensation";
            Question[48][2] = "Evaporation";
            Question[48][3] = "Precipitation";
            Question[48][4] = "Sublimation";
            Question[48][5] = "Evaporation";

            Question[49][0] = "What is the formula for density?";
            Question[49][1] = "Mass × Volume";
            Question[49][2] = "Mass / Volume";
            Question[49][3] = "Volume / Mass";
            Question[49][4] = "1/2 × Mass × Volume";
            Question[49][5] = "Mass / Volume";

            Question[50][0] = "What is the chemical symbol for sodium?";
            Question[50][1] = "So";
            Question[50][2] = "Na";
            Question[50][3] = "Sd";
            Question[50][4] = "Sm";
            Question[50][5] = "Na";

            Question[51][0] = "What is the name of the force that pulls objects towards each other?";
            Question[51][1] = "Friction";
            Question[51][2] = "Gravity";
            Question[51][3] = "Magnetism";
            Question[51][4] = "Tension";
            Question[51][5] = "Gravity";

            Question[52][0] = "What is the chemical symbol for potassium?";
            Question[52][1] = "Po";
            Question[52][2] = "K";
            Question[52][3] = "Pt";
            Question[52][4] = "Ps";
            Question[52][5] = "K";

            Question[53][0] = "What is the smallest unit of an element that retains its chemical properties?";
            Question[53][1] = "Molecule";
            Question[53][2] = "Atom";
            Question[53][3] = "Ion";
            Question[53][4] = "Compound";
            Question[53][5] = "Atom";

            Question[54][0] = "What is the formula for work done?";
            Question[54][1] = "Force / Distance";
            Question[54][2] = "Force × Distance";
            Question[54][3] = "Distance / Force";
            Question[54][4] = "1/2 × Force × Distance";
            Question[54][5] = "Force × Distance";

            Question[55][0] = "What is the chemical symbol for calcium?";
            Question[55][1] = "Cl";
            Question[55][2] = "Ca";
            Question[55][3] = "Cm";
            Question[55][4] = "Cn";
            Question[55][5] = "Ca";

            Question[56][0] = "What are the three states of matter?";
            Question[56][1] = "Solid, Liquid, Gas";
            Question[56][2] = "Earth, Fire, Water";
            Question[56][3] = "Plasma, Solid, Liquid";
            Question[56][4] = "Gas, Plasma, Bose-Einstein condensate";
            Question[56][5] = "Solid, Liquid, Gas";

            Question[57][0] = "What is the chemical symbol for magnesium?";
            Question[57][1] = "Mn";
            Question[57][2] = "Mg";
            Question[57][3] = "Ms";
            Question[57][4] = "Mc";
            Question[57][5] = "Mg";

            Question[58][0] = "What is the process of a liquid turning into a solid?";
            Question[58][1] = "Melting";
            Question[58][2] = "Freezing";
            Question[58][3] = "Boiling";
            Question[58][4] = "Condensing";
            Question[58][5] = "Freezing";

            Question[59][0] = "What is the formula for kinetic energy?";
            Question[59][1] = "mgh";
            Question[59][2] = "1/2 mv^2";
            Question[59][3] = "mc^2";
            Question[59][4] = "F × d";
            Question[59][5] = "1/2 mv^2";

            Question[60][0] = "What is the chemical symbol for aluminum?";
            Question[60][1] = "Am";
            Question[60][2] = "Al";
            Question[60][3] = "Au";
            Question[60][4] = "Ar";
            Question[60][5] = "Al";

            Question[61][0] = "What is the name of the force that opposes motion between surfaces in contact?";
            Question[61][1] = "Gravity";
            Question[61][2] = "Friction";
            Question[61][3] = "Tension";
            Question[61][4] = "Applied Force";
            Question[61][5] = "Friction";

            Question[62][0] = "What is the chemical symbol for zinc?";
            Question[62][1] = "Zn";
            Question[62][2] = "Zi";
            Question[62][3] = "Ze";
            Question[62][4] = "Zc";
            Question[62][5] = "Zn";

            Question[63][0] = "What is the process of a solid turning directly into a gas?";
            Question[63][1] = "Melting";
            Question[63][2] = "Boiling";
            Question[63][3] = "Sublimation";
            Question[63][4] = "Deposition";
            Question[63][5] = "Sublimation";

            Question[64][0] = "What is the formula for potential energy due to gravity?";
            Question[64][1] = "1/2 mv^2";
            Question[64][2] = "mgh";
            Question[64][3] = "mc^2";
            Question[64][4] = "F × d";
            Question[64][5] = "mgh";

            Question[65][0] = "What is the chemical symbol for lead?";
            Question[65][1] = "Le";
            Question[65][2] = "Pb";
            Question[65][3] = "Ld";
            Question[65][4] = "Pl";
            Question[65][5] = "Pb";

            Question[66][0] = "What is the name of the organ that pumps blood around the body?";
            Question[66][1] = "Lungs";
            Question[66][2] = "Heart";
            Question[66][3] = "Liver";
            Question[66][4] = "Kidney";
            Question[66][5] = "Heart";

            Question[67][0] = "What is the chemical symbol for tin?";
            Question[67][1] = "Ti";
            Question[67][2] = "Sn";
            Question[67][3] = "Tn";
            Question[67][4] = "Tm";
            Question[67][5] = "Sn";

            Question[68][0] = "What is the process of a gas turning into a liquid?";
            Question[68][1] = "Evaporation";
            Question[68][2] = "Condensation";
            Question[68][3] = "Freezing";
            Question[68][4] = "Melting";
            Question[68][5] = "Condensation";

            Question[69][0] = "What is the formula for acceleration?";
            Question[69][1] = "Velocity × Time";
            Question[69][2] = "Change in Velocity / Time";
            Question[69][3] = "Distance / Time";
            Question[69][4] = "Velocity / Distance";
            Question[69][5] = "Change in Velocity / Time";

            Question[70][0] = "What is the chemical symbol for mercury?";
            Question[70][1] = "Mr";
            Question[70][2] = "Hg";
            Question[70][3] = "Mc";
            Question[70][4] = "Hy";
            Question[70][5] = "Hg";

            Question[71][0] = "What is the name of the tube that carries air to the lungs?";
            Question[71][1] = "Esophagus";
            Question[71][2] = "Trachea";
            Question[71][3] = "Bronchus";
            Question[71][4] = "Alveoli";
            Question[71][5] = "Trachea";

            Question[72][0] = "What is the chemical symbol for bromine?";
            Question[72][1] = "Bm";
            Question[72][2] = "Br";
            Question[72][3] = "Be";
            Question[72][4] = "Bn";
            Question[72][5] = "Br";

            Question[73][0] = "What is the process of a liquid turning into a gas when heated?";
            Question[73][1] = "Melting";
            Question[73][2] = "Boiling";
            Question[73][3] = "Freezing";
            Question[73][4] = "Sublimation";
            Question[73][5] = "Boiling";

            Question[74][0] = "What is the formula for momentum?";
            Question[74][1] = "Force × Time";
            Question[74][2] = "Mass × Velocity";
            Question[74][3] = "Force × Acceleration";
            Question[74][4] = "1/2 × Mass × Velocity^2";
            Question[74][5] = "Mass × Velocity";

            Question[75][0] = "What is the chemical symbol for iodine?";
            Question[75][1] = "Io";
            Question[75][2] = "I";
            Question[75][3] = "Id";
            Question[75][4] = "In";
            Question[75][5] = "I";

            Question[76][0] = "What is the name of the largest artery in the human body?";
            Question[76][1] = "Pulmonary artery";
            Question[76][2] = "Aorta";
            Question[76][3] = "Carotid artery";
            Question[76][4] = "Femoral artery";
            Question[76][5] = "Aorta";

            Question[77][0] = "What is the chemical symbol for sulfur?";
            Question[77][1] = "Sl";
            Question[77][2] = "S";
            Question[77][3] = "Su";
            Question[77][4] = "Sr";
            Question[77][5] = "S";

            Question[78][0] = "What is the process of a gas turning directly into a solid?";
            Question[78][1] = "Condensation";
            Question[78][2] = "Deposition";
            Question[78][3] = "Sublimation";
            Question[78][4] = "Freezing";
            Question[78][5] = "Deposition";

            Question[79][0] = "What is the formula for force according to Newton's second law?";
            Question[79][1] = "Mass / Acceleration";
            Question[79][2] = "Mass × Acceleration";
            Question[79][3] = "Velocity / Time";
            Question[79][4] = "Work / Distance";
            Question[79][5] = "Mass × Acceleration";

            Question[80][0] = "What is the chemical symbol for chlorine?";
            Question[80][1] = "Ch";
            Question[80][2] = "Cl";
            Question[80][3] = "Cr";
            Question[80][4] = "Cn";
            Question[80][5] = "Cl";

            Question[81][0] = "What is the name of the pigment that gives plants their green color?";
            Question[81][1] = "Melanin";
            Question[81][2] = "Chlorophyll";
            Question[81][3] = "Carotene";
            Question[81][4] = "Hemoglobin";
            Question[81][5] = "Chlorophyll";

            Question[82][0] = "What is the chemical symbol for neon?";
            Question[82][1] = "Ne";
            Question[82][2] = "No";
            Question[82][3] = "Ni";
            Question[82][4] = "Nn";
            Question[82][5] = "Ne";

            Question[83][0] = "What is the bending of light as it passes from one medium to another called?";
            Question[83][1] = "Reflection";
            Question[83][2] = "Refraction";
            Question[83][3] = "Diffraction";
            Question[83][4] = "Interference";
            Question[83][5] = "Refraction";

            Question[84][0] = "What is the formula for pressure?";
            Question[84][1] = "Force × Area";
            Question[84][2] = "Force / Area";
            Question[84][3] = "Area / Force";
            Question[84][4] = "Mass × Acceleration × Area";
            Question[84][5] = "Force / Area";

            Question[85][0] = "What is the chemical symbol for argon?";
            Question[85][1] = "Ar";
            Question[85][2] = "Ag";
            Question[85][3] = "An";
            Question[85][4] = "Ao";
            Question[85][5] = "Ar";

            Question[86][0] = "What is the name of the part of the eye that controls the amount of light entering?";
            Question[86][1] = "Lens";
            Question[86][2] = "Iris";
            Question[86][3] = "Retina";
            Question[86][4] = "Pupil";
            Question[86][5] = "Iris";

            Question[87][0] = "What is the chemical symbol for krypton?";
            Question[87][1] = "Kr";
            Question[87][2] = "Kp";
            Question[87][3] = "Kn";
            Question[87][4] = "Ky";
            Question[87][5] = "Kr";

            Question[88][0] = "What is the transfer of heat through direct contact called?";
            Question[88][1] = "Convection";
            Question[88][2] = "Conduction";
            Question[88][3] = "Radiation";
            Question[88][4] = "Insulation";
            Question[88][5] = "Conduction";

            Question[89][0] = "What is the formula for power?";
            Question[89][1] = "Work × Time";
            Question[89][2] = "Work / Time";
            Question[89][3] = "Energy × Time";
            Question[89][4] = "Force × Distance × Time";
            Question[89][5] = "Work / Time";

            Question[90][0] = "What is the chemical symbol for xenon?";
            Question[90][1] = "Xe";
            Question[90][2] = "Xn";
            Question[90][3] = "Xi";
            Question[90][4] = "Xo";
            Question[90][5] = "Xe";

            Question[91][0] = "What is the name of the process by which organisms evolve over long periods?";
            Question[91][1] = "Metamorphosis";
            Question[91][2] = "Natural Selection";
            Question[91][3] = "Adaptation";
            Question[91][4] = "Mutation";
            Question[91][5] = "Natural Selection";

            Question[92][0] = "What is the chemical symbol for radon?";
            Question[92][1] = "Rn";
            Question[92][2] = "Ra";
            Question[92][3] = "Ro";
            Question[92][4] = "Rd";
            Question[92][5] = "Rn";

            Question[93][0] = "What is the transfer of heat through the movement of fluids called?";
            Question[93][1] = "Conduction";
            Question[93][2] = "Convection";
            Question[93][3] = "Radiation";
            Question[93][4] = "Thermal Equilibrium";
            Question[93][5] = "Convection";

            Question[94][0] = "What is the formula for voltage in Ohm's Law?";
            Question[94][1] = "I / R";
            Question[94][2] = "I × R";
            Question[94][3] = "R / I";
            Question[94][4] = "P × R";
            Question[94][5] = "I × R";

            Question[95][0] = "What is the chemical symbol for lithium?";
            Question[95][1] = "Li";
            Question[95][2] = "Lm";
            Question[95][3] = "Lt";
            Question[95][4] = "Lo";
            Question[95][5] = "Li";

            Question[96][0] = "What is the name of the protective layer around the Earth that absorbs UV radiation?";
            Question[96][1] = "Ionosphere";
            Question[96][2] = "Ozone Layer";
            Question[96][3] = "Troposphere";
            Question[96][4] = "Stratosphere";
            Question[96][5] = "Ozone Layer";

            Question[97][0] = "What is the chemical symbol for beryllium?";
            Question[97][1] = "Be";
            Question[97][2] = "Br";
            Question[97][3] = "Ba";
            Question[97][4] = "Bi";
            Question[97][5] = "Be";

            Question[98][0] = "What is the transfer of heat through electromagnetic waves called?";
            Question[98][1] = "Conduction";
            Question[98][2] = "Convection";
            Question[98][3] = "Radiation";
            Question[98][4] = "Specific Heat";
            Question[98][5] = "Radiation";

            Question[99][0] = "What is the formula for electrical current?";
            Question[99][1] = "Voltage × Resistance";
            Question[99][2] = "Voltage / Resistance";
            Question[99][3] = "Resistance / Voltage";
            Question[99][4] = "Power / Voltage";
            Question[99][5] = "Voltage / Resistance";

        }
    public  static  void  MathQuestionAdd(){
        Question[0][0] = "What is the sum of 8 and 12?";
        Question[0][1] = "18";
        Question[0][2] = "20";
        Question[0][3] = "22";
        Question[0][4] = "24";
        Question[0][5] = "20";

        Question[1][0] = "What is the product of 7 and 9?";
        Question[1][1] = "56";
        Question[1][2] = "63";
        Question[1][3] = "72";
        Question[1][4] = "81";
        Question[1][5] = "63";

        Question[2][0] = "What is the square root of 144?";
        Question[2][1] = "10";
        Question[2][2] = "12";
        Question[2][3] = "14";
        Question[2][4] = "16";
        Question[2][5] = "12";

        Question[3][0] = "What is 25% of 200?";
        Question[3][1] = "40";
        Question[3][2] = "50";
        Question[3][3] = "60";
        Question[3][4] = "70";
        Question[3][5] = "50";

        Question[4][0] = "If a triangle has sides of lengths 3, 4, and 5, what is its area?";
        Question[4][1] = "6";
        Question[4][2] = "12";
        Question[4][3] = "15";
        Question[4][4] = "20";
        Question[4][5] = "6";

        Question[5][0] = "What is the next number in the sequence 2, 4, 8, 16, ?";
        Question[5][1] = "24";
        Question[5][2] = "30";
        Question[5][3] = "32";
        Question[5][4] = "64";
        Question[5][5] = "32";

        Question[6][0] = "What is 7 squared?";
        Question[6][1] = "49";
        Question[6][2] = "56";
        Question[6][3] = "63";
        Question[6][4] = "72";
        Question[6][5] = "49";

        Question[7][0] = "What is the perimeter of a rectangle with length 5 and width 3?";
        Question[7][1] = "15";
        Question[7][2] = "16";
        Question[7][3] = "18";
        Question[7][4] = "20";
        Question[7][5] = "16";

        Question[8][0] = "If a circle has a radius of 7, what is its circumference? (Use π ≈ 3.14)";
        Question[8][1] = "21.98";
        Question[8][2] = "43.96";
        Question[8][3] = "49.96";
        Question[8][4] = "63.14";
        Question[8][5] = "43.96";

        Question[9][0] = "What is the value of 5 factorial (5!)?";
        Question[9][1] = "120";
        Question[9][2] = "100";
        Question[9][3] = "60";
        Question[9][4] = "30";
        Question[9][5] = "120";

        Question[10][0] = "What is 10 divided by 2 plus 3?";
        Question[10][1] = "8";
        Question[10][2] = "10";
        Question[10][3] = "11";
        Question[10][4] = "13";
        Question[10][5] = "8";

        Question[11][0] = "What is the greatest common divisor (GCD) of 48 and 60?";
        Question[11][1] = "6";
        Question[11][2] = "8";
        Question[11][3] = "12";
        Question[11][4] = "24";
        Question[11][5] = "12";

        Question[12][0] = "What is the area of a square with side length 5?";
        Question[12][1] = "20";
        Question[12][2] = "25";
        Question[12][3] = "30";
        Question[12][4] = "35";
        Question[12][5] = "25";

        Question[13][0] = "What is the value of π (pi) to two decimal places?";
        Question[13][1] = "2.14";
        Question[13][2] = "3.14";
        Question[13][3] = "3.24";
        Question[13][4] = "3.34";
        Question[13][5] = "3.14";

        Question[14][0] = "What is the sum of the angles in a triangle?";
        Question[14][1] = "180 degrees";
        Question[14][2] = "90 degrees";
        Question[14][3] = "360 degrees";
        Question[14][4] = "270 degrees";
        Question[14][5] = "180 degrees";

        Question[15][0] = "What is the cube root of 27?";
        Question[15][1] = "3";
        Question[15][2] = "6";
        Question[15][3] = "9";
        Question[15][4] = "27";
        Question[15][5] = "3";

        Question[16][0] = "What is the product of the first four prime numbers?";
        Question[16][1] = "30";
        Question[16][2] = "60";
        Question[16][3] = "210";
        Question[16][4] = "210";
        Question[16][5] = "210";

        Question[17][0] = "What is 2 to the power of 5?";
        Question[17][1] = "16";
        Question[17][2] = "32";
        Question[17][3] = "64";
        Question[17][4] = "128";
        Question[17][5] = "32";

        Question[18][0] = "What is the value of 7 + 3 × 2?";
        Question[18][1] = "14";
        Question[18][2] = "16";
        Question[18][3] = "20";
        Question[18][4] = "22";
        Question[18][5] = "13";

        Question[19][0] = "What is the least common multiple (LCM) of 4 and 5?";
        Question[19][1] = "10";
        Question[19][2] = "20";
        Question[19][3] = "30";
        Question[19][4] = "40";
        Question[19][5] = "20";

        Question[20][0] = "What is the value of 100 divided by 4?";
        Question[20][1] = "20";
        Question[20][2] = "25";
        Question[20][3] = "30";
        Question[20][4] = "40";
        Question[20][5] = "25";

        Question[21][0] = "What is the perimeter of a triangle with sides of lengths 6, 8, and 10?";
        Question[21][1] = "24";
        Question[21][2] = "26";
        Question[21][3] = "28";
        Question[21][4] = "30";
        Question[21][5] = "24";

        Question[22][0] = "What is the value of 8 + (6 ÷ 3) × 2?";
        Question[22][1] = "10";
        Question[22][2] = "12";
        Question[22][3] = "14";
        Question[22][4] = "16";
        Question[22][5] = "12";

        Question[23][0] = "What is the area of a circle with radius 7? (Use π ≈ 3.14)";
        Question[23][1] = "153.86";
        Question[23][2] = "154";
        Question[23][3] = "145.6";
        Question[23][4] = "163.4";
        Question[23][5] = "153.86";

        Question[24][0] = "What is the value of 15 × 3 ÷ 5?";
        Question[24][1] = "7";
        Question[24][2] = "9";
        Question[24][3] = "10";
        Question[24][4] = "12";
        Question[24][5] = "9";

        Question[25][0] = "What is the difference between 100 and 45?";
        Question[25][1] = "55";
        Question[25][2] = "65";
        Question[25][3] = "75";
        Question[25][4] = "85";
        Question[25][5] = "55";

        Question[26][0] = "What is the sum of the angles in a quadrilateral?";
        Question[26][1] = "360 degrees";
        Question[26][2] = "180 degrees";
        Question[26][3] = "270 degrees";
        Question[26][4] = "90 degrees";
        Question[26][5] = "360 degrees";

        Question[27][0] = "What is the value of 5 + 4 × 3?";
        Question[27][1] = "15";
        Question[27][2] = "17";
        Question[27][3] = "18";
        Question[27][4] = "20";
        Question[27][5] = "17";

        Question[28][0] = "What is the value of 2 × (3 + 4)?";
        Question[28][1] = "10";
        Question[28][2] = "14";
        Question[28][3] = "16";
        Question[28][4] = "18";
        Question[28][5] = "14";

        Question[29][0] = "What is 9 cubed (9^3)?";
        Question[29][1] = "729";
        Question[29][2] = "81";
        Question[29][3] = "243";
        Question[29][4] = "648";
        Question[29][5] = "729";

        Question[30][0] = "What is the median of the numbers 3, 7, 9, 12, 15?";
        Question[30][1] = "9";
        Question[30][2] = "7";
        Question[30][3] = "12";
        Question[30][4] = "15";
        Question[30][5] = "9";

        Question[31][0] = "What is the value of 100 minus 2 squared?";
        Question[31][1] = "96";
        Question[31][2] = "98";
        Question[31][3] = "102";
        Question[31][4] = "104";
        Question[31][5] = "96";

        Question[32][0] = "What is the square of 15?";
        Question[32][1] = "225";
        Question[32][2] = "200";
        Question[32][3] = "250";
        Question[32][4] = "275";
        Question[32][5] = "225";

        Question[33][0] = "What is the sum of the interior angles of a pentagon?";
        Question[33][1] = "360 degrees";
        Question[33][2] = "540 degrees";
        Question[33][3] = "720 degrees";
        Question[33][4] = "900 degrees";
        Question[33][5] = "540 degrees";

        Question[34][0] = "What is the value of 20 ÷ (4 + 1)?";
        Question[34][1] = "4";
        Question[34][2] = "5";
        Question[34][3] = "6";
        Question[34][4] = "7";
        Question[34][5] = "4";

        Question[35][0] = "What is 3 to the power of 4?";
        Question[35][1] = "81";
        Question[35][2] = "27";
        Question[35][3] = "9";
        Question[35][4] = "12";
        Question[35][5] = "81";

        Question[36][0] = "What is the value of 7 + 6 ÷ 2?";
        Question[36][1] = "10";
        Question[36][2] = "12";
        Question[36][3] = "13";
        Question[36][4] = "15";
        Question[36][5] = "10";

        Question[37][0] = "What is the area of a triangle with base 10 and height 5?";
        Question[37][1] = "25";
        Question[37][2] = "30";
        Question[37][3] = "50";
        Question[37][4] = "75";
        Question[37][5] = "25";

        Question[38][0] = "What is the sum of 15 and 20 divided by 5?";
        Question[38][1] = "7";
        Question[38][2] = "8";
        Question[38][3] = "10";
        Question[38][4] = "12";
        Question[38][5] = "7";

        Question[39][0] = "What is the circumference of a circle with a diameter of 10? (Use π ≈ 3.14)";
        Question[39][1] = "31.4";
        Question[39][2] = "30.14";
        Question[39][3] = "32";
        Question[39][4] = "35";
        Question[39][5] = "31.4";

        Question[40][0] = "What is the value of 18 ÷ 3 × 2?";
        Question[40][1] = "12";
        Question[40][2] = "10";
        Question[40][3] = "8";
        Question[40][4] = "6";
        Question[40][5] = "12";

        Question[41][0] = "What is the sum of 50 and 25?";
        Question[41][1] = "60";
        Question[41][2] = "70";
        Question[41][3] = "75";
        Question[41][4] = "80";
        Question[41][5] = "75";

        Question[42][0] = "What is the product of 12 and 4?";
        Question[42][1] = "36";
        Question[42][2] = "48";
        Question[42][3] = "50";
        Question[42][4] = "60";
        Question[42][5] = "48";

        Question[43][0] = "What is the difference between 90 and 45?";
        Question[43][1] = "40";
        Question[43][2] = "45";
        Question[43][3] = "50";
        Question[43][4] = "55";
        Question[43][5] = "45";

        Question[44][0] = "What is the value of 9 × 9?";
        Question[44][1] = "81";
        Question[44][2] = "72";
        Question[44][3] = "90";
        Question[44][4] = "99";
        Question[44][5] = "81";

        Question[45][0] = "What is the value of 100 ÷ 5 + 6?";
        Question[45][1] = "20";
        Question[45][2] = "26";
        Question[45][3] = "22";
        Question[45][4] = "30";
        Question[45][5] = "26";

        Question[46][0] = "What is the square of 8?";
        Question[46][1] = "64";
        Question[46][2] = "72";
        Question[46][3] = "80";
        Question[46][4] = "84";
        Question[46][5] = "64";

        Question[47][0] = "What is the area of a rectangle with length 8 and width 6?";
        Question[47][1] = "48";
        Question[47][2] = "50";
        Question[47][3] = "54";
        Question[47][4] = "60";
        Question[47][5] = "48";

        Question[48][0] = "What is the sum of the first 5 positive integers?";
        Question[48][1] = "10";
        Question[48][2] = "15";
        Question[48][3] = "20";
        Question[48][4] = "25";
        Question[48][5] = "15";

        Question[49][0] = "What is 5 to the power of 3?";
        Question[49][1] = "125";
        Question[49][2] = "100";
        Question[49][3] = "150";
        Question[49][4] = "175";
        Question[49][5] = "125";

        Question[50][0] = "What is the value of 4 × 5 + 7?";
        Question[50][1] = "27";
        Question[50][2] = "30";
        Question[50][3] = "35";
        Question[50][4] = "40";
        Question[50][5] = "27";

        Question[51][0] = "What is the median of the numbers 1, 5, 7, 8, 10?";
        Question[51][1] = "7";
        Question[51][2] = "5";
        Question[51][3] = "8";
        Question[51][4] = "10";
        Question[51][5] = "7";

        Question[52][0] = "What is the sum of the interior angles of a hexagon?";
        Question[52][1] = "720 degrees";
        Question[52][2] = "900 degrees";
        Question[52][3] = "1080 degrees";
        Question[52][4] = "360 degrees";
        Question[52][5] = "720 degrees";

        Question[53][0] = "What is the cube of 4?";
        Question[53][1] = "64";
        Question[53][2] = "48";
        Question[53][3] = "72";
        Question[53][4] = "81";
        Question[53][5] = "64";

        Question[54][0] = "What is the perimeter of a square with side length 9?";
        Question[54][1] = "36";
        Question[54][2] = "45";
        Question[54][3] = "54";
        Question[54][4] = "63";
        Question[54][5] = "36";

        Question[55][0] = "What is the area of a circle with a diameter of 8? (Use π ≈ 3.14)";
        Question[55][1] = "50.24";
        Question[55][2] = "64";
        Question[55][3] = "78.5";
        Question[55][4] = "100.48";
        Question[55][5] = "50.24";

        Question[56][0] = "What is the value of 6 to the power of 2?";
        Question[56][1] = "36";
        Question[56][2] = "42";
        Question[56][3] = "48";
        Question[56][4] = "54";
        Question[56][5] = "36";

        Question[57][0] = "What is the sum of 40 and 35?";
        Question[57][1] = "60";
        Question[57][2] = "75";
        Question[57][3] = "80";
        Question[57][4] = "85";
        Question[57][5] = "75";

        Question[58][0] = "What is the value of 8 × (7 - 2)?";
        Question[58][1] = "30";
        Question[58][2] = "40";
        Question[58][3] = "50";
        Question[58][4] = "60";
        Question[58][5] = "40";

        Question[59][0] = "What is the value of 11 × 11?";
        Question[59][1] = "121";
        Question[59][2] = "110";
        Question[59][3] = "132";
        Question[59][4] = "144";
        Question[59][5] = "121";

        Question[60][0] = "What is the area of a parallelogram with base 12 and height 7?";
        Question[60][1] = "70";
        Question[60][2] = "84";
        Question[60][3] = "90";
        Question[60][4] = "96";
        Question[60][5] = "84";

        Question[61][0] = "What is the value of 24 ÷ 6 × 2?";
        Question[61][1] = "8";
        Question[61][2] = "12";
        Question[61][3] = "16";
        Question[61][4] = "20";
        Question[61][5] = "8";

        Question[62][0] = "What is the value of 15 - 3 × 2?";
        Question[62][1] = "9";
        Question[62][2] = "12";
        Question[62][3] = "15";
        Question[62][4] = "18";
        Question[62][5] = "9";

        Question[63][0] = "What is the sum of 7 and 9?";
        Question[63][1] = "14";
        Question[63][2] = "15";
        Question[63][3] = "16";
        Question[63][4] = "17";
        Question[63][5] = "16";

        Question[64][0] = "What is the value of 3 × (5 + 2)?";
        Question[64][1] = "18";
        Question[64][2] = "21";
        Question[64][3] = "24";
        Question[64][4] = "27";
        Question[64][5] = "21";

        Question[65][0] = "What is the sum of 22 and 19?";
        Question[65][1] = "40";
        Question[65][2] = "41";
        Question[65][3] = "42";
        Question[65][4] = "43";
        Question[65][5] = "41";

        Question[66][0] = "What is the square of 12?";
        Question[66][1] = "144";
        Question[66][2] = "156";
        Question[66][3] = "168";
        Question[66][4] = "180";
        Question[66][5] = "144";

        Question[67][0] = "What is the sum of the first 10 positive integers?";
        Question[67][1] = "45";
        Question[67][2] = "50";
        Question[67][3] = "55";
        Question[67][4] = "60";
        Question[67][5] = "55";

        Question[68][0] = "What is the value of 50 ÷ 5 + 7?";
        Question[68][1] = "17";
        Question[68][2] = "18";
        Question[68][3] = "20";
        Question[68][4] = "22";
        Question[68][5] = "17";

        Question[69][0] = "What is the area of a trapezoid with bases 10 and 6, and height 4?";
        Question[69][1] = "32";
        Question[69][2] = "36";
        Question[69][3] = "40";
        Question[69][4] = "44";
        Question[69][5] = "32";

        Question[70][0] = "What is the value of 12 × 3 - 4?";
        Question[70][1] = "32";
        Question[70][2] = "34";
        Question[70][3] = "36";
        Question[70][4] = "38";
        Question[70][5] = "32";

        Question[71][0] = "What is the value of 6 + 5 × 4?";
        Question[71][1] = "26";
        Question[71][2] = "28";
        Question[71][3] = "30";
        Question[71][4] = "32";
        Question[71][5] = "26";

        Question[72][0] = "What is the value of 3 × (2 + 6)?";
        Question[72][1] = "24";
        Question[72][2] = "30";
        Question[72][3] = "32";
        Question[72][4] = "40";
        Question[72][5] = "24";

        Question[73][0] = "What is the perimeter of a rectangle with length 9 and width 4?";
        Question[73][1] = "26";
        Question[73][2] = "28";
        Question[73][3] = "30";
        Question[73][4] = "32";
        Question[73][5] = "26";

        Question[74][0] = "What is the area of a circle with a radius of 5? (Use π ≈ 3.14)";
        Question[74][1] = "78.5";
        Question[74][2] = "80";
        Question[74][3] = "82.5";
        Question[74][4] = "85";
        Question[74][5] = "78.5";

        Question[75][0] = "What is the value of 16 ÷ 4 × 3?";
        Question[75][1] = "12";
        Question[75][2] = "15";
        Question[75][3] = "18";
        Question[75][4] = "21";
        Question[75][5] = "12";

        Question[76][0] = "What is the sum of 14 and 22?";
        Question[76][1] = "34";
        Question[76][2] = "36";
        Question[76][3] = "38";
        Question[76][4] = "40";
        Question[76][5] = "36";

        Question[77][0] = "What is the value of 10 × (5 - 3)?";
        Question[77][1] = "20";
        Question[77][2] = "30";
        Question[77][3] = "40";
        Question[77][4] = "50";
        Question[77][5] = "20";

        Question[78][0] = "What is the value of 9 + 8 × 2?";
        Question[78][1] = "25";
        Question[78][2] = "26";
        Question[78][3] = "27";
        Question[78][4] = "28";
        Question[78][5] = "25";

        Question[79][0] = "What is the product of 8 and 6?";
        Question[79][1] = "40";
        Question[79][2] = "42";
        Question[79][3] = "44";
        Question[79][4] = "48";
        Question[79][5] = "48";

        Question[80][0] = "What is the value of 4^3?";
        Question[80][1] = "64";
        Question[80][2] = "48";
        Question[80][3] = "36";
        Question[80][4] = "24";
        Question[80][5] = "64";

        Question[81][0] = "What is the area of a triangle with base 6 and height 7?";
        Question[81][1] = "21";
        Question[81][2] = "24";
        Question[81][3] = "28";
        Question[81][4] = "30";
        Question[81][5] = "21";

        Question[82][0] = "What is the value of 5 + 6 ÷ (3 - 1)?";
        Question[82][1] = "8";
        Question[82][2] = "11";
        Question[82][3] = "13";
        Question[82][4] = "16";
        Question[82][5] = "8";

        Question[83][0] = "What is the sum of the first 6 even numbers?";
        Question[83][1] = "42";
        Question[83][2] = "44";
        Question[83][3] = "46";
        Question[83][4] = "48";
        Question[83][5] = "42";

        Question[84][0] = "What is the value of 2 × (5 + 6)?";
        Question[84][1] = "20";
        Question[84][2] = "22";
        Question[84][3] = "24";
        Question[84][4] = "26";
        Question[84][5] = "22";

        Question[85][0] = "What is the value of 7 × 3 - 8?";
        Question[85][1] = "13";
        Question[85][2] = "15";
        Question[85][3] = "19";
        Question[85][4] = "21";
        Question[85][5] = "13";

        Question[86][0] = "What is the value of 18 ÷ (3 × 2)?";
        Question[86][1] = "3";
        Question[86][2] = "6";
        Question[86][3] = "9";
        Question[86][4] = "12";
        Question[86][5] = "3";

        Question[87][0] = "What is the value of 4 × (3 + 2)?";
        Question[87][1] = "20";
        Question[87][2] = "24";
        Question[87][3] = "28";
        Question[87][4] = "32";
        Question[87][5] = "20";

        Question[88][0] = "What is the value of 100 ÷ (5 + 5)?";
        Question[88][1] = "5";
        Question[88][2] = "10";
        Question[88][3] = "15";
        Question[88][4] = "20";
        Question[88][5] = "10";

        Question[89][0] = "What is the product of 7 and 8?";
        Question[89][1] = "54";
        Question[89][2] = "56";
        Question[89][3] = "64";
        Question[89][4] = "72";
        Question[89][5] = "56";

        Question[90][0] = "What is the sum of 3^2 and 4^2?";
        Question[90][1] = "25";
        Question[90][2] = "29";
        Question[90][3] = "37";
        Question[90][4] = "41";
        Question[90][5] = "25";

        Question[91][0] = "What is the value of 7 × (4 - 2)?";
        Question[91][1] = "14";
        Question[91][2] = "16";
        Question[91][3] = "18";
        Question[91][4] = "20";
        Question[91][5] = "14";

        Question[92][0] = "What is the value of 5 + 6 × (4 - 2)?";
        Question[92][1] = "17";
        Question[92][2] = "25";
        Question[92][3] = "29";
        Question[92][4] = "35";
        Question[92][5] = "17";

        Question[93][0] = "What is the square root of 81?";
        Question[93][1] = "9";
        Question[93][2] = "8";
        Question[93][3] = "10";
        Question[93][4] = "11";
        Question[93][5] = "9";

        Question[94][0] = "What is the value of 7^2?";
        Question[94][1] = "49";
        Question[94][2] = "42";
        Question[94][3] = "56";
        Question[94][4] = "64";
        Question[94][5] = "49";

        Question[95][0] = "What is the sum of 12 and 15?";
        Question[95][1] = "27";
        Question[95][2] = "28";
        Question[95][3] = "29";
        Question[95][4] = "30";
        Question[95][5] = "27";

        Question[96][0] = "What is the area of a rectangle with length 5 and width 3?";
        Question[96][1] = "12";
        Question[96][2] = "15";
        Question[96][3] = "18";
        Question[96][4] = "20";
        Question[96][5] = "15";

        Question[97][0] = "What is the value of 8 + 2 × 5?";
        Question[97][1] = "18";
        Question[97][2] = "20";
        Question[97][3] = "22";
        Question[97][4] = "24";
        Question[97][5] = "18";

        Question[98][0] = "What is the perimeter of a triangle with sides 5, 12, and 13?";
        Question[98][1] = "30";
        Question[98][2] = "32";
        Question[98][3] = "34";
        Question[98][4] = "36";
        Question[98][5] = "30";

        Question[99][0] = "What is the value of 9 - 2 × (4 - 1)?";
        Question[99][1] = "3";
        Question[99][2] = "5";
        Question[99][3] = "7";
        Question[99][4] = "9";
        Question[99][5] = "3";
    }
    public  static  void IslamQuestionAdd(){
        Question[0][0] = "What is the first pillar of Islam?";
        Question[0][1] = "Sawm (Fasting)";
        Question[0][2] = "Shahada (Declaration of Faith)";
        Question[0][3] = "Zakat (Charity)";
        Question[0][4] = "Hajj (Pilgrimage)";
        Question[0][5] = "Shahada (Declaration of Faith)";

        Question[1][0] = "How many times a day do Muslims pray?";
        Question[1][1] = "3";
        Question[1][2] = "5";
        Question[1][3] = "7";
        Question[1][4] = "4";
        Question[1][5] = "5";

        Question[2][0] = "What is the holy book of Islam?";
        Question[2][1] = "Bible";
        Question[2][2] = "Torah";
        Question[2][3] = "Quran";
        Question[2][4] = "Gita";
        Question[2][5] = "Quran";

        Question[3][0] = "What is the name of the month of fasting in Islam?";
        Question[3][1] = "Shawwal";
        Question[3][2] = "Dhul Hijjah";
        Question[3][3] = "Ramadan";
        Question[3][4] = "Muharram";
        Question[3][5] = "Ramadan";

        Question[4][0] = "What is the direction of the Kaaba (Qibla) for prayer?";
        Question[4][1] = "Jerusalem";
        Question[4][2] = "Medina";
        Question[4][3] = "Mecca";
        Question[4][4] = "Damascus";
        Question[4][5] = "Mecca";

        Question[5][0] = "Who is considered the last prophet in Islam?";
        Question[5][1] = "Prophet Musa (Moses)";
        Question[5][2] = "Prophet Isa (Jesus)";
        Question[5][3] = "Prophet Muhammad (peace be upon him)";
        Question[5][4] = "Prophet Ibrahim (Abraham)";
        Question[5][5] = "Prophet Muhammad (peace be upon him)";

        Question[6][0] = "What is the meaning of the word 'Islam'?";
        Question[6][1] = "Peace";
        Question[6][2] = "Submission to God";
        Question[6][3] = "Charity";
        Question[6][4] = "Faith";
        Question[6][5] = "Submission to God";

        Question[7][0] = "What is the name of the angel who revealed the Quran to Prophet Muhammad?";
        Question[7][1] = "Angel Mikael";
        Question[7][2] = "Angel Israfil";
        Question[7][3] = "Angel Jibril (Gabriel)";
        Question[7][4] = "Angel Azrael";
        Question[7][5] = "Angel Jibril (Gabriel)";

        Question[8][0] = "What is the second pillar of Islam?";
        Question[8][1] = "Shahada (Declaration of Faith)";
        Question[8][2] = "Salat (Prayer)";
        Question[8][3] = "Sawm (Fasting)";
        Question[8][4] = "Zakat (Charity)";
        Question[8][5] = "Salat (Prayer)";

        Question[9][0] = "What is the name of the first mosque built in Islam?";
        Question[9][1] = "Masjid al-Haram";
        Question[9][2] = "Masjid al-Aqsa";
        Question[9][3] = "Masjid Quba";
        Question[9][4] = "Masjid an-Nabawi";
        Question[9][5] = "Masjid Quba";

        Question[10][0] = "What is 'Zakat' in Islam?";
        Question[10][1] = "Voluntary charity";
        Question[10][2] = "Obligatory charity";
        Question[10][3] = "Fasting";
        Question[10][4] = "Pilgrimage";
        Question[10][5] = "Obligatory charity";

        Question[11][0] = "What is the significance of the city of Medina in Islam?";
        Question[11][1] = "Birthplace of Prophet Muhammad";
        Question[11][2] = "First Qibla for prayer";
        Question[11][3] = "First capital of the Islamic state";
        Question[11][4] = "Location of the Kaaba";
        Question[11][5] = "First capital of the Islamic state";

        Question[12][0] = "What is 'Hajj' in Islam?";
        Question[12][1] = "Daily prayers";
        Question[12][2] = "Annual fasting";
        Question[12][3] = "Pilgrimage to Mecca";
        Question[12][4] = "Giving charity";
        Question[12][5] = "Pilgrimage to Mecca";

        Question[13][0] = "What is the name of the festival that marks the end of Ramadan?";
        Question[13][1] = "Eid al-Adha";
        Question[13][2] = "Eid al-Fitr";
        Question[13][3] = "Ashura";
        Question[13][4] = "Mawlid an-Nabi";
        Question[13][5] = "Eid al-Fitr";

        Question[14][0] = "What is the meaning of 'Allahu Akbar'?";
        Question[14][1] = "God is merciful";
        Question[14][2] = "God is great";
        Question[14][3] = "There is no god but Allah";
        Question[14][4] = "Praise be to God";
        Question[14][5] = "God is great";

        Question[15][0] = "What is the 'Sunnah' in Islam?";
        Question[15][1] = "The holy book";
        Question[15][2] = "The sayings and actions of Prophet Muhammad";
        Question[15][3] = "The consensus of Muslim scholars";
        Question[15][4] = "The early Muslim community";
        Question[15][5] = "The sayings and actions of Prophet Muhammad";

        Question[16][0] = "What is 'Tawhid' in Islam?";
        Question[16][1] = "The belief in angels";
        Question[16][2] = "The belief in prophets";
        Question[16][3] = "The oneness of God";
        Question[16][4] = "The belief in the afterlife";
        Question[16][5] = "The oneness of God";

        Question[17][0] = "What is the significance of the 'Night of Power' (Laylat al-Qadr)?";
        Question[17][1] = "The night Prophet Muhammad was born";
        Question[17][2] = "The night the Kaaba was built";
        Question[17][3] = "The night the first verses of the Quran were revealed";
        Question[17][4] = "The night of the migration to Medina";
        Question[17][5] = "The night the first verses of the Quran were revealed";

        Question[18][0] = "What is 'Halal' in Islam?";
        Question[18][1] = "Forbidden";
        Question[18][2] = "Permissible";
        Question[18][3] = "Discouraged";
        Question[18][4] = "Obligatory";
        Question[18][5] = "Permissible";

        Question[19][0] = "What is 'Haram' in Islam?";
        Question[19][1] = "Permissible";
        Question[19][2] = "Allowed";
        Question[19][3] = "Forbidden";
        Question[19][4] = "Recommended";
        Question[19][5] = "Forbidden";

        Question[20][0] = "What is the name of the festival that commemorates the sacrifice of Prophet Ibrahim?";
        Question[20][1] = "Eid al-Fitr";
        Question[20][2] = "Eid al-Adha";
        Question[20][3] = "Ashura";
        Question[20][4] = "Mawlid an-Nabi";
        Question[20][5] = "Eid al-Adha";

        Question[21][0] = "What is the 'Hijra' in Islamic history?";
        Question[21][1] = "The birth of Prophet Muhammad";
        Question[21][2] = "The revelation of the Quran";
        Question[21][3] = "The migration of Prophet Muhammad from Mecca to Medina";
        Question[21][4] = "The construction of the Kaaba";
        Question[21][5] = "The migration of Prophet Muhammad from Mecca to Medina";

        Question[22][0] = "What is the role of angels in Islam?";
        Question[22][1] = "To be worshipped alongside God";
        Question[22][2] = "To intercede with God on behalf of humans";
        Question[22][3] = "To carry out God's commands";
        Question[22][4] = "To be equal to prophets";
        Question[22][5] = "To carry out God's commands";

        Question[23][0] = "What is the belief in the 'Day of Judgment' in Islam?";
        Question[23][1] = "A day when prophets will return to Earth";
        Question[23][2] = "A day when the Quran will be revealed again";
        Question[23][3] = "A day when all people will be judged by God for their actions";
        Question[23][4] = "A day of celebration for Muslims";
        Question[23][5] = "A day when all people will be judged by God for their actions";

        Question[24][0] = "What are the 'Five Pillars of Islam' in order?";
        Question[24][1] = "Salat, Zakat, Sawm, Hajj, Shahada";
        Question[24][2] = "Shahada, Salat, Zakat, Sawm, Hajj";
        Question[24][3] = "Zakat, Salat, Shahada, Sawm, Hajj";
        Question[24][4] = "Sawm, Salat, Zakat, Hajj, Shahada";
        Question[24][5] = "Shahada, Salat, Zakat, Sawm, Hajj";

        Question[25][0] = "What is the meaning of 'Subhanallah'?";
        Question[25][1] = "God is the most great";
        Question[25][2] = "Praise be to God";
        Question[25][3] = "Glory be to God";
        Question[25][4] = "God is merciful";
        Question[25][5] = "Glory be to God";

        Question[26][0] = "What is 'Alhamdulillah'?";
        Question[26][1] = "God is the most great";
        Question[26][2] = "Praise be to God";
        Question[26][3] = "Glory be to God";
        Question[26][4] = "God is merciful";
        Question[26][5] = "Praise be to God";

        Question[27][0] = "What is 'Astaghfirullah'?";
        Question[27][1] = "I seek refuge in God";
        Question[27][2] = "I praise God";
        Question[27][3] = "I seek forgiveness from God";
        Question[27][4] = "God is sufficient for me";
        Question[27][5] = "I seek forgiveness from God";

        Question[28][0] = "What is 'Insha'Allah'?";
        Question[28][1] = "God willing";
        Question[28][2] = "God knows best";
        Question[28][3] = "God is with us";
        Question[28][4] = "God is the protector";
        Question[28][5] = "God willing";

        Question[29][0] = "What is 'Masha'Allah'?";
        Question[29][1] = "What God wills has happened";
        Question[29][2] = "God is the provider";
        Question[29][3] = "God is the judge";
        Question[29][4] = "God is the guide";
        Question[29][5] = "What God wills has happened";

        Question[30][0] = "What is the 'Kaaba'?";
        Question[30][1] = "The first mosque built";
        Question[30][2] = "The holiest site in Islam";
        Question[30][3] = "The birthplace of Prophet Muhammad";
        Question[30][4] = "The place where the Quran was revealed";
        Question[30][5] = "The holiest site in Islam";

        Question[31][0] = "What is the 'Tawaf'?";
        Question[31][1] = "The prayer performed in congregation";
        Question[31][2] = "The act of circumambulating the Kaaba";
        Question[31][3] = "The sermon delivered during Friday prayers";
        Question[31][4] = "The supplication made after prayer";
        Question[31][5] = "The act of circumambulating the Kaaba";

        Question[32][0] = "What is 'Sa'i'?";
        Question[32][1] = "The standing during prayer";
        Question[32][2] = "The bowing during prayer";
        Question[32][3] = "The running or walking between the hills of Safa and Marwa";
        Question[32][4] = "The prostration during prayer";
        Question[32][5] = "The running or walking between the hills of Safa and Marwa";

        Question[33][0] = "What is 'Zamzam'?";
        Question[33][1] = "A mountain near Mecca";
        Question[33][2] = "A valley outside Medina";
        Question[33][3] = "A holy well in Mecca";
        Question[33][4] = "A river in Paradise";
        Question[33][5] = "A holy well in Mecca";

        Question[34][0] = "What is 'Arafat'?";
        Question[34][1] = "A mosque in Medina";
        Question[34][2] = "A plain near Mecca where pilgrims gather";
        Question[34][3] = "A holy book in Islam";
        Question[34][4] = "A prayer performed during Hajj";
        Question[34][5] = "A plain near Mecca where pilgrims gather";

        Question[35][0] = "What is 'Mina'?";
        Question[35][1] = "A city near Jerusalem";
        Question[35][2] = "A valley near Mecca where pilgrims stone pillars";
        Question[35][3] = "A type of date fruit";
        Question[35][4] = "An Islamic greeting";
        Question[35][5] = "A valley near Mecca where pilgrims stone pillars";

        Question[36][0] = "What is 'Muzdalifah'?";
        Question[36][1] = "A prayer recited at night";
        Question[36][2] = "An area between Arafat and Mina where pilgrims spend the night";
        Question[36][3] = "A chapter in the Quran";
        Question[36][4] = "A type of Islamic clothing";
        Question[36][5] = "An area between Arafat and Mina where pilgrims spend the night";

        Question[37][0] = "What is 'Ihram'?";
        Question[37][1] = "The state of ritual purity during Hajj and Umrah";
        Question[37][2] = "The clothing worn during prayer";
        Question[37][3] = "The act of giving charity";
        Question[37][4] = "The recitation of the Quran";
        Question[37][5] = "The state of ritual purity during Hajj and Umrah";

        Question[38][0] = "What is 'Umrah'?";
        Question[38][1] = "The annual fasting in Ramadan";
        Question[38][2] = "The obligatory pilgrimage to Mecca";
        Question[38][3] = "A voluntary pilgrimage to Mecca";
        Question[38][4] = "The daily prayers";
        Question[38][5] = "A voluntary pilgrimage to Mecca";
        Question[39][0] = "What is 'Talbiyah'?";
        Question[39][1] = "A prayer for forgiveness";
        Question[39][2] = "A supplication recited during Hajj and Umrah";
        Question[39][3] = "A greeting exchanged by pilgrims";
        Question[39][4] = "A sacrifice made during Eid al-Adha";
        Question[39][5] = "A supplication recited during Hajj and Umrah";

        Question[40][0] = "What is the significance of the 'Black Stone' (Hajar al-Aswad)?";
        Question[40][1] = "It marks the direction of prayer";
        Question[40][2] = "It is believed to have come from Paradise";
        Question[40][3] = "It is a symbol of the Kaaba's foundation";
        Question[40][4] = "It contains the names of all prophets";
        Question[40][5] = "It is believed to have come from Paradise";

        Question[41][0] = "What is 'Qurbani'?";
        Question[41][1] = "The prayer performed at dawn";
        Question[41][2] = "The act of giving voluntary charity";
        Question[41][3] = "The sacrifice of an animal during Eid al-Adha";
        Question[41][4] = "The fasting during the month of Rajab";
        Question[41][5] = "The sacrifice of an animal during Eid al-Adha";

        Question[42][0] = "What is 'Aqiqah'?";
        Question[42][1] = "The celebration at the end of Hajj";
        Question[42][2] = "The naming ceremony of a newborn child with animal sacrifice";
        Question[42][3] = "The marriage ceremony in Islam";
        Question[42][4] = "The funeral rites in Islam";
        Question[42][5] = "The naming ceremony of a newborn child with animal sacrifice";

        Question[43][0] = "What is 'Nikah'?";
        Question[43][1] = "The declaration of faith";
        Question[43][2] = "The Islamic marriage contract";
        Question[43][3] = "The pilgrimage to Mecca";
        Question[43][4] = "The obligatory charity";
        Question[43][5] = "The Islamic marriage contract";

        Question[44][0] = "What is 'Talaq'?";
        Question[44][1] = "The Islamic greeting";
        Question[44][2] = "The Islamic term for divorce";
        Question[44][3] = "The Islamic code of law";
        Question[44][4] = "The Islamic form of prayer";
        Question[44][5] = "The Islamic term for divorce";

        Question[45][0] = "What is 'Iddah'?";
        Question[45][1] = "The period of fasting before marriage";
        Question[45][2] = "The waiting period for a divorced or widowed woman before remarriage";
        Question[45][3] = "The period of Hajj pilgrimage";
        Question[45][4] = "The period of study for religious scholars";
        Question[45][5] = "The waiting period for a divorced or widowed woman before remarriage";

        Question[46][0] = "What is 'Mahram'?";
        Question[46][1] = "A non-Muslim person";
        Question[46][2] = "A Muslim scholar";
        Question[46][3] = "A close relative with whom marriage is not permissible";
        Question[46][4] = "A fellow pilgrim during Hajj";
        Question[46][5] = "A close relative with whom marriage is not permissible";

        Question[47][0] = "What is 'Hijab'?";
        Question[47][1] = "The prayer mat used by Muslims";
        Question[47][2] = "The veil worn by some Muslim women";
        Question[47][3] = "The month of pilgrimage";
        Question[47][4] = "The Islamic call to prayer";
        Question[47][5] = "The veil worn by some Muslim women";

        Question[48][0] = "What is 'Niqab'?";
        Question[48][1] = "A type of Islamic architecture";
        Question[48][2] = "A veil that covers the face, leaving the eyes visible";
        Question[48][3] = "A style of Quranic recitation";
        Question[48][4] = "A school of Islamic thought";
        Question[48][5] = "A veil that covers the face, leaving the eyes visible";

        Question[49][0] = "What is 'Burqa'?";
        Question[49][1] = "A type of Islamic poetry";
        Question[49][2] = "A garment that covers the entire body and face, with a mesh screen for the eyes";
        Question[49][3] = "A traditional Islamic meal";
        Question[49][4] = "A form of Islamic art";
        Question[49][5] = "A garment that covers the entire body and face, with a mesh screen for the eyes";

        Question[50][0] = "What is 'Khutbah'?";
        Question[50][1] = "The first chapter of the Quran";
        Question[50][2] = "The sermon delivered during Friday prayers and Eid prayers";
        Question[50][3] = "The call to prayer (Adhan)";
        Question[50][4] = "The supplication made at the end of prayer";
        Question[50][5] = "The sermon delivered during Friday prayers and Eid prayers";

        Question[51][0] = "What is 'Adhan'?";
        Question[51][1] = "The prayer performed before sunrise";
        Question[51][2] = "The Islamic call to prayer";
        Question[51][3] = "The obligatory charity given annually";
        Question[51][4] = "The pilgrimage to Mecca";
        Question[51][5] = "The Islamic call to prayer";

        Question[52][0] = "What is 'Iqamah'?";
        Question[52][1] = "The opening chapter of the Quran";
        Question[52][2] = "The second declaration of prayer, signaling its commencement";
        Question[52][3] = "The closing supplication of prayer";
        Question[52][4] = "The voluntary prayers performed at night";
        Question[52][5] = "The second declaration of prayer, signaling its commencement";

        Question[53][0] = "What is 'Rakah'?";
        Question[53][1] = "A chapter of the Quran";
        Question[53][2] = "A unit of Islamic prayer consisting of specific movements and recitations";
        Question[53][3] = "A type of Islamic clothing worn by men";
        Question[53][4] = "A school of Islamic jurisprudence";
        Question[53][5] = "A unit of Islamic prayer consisting of specific movements and recitations";

        Question[54][0] = "What is 'Sujud'?";
        Question[54][1] = "The act of standing in prayer";
        Question[54][2] = "The act of bowing in prayer";
        Question[54][3] = "The act of prostrating with the forehead, nose, palms, knees, and toes touching the ground";
        Question[54][4] = "The act of sitting during prayer";
        Question[54][5] = "The act of prostrating with the forehead, nose, palms, knees, and toes touching the ground";

        Question[55][0] = "What is 'Ruku'?";
        Question[55][1] = "The opening recitation of prayer";
        Question[55][2] = "The act of bowing with the back straight during prayer";
        Question[55][3] = "The final sitting position in prayer";
        Question[55][4] = "The raising of hands before prayer";
        Question[55][5] = "The act of bowing with the back straight during prayer";

        Question[56][0] = "What is 'Tashahhud'?";
        Question[56][1] = "The opening chapter of the Quran";
        Question[56][2] = "The recitation of the testimony of faith while sitting in prayer";
        Question[56][3] = "The supplication made at the beginning of prayer";
        Question[56][4] = "The blessings sent upon the Prophet at the end of prayer";
        Question[56][5] = "The recitation of the testimony of faith while sitting in prayer";

        Question[57][0] = "What is 'Taslim'?";
        Question[57][1] = "The act of standing erect in prayer";
        Question[57][2] = "The act of turning the head to the right and left at the end of prayer, saying 'Peace be upon you'";
        Question[57][3] = "The act of reciting the Quran during prayer";
        Question[57][4] = "The act of making supplication during prayer";
        Question[57][5] = "The act of turning the head to the right and left at the end of prayer, saying 'Peace be upon you'";

        Question[58][0] = "What is 'Du'a'?";
        Question[58][1] = "The formal prayer in Islam";
        Question[58][2] = "A personal supplication or prayer to God";
        Question[58][3] = "The obligatory fasting in Ramadan";
        Question[58][4] = "The pilgrimage to Mecca";
        Question[58][5] = "A personal supplication or prayer to God";

        Question[59][0] = "What is 'Wudu'?";
        Question[59][1] = "The act of prostration in prayer";
        Question[59][2] = "The ritual purification with water before prayer";
        Question[59][3] = "The recitation of the Quran";
        Question[59][4] = "The giving of charity";
        Question[59][5] = "The ritual purification with water before prayer";

        Question[60][0] = "What is 'Ghusl'?";
        Question[60][1] = "The prayer performed at noon";
        Question[60][2] = "A full body wash required after certain states of impurity";
        Question[60][3] = "The voluntary fasting on Mondays and Thursdays";
        Question[60][4] = "The journey made for religious knowledge";
        Question[60][5] = "A full body wash required after certain states of impurity";

        Question[61][0] = "What is 'Tayammum'?";
        Question[61][1] = "The prayer performed at sunset";
        Question[61][2] = "A dry form of ritual purification using earth or sand when water is unavailable";
        Question[61][3] = "The night prayers performed during Ramadan";
        Question[61][4] = "The remembrance of God";
        Question[61][5] = "A dry form of ritual purification using earth or sand when water is unavailable";

        Question[62][0] = "What is 'Masjid'?";
        Question[62][1] = "A religious school";
        Question[62][2] = "A place of worship for Muslims (mosque)";
        Question[62][3] = "A charitable organization";
        Question[62][4] = "A community gathering place";
        Question[62][5] = "A place of worship for Muslims (mosque)";

        Question[63][0] = "What is 'Minbar'?";
        Question[63][1] = "The niche in a mosque indicating the direction of prayer";
        Question[63][2] = "The pulpit in a mosque from which the sermon (Khutbah) is delivered";
        Question[63][3] = "The area in a mosque for ablution (Wudu)";
        Question[63][4] = "The courtyard of a mosque";
        Question[63][5] = "The pulpit in a mosque from which the sermon (Khutbah) is delivered";

        Question[64][0] = "What is 'Mihrab'?";
        Question[64][1] = "The tower from which the call to prayer is made";
        Question[64][2] = "The niche in the wall of a mosque that indicates the Qibla (direction of Kaaba)";
        Question[64][3] = "The prayer hall of a mosque";
        Question[64][4] = "The library within a mosque";
        Question[64][5] = "The niche in the wall of a mosque that indicates the Qibla (direction of Kaaba)";

        Question[65][0] = "What is 'Muezzin'?";
        Question[65][1] = "The leader of the prayer";
        Question[65][2] = "The person who calls Muslims to prayer (Adhan)";
        Question[65][3] = "The reciter of the Quran in the mosque";
        Question[65][4] = "The caretaker of the mosque";
        Question[65][5] = "The person who calls Muslims to prayer (Adhan)";

        Question[66][0] = "What is 'Imam'?";
        Question[66][1] = "The person who performs the call to prayer";
        Question[66][2] = "The leader of the prayer in congregation";
        Question[66][3] = "A religious scholar";
        Question[66][4] = "A Sufi mystic";
        Question[66][5] = "The leader of the prayer in congregation";

        Question[67][0] = "What is 'Khilafah'?";
        Question[67][1] = "A school of Islamic law";
        Question[67][2] = "The Islamic system of governance after the death of Prophet Muhammad";
        Question[67][3] = "A mystical branch of Islam";
        Question[67][4] = "A type of Islamic art form";
        Question[67][5] = "The Islamic system of governance after the death of Prophet Muhammad";

        Question[68][0] = "What is 'Shura'?";
        Question[68][1] = "The Islamic code of ethics";
        Question[68][2] = "Consultation or counsel in Islamic decision-making";
        Question[68][3] = "The economic system in Islam";
        Question[68][4] = "The social structure in early Islam";
        Question[68][5] = "Consultation or counsel in Islamic decision-making";

        Question[69][0] = "What is 'Ummah'?";
        Question[69][1] = "The community of a particular mosque";
        Question[69][2] = "The global community of Muslims";
        Question[69][3] = "The family of the Prophet Muhammad";
        Question[69][4] = "The early followers of Islam in Mecca";
        Question[69][5] = "The global community of Muslims";

        Question[70][0] = "What is 'Fitna'?";
        Question[70][1] = "A blessing or favor from God";
        Question[70][2] = "Trial, tribulation, or discord within the Muslim community";
        Question[70][3] = "A period of peace and prosperity in Islamic history";
        Question[70][4] = "The expansion of the Islamic empire";
        Question[70][5] = "Trial, tribulation, or discord within the Muslim community";

        Question[71][0] = "What is 'Jihad' in Islam?";
        Question[71][1] = "Holy war against non-believers";
        Question[71][2] = "A struggle or striving in the way of God, which can be internal or external";
        Question[71][3] = "Forced conversion to Islam";
        Question[71][4] = "Violent extremism";
        Question[71][5] = "A struggle or striving in the way of God, which can be internal or external";

        Question[72][0] = "What is 'Shahid'?";
        Question[72][1] = "A religious leader";
        Question[72][2] = "A martyr, someone who dies for their faith";
        Question[72][3] = "A great warrior in Islamic history";
        Question[72][4] = "A pious Muslim scholar";
        Question[72][5] = "A martyr, someone who dies for their faith";

        Question[73][0] = "What is 'Maudu' Hadith'?";
        Question[73][1] = "A Hadith whose meaning is unclear";
        Question[73][2] = "A fabricated or forged Hadith attributed to Prophet Muhammad";
        Question[73][3] = "A Hadith that deals with future events";
        Question[73][4] = "A Hadith that emphasizes the importance of knowledge";
        Question[73][5] = "A fabricated or forged Hadith attributed to Prophet Muhammad";

        // Question 74
        Question[74][0] = "What is 'Sahih' Hadith?";
        Question[74][1] = "A Hadith that is considered authentic and reliable";
        Question[74][2] = "A Hadith that deals with future events";
        Question[74][3] = "A fabricated or forged Hadith";
        Question[74][4] = "A Hadith that emphasizes the importance of knowledge";
        Question[74][5] = "A Hadith that is considered authentic and reliable";

        // Question 75
        Question[75][0] = "What is 'Da'if' Hadith?";
        Question[75][1] = "A fabricated Hadith with no authenticity";
        Question[75][2] = "A weak Hadith with questionable authenticity";
        Question[75][3] = "A Hadith that is universally accepted";
        Question[75][4] = "A Hadith that deals with moral guidance";
        Question[75][5] = "A weak Hadith with questionable authenticity";

        // Question 76
        Question[76][0] = "What is 'Sunnah'?";
        Question[76][1] = "The actions and sayings of Prophet Muhammad";
        Question[76][2] = "A collection of Islamic legal texts";
        Question[76][3] = "The teachings of early Islamic scholars";
        Question[76][4] = "The religious laws of Islam";
        Question[76][5] = "The actions and sayings of Prophet Muhammad";

        // Question 77
        Question[77][0] = "What is 'Tafsir'?";
        Question[77][1] = "The interpretation or exegesis of the Quran";
        Question[77][2] = "A Hadith collection";
        Question[77][3] = "A type of Islamic prayer";
        Question[77][4] = "The history of early Islamic civilization";
        Question[77][5] = "The interpretation or exegesis of the Quran";

        // Question 78
        Question[78][0] = "What is 'Fiqh'?";
        Question[78][1] = "Islamic jurisprudence and legal theory";
        Question[78][2] = "A Hadith collection";
        Question[78][3] = "The theology of Islam";
        Question[78][4] = "The practices of Sufism";
        Question[78][5] = "Islamic jurisprudence and legal theory";

        // Question 79
        Question[79][0] = "What is 'Zakat'?";
        Question[79][1] = "The voluntary charity given by Muslims";
        Question[79][2] = "The obligatory almsgiving in Islam, a form of charity";
        Question[79][3] = "A pilgrimage to Mecca";
        Question[79][4] = "A form of religious fasting";
        Question[79][5] = "The obligatory almsgiving in Islam, a form of charity";

        // Question 80
        Question[80][0] = "What is 'Sawm'?";
        Question[80][1] = "The annual pilgrimage to Mecca";
        Question[80][2] = "The fasting during the month of Ramadan";
        Question[80][3] = "The prayer performed after sunset";
        Question[80][4] = "The charity given to the poor";
        Question[80][5] = "The fasting during the month of Ramadan";

        // Question 81
        Question[81][0] = "What is 'Hajj'?";
        Question[81][1] = "The annual pilgrimage to Mecca, one of the Five Pillars of Islam";
        Question[81][2] = "The voluntary charity given by Muslims";
        Question[81][3] = "The fasting during the month of Ramadan";
        Question[81][4] = "The act of giving alms to the poor";
        Question[81][5] = "The annual pilgrimage to Mecca, one of the Five Pillars of Islam";

        // Question 82
        Question[82][0] = "What is 'Shahada'?";
        Question[82][1] = "The Islamic declaration of faith";
        Question[82][2] = "The pilgrimage to Mecca";
        Question[82][3] = "The giving of charity to the poor";
        Question[82][4] = "The practice of fasting during Ramadan";
        Question[82][5] = "The Islamic declaration of faith";

        // Question 83
        Question[83][0] = "What is 'Tawhid'?";
        Question[83][1] = "The belief in the oneness of God";
        Question[83][2] = "The practice of daily prayer in Islam";
        Question[83][3] = "The collection of Islamic legal texts";
        Question[83][4] = "The Islamic declaration of faith";
        Question[83][5] = "The belief in the oneness of God";

        // Question 84
        Question[84][0] = "What is 'Aqiqah'?";
        Question[84][1] = "A religious festival in Islam";
        Question[84][2] = "A ceremony to celebrate the birth of a child, including the sacrifice of an animal";
        Question[84][3] = "The annual pilgrimage to Mecca";
        Question[84][4] = "A type of Islamic charity";
        Question[84][5] = "A ceremony to celebrate the birth of a child, including the sacrifice of an animal";

        // Question 85
        Question[85][0] = "What is 'Ibadah'?";
        Question[85][1] = "The act of worship or devotion in Islam";
        Question[85][2] = "The declaration of faith in Islam";
        Question[85][3] = "The fasting during Ramadan";
        Question[85][4] = "The act of giving alms to the poor";
        Question[85][5] = "The act of worship or devotion in Islam";

        // Question 86
        Question[86][0] = "What is 'Ilm'?";
        Question[86][1] = "Knowledge, particularly religious knowledge in Islam";
        Question[86][2] = "The belief in the oneness of God";
        Question[86][3] = "The Islamic declaration of faith";
        Question[86][4] = "The pilgrimage to Mecca";
        Question[86][5] = "Knowledge, particularly religious knowledge in Islam";

        // Question 87
        Question[87][0] = "What is 'Jannah'?";
        Question[87][1] = "The paradise or heaven in Islam";
        Question[87][2] = "The concept of hell in Islam";
        Question[87][3] = "The daily prayer in Islam";
        Question[87][4] = "The practice of fasting during Ramadan";
        Question[87][5] = "The paradise or heaven in Islam";

        // Question 88
        Question[88][0] = "What is 'Nar'?";
        Question[88][1] = "The paradise or heaven in Islam";
        Question[88][2] = "The concept of hell in Islam";
        Question[88][3] = "The concept of charity in Islam";
        Question[88][4] = "The daily prayer in Islam";
        Question[88][5] = "The concept of hell in Islam";

        // Question 89
        Question[89][0] = "What is 'Sadaqah'?";
        Question[89][1] = "Voluntary charity given by Muslims";
        Question[89][2] = "The obligatory charity or almsgiving in Islam";
        Question[89][3] = "The fasting during the month of Ramadan";
        Question[89][4] = "A form of Islamic worship";
        Question[89][5] = "Voluntary charity given by Muslims";

        // Question 90
        Question[90][0] = "What is 'Khums'?";
        Question[90][1] = "A religious tax in Islam that is given to the poor and the needy";
        Question[90][2] = "The annual pilgrimage to Mecca";
        Question[90][3] = "The daily prayers in Islam";
        Question[90][4] = "A voluntary charity given by Muslims";
        Question[90][5] = "A religious tax in Islam that is given to the poor and the needy";

        // Question 91
        Question[91][0] = "What is 'Tawbah'?";
        Question[91][1] = "Repentance or seeking forgiveness in Islam";
        Question[91][2] = "The belief in the oneness of God";
        Question[91][3] = "The act of fasting during Ramadan";
        Question[91][4] = "The practice of charity";
        Question[91][5] = "Repentance or seeking forgiveness in Islam";

        // Question 92
        Question[92][0] = "What is 'Mujahid'?";
        Question[92][1] = "A person who struggles or strives in the way of God";
        Question[92][2] = "A warrior who fights in a holy war";
        Question[92][3] = "A person who recites the Quran";
        Question[92][4] = "A leader of the Islamic community";
        Question[92][5] = "A person who struggles or strives in the way of God";

        // Question 93
        Question[93][0] = "What is 'Ulama'?";
        Question[93][1] = "The scholars or learned persons in Islam";
        Question[93][2] = "A group of Islamic warriors";
        Question[93][3] = "A class of religious leaders in Islam";
        Question[93][4] = "A term for Islamic charity";
        Question[93][5] = "The scholars or learned persons in Islam";

        // Question 94
        Question[94][0] = "What is 'Fitnah'?";
        Question[94][1] = "A trial or test, often involving conflict or mischief";
        Question[94][2] = "A type of charity in Islam";
        Question[94][3] = "The daily prayer in Islam";
        Question[94][4] = "A form of fasting";
        Question[94][5] = "A trial or test, often involving conflict or mischief";

        // Question 95
        Question[95][0] = "What is 'Riba'?";
        Question[95][1] = "Usury or interest, which is prohibited in Islam";
        Question[95][2] = "Charity given to the poor";
        Question[95][3] = "A form of Islamic prayer";
        Question[95][4] = "The pilgrimage to Mecca";
        Question[95][5] = "Usury or interest, which is prohibited in Islam";

        // Question 96
        Question[96][0] = "What is 'Jihad'?";
        Question[96][1] = "Striving or struggling in the way of God, often used in the context of self-improvement";
        Question[96][2] = "A pilgrimage to Mecca";
        Question[96][3] = "The daily prayer in Islam";
        Question[96][4] = "A type of Islamic charity";
        Question[96][5] = "Striving or struggling in the way of God, often used in the context of self-improvement";

        // Question 97
        Question[97][0] = "What is 'Ahl al-Bayt'?";
        Question[97][1] = "The family of Prophet Muhammad, including his daughter Fatimah and her descendants";
        Question[97][2] = "The companions of the Prophet Muhammad";
        Question[97][3] = "The early followers of Islam";
        Question[97][4] = "The leaders of the Islamic community after the Prophet";
        Question[97][5] = "The family of Prophet Muhammad, including his daughter Fatimah and her descendants";

        // Question 98
        Question[98][0] = "What is 'Shia Islam'?";
        Question[98][1] = "A branch of Islam that believes in the leadership of the Prophet's family, especially Ali";
        Question[98][2] = "A school of thought in Islamic jurisprudence";
        Question[98][3] = "The branch of Islam that follows the first four caliphs";
        Question[98][4] = "The practice of the Sunni branch of Islam";
        Question[98][5] = "A branch of Islam that believes in the leadership of the Prophet's family, especially Ali";

        // Question 99
        Question[99][0] = "What is 'Sunni Islam'?";
        Question[99][1] = "A branch of Islam that believes in the leadership of the first four caliphs";
        Question[99][2] = "A school of thought in Islamic jurisprudence";
        Question[99][3] = "The branch of Islam that follows the family of the Prophet";
        Question[99][4] = "The practice of Shia Islam";
        Question[99][5] = "A branch of Islam that believes in the leadership of the first four caliphs";

    }
    public  static  void GeneralQuestionAdd(){
        Question[0][0] = "What is the national fruit of Bangladesh?";
        Question[0][1] = "Banana";
        Question[0][2] = "Mango";
        Question[0][3] = "Jackfruit";
        Question[0][4] = "Guava";
        Question[0][5] = "Jackfruit";

        Question[1][0] = "Which city is known as the port city of Bangladesh?";
        Question[1][1] = "Sylhet";
        Question[1][2] = "Barisal";
        Question[1][3] = "Chattogram";
        Question[1][4] = "Rajshahi";
        Question[1][5] = "Chattogram";

        Question[2][0] = "Which is the largest district in Bangladesh by area?";
        Question[2][1] = "Rangamati";
        Question[2][2] = "Khulna";
        Question[2][3] = "Rajshahi";
        Question[2][4] = "Cox's Bazar";
        Question[2][5] = "Rangamati";

        Question[3][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[3][1] = "21st February";
        Question[3][2] = "16th December";
        Question[3][3] = "26th March";
        Question[3][4] = "1st May";
        Question[3][5] = "21st February";

        Question[4][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[4][1] = "Ziaur Rahman";
        Question[4][2] = "Sheikh Hasina";
        Question[4][3] = "Khaleda Zia";
        Question[4][4] = "Abdul Hamid";
        Question[4][5] = "Sheikh Hasina";

        Question[5][0] = "What is the name of the longest beach in Bangladesh?";
        Question[5][1] = "Kuakata";
        Question[5][2] = "Cox's Bazar";
        Question[5][3] = "Saint Martin";
        Question[5][4] = "Patenga";
        Question[5][5] = "Cox's Bazar";

        Question[6][0] = "What is the national game of Bangladesh?";
        Question[6][1] = "Football";
        Question[6][2] = "Kabaddi";
        Question[6][3] = "Cricket";
        Question[6][4] = "Hockey";
        Question[6][5] = "Kabaddi";

        Question[7][0] = "What is the national bird of Bangladesh?";
        Question[7][1] = "Sparrow";
        Question[7][2] = "Doyel";
        Question[7][3] = "Crow";
        Question[7][4] = "Parrot";
        Question[7][5] = "Doyel";

        Question[8][0] = "What is the national fish of Bangladesh?";
        Question[8][1] = "Hilsa";
        Question[8][2] = "Rui";
        Question[8][3] = "Pangas";
        Question[8][4] = "Katla";
        Question[8][5] = "Hilsa";

        Question[9][0] = "Which university is the oldest in Bangladesh?";
        Question[9][1] = "Chittagong University";
        Question[9][2] = "Jahangirnagar University";
        Question[9][3] = "University of Dhaka";
        Question[9][4] = "Rajshahi University";
        Question[9][5] = "University of Dhaka";

        Question[10][0] = "What is the national fruit of Bangladesh?";
        Question[10][1] = "Banana";
        Question[10][2] = "Mango";
        Question[10][3] = "Jackfruit";
        Question[10][4] = "Guava";
        Question[10][5] = "Jackfruit";

        Question[11][0] = "Which city is known as the port city of Bangladesh?";
        Question[11][1] = "Sylhet";
        Question[11][2] = "Barisal";
        Question[11][3] = "Chattogram";
        Question[11][4] = "Rajshahi";
        Question[11][5] = "Chattogram";

        Question[12][0] = "Which is the largest district in Bangladesh by area?";
        Question[12][1] = "Rangamati";
        Question[12][2] = "Khulna";
        Question[12][3] = "Rajshahi";
        Question[12][4] = "Cox's Bazar";
        Question[12][5] = "Rangamati";

        Question[13][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[13][1] = "21st February";
        Question[13][2] = "16th December";
        Question[13][3] = "26th March";
        Question[13][4] = "1st May";
        Question[13][5] = "21st February";

        Question[14][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[14][1] = "Ziaur Rahman";
        Question[14][2] = "Sheikh Hasina";
        Question[14][3] = "Khaleda Zia";
        Question[14][4] = "Abdul Hamid";
        Question[14][5] = "Sheikh Hasina";

        Question[15][0] = "What is the name of the longest beach in Bangladesh?";
        Question[15][1] = "Kuakata";
        Question[15][2] = "Cox's Bazar";
        Question[15][3] = "Saint Martin";
        Question[15][4] = "Patenga";
        Question[15][5] = "Cox's Bazar";

        Question[16][0] = "What is the national game of Bangladesh?";
        Question[16][1] = "Football";
        Question[16][2] = "Kabaddi";
        Question[16][3] = "Cricket";
        Question[16][4] = "Hockey";
        Question[16][5] = "Kabaddi";

        Question[17][0] = "What is the national bird of Bangladesh?";
        Question[17][1] = "Sparrow";
        Question[17][2] = "Doyel";
        Question[17][3] = "Crow";
        Question[17][4] = "Parrot";
        Question[17][5] = "Doyel";

        Question[18][0] = "What is the national fish of Bangladesh?";
        Question[18][1] = "Hilsa";
        Question[18][2] = "Rui";
        Question[18][3] = "Pangas";
        Question[18][4] = "Katla";
        Question[18][5] = "Hilsa";

        Question[19][0] = "Which university is the oldest in Bangladesh?";
        Question[19][1] = "Chittagong University";
        Question[19][2] = "Jahangirnagar University";
        Question[19][3] = "University of Dhaka";
        Question[19][4] = "Rajshahi University";
        Question[19][5] = "University of Dhaka";

        Question[20][0] = "What is the national fruit of Bangladesh?";
        Question[20][1] = "Banana";
        Question[20][2] = "Mango";
        Question[20][3] = "Jackfruit";
        Question[20][4] = "Guava";
        Question[20][5] = "Jackfruit";

        Question[21][0] = "Which city is known as the port city of Bangladesh?";
        Question[21][1] = "Sylhet";
        Question[21][2] = "Barisal";
        Question[21][3] = "Chattogram";
        Question[21][4] = "Rajshahi";
        Question[21][5] = "Chattogram";

        Question[22][0] = "Which is the largest district in Bangladesh by area?";
        Question[22][1] = "Rangamati";
        Question[22][2] = "Khulna";
        Question[22][3] = "Rajshahi";
        Question[22][4] = "Cox's Bazar";
        Question[22][5] = "Rangamati";

        Question[23][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[23][1] = "21st February";
        Question[23][2] = "16th December";
        Question[23][3] = "26th March";
        Question[23][4] = "1st May";
        Question[23][5] = "21st February";

        Question[24][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[24][1] = "Ziaur Rahman";
        Question[24][2] = "Sheikh Hasina";
        Question[24][3] = "Khaleda Zia";
        Question[24][4] = "Abdul Hamid";
        Question[24][5] = "Sheikh Hasina";

        Question[25][0] = "What is the name of the longest beach in Bangladesh?";
        Question[25][1] = "Kuakata";
        Question[25][2] = "Cox's Bazar";
        Question[25][3] = "Saint Martin";
        Question[25][4] = "Patenga";
        Question[25][5] = "Cox's Bazar";

        Question[26][0] = "What is the national game of Bangladesh?";
        Question[26][1] = "Football";
        Question[26][2] = "Kabaddi";
        Question[26][3] = "Cricket";
        Question[26][4] = "Hockey";
        Question[26][5] = "Kabaddi";

        Question[27][0] = "What is the national bird of Bangladesh?";
        Question[27][1] = "Sparrow";
        Question[27][2] = "Doyel";
        Question[27][3] = "Crow";
        Question[27][4] = "Parrot";
        Question[27][5] = "Doyel";

        Question[28][0] = "What is the national fish of Bangladesh?";
        Question[28][1] = "Hilsa";
        Question[28][2] = "Rui";
        Question[28][3] = "Pangas";
        Question[28][4] = "Katla";
        Question[28][5] = "Hilsa";

        Question[29][0] = "Which university is the oldest in Bangladesh?";
        Question[29][1] = "Chittagong University";
        Question[29][2] = "Jahangirnagar University";
        Question[29][3] = "University of Dhaka";
        Question[29][4] = "Rajshahi University";
        Question[29][5] = "University of Dhaka";

        Question[30][0] = "What is the national fruit of Bangladesh?";
        Question[30][1] = "Banana";
        Question[30][2] = "Mango";
        Question[30][3] = "Jackfruit";
        Question[30][4] = "Guava";
        Question[30][5] = "Jackfruit";

        Question[31][0] = "Which city is known as the port city of Bangladesh?";
        Question[31][1] = "Sylhet";
        Question[31][2] = "Barisal";
        Question[31][3] = "Chattogram";
        Question[31][4] = "Rajshahi";
        Question[31][5] = "Chattogram";

        Question[32][0] = "Which is the largest district in Bangladesh by area?";
        Question[32][1] = "Rangamati";
        Question[32][2] = "Khulna";
        Question[32][3] = "Rajshahi";
        Question[32][4] = "Cox's Bazar";
        Question[32][5] = "Rangamati";

        Question[33][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[33][1] = "21st February";
        Question[33][2] = "16th December";
        Question[33][3] = "26th March";
        Question[33][4] = "1st May";
        Question[33][5] = "21st February";

        Question[34][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[34][1] = "Ziaur Rahman";
        Question[34][2] = "Sheikh Hasina";
        Question[34][3] = "Khaleda Zia";
        Question[34][4] = "Abdul Hamid";
        Question[34][5] = "Sheikh Hasina";

        Question[35][0] = "What is the name of the longest beach in Bangladesh?";
        Question[35][1] = "Kuakata";
        Question[35][2] = "Cox's Bazar";
        Question[35][3] = "Saint Martin";
        Question[35][4] = "Patenga";
        Question[35][5] = "Cox's Bazar";

        Question[36][0] = "What is the national game of Bangladesh?";
        Question[36][1] = "Football";
        Question[36][2] = "Kabaddi";
        Question[36][3] = "Cricket";
        Question[36][4] = "Hockey";
        Question[36][5] = "Kabaddi";

        Question[37][0] = "What is the national bird of Bangladesh?";
        Question[37][1] = "Sparrow";
        Question[37][2] = "Doyel";
        Question[37][3] = "Crow";
        Question[37][4] = "Parrot";
        Question[37][5] = "Doyel";

        Question[38][0] = "What is the national fish of Bangladesh?";
        Question[38][1] = "Hilsa";
        Question[38][2] = "Rui";
        Question[38][3] = "Pangas";
        Question[38][4] = "Katla";
        Question[38][5] = "Hilsa";

        Question[39][0] = "Which university is the oldest in Bangladesh?";
        Question[39][1] = "Chittagong University";
        Question[39][2] = "Jahangirnagar University";
        Question[39][3] = "University of Dhaka";
        Question[39][4] = "Rajshahi University";
        Question[39][5] = "University of Dhaka";

        Question[40][0] = "What is the national fruit of Bangladesh?";
        Question[40][1] = "Banana";
        Question[40][2] = "Mango";
        Question[40][3] = "Jackfruit";
        Question[40][4] = "Guava";
        Question[40][5] = "Jackfruit";

        Question[41][0] = "Which city is known as the port city of Bangladesh?";
        Question[41][1] = "Sylhet";
        Question[41][2] = "Barisal";
        Question[41][3] = "Chattogram";
        Question[41][4] = "Rajshahi";
        Question[41][5] = "Chattogram";

        Question[42][0] = "Which is the largest district in Bangladesh by area?";
        Question[42][1] = "Rangamati";
        Question[42][2] = "Khulna";
        Question[42][3] = "Rajshahi";
        Question[42][4] = "Cox's Bazar";
        Question[42][5] = "Rangamati";

        Question[43][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[43][1] = "21st February";
        Question[43][2] = "16th December";
        Question[43][3] = "26th March";
        Question[43][4] = "1st May";
        Question[43][5] = "21st February";

        Question[44][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[44][1] = "Ziaur Rahman";
        Question[44][2] = "Sheikh Hasina";
        Question[44][3] = "Khaleda Zia";
        Question[44][4] = "Abdul Hamid";
        Question[44][5] = "Sheikh Hasina";

        Question[45][0] = "What is the name of the longest beach in Bangladesh?";
        Question[45][1] = "Kuakata";
        Question[45][2] = "Cox's Bazar";
        Question[45][3] = "Saint Martin";
        Question[45][4] = "Patenga";
        Question[45][5] = "Cox's Bazar";

        Question[46][0] = "What is the national game of Bangladesh?";
        Question[46][1] = "Football";
        Question[46][2] = "Kabaddi";
        Question[46][3] = "Cricket";
        Question[46][4] = "Hockey";
        Question[46][5] = "Kabaddi";

        Question[47][0] = "What is the national bird of Bangladesh?";
        Question[47][1] = "Sparrow";
        Question[47][2] = "Doyel";
        Question[47][3] = "Crow";
        Question[47][4] = "Parrot";
        Question[47][5] = "Doyel";

        Question[48][0] = "What is the national fish of Bangladesh?";
        Question[48][1] = "Hilsa";
        Question[48][2] = "Rui";
        Question[48][3] = "Pangas";
        Question[48][4] = "Katla";
        Question[48][5] = "Hilsa";

        Question[49][0] = "Which university is the oldest in Bangladesh?";
        Question[49][1] = "Chittagong University";
        Question[49][2] = "Jahangirnagar University";
        Question[49][3] = "University of Dhaka";
        Question[49][4] = "Rajshahi University";
        Question[49][5] = "University of Dhaka";

        Question[50][0] = "What is the national fruit of Bangladesh?";
        Question[50][1] = "Banana";
        Question[50][2] = "Mango";
        Question[50][3] = "Jackfruit";
        Question[50][4] = "Guava";
        Question[50][5] = "Jackfruit";

        Question[51][0] = "Which city is known as the port city of Bangladesh?";
        Question[51][1] = "Sylhet";
        Question[51][2] = "Barisal";
        Question[51][3] = "Chattogram";
        Question[51][4] = "Rajshahi";
        Question[51][5] = "Chattogram";

        Question[52][0] = "Which is the largest district in Bangladesh by area?";
        Question[52][1] = "Rangamati";
        Question[52][2] = "Khulna";
        Question[52][3] = "Rajshahi";
        Question[52][4] = "Cox's Bazar";
        Question[52][5] = "Rangamati";

        Question[53][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[53][1] = "21st February";
        Question[53][2] = "16th December";
        Question[53][3] = "26th March";
        Question[53][4] = "1st May";
        Question[53][5] = "21st February";

        Question[54][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[54][1] = "Ziaur Rahman";
        Question[54][2] = "Sheikh Hasina";
        Question[54][3] = "Khaleda Zia";
        Question[54][4] = "Abdul Hamid";
        Question[54][5] = "Sheikh Hasina";

        Question[55][0] = "What is the name of the longest beach in Bangladesh?";
        Question[55][1] = "Kuakata";
        Question[55][2] = "Cox's Bazar";
        Question[55][3] = "Saint Martin";
        Question[55][4] = "Patenga";
        Question[55][5] = "Cox's Bazar";

        Question[56][0] = "What is the national game of Bangladesh?";
        Question[56][1] = "Football";
        Question[56][2] = "Kabaddi";
        Question[56][3] = "Cricket";
        Question[56][4] = "Hockey";
        Question[56][5] = "Kabaddi";

        Question[57][0] = "What is the national bird of Bangladesh?";
        Question[57][1] = "Sparrow";
        Question[57][2] = "Doyel";
        Question[57][3] = "Crow";
        Question[57][4] = "Parrot";
        Question[57][5] = "Doyel";

        Question[58][0] = "What is the national fish of Bangladesh?";
        Question[58][1] = "Hilsa";
        Question[58][2] = "Rui";
        Question[58][3] = "Pangas";
        Question[58][4] = "Katla";
        Question[58][5] = "Hilsa";

        Question[59][0] = "Which university is the oldest in Bangladesh?";
        Question[59][1] = "Chittagong University";
        Question[59][2] = "Jahangirnagar University";
        Question[59][3] = "University of Dhaka";
        Question[59][4] = "Rajshahi University";
        Question[59][5] = "University of Dhaka";

        Question[60][0] = "What is the national fruit of Bangladesh?";
        Question[60][1] = "Banana";
        Question[60][2] = "Mango";
        Question[60][3] = "Jackfruit";
        Question[60][4] = "Guava";
        Question[60][5] = "Jackfruit";

        Question[61][0] = "Which city is known as the port city of Bangladesh?";
        Question[61][1] = "Sylhet";
        Question[61][2] = "Barisal";
        Question[61][3] = "Chattogram";
        Question[61][4] = "Rajshahi";
        Question[61][5] = "Chattogram";

        Question[62][0] = "Which is the largest district in Bangladesh by area?";
        Question[62][1] = "Rangamati";
        Question[62][2] = "Khulna";
        Question[62][3] = "Rajshahi";
        Question[62][4] = "Cox's Bazar";
        Question[62][5] = "Rangamati";

        Question[63][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[63][1] = "21st February";
        Question[63][2] = "16th December";
        Question[63][3] = "26th March";
        Question[63][4] = "1st May";
        Question[63][5] = "21st February";

        Question[64][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[64][1] = "Ziaur Rahman";
        Question[64][2] = "Sheikh Hasina";
        Question[64][3] = "Khaleda Zia";
        Question[64][4] = "Abdul Hamid";
        Question[64][5] = "Sheikh Hasina";

        Question[65][0] = "What is the name of the longest beach in Bangladesh?";
        Question[65][1] = "Kuakata";
        Question[65][2] = "Cox's Bazar";
        Question[65][3] = "Saint Martin";
        Question[65][4] = "Patenga";
        Question[65][5] = "Cox's Bazar";

        Question[66][0] = "What is the national game of Bangladesh?";
        Question[66][1] = "Football";
        Question[66][2] = "Kabaddi";
        Question[66][3] = "Cricket";
        Question[66][4] = "Hockey";
        Question[66][5] = "Kabaddi";

        Question[67][0] = "What is the national bird of Bangladesh?";
        Question[67][1] = "Sparrow";
        Question[67][2] = "Doyel";
        Question[67][3] = "Crow";
        Question[67][4] = "Parrot";
        Question[67][5] = "Doyel";

        Question[68][0] = "What is the national fish of Bangladesh?";
        Question[68][1] = "Hilsa";
        Question[68][2] = "Rui";
        Question[68][3] = "Pangas";
        Question[68][4] = "Katla";
        Question[68][5] = "Hilsa";

        Question[69][0] = "Which university is the oldest in Bangladesh?";
        Question[69][1] = "Chittagong University";
        Question[69][2] = "Jahangirnagar University";
        Question[69][3] = "University of Dhaka";
        Question[69][4] = "Rajshahi University";
        Question[69][5] = "University of Dhaka";

        Question[70][0] = "What is the national fruit of Bangladesh?";
        Question[70][1] = "Banana";
        Question[70][2] = "Mango";
        Question[70][3] = "Jackfruit";
        Question[70][4] = "Guava";
        Question[70][5] = "Jackfruit";

        Question[71][0] = "Which city is known as the port city of Bangladesh?";
        Question[71][1] = "Sylhet";
        Question[71][2] = "Barisal";
        Question[71][3] = "Chattogram";
        Question[71][4] = "Rajshahi";
        Question[71][5] = "Chattogram";

        Question[72][0] = "Which is the largest district in Bangladesh by area?";
        Question[72][1] = "Rangamati";
        Question[72][2] = "Khulna";
        Question[72][3] = "Rajshahi";
        Question[72][4] = "Cox's Bazar";
        Question[72][5] = "Rangamati";

        Question[73][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[73][1] = "21st February";
        Question[73][2] = "16th December";
        Question[73][3] = "26th March";
        Question[73][4] = "1st May";
        Question[73][5] = "21st February";

        Question[74][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[74][1] = "Ziaur Rahman";
        Question[74][2] = "Sheikh Hasina";
        Question[74][3] = "Khaleda Zia";
        Question[74][4] = "Abdul Hamid";
        Question[74][5] = "Sheikh Hasina";

        Question[75][0] = "What is the name of the longest beach in Bangladesh?";
        Question[75][1] = "Kuakata";
        Question[75][2] = "Cox's Bazar";
        Question[75][3] = "Saint Martin";
        Question[75][4] = "Patenga";
        Question[75][5] = "Cox's Bazar";

        Question[76][0] = "What is the national game of Bangladesh?";
        Question[76][1] = "Football";
        Question[76][2] = "Kabaddi";
        Question[76][3] = "Cricket";
        Question[76][4] = "Hockey";
        Question[76][5] = "Kabaddi";

        Question[77][0] = "What is the national bird of Bangladesh?";
        Question[77][1] = "Sparrow";
        Question[77][2] = "Doyel";
        Question[77][3] = "Crow";
        Question[77][4] = "Parrot";
        Question[77][5] = "Doyel";

        Question[78][0] = "What is the national fish of Bangladesh?";
        Question[78][1] = "Hilsa";
        Question[78][2] = "Rui";
        Question[78][3] = "Pangas";
        Question[78][4] = "Katla";
        Question[78][5] = "Hilsa";

        Question[79][0] = "Which university is the oldest in Bangladesh?";
        Question[79][1] = "Chittagong University";
        Question[79][2] = "Jahangirnagar University";
        Question[79][3] = "University of Dhaka";
        Question[79][4] = "Rajshahi University";
        Question[79][5] = "University of Dhaka";

        Question[80][0] = "What is the national fruit of Bangladesh?";
        Question[80][1] = "Banana";
        Question[80][2] = "Mango";
        Question[80][3] = "Jackfruit";
        Question[80][4] = "Guava";
        Question[80][5] = "Jackfruit";

        Question[81][0] = "Which city is known as the port city of Bangladesh?";
        Question[81][1] = "Sylhet";
        Question[81][2] = "Barisal";
        Question[81][3] = "Chattogram";
        Question[81][4] = "Rajshahi";
        Question[81][5] = "Chattogram";

        Question[82][0] = "Which is the largest district in Bangladesh by area?";
        Question[82][1] = "Rangamati";
        Question[82][2] = "Khulna";
        Question[82][3] = "Rajshahi";
        Question[82][4] = "Cox's Bazar";
        Question[82][5] = "Rangamati";

        Question[83][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[83][1] = "21st February";
        Question[83][2] = "16th December";
        Question[83][3] = "26th March";
        Question[83][4] = "1st May";
        Question[83][5] = "21st February";

        Question[84][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[84][1] = "Ziaur Rahman";
        Question[84][2] = "Sheikh Hasina";
        Question[84][3] = "Khaleda Zia";
        Question[84][4] = "Abdul Hamid";
        Question[84][5] = "Sheikh Hasina";

        Question[85][0] = "What is the name of the longest beach in Bangladesh?";
        Question[85][1] = "Kuakata";
        Question[85][2] = "Cox's Bazar";
        Question[85][3] = "Saint Martin";
        Question[85][4] = "Patenga";
        Question[85][5] = "Cox's Bazar";

        Question[86][0] = "What is the national game of Bangladesh?";
        Question[86][1] = "Football";
        Question[86][2] = "Kabaddi";
        Question[86][3] = "Cricket";
        Question[86][4] = "Hockey";
        Question[86][5] = "Kabaddi";

        Question[87][0] = "What is the national bird of Bangladesh?";
        Question[87][1] = "Sparrow";
        Question[87][2] = "Doyel";
        Question[87][3] = "Crow";
        Question[87][4] = "Parrot";
        Question[87][5] = "Doyel";

        Question[88][0] = "What is the national fish of Bangladesh?";
        Question[88][1] = "Hilsa";
        Question[88][2] = "Rui";
        Question[88][3] = "Pangas";
        Question[88][4] = "Katla";
        Question[88][5] = "Hilsa";

        Question[89][0] = "Which university is the oldest in Bangladesh?";
        Question[89][1] = "Chittagong University";
        Question[89][2] = "Jahangirnagar University";
        Question[89][3] = "University of Dhaka";
        Question[89][4] = "Rajshahi University";
        Question[89][5] = "University of Dhaka";

        Question[90][0] = "What is the national fruit of Bangladesh?";
        Question[90][1] = "Banana";
        Question[90][2] = "Mango";
        Question[90][3] = "Jackfruit";
        Question[90][4] = "Guava";
        Question[90][5] = "Jackfruit";

        Question[91][0] = "Which city is known as the port city of Bangladesh?";
        Question[91][1] = "Sylhet";
        Question[91][2] = "Barisal";
        Question[91][3] = "Chattogram";
        Question[91][4] = "Rajshahi";
        Question[91][5] = "Chattogram";

        Question[92][0] = "Which is the largest district in Bangladesh by area?";
        Question[92][1] = "Rangamati";
        Question[92][2] = "Khulna";
        Question[92][3] = "Rajshahi";
        Question[92][4] = "Cox's Bazar";
        Question[92][5] = "Rangamati";

        Question[93][0] = "Which language movement day is observed as International Mother Language Day?";
        Question[93][1] = "21st February";
        Question[93][2] = "16th December";
        Question[93][3] = "26th March";
        Question[93][4] = "1st May";
        Question[93][5] = "21st February";

        Question[94][0] = "Who is the current Prime Minister of Bangladesh?";
        Question[94][1] = "Ziaur Rahman";
        Question[94][2] = "Sheikh Hasina";
        Question[94][3] = "Khaleda Zia";
        Question[94][4] = "Abdul Hamid";
        Question[94][5] = "Sheikh Hasina";

        Question[95][0] = "What is the name of the longest beach in Bangladesh?";
        Question[95][1] = "Kuakata";
        Question[95][2] = "Cox's Bazar";
        Question[95][3] = "Saint Martin";
        Question[95][4] = "Patenga";
        Question[95][5] = "Cox's Bazar";

        Question[96][0] = "What is the national game of Bangladesh?";
        Question[96][1] = "Football";
        Question[96][2] = "Kabaddi";
        Question[96][3] = "Cricket";
        Question[96][4] = "Hockey";
        Question[96][5] = "Kabaddi";

        Question[97][0] = "What is the national bird of Bangladesh?";
        Question[97][1] = "Sparrow";
        Question[97][2] = "Doyel";
        Question[97][3] = "Crow";
        Question[97][4] = "Parrot";
        Question[97][5] = "Doyel";

        Question[98][0] = "What is the national fish of Bangladesh?";
        Question[98][1] = "Hilsa";
        Question[98][2] = "Rui";
        Question[98][3] = "Pangas";
        Question[98][4] = "Katla";
        Question[98][5] = "Hilsa";

        Question[99][0] = "Which university is the oldest in Bangladesh?";
        Question[99][1] = "Chittagong University";
        Question[99][2] = "Jahangirnagar University";
        Question[99][3] = "University of Dhaka";
        Question[99][4] = "Rajshahi University";
        Question[99][5] = "University of Dhaka";


    }
    public  static  void HistoryQuestionAdd(){
        Question[0][0] = "When did the Language Movement take place in Bangladesh?";
        Question[0][1] = "1952";
        Question[0][2] = "1971";
        Question[0][3] = "1947";
        Question[0][4] = "1962";
        Question[0][5] = "1952";

        Question[1][0] = "Who was the first President of Bangladesh?";
        Question[1][1] = "Sheikh Mujibur Rahman";
        Question[1][2] = "Ziaur Rahman";
        Question[1][3] = "Tajuddin Ahmad";
        Question[1][4] = "Syed Nazrul Islam";
        Question[1][5] = "Sheikh Mujibur Rahman";

        Question[2][0] = "When did Bangladesh become an independent country?";
        Question[2][1] = "1971";
        Question[2][2] = "1947";
        Question[2][3] = "1965";
        Question[2][4] = "1975";
        Question[2][5] = "1971";

        Question[3][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[3][1] = "Tajuddin Ahmad";
        Question[3][2] = "Ziaur Rahman";
        Question[3][3] = "Sheikh Hasina";
        Question[3][4] = "M. A. G. Osmani";
        Question[3][5] = "Tajuddin Ahmad";

        Question[4][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[4][1] = "Operation Searchlight";
        Question[4][2] = "Operation Liberation";
        Question[4][3] = "Operation Clean Heart";
        Question[4][4] = "Operation Thunder";
        Question[4][5] = "Operation Searchlight";

        Question[5][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[5][1] = "M. A. G. Osmani";
        Question[5][2] = "Ziaur Rahman";
        Question[5][3] = "K. M. Shafiullah";
        Question[5][4] = "Shafi Imam Rumi";
        Question[5][5] = "M. A. G. Osmani";

        Question[6][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[6][1] = "1971";
        Question[6][2] = "1970";
        Question[6][3] = "1969";
        Question[6][4] = "1966";
        Question[6][5] = "1971";

        Question[7][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[7][1] = "Mujibnagar";
        Question[7][2] = "Dhaka";
        Question[7][3] = "Kolkata";
        Question[7][4] = "Chattogram";
        Question[7][5] = "Mujibnagar";

        Question[8][0] = "What significant event happened on 16 December 1971?";
        Question[8][1] = "Victory Day";
        Question[8][2] = "Language Movement";
        Question[8][3] = "Independence Declaration";
        Question[8][4] = "Constitution Day";
        Question[8][5] = "Victory Day";

        Question[9][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[9][1] = "Friendship Treaty";
        Question[9][2] = "Peace Treaty";
        Question[9][3] = "Joint Cooperation Treaty";
        Question[9][4] = "Security Treaty";
        Question[9][5] = "Friendship Treaty";

        Question[10][0] = "When did the Language Movement take place in Bangladesh?";
        Question[10][1] = "1952";
        Question[10][2] = "1971";
        Question[10][3] = "1947";
        Question[10][4] = "1962";
        Question[10][5] = "1952";

        Question[11][0] = "Who was the first President of Bangladesh?";
        Question[11][1] = "Sheikh Mujibur Rahman";
        Question[11][2] = "Ziaur Rahman";
        Question[11][3] = "Tajuddin Ahmad";
        Question[11][4] = "Syed Nazrul Islam";
        Question[11][5] = "Sheikh Mujibur Rahman";

        Question[12][0] = "When did Bangladesh become an independent country?";
        Question[12][1] = "1971";
        Question[12][2] = "1947";
        Question[12][3] = "1965";
        Question[12][4] = "1975";
        Question[12][5] = "1971";

        Question[13][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[13][1] = "Tajuddin Ahmad";
        Question[13][2] = "Ziaur Rahman";
        Question[13][3] = "Sheikh Hasina";
        Question[13][4] = "M. A. G. Osmani";
        Question[13][5] = "Tajuddin Ahmad";

        Question[14][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[14][1] = "Operation Searchlight";
        Question[14][2] = "Operation Liberation";
        Question[14][3] = "Operation Clean Heart";
        Question[14][4] = "Operation Thunder";
        Question[14][5] = "Operation Searchlight";

        Question[15][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[15][1] = "M. A. G. Osmani";
        Question[15][2] = "Ziaur Rahman";
        Question[15][3] = "K. M. Shafiullah";
        Question[15][4] = "Shafi Imam Rumi";
        Question[15][5] = "M. A. G. Osmani";

        Question[16][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[16][1] = "1971";
        Question[16][2] = "1970";
        Question[16][3] = "1969";
        Question[16][4] = "1966";
        Question[16][5] = "1971";

        Question[17][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[17][1] = "Mujibnagar";
        Question[17][2] = "Dhaka";
        Question[17][3] = "Kolkata";
        Question[17][4] = "Chattogram";
        Question[17][5] = "Mujibnagar";

        Question[18][0] = "What significant event happened on 16 December 1971?";
        Question[18][1] = "Victory Day";
        Question[18][2] = "Language Movement";
        Question[18][3] = "Independence Declaration";
        Question[18][4] = "Constitution Day";
        Question[18][5] = "Victory Day";

        Question[19][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[19][1] = "Friendship Treaty";
        Question[19][2] = "Peace Treaty";
        Question[19][3] = "Joint Cooperation Treaty";
        Question[19][4] = "Security Treaty";
        Question[19][5] = "Friendship Treaty";

        Question[20][0] = "When did the Language Movement take place in Bangladesh?";
        Question[20][1] = "1952";
        Question[20][2] = "1971";
        Question[20][3] = "1947";
        Question[20][4] = "1962";
        Question[20][5] = "1952";

        Question[21][0] = "Who was the first President of Bangladesh?";
        Question[21][1] = "Sheikh Mujibur Rahman";
        Question[21][2] = "Ziaur Rahman";
        Question[21][3] = "Tajuddin Ahmad";
        Question[21][4] = "Syed Nazrul Islam";
        Question[21][5] = "Sheikh Mujibur Rahman";

        Question[22][0] = "When did Bangladesh become an independent country?";
        Question[22][1] = "1971";
        Question[22][2] = "1947";
        Question[22][3] = "1965";
        Question[22][4] = "1975";
        Question[22][5] = "1971";

        Question[23][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[23][1] = "Tajuddin Ahmad";
        Question[23][2] = "Ziaur Rahman";
        Question[23][3] = "Sheikh Hasina";
        Question[23][4] = "M. A. G. Osmani";
        Question[23][5] = "Tajuddin Ahmad";

        Question[24][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[24][1] = "Operation Searchlight";
        Question[24][2] = "Operation Liberation";
        Question[24][3] = "Operation Clean Heart";
        Question[24][4] = "Operation Thunder";
        Question[24][5] = "Operation Searchlight";

        Question[25][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[25][1] = "M. A. G. Osmani";
        Question[25][2] = "Ziaur Rahman";
        Question[25][3] = "K. M. Shafiullah";
        Question[25][4] = "Shafi Imam Rumi";
        Question[25][5] = "M. A. G. Osmani";

        Question[26][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[26][1] = "1971";
        Question[26][2] = "1970";
        Question[26][3] = "1969";
        Question[26][4] = "1966";
        Question[26][5] = "1971";

        Question[27][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[27][1] = "Mujibnagar";
        Question[27][2] = "Dhaka";
        Question[27][3] = "Kolkata";
        Question[27][4] = "Chattogram";
        Question[27][5] = "Mujibnagar";

        Question[28][0] = "What significant event happened on 16 December 1971?";
        Question[28][1] = "Victory Day";
        Question[28][2] = "Language Movement";
        Question[28][3] = "Independence Declaration";
        Question[28][4] = "Constitution Day";
        Question[28][5] = "Victory Day";

        Question[29][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[29][1] = "Friendship Treaty";
        Question[29][2] = "Peace Treaty";
        Question[29][3] = "Joint Cooperation Treaty";
        Question[29][4] = "Security Treaty";
        Question[29][5] = "Friendship Treaty";

        Question[30][0] = "When did the Language Movement take place in Bangladesh?";
        Question[30][1] = "1952";
        Question[30][2] = "1971";
        Question[30][3] = "1947";
        Question[30][4] = "1962";
        Question[30][5] = "1952";

        Question[31][0] = "Who was the first President of Bangladesh?";
        Question[31][1] = "Sheikh Mujibur Rahman";
        Question[31][2] = "Ziaur Rahman";
        Question[31][3] = "Tajuddin Ahmad";
        Question[31][4] = "Syed Nazrul Islam";
        Question[31][5] = "Sheikh Mujibur Rahman";

        Question[32][0] = "When did Bangladesh become an independent country?";
        Question[32][1] = "1971";
        Question[32][2] = "1947";
        Question[32][3] = "1965";
        Question[32][4] = "1975";
        Question[32][5] = "1971";

        Question[33][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[33][1] = "Tajuddin Ahmad";
        Question[33][2] = "Ziaur Rahman";
        Question[33][3] = "Sheikh Hasina";
        Question[33][4] = "M. A. G. Osmani";
        Question[33][5] = "Tajuddin Ahmad";

        Question[34][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[34][1] = "Operation Searchlight";
        Question[34][2] = "Operation Liberation";
        Question[34][3] = "Operation Clean Heart";
        Question[34][4] = "Operation Thunder";
        Question[34][5] = "Operation Searchlight";

        Question[35][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[35][1] = "M. A. G. Osmani";
        Question[35][2] = "Ziaur Rahman";
        Question[35][3] = "K. M. Shafiullah";
        Question[35][4] = "Shafi Imam Rumi";
        Question[35][5] = "M. A. G. Osmani";

        Question[36][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[36][1] = "1971";
        Question[36][2] = "1970";
        Question[36][3] = "1969";
        Question[36][4] = "1966";
        Question[36][5] = "1971";

        Question[37][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[37][1] = "Mujibnagar";
        Question[37][2] = "Dhaka";
        Question[37][3] = "Kolkata";
        Question[37][4] = "Chattogram";
        Question[37][5] = "Mujibnagar";

        Question[38][0] = "What significant event happened on 16 December 1971?";
        Question[38][1] = "Victory Day";
        Question[38][2] = "Language Movement";
        Question[38][3] = "Independence Declaration";
        Question[38][4] = "Constitution Day";
        Question[38][5] = "Victory Day";

        Question[39][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[39][1] = "Friendship Treaty";
        Question[39][2] = "Peace Treaty";
        Question[39][3] = "Joint Cooperation Treaty";
        Question[39][4] = "Security Treaty";
        Question[39][5] = "Friendship Treaty";

        Question[40][0] = "When did the Language Movement take place in Bangladesh?";
        Question[40][1] = "1952";
        Question[40][2] = "1971";
        Question[40][3] = "1947";
        Question[40][4] = "1962";
        Question[40][5] = "1952";

        Question[41][0] = "Who was the first President of Bangladesh?";
        Question[41][1] = "Sheikh Mujibur Rahman";
        Question[41][2] = "Ziaur Rahman";
        Question[41][3] = "Tajuddin Ahmad";
        Question[41][4] = "Syed Nazrul Islam";
        Question[41][5] = "Sheikh Mujibur Rahman";

        Question[42][0] = "When did Bangladesh become an independent country?";
        Question[42][1] = "1971";
        Question[42][2] = "1947";
        Question[42][3] = "1965";
        Question[42][4] = "1975";
        Question[42][5] = "1971";

        Question[43][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[43][1] = "Tajuddin Ahmad";
        Question[43][2] = "Ziaur Rahman";
        Question[43][3] = "Sheikh Hasina";
        Question[43][4] = "M. A. G. Osmani";
        Question[43][5] = "Tajuddin Ahmad";

        Question[44][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[44][1] = "Operation Searchlight";
        Question[44][2] = "Operation Liberation";
        Question[44][3] = "Operation Clean Heart";
        Question[44][4] = "Operation Thunder";
        Question[44][5] = "Operation Searchlight";

        Question[45][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[45][1] = "M. A. G. Osmani";
        Question[45][2] = "Ziaur Rahman";
        Question[45][3] = "K. M. Shafiullah";
        Question[45][4] = "Shafi Imam Rumi";
        Question[45][5] = "M. A. G. Osmani";

        Question[46][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[46][1] = "1971";
        Question[46][2] = "1970";
        Question[46][3] = "1969";
        Question[46][4] = "1966";
        Question[46][5] = "1971";

        Question[47][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[47][1] = "Mujibnagar";
        Question[47][2] = "Dhaka";
        Question[47][3] = "Kolkata";
        Question[47][4] = "Chattogram";
        Question[47][5] = "Mujibnagar";

        Question[48][0] = "What significant event happened on 16 December 1971?";
        Question[48][1] = "Victory Day";
        Question[48][2] = "Language Movement";
        Question[48][3] = "Independence Declaration";
        Question[48][4] = "Constitution Day";
        Question[48][5] = "Victory Day";

        Question[49][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[49][1] = "Friendship Treaty";
        Question[49][2] = "Peace Treaty";
        Question[49][3] = "Joint Cooperation Treaty";
        Question[49][4] = "Security Treaty";
        Question[49][5] = "Friendship Treaty";

        Question[50][0] = "When did the Language Movement take place in Bangladesh?";
        Question[50][1] = "1952";
        Question[50][2] = "1971";
        Question[50][3] = "1947";
        Question[50][4] = "1962";
        Question[50][5] = "1952";

        Question[51][0] = "Who was the first President of Bangladesh?";
        Question[51][1] = "Sheikh Mujibur Rahman";
        Question[51][2] = "Ziaur Rahman";
        Question[51][3] = "Tajuddin Ahmad";
        Question[51][4] = "Syed Nazrul Islam";
        Question[51][5] = "Sheikh Mujibur Rahman";

        Question[52][0] = "When did Bangladesh become an independent country?";
        Question[52][1] = "1971";
        Question[52][2] = "1947";
        Question[52][3] = "1965";
        Question[52][4] = "1975";
        Question[52][5] = "1971";

        Question[53][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[53][1] = "Tajuddin Ahmad";
        Question[53][2] = "Ziaur Rahman";
        Question[53][3] = "Sheikh Hasina";
        Question[53][4] = "M. A. G. Osmani";
        Question[53][5] = "Tajuddin Ahmad";

        Question[54][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[54][1] = "Operation Searchlight";
        Question[54][2] = "Operation Liberation";
        Question[54][3] = "Operation Clean Heart";
        Question[54][4] = "Operation Thunder";
        Question[54][5] = "Operation Searchlight";

        Question[55][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[55][1] = "M. A. G. Osmani";
        Question[55][2] = "Ziaur Rahman";
        Question[55][3] = "K. M. Shafiullah";
        Question[55][4] = "Shafi Imam Rumi";
        Question[55][5] = "M. A. G. Osmani";

        Question[56][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[56][1] = "1971";
        Question[56][2] = "1970";
        Question[56][3] = "1969";
        Question[56][4] = "1966";
        Question[56][5] = "1971";

        Question[57][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[57][1] = "Mujibnagar";
        Question[57][2] = "Dhaka";
        Question[57][3] = "Kolkata";
        Question[57][4] = "Chattogram";
        Question[57][5] = "Mujibnagar";

        Question[58][0] = "What significant event happened on 16 December 1971?";
        Question[58][1] = "Victory Day";
        Question[58][2] = "Language Movement";
        Question[58][3] = "Independence Declaration";
        Question[58][4] = "Constitution Day";
        Question[58][5] = "Victory Day";

        Question[59][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[59][1] = "Friendship Treaty";
        Question[59][2] = "Peace Treaty";
        Question[59][3] = "Joint Cooperation Treaty";
        Question[59][4] = "Security Treaty";
        Question[59][5] = "Friendship Treaty";

        Question[60][0] = "When did the Language Movement take place in Bangladesh?";
        Question[60][1] = "1952";
        Question[60][2] = "1971";
        Question[60][3] = "1947";
        Question[60][4] = "1962";
        Question[60][5] = "1952";

        Question[61][0] = "Who was the first President of Bangladesh?";
        Question[61][1] = "Sheikh Mujibur Rahman";
        Question[61][2] = "Ziaur Rahman";
        Question[61][3] = "Tajuddin Ahmad";
        Question[61][4] = "Syed Nazrul Islam";
        Question[61][5] = "Sheikh Mujibur Rahman";

        Question[62][0] = "When did Bangladesh become an independent country?";
        Question[62][1] = "1971";
        Question[62][2] = "1947";
        Question[62][3] = "1965";
        Question[62][4] = "1975";
        Question[62][5] = "1971";

        Question[63][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[63][1] = "Tajuddin Ahmad";
        Question[63][2] = "Ziaur Rahman";
        Question[63][3] = "Sheikh Hasina";
        Question[63][4] = "M. A. G. Osmani";
        Question[63][5] = "Tajuddin Ahmad";

        Question[64][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[64][1] = "Operation Searchlight";
        Question[64][2] = "Operation Liberation";
        Question[64][3] = "Operation Clean Heart";
        Question[64][4] = "Operation Thunder";
        Question[64][5] = "Operation Searchlight";

        Question[65][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[65][1] = "M. A. G. Osmani";
        Question[65][2] = "Ziaur Rahman";
        Question[65][3] = "K. M. Shafiullah";
        Question[65][4] = "Shafi Imam Rumi";
        Question[65][5] = "M. A. G. Osmani";

        Question[66][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[66][1] = "1971";
        Question[66][2] = "1970";
        Question[66][3] = "1969";
        Question[66][4] = "1966";
        Question[66][5] = "1971";

        Question[67][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[67][1] = "Mujibnagar";
        Question[67][2] = "Dhaka";
        Question[67][3] = "Kolkata";
        Question[67][4] = "Chattogram";
        Question[67][5] = "Mujibnagar";

        Question[68][0] = "What significant event happened on 16 December 1971?";
        Question[68][1] = "Victory Day";
        Question[68][2] = "Language Movement";
        Question[68][3] = "Independence Declaration";
        Question[68][4] = "Constitution Day";
        Question[68][5] = "Victory Day";

        Question[69][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[69][1] = "Friendship Treaty";
        Question[69][2] = "Peace Treaty";
        Question[69][3] = "Joint Cooperation Treaty";
        Question[69][4] = "Security Treaty";
        Question[69][5] = "Friendship Treaty";

        Question[70][0] = "When did the Language Movement take place in Bangladesh?";
        Question[70][1] = "1952";
        Question[70][2] = "1971";
        Question[70][3] = "1947";
        Question[70][4] = "1962";
        Question[70][5] = "1952";

        Question[71][0] = "Who was the first President of Bangladesh?";
        Question[71][1] = "Sheikh Mujibur Rahman";
        Question[71][2] = "Ziaur Rahman";
        Question[71][3] = "Tajuddin Ahmad";
        Question[71][4] = "Syed Nazrul Islam";
        Question[71][5] = "Sheikh Mujibur Rahman";

        Question[72][0] = "When did Bangladesh become an independent country?";
        Question[72][1] = "1971";
        Question[72][2] = "1947";
        Question[72][3] = "1965";
        Question[72][4] = "1975";
        Question[72][5] = "1971";

        Question[73][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[73][1] = "Tajuddin Ahmad";
        Question[73][2] = "Ziaur Rahman";
        Question[73][3] = "Sheikh Hasina";
        Question[73][4] = "M. A. G. Osmani";
        Question[73][5] = "Tajuddin Ahmad";

        Question[74][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[74][1] = "Operation Searchlight";
        Question[74][2] = "Operation Liberation";
        Question[74][3] = "Operation Clean Heart";
        Question[74][4] = "Operation Thunder";
        Question[74][5] = "Operation Searchlight";

        Question[75][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[75][1] = "M. A. G. Osmani";
        Question[75][2] = "Ziaur Rahman";
        Question[75][3] = "K. M. Shafiullah";
        Question[75][4] = "Shafi Imam Rumi";
        Question[75][5] = "M. A. G. Osmani";

        Question[76][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[76][1] = "1971";
        Question[76][2] = "1970";
        Question[76][3] = "1969";
        Question[76][4] = "1966";
        Question[76][5] = "1971";

        Question[77][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[77][1] = "Mujibnagar";
        Question[77][2] = "Dhaka";
        Question[77][3] = "Kolkata";
        Question[77][4] = "Chattogram";
        Question[77][5] = "Mujibnagar";

        Question[78][0] = "What significant event happened on 16 December 1971?";
        Question[78][1] = "Victory Day";
        Question[78][2] = "Language Movement";
        Question[78][3] = "Independence Declaration";
        Question[78][4] = "Constitution Day";
        Question[78][5] = "Victory Day";

        Question[79][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[79][1] = "Friendship Treaty";
        Question[79][2] = "Peace Treaty";
        Question[79][3] = "Joint Cooperation Treaty";
        Question[79][4] = "Security Treaty";
        Question[79][5] = "Friendship Treaty";

        Question[80][0] = "When did the Language Movement take place in Bangladesh?";
        Question[80][1] = "1952";
        Question[80][2] = "1971";
        Question[80][3] = "1947";
        Question[80][4] = "1962";
        Question[80][5] = "1952";

        Question[81][0] = "Who was the first President of Bangladesh?";
        Question[81][1] = "Sheikh Mujibur Rahman";
        Question[81][2] = "Ziaur Rahman";
        Question[81][3] = "Tajuddin Ahmad";
        Question[81][4] = "Syed Nazrul Islam";
        Question[81][5] = "Sheikh Mujibur Rahman";

        Question[82][0] = "When did Bangladesh become an independent country?";
        Question[82][1] = "1971";
        Question[82][2] = "1947";
        Question[82][3] = "1965";
        Question[82][4] = "1975";
        Question[82][5] = "1971";

        Question[83][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[83][1] = "Tajuddin Ahmad";
        Question[83][2] = "Ziaur Rahman";
        Question[83][3] = "Sheikh Hasina";
        Question[83][4] = "M. A. G. Osmani";
        Question[83][5] = "Tajuddin Ahmad";

        Question[84][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[84][1] = "Operation Searchlight";
        Question[84][2] = "Operation Liberation";
        Question[84][3] = "Operation Clean Heart";
        Question[84][4] = "Operation Thunder";
        Question[84][5] = "Operation Searchlight";

        Question[85][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[85][1] = "M. A. G. Osmani";
        Question[85][2] = "Ziaur Rahman";
        Question[85][3] = "K. M. Shafiullah";
        Question[85][4] = "Shafi Imam Rumi";
        Question[85][5] = "M. A. G. Osmani";

        Question[86][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[86][1] = "1971";
        Question[86][2] = "1970";
        Question[86][3] = "1969";
        Question[86][4] = "1966";
        Question[86][5] = "1971";

        Question[87][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[87][1] = "Mujibnagar";
        Question[87][2] = "Dhaka";
        Question[87][3] = "Kolkata";
        Question[87][4] = "Chattogram";
        Question[87][5] = "Mujibnagar";

        Question[88][0] = "What significant event happened on 16 December 1971?";
        Question[88][1] = "Victory Day";
        Question[88][2] = "Language Movement";
        Question[88][3] = "Independence Declaration";
        Question[88][4] = "Constitution Day";
        Question[88][5] = "Victory Day";

        Question[89][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[89][1] = "Friendship Treaty";
        Question[89][2] = "Peace Treaty";
        Question[89][3] = "Joint Cooperation Treaty";
        Question[89][4] = "Security Treaty";
        Question[89][5] = "Friendship Treaty";

        Question[90][0] = "When did the Language Movement take place in Bangladesh?";
        Question[90][1] = "1952";
        Question[90][2] = "1971";
        Question[90][3] = "1947";
        Question[90][4] = "1962";
        Question[90][5] = "1952";

        Question[91][0] = "Who was the first President of Bangladesh?";
        Question[91][1] = "Sheikh Mujibur Rahman";
        Question[91][2] = "Ziaur Rahman";
        Question[91][3] = "Tajuddin Ahmad";
        Question[91][4] = "Syed Nazrul Islam";
        Question[91][5] = "Sheikh Mujibur Rahman";

        Question[92][0] = "When did Bangladesh become an independent country?";
        Question[92][1] = "1971";
        Question[92][2] = "1947";
        Question[92][3] = "1965";
        Question[92][4] = "1975";
        Question[92][5] = "1971";

        Question[93][0] = "Who led the provisional government of Bangladesh in 1971?";
        Question[93][1] = "Tajuddin Ahmad";
        Question[93][2] = "Ziaur Rahman";
        Question[93][3] = "Sheikh Hasina";
        Question[93][4] = "M. A. G. Osmani";
        Question[93][5] = "Tajuddin Ahmad";

        Question[94][0] = "What was the operation launched by the Pakistan Army on 25 March 1971 called?";
        Question[94][1] = "Operation Searchlight";
        Question[94][2] = "Operation Liberation";
        Question[94][3] = "Operation Clean Heart";
        Question[94][4] = "Operation Thunder";
        Question[94][5] = "Operation Searchlight";

        Question[95][0] = "Who was the commander-in-chief of the Mukti Bahini?";
        Question[95][1] = "M. A. G. Osmani";
        Question[95][2] = "Ziaur Rahman";
        Question[95][3] = "K. M. Shafiullah";
        Question[95][4] = "Shafi Imam Rumi";
        Question[95][5] = "M. A. G. Osmani";

        Question[96][0] = "Which year did Sheikh Mujibur Rahman deliver the historic 7th March speech?";
        Question[96][1] = "1971";
        Question[96][2] = "1970";
        Question[96][3] = "1969";
        Question[96][4] = "1966";
        Question[96][5] = "1971";

        Question[97][0] = "Where was the provisional government of Bangladesh formed in 1971?";
        Question[97][1] = "Mujibnagar";
        Question[97][2] = "Dhaka";
        Question[97][3] = "Kolkata";
        Question[97][4] = "Chattogram";
        Question[97][5] = "Mujibnagar";

        Question[98][0] = "What significant event happened on 16 December 1971?";
        Question[98][1] = "Victory Day";
        Question[98][2] = "Language Movement";
        Question[98][3] = "Independence Declaration";
        Question[98][4] = "Constitution Day";
        Question[98][5] = "Victory Day";

        Question[99][0] = "What is the name of the treaty signed between India and Bangladesh in 1972?";
        Question[99][1] = "Friendship Treaty";
        Question[99][2] = "Peace Treaty";
        Question[99][3] = "Joint Cooperation Treaty";
        Question[99][4] = "Security Treaty";
        Question[99][5] = "Friendship Treaty";
    }
    public  static  void BanglaQuestionAdd(){
        Question[0][0] = "বাংলা ভাষার জনক কে?";
        Question[0][1] = "মাইকেল মধুসূদন দত্ত";
        Question[0][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[0][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[0][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[0][5] = "মাইকেল মধুসূদন দত্ত";

        Question[1][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[1][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[1][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[1][3] = "মাইকেল মধুসূদন দত্ত";
        Question[1][4] = "কাজী নজরুল ইসলাম";
        Question[1][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[2][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[2][1] = "জসীমউদ্দীন";
        Question[2][2] = "কাজী নজরুল ইসলাম";
        Question[2][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[2][4] = "সুকান্ত ভট্টাচার্য";
        Question[2][5] = "কাজী নজরুল ইসলাম";

        Question[3][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[3][1] = "জীবনানন্দ দাশ";
        Question[3][2] = "কাজী নজরুল ইসলাম";
        Question[3][3] = "সুকান্ত ভট্টাচার্য";
        Question[3][4] = "শামসুর রাহমান";
        Question[3][5] = "কাজী নজরুল ইসলাম";

        Question[4][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[4][1] = "শিশু";
        Question[4][2] = "নারী";
        Question[4][3] = "কৃষক";
        Question[4][4] = "বৃদ্ধ";
        Question[4][5] = "শিশু";

        Question[5][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[5][1] = "সুভাষ মুখোপাধ্যায়";
        Question[5][2] = "সুকান্ত ভট্টাচার্য";
        Question[5][3] = "জীবনানন্দ দাশ";
        Question[5][4] = "মাইকেল মধুসূদন দত্ত";
        Question[5][5] = "মাইকেল মধুসূদন দত্ত";

        Question[6][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[6][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[6][2] = "চন্দ্রাবতী";
        Question[6][3] = "নাসরিন সুলতানা";
        Question[6][4] = "নাসরিন ইসলাম";
        Question[6][5] = "চন্দ্রাবতী";

        Question[7][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[7][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[7][2] = "কাজী নজরুল ইসলাম";
        Question[7][3] = "সুকান্ত ভট্টাচার্য";
        Question[7][4] = "জসীমউদ্দীন";
        Question[7][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[8][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[8][1] = "কাজী নজরুল ইসলাম";
        Question[8][2] = "জসীমউদ্দীন";
        Question[8][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[8][4] = "সুকান্ত ভট্টাচার্য";
        Question[8][5] = "জসীমউদ্দীন";

        Question[9][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[9][1] = "আমার সোনার বাংলা";
        Question[9][2] = "বন্দে মাতরম";
        Question[9][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[9][4] = "জনগণমন";
        Question[9][5] = "বন্দে মাতরম";

        Question[10][0] = "বাংলা ভাষার জনক কে?";
        Question[10][1] = "মাইকেল মধুসূদন দত্ত";
        Question[10][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[10][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[10][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[10][5] = "মাইকেল মধুসূদন দত্ত";

        Question[11][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[11][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[11][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[11][3] = "মাইকেল মধুসূদন দত্ত";
        Question[11][4] = "কাজী নজরুল ইসলাম";
        Question[11][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[12][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[12][1] = "জসীমউদ্দীন";
        Question[12][2] = "কাজী নজরুল ইসলাম";
        Question[12][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[12][4] = "সুকান্ত ভট্টাচার্য";
        Question[12][5] = "কাজী নজরুল ইসলাম";

        Question[13][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[13][1] = "জীবনানন্দ দাশ";
        Question[13][2] = "কাজী নজরুল ইসলাম";
        Question[13][3] = "সুকান্ত ভট্টাচার্য";
        Question[13][4] = "শামসুর রাহমান";
        Question[13][5] = "কাজী নজরুল ইসলাম";

        Question[14][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[14][1] = "শিশু";
        Question[14][2] = "নারী";
        Question[14][3] = "কৃষক";
        Question[14][4] = "বৃদ্ধ";
        Question[14][5] = "শিশু";

        Question[15][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[15][1] = "সুভাষ মুখোপাধ্যায়";
        Question[15][2] = "সুকান্ত ভট্টাচার্য";
        Question[15][3] = "জীবনানন্দ দাশ";
        Question[15][4] = "মাইকেল মধুসূদন দত্ত";
        Question[15][5] = "মাইকেল মধুসূদন দত্ত";

        Question[16][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[16][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[16][2] = "চন্দ্রাবতী";
        Question[16][3] = "নাসরিন সুলতানা";
        Question[16][4] = "নাসরিন ইসলাম";
        Question[16][5] = "চন্দ্রাবতী";

        Question[17][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[17][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[17][2] = "কাজী নজরুল ইসলাম";
        Question[17][3] = "সুকান্ত ভট্টাচার্য";
        Question[17][4] = "জসীমউদ্দীন";
        Question[17][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[18][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[18][1] = "কাজী নজরুল ইসলাম";
        Question[18][2] = "জসীমউদ্দীন";
        Question[18][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[18][4] = "সুকান্ত ভট্টাচার্য";
        Question[18][5] = "জসীমউদ্দীন";

        Question[19][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[19][1] = "আমার সোনার বাংলা";
        Question[19][2] = "বন্দে মাতরম";
        Question[19][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[19][4] = "জনগণমন";
        Question[19][5] = "বন্দে মাতরম";

        Question[20][0] = "বাংলা ভাষার জনক কে?";
        Question[20][1] = "মাইকেল মধুসূদন দত্ত";
        Question[20][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[20][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[20][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[20][5] = "মাইকেল মধুসূদন দত্ত";

        Question[21][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[21][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[21][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[21][3] = "মাইকেল মধুসূদন দত্ত";
        Question[21][4] = "কাজী নজরুল ইসলাম";
        Question[21][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[22][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[22][1] = "জসীমউদ্দীন";
        Question[22][2] = "কাজী নজরুল ইসলাম";
        Question[22][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[22][4] = "সুকান্ত ভট্টাচার্য";
        Question[22][5] = "কাজী নজরুল ইসলাম";

        Question[23][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[23][1] = "জীবনানন্দ দাশ";
        Question[23][2] = "কাজী নজরুল ইসলাম";
        Question[23][3] = "সুকান্ত ভট্টাচার্য";
        Question[23][4] = "শামসুর রাহমান";
        Question[23][5] = "কাজী নজরুল ইসলাম";

        Question[24][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[24][1] = "শিশু";
        Question[24][2] = "নারী";
        Question[24][3] = "কৃষক";
        Question[24][4] = "বৃদ্ধ";
        Question[24][5] = "শিশু";

        Question[25][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[25][1] = "সুভাষ মুখোপাধ্যায়";
        Question[25][2] = "সুকান্ত ভট্টাচার্য";
        Question[25][3] = "জীবনানন্দ দাশ";
        Question[25][4] = "মাইকেল মধুসূদন দত্ত";
        Question[25][5] = "মাইকেল মধুসূদন দত্ত";

        Question[26][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[26][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[26][2] = "চন্দ্রাবতী";
        Question[26][3] = "নাসরিন সুলতানা";
        Question[26][4] = "নাসরিন ইসলাম";
        Question[26][5] = "চন্দ্রাবতী";

        Question[27][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[27][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[27][2] = "কাজী নজরুল ইসলাম";
        Question[27][3] = "সুকান্ত ভট্টাচার্য";
        Question[27][4] = "জসীমউদ্দীন";
        Question[27][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[28][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[28][1] = "কাজী নজরুল ইসলাম";
        Question[28][2] = "জসীমউদ্দীন";
        Question[28][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[28][4] = "সুকান্ত ভট্টাচার্য";
        Question[28][5] = "জসীমউদ্দীন";

        Question[29][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[29][1] = "আমার সোনার বাংলা";
        Question[29][2] = "বন্দে মাতরম";
        Question[29][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[29][4] = "জনগণমন";
        Question[29][5] = "বন্দে মাতরম";

        Question[30][0] = "বাংলা ভাষার জনক কে?";
        Question[30][1] = "মাইকেল মধুসূদন দত্ত";
        Question[30][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[30][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[30][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[30][5] = "মাইকেল মধুসূদন দত্ত";

        Question[31][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[31][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[31][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[31][3] = "মাইকেল মধুসূদন দত্ত";
        Question[31][4] = "কাজী নজরুল ইসলাম";
        Question[31][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[32][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[32][1] = "জসীমউদ্দীন";
        Question[32][2] = "কাজী নজরুল ইসলাম";
        Question[32][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[32][4] = "সুকান্ত ভট্টাচার্য";
        Question[32][5] = "কাজী নজরুল ইসলাম";

        Question[33][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[33][1] = "জীবনানন্দ দাশ";
        Question[33][2] = "কাজী নজরুল ইসলাম";
        Question[33][3] = "সুকান্ত ভট্টাচার্য";
        Question[33][4] = "শামসুর রাহমান";
        Question[33][5] = "কাজী নজরুল ইসলাম";

        Question[34][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[34][1] = "শিশু";
        Question[34][2] = "নারী";
        Question[34][3] = "কৃষক";
        Question[34][4] = "বৃদ্ধ";
        Question[34][5] = "শিশু";

        Question[35][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[35][1] = "সুভাষ মুখোপাধ্যায়";
        Question[35][2] = "সুকান্ত ভট্টাচার্য";
        Question[35][3] = "জীবনানন্দ দাশ";
        Question[35][4] = "মাইকেল মধুসূদন দত্ত";
        Question[35][5] = "মাইকেল মধুসূদন দত্ত";

        Question[36][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[36][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[36][2] = "চন্দ্রাবতী";
        Question[36][3] = "নাসরিন সুলতানা";
        Question[36][4] = "নাসরিন ইসলাম";
        Question[36][5] = "চন্দ্রাবতী";

        Question[37][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[37][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[37][2] = "কাজী নজরুল ইসলাম";
        Question[37][3] = "সুকান্ত ভট্টাচার্য";
        Question[37][4] = "জসীমউদ্দীন";
        Question[37][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[38][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[38][1] = "কাজী নজরুল ইসলাম";
        Question[38][2] = "জসীমউদ্দীন";
        Question[38][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[38][4] = "সুকান্ত ভট্টাচার্য";
        Question[38][5] = "জসীমউদ্দীন";

        Question[39][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[39][1] = "আমার সোনার বাংলা";
        Question[39][2] = "বন্দে মাতরম";
        Question[39][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[39][4] = "জনগণমন";
        Question[39][5] = "বন্দে মাতরম";

        Question[40][0] = "বাংলা ভাষার জনক কে?";
        Question[40][1] = "মাইকেল মধুসূদন দত্ত";
        Question[40][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[40][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[40][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[40][5] = "মাইকেল মধুসূদন দত্ত";

        Question[41][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[41][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[41][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[41][3] = "মাইকেল মধুসূদন দত্ত";
        Question[41][4] = "কাজী নজরুল ইসলাম";
        Question[41][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[42][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[42][1] = "জসীমউদ্দীন";
        Question[42][2] = "কাজী নজরুল ইসলাম";
        Question[42][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[42][4] = "সুকান্ত ভট্টাচার্য";
        Question[42][5] = "কাজী নজরুল ইসলাম";

        Question[43][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[43][1] = "জীবনানন্দ দাশ";
        Question[43][2] = "কাজী নজরুল ইসলাম";
        Question[43][3] = "সুকান্ত ভট্টাচার্য";
        Question[43][4] = "শামসুর রাহমান";
        Question[43][5] = "কাজী নজরুল ইসলাম";

        Question[44][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[44][1] = "শিশু";
        Question[44][2] = "নারী";
        Question[44][3] = "কৃষক";
        Question[44][4] = "বৃদ্ধ";
        Question[44][5] = "শিশু";

        Question[45][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[45][1] = "সুভাষ মুখোপাধ্যায়";
        Question[45][2] = "সুকান্ত ভট্টাচার্য";
        Question[45][3] = "জীবনানন্দ দাশ";
        Question[45][4] = "মাইকেল মধুসূদন দত্ত";
        Question[45][5] = "মাইকেল মধুসূদন দত্ত";

        Question[46][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[46][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[46][2] = "চন্দ্রাবতী";
        Question[46][3] = "নাসরিন সুলতানা";
        Question[46][4] = "নাসরিন ইসলাম";
        Question[46][5] = "চন্দ্রাবতী";

        Question[47][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[47][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[47][2] = "কাজী নজরুল ইসলাম";
        Question[47][3] = "সুকান্ত ভট্টাচার্য";
        Question[47][4] = "জসীমউদ্দীন";
        Question[47][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[48][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[48][1] = "কাজী নজরুল ইসলাম";
        Question[48][2] = "জসীমউদ্দীন";
        Question[48][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[48][4] = "সুকান্ত ভট্টাচার্য";
        Question[48][5] = "জসীমউদ্দীন";

        Question[49][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[49][1] = "আমার সোনার বাংলা";
        Question[49][2] = "বন্দে মাতরম";
        Question[49][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[49][4] = "জনগণমন";
        Question[49][5] = "বন্দে মাতরম";

        Question[50][0] = "বাংলা ভাষার জনক কে?";
        Question[50][1] = "মাইকেল মধুসূদন দত্ত";
        Question[50][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[50][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[50][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[50][5] = "মাইকেল মধুসূদন দত্ত";

        Question[51][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[51][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[51][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[51][3] = "মাইকেল মধুসূদন দত্ত";
        Question[51][4] = "কাজী নজরুল ইসলাম";
        Question[51][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[52][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[52][1] = "জসীমউদ্দীন";
        Question[52][2] = "কাজী নজরুল ইসলাম";
        Question[52][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[52][4] = "সুকান্ত ভট্টাচার্য";
        Question[52][5] = "কাজী নজরুল ইসলাম";

        Question[53][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[53][1] = "জীবনানন্দ দাশ";
        Question[53][2] = "কাজী নজরুল ইসলাম";
        Question[53][3] = "সুকান্ত ভট্টাচার্য";
        Question[53][4] = "শামসুর রাহমান";
        Question[53][5] = "কাজী নজরুল ইসলাম";

        Question[54][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[54][1] = "শিশু";
        Question[54][2] = "নারী";
        Question[54][3] = "কৃষক";
        Question[54][4] = "বৃদ্ধ";
        Question[54][5] = "শিশু";

        Question[55][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[55][1] = "সুভাষ মুখোপাধ্যায়";
        Question[55][2] = "সুকান্ত ভট্টাচার্য";
        Question[55][3] = "জীবনানন্দ দাশ";
        Question[55][4] = "মাইকেল মধুসূদন দত্ত";
        Question[55][5] = "মাইকেল মধুসূদন দত্ত";

        Question[56][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[56][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[56][2] = "চন্দ্রাবতী";
        Question[56][3] = "নাসরিন সুলতানা";
        Question[56][4] = "নাসরিন ইসলাম";
        Question[56][5] = "চন্দ্রাবতী";

        Question[57][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[57][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[57][2] = "কাজী নজরুল ইসলাম";
        Question[57][3] = "সুকান্ত ভট্টাচার্য";
        Question[57][4] = "জসীমউদ্দীন";
        Question[57][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[58][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[58][1] = "কাজী নজরুল ইসলাম";
        Question[58][2] = "জসীমউদ্দীন";
        Question[58][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[58][4] = "সুকান্ত ভট্টাচার্য";
        Question[58][5] = "জসীমউদ্দীন";

        Question[59][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[59][1] = "আমার সোনার বাংলা";
        Question[59][2] = "বন্দে মাতরম";
        Question[59][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[59][4] = "জনগণমন";
        Question[59][5] = "বন্দে মাতরম";

        Question[60][0] = "বাংলা ভাষার জনক কে?";
        Question[60][1] = "মাইকেল মধুসূদন দত্ত";
        Question[60][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[60][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[60][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[60][5] = "মাইকেল মধুসূদন দত্ত";

        Question[61][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[61][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[61][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[61][3] = "মাইকেল মধুসূদন দত্ত";
        Question[61][4] = "কাজী নজরুল ইসলাম";
        Question[61][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[62][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[62][1] = "জসীমউদ্দীন";
        Question[62][2] = "কাজী নজরুল ইসলাম";
        Question[62][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[62][4] = "সুকান্ত ভট্টাচার্য";
        Question[62][5] = "কাজী নজরুল ইসলাম";

        Question[63][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[63][1] = "জীবনানন্দ দাশ";
        Question[63][2] = "কাজী নজরুল ইসলাম";
        Question[63][3] = "সুকান্ত ভট্টাচার্য";
        Question[63][4] = "শামসুর রাহমান";
        Question[63][5] = "কাজী নজরুল ইসলাম";

        Question[64][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[64][1] = "শিশু";
        Question[64][2] = "নারী";
        Question[64][3] = "কৃষক";
        Question[64][4] = "বৃদ্ধ";
        Question[64][5] = "শিশু";

        Question[65][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[65][1] = "সুভাষ মুখোপাধ্যায়";
        Question[65][2] = "সুকান্ত ভট্টাচার্য";
        Question[65][3] = "জীবনানন্দ দাশ";
        Question[65][4] = "মাইকেল মধুসূদন দত্ত";
        Question[65][5] = "মাইকেল মধুসূদন দত্ত";

        Question[66][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[66][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[66][2] = "চন্দ্রাবতী";
        Question[66][3] = "নাসরিন সুলতানা";
        Question[66][4] = "নাসরিন ইসলাম";
        Question[66][5] = "চন্দ্রাবতী";

        Question[67][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[67][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[67][2] = "কাজী নজরুল ইসলাম";
        Question[67][3] = "সুকান্ত ভট্টাচার্য";
        Question[67][4] = "জসীমউদ্দীন";
        Question[67][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[68][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[68][1] = "কাজী নজরুল ইসলাম";
        Question[68][2] = "জসীমউদ্দীন";
        Question[68][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[68][4] = "সুকান্ত ভট্টাচার্য";
        Question[68][5] = "জসীমউদ্দীন";

        Question[69][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[69][1] = "আমার সোনার বাংলা";
        Question[69][2] = "বন্দে মাতরম";
        Question[69][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[69][4] = "জনগণমন";
        Question[69][5] = "বন্দে মাতরম";

        Question[70][0] = "বাংলা ভাষার জনক কে?";
        Question[70][1] = "মাইকেল মধুসূদন দত্ত";
        Question[70][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[70][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[70][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[70][5] = "মাইকেল মধুসূদন দত্ত";

        Question[71][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[71][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[71][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[71][3] = "মাইকেল মধুসূদন দত্ত";
        Question[71][4] = "কাজী নজরুল ইসলাম";
        Question[71][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[72][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[72][1] = "জসীমউদ্দীন";
        Question[72][2] = "কাজী নজরুল ইসলাম";
        Question[72][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[72][4] = "সুকান্ত ভট্টাচার্য";
        Question[72][5] = "কাজী নজরুল ইসলাম";

        Question[73][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[73][1] = "জীবনানন্দ দাশ";
        Question[73][2] = "কাজী নজরুল ইসলাম";
        Question[73][3] = "সুকান্ত ভট্টাচার্য";
        Question[73][4] = "শামসুর রাহমান";
        Question[73][5] = "কাজী নজরুল ইসলাম";

        Question[74][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[74][1] = "শিশু";
        Question[74][2] = "নারী";
        Question[74][3] = "কৃষক";
        Question[74][4] = "বৃদ্ধ";
        Question[74][5] = "শিশু";

        Question[75][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[75][1] = "সুভাষ মুখোপাধ্যায়";
        Question[75][2] = "সুকান্ত ভট্টাচার্য";
        Question[75][3] = "জীবনানন্দ দাশ";
        Question[75][4] = "মাইকেল মধুসূদন দত্ত";
        Question[75][5] = "মাইকেল মধুসূদন দত্ত";

        Question[76][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[76][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[76][2] = "চন্দ্রাবতী";
        Question[76][3] = "নাসরিন সুলতানা";
        Question[76][4] = "নাসরিন ইসলাম";
        Question[76][5] = "চন্দ্রাবতী";

        Question[77][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[77][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[77][2] = "কাজী নজরুল ইসলাম";
        Question[77][3] = "সুকান্ত ভট্টাচার্য";
        Question[77][4] = "জসীমউদ্দীন";
        Question[77][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[78][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[78][1] = "কাজী নজরুল ইসলাম";
        Question[78][2] = "জসীমউদ্দীন";
        Question[78][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[78][4] = "সুকান্ত ভট্টাচার্য";
        Question[78][5] = "জসীমউদ্দীন";

        Question[79][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[79][1] = "আমার সোনার বাংলা";
        Question[79][2] = "বন্দে মাতরম";
        Question[79][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[79][4] = "জনগণমন";
        Question[79][5] = "বন্দে মাতরম";

        Question[80][0] = "বাংলা ভাষার জনক কে?";
        Question[80][1] = "মাইকেল মধুসূদন দত্ত";
        Question[80][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[80][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[80][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[80][5] = "মাইকেল মধুসূদন দত্ত";

        Question[81][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[81][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[81][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[81][3] = "মাইকেল মধুসূদন দত্ত";
        Question[81][4] = "কাজী নজরুল ইসলাম";
        Question[81][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[82][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[82][1] = "জসীমউদ্দীন";
        Question[82][2] = "কাজী নজরুল ইসলাম";
        Question[82][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[82][4] = "সুকান্ত ভট্টাচার্য";
        Question[82][5] = "কাজী নজরুল ইসলাম";

        Question[83][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[83][1] = "জীবনানন্দ দাশ";
        Question[83][2] = "কাজী নজরুল ইসলাম";
        Question[83][3] = "সুকান্ত ভট্টাচার্য";
        Question[83][4] = "শামসুর রাহমান";
        Question[83][5] = "কাজী নজরুল ইসলাম";

        Question[84][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[84][1] = "শিশু";
        Question[84][2] = "নারী";
        Question[84][3] = "কৃষক";
        Question[84][4] = "বৃদ্ধ";
        Question[84][5] = "শিশু";

        Question[85][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[85][1] = "সুভাষ মুখোপাধ্যায়";
        Question[85][2] = "সুকান্ত ভট্টাচার্য";
        Question[85][3] = "জীবনানন্দ দাশ";
        Question[85][4] = "মাইকেল মধুসূদন দত্ত";
        Question[85][5] = "মাইকেল মধুসূদন দত্ত";

        Question[86][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[86][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[86][2] = "চন্দ্রাবতী";
        Question[86][3] = "নাসরিন সুলতানা";
        Question[86][4] = "নাসরিন ইসলাম";
        Question[86][5] = "চন্দ্রাবতী";

        Question[87][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[87][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[87][2] = "কাজী নজরুল ইসলাম";
        Question[87][3] = "সুকান্ত ভট্টাচার্য";
        Question[87][4] = "জসীমউদ্দীন";
        Question[87][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[88][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[88][1] = "কাজী নজরুল ইসলাম";
        Question[88][2] = "জসীমউদ্দীন";
        Question[88][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[88][4] = "সুকান্ত ভট্টাচার্য";
        Question[88][5] = "জসীমউদ্দীন";

        Question[89][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[89][1] = "আমার সোনার বাংলা";
        Question[89][2] = "বন্দে মাতরম";
        Question[89][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[89][4] = "জনগণমন";
        Question[89][5] = "বন্দে মাতরম";

        Question[90][0] = "বাংলা ভাষার জনক কে?";
        Question[90][1] = "মাইকেল মধুসূদন দত্ত";
        Question[90][2] = "ইশ্বরচন্দ্র বিদ্যাসাগর";
        Question[90][3] = "ঈশ্বরচন্দ্র গপ্ত";
        Question[90][4] = "বাক্যে নির্দিষ্ট কেউ নেই";
        Question[90][5] = "মাইকেল মধুসূদন দত্ত";

        Question[91][0] = "'কপালকুণ্ডলা' উপন্যাসটি কে রচনা করেন?";
        Question[91][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[91][2] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";
        Question[91][3] = "মাইকেল মধুসূদন দত্ত";
        Question[91][4] = "কাজী নজরুল ইসলাম";
        Question[91][5] = "বঙ্কিমচন্দ্র চট্টোপাধ্যায়";

        Question[92][0] = "বাংলা সাহিত্যে ‘বিদ্রোহী কবি’ নামে পরিচিত কে?";
        Question[92][1] = "জসীমউদ্দীন";
        Question[92][2] = "কাজী নজরুল ইসলাম";
        Question[92][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[92][4] = "সুকান্ত ভট্টাচার্য";
        Question[92][5] = "কাজী নজরুল ইসলাম";

        Question[93][0] = "‘অগ্নিবীণা’ কোন কবির কাব্যগ্রন্থ?";
        Question[93][1] = "জীবনানন্দ দাশ";
        Question[93][2] = "কাজী নজরুল ইসলাম";
        Question[93][3] = "সুকান্ত ভট্টাচার্য";
        Question[93][4] = "শামসুর রাহমান";
        Question[93][5] = "কাজী নজরুল ইসলাম";

        Question[94][0] = "'ছোটদের রবীন্দ্রনাথ' গ্রন্থটি কাদের জন্য উপযোগী?";
        Question[94][1] = "শিশু";
        Question[94][2] = "নারী";
        Question[94][3] = "কৃষক";
        Question[94][4] = "বৃদ্ধ";
        Question[94][5] = "শিশু";

        Question[95][0] = "‘নির্বাসিতা’ কবিতার রচয়িতা কে?";
        Question[95][1] = "সুভাষ মুখোপাধ্যায়";
        Question[95][2] = "সুকান্ত ভট্টাচার্য";
        Question[95][3] = "জীবনানন্দ দাশ";
        Question[95][4] = "মাইকেল মধুসূদন দত্ত";
        Question[95][5] = "মাইকেল মধুসূদন দত্ত";

        Question[96][0] = "বাংলা সাহিত্যের প্রথম নারী কবি কে?";
        Question[96][1] = "রোকেয়া সাখাওয়াত হোসেন";
        Question[96][2] = "চন্দ্রাবতী";
        Question[96][3] = "নাসরিন সুলতানা";
        Question[96][4] = "নাসরিন ইসলাম";
        Question[96][5] = "চন্দ্রাবতী";

        Question[97][0] = "'সোনার তরী' কার কাব্যগ্রন্থ?";
        Question[97][1] = "রবীন্দ্রনাথ ঠাকুর";
        Question[97][2] = "কাজী নজরুল ইসলাম";
        Question[97][3] = "সুকান্ত ভট্টাচার্য";
        Question[97][4] = "জসীমউদ্দীন";
        Question[97][5] = "রবীন্দ্রনাথ ঠাকুর";

        Question[98][0] = "'পল্লীকবি' উপাধিটি কে পেয়েছেন?";
        Question[98][1] = "কাজী নজরুল ইসলাম";
        Question[98][2] = "জসীমউদ্দীন";
        Question[98][3] = "রবীন্দ্রনাথ ঠাকুর";
        Question[98][4] = "সুকান্ত ভট্টাচার্য";
        Question[98][5] = "জসীমউদ্দীন";

        Question[99][0] = "'আনন্দমঠ' উপন্যাসে কোন বিখ্যাত দেশাত্মবোধক গানটি আছে?";
        Question[99][1] = "আমার সোনার বাংলা";
        Question[99][2] = "বন্দে মাতরম";
        Question[99][3] = "ধনধান্যে পুষ্পে ভরা";
        Question[99][4] = "জনগণমন";
        Question[99][5] = "বন্দে মাতরম";


    }
    public  static  void SportsQuestionAdd(){

        Question[0][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[0][1] = "Milkha Singh";
        Question[0][2] = "P. T. Usha";
        Question[0][3] = "Usain Bolt";
        Question[0][4] = "Abhinav Bindra";
        Question[0][5] = "Milkha Singh";

        Question[1][0] = "Which country has won the most FIFA World Cups?";
        Question[1][1] = "Germany";
        Question[1][2] = "Argentina";
        Question[1][3] = "Italy";
        Question[1][4] = "Brazil";
        Question[1][5] = "Brazil";

        Question[2][0] = "Which sport is associated with Wimbledon?";
        Question[2][1] = "Football";
        Question[2][2] = "Cricket";
        Question[2][3] = "Tennis";
        Question[2][4] = "Hockey";
        Question[2][5] = "Tennis";

        Question[3][0] = "In cricket, how many players are there in each team?";
        Question[3][1] = "9";
        Question[3][2] = "10";
        Question[3][3] = "11";
        Question[3][4] = "12";
        Question[3][5] = "11";

        Question[4][0] = "Who won the Ballon d'Or in 2023?";
        Question[4][1] = "Lionel Messi";
        Question[4][2] = "Cristiano Ronaldo";
        Question[4][3] = "Kylian Mbappe";
        Question[4][4] = "Erling Haaland";
        Question[4][5] = "Lionel Messi";

        Question[5][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[5][1] = "Russia";
        Question[5][2] = "Qatar";
        Question[5][3] = "Brazil";
        Question[5][4] = "France";
        Question[5][5] = "Qatar";

        Question[6][0] = "The Olympic Games are held every how many years?";
        Question[6][1] = "2";
        Question[6][2] = "3";
        Question[6][3] = "4";
        Question[6][4] = "5";
        Question[6][5] = "4";

        Question[7][0] = "How many rings are there in the Olympic symbol?";
        Question[7][1] = "3";
        Question[7][2] = "4";
        Question[7][3] = "5";
        Question[7][4] = "6";
        Question[7][5] = "5";

        Question[8][0] = "Who is the fastest man in the world?";
        Question[8][1] = "Tyson Gay";
        Question[8][2] = "Yohan Blake";
        Question[8][3] = "Usain Bolt";
        Question[8][4] = "Justin Gatlin";
        Question[8][5] = "Usain Bolt";

        Question[9][0] = "Which sport uses the term 'home run'?";
        Question[9][1] = "Basketball";
        Question[9][2] = "Cricket";
        Question[9][3] = "Baseball";
        Question[9][4] = "Football";
        Question[9][5] = "Baseball";

        Question[10][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[10][1] = "Milkha Singh";
        Question[10][2] = "P. T. Usha";
        Question[10][3] = "Usain Bolt";
        Question[10][4] = "Abhinav Bindra";
        Question[10][5] = "Milkha Singh";

        Question[11][0] = "Which country has won the most FIFA World Cups?";
        Question[11][1] = "Germany";
        Question[11][2] = "Argentina";
        Question[11][3] = "Italy";
        Question[11][4] = "Brazil";
        Question[11][5] = "Brazil";

        Question[12][0] = "Which sport is associated with Wimbledon?";
        Question[12][1] = "Football";
        Question[12][2] = "Cricket";
        Question[12][3] = "Tennis";
        Question[12][4] = "Hockey";
        Question[12][5] = "Tennis";

        Question[13][0] = "In cricket, how many players are there in each team?";
        Question[13][1] = "9";
        Question[13][2] = "10";
        Question[13][3] = "11";
        Question[13][4] = "12";
        Question[13][5] = "11";

        Question[14][0] = "Who won the Ballon d'Or in 2023?";
        Question[14][1] = "Lionel Messi";
        Question[14][2] = "Cristiano Ronaldo";
        Question[14][3] = "Kylian Mbappe";
        Question[14][4] = "Erling Haaland";
        Question[14][5] = "Lionel Messi";

        Question[15][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[15][1] = "Russia";
        Question[15][2] = "Qatar";
        Question[15][3] = "Brazil";
        Question[15][4] = "France";
        Question[15][5] = "Qatar";

        Question[16][0] = "The Olympic Games are held every how many years?";
        Question[16][1] = "2";
        Question[16][2] = "3";
        Question[16][3] = "4";
        Question[16][4] = "5";
        Question[16][5] = "4";

        Question[17][0] = "How many rings are there in the Olympic symbol?";
        Question[17][1] = "3";
        Question[17][2] = "4";
        Question[17][3] = "5";
        Question[17][4] = "6";
        Question[17][5] = "5";

        Question[18][0] = "Who is the fastest man in the world?";
        Question[18][1] = "Tyson Gay";
        Question[18][2] = "Yohan Blake";
        Question[18][3] = "Usain Bolt";
        Question[18][4] = "Justin Gatlin";
        Question[18][5] = "Usain Bolt";

        Question[19][0] = "Which sport uses the term 'home run'?";
        Question[19][1] = "Basketball";
        Question[19][2] = "Cricket";
        Question[19][3] = "Baseball";
        Question[19][4] = "Football";
        Question[19][5] = "Baseball";

        Question[20][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[20][1] = "Milkha Singh";
        Question[20][2] = "P. T. Usha";
        Question[20][3] = "Usain Bolt";
        Question[20][4] = "Abhinav Bindra";
        Question[20][5] = "Milkha Singh";

        Question[21][0] = "Which country has won the most FIFA World Cups?";
        Question[21][1] = "Germany";
        Question[21][2] = "Argentina";
        Question[21][3] = "Italy";
        Question[21][4] = "Brazil";
        Question[21][5] = "Brazil";

        Question[22][0] = "Which sport is associated with Wimbledon?";
        Question[22][1] = "Football";
        Question[22][2] = "Cricket";
        Question[22][3] = "Tennis";
        Question[22][4] = "Hockey";
        Question[22][5] = "Tennis";

        Question[23][0] = "In cricket, how many players are there in each team?";
        Question[23][1] = "9";
        Question[23][2] = "10";
        Question[23][3] = "11";
        Question[23][4] = "12";
        Question[23][5] = "11";

        Question[24][0] = "Who won the Ballon d'Or in 2023?";
        Question[24][1] = "Lionel Messi";
        Question[24][2] = "Cristiano Ronaldo";
        Question[24][3] = "Kylian Mbappe";
        Question[24][4] = "Erling Haaland";
        Question[24][5] = "Lionel Messi";

        Question[25][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[25][1] = "Russia";
        Question[25][2] = "Qatar";
        Question[25][3] = "Brazil";
        Question[25][4] = "France";
        Question[25][5] = "Qatar";

        Question[26][0] = "The Olympic Games are held every how many years?";
        Question[26][1] = "2";
        Question[26][2] = "3";
        Question[26][3] = "4";
        Question[26][4] = "5";
        Question[26][5] = "4";

        Question[27][0] = "How many rings are there in the Olympic symbol?";
        Question[27][1] = "3";
        Question[27][2] = "4";
        Question[27][3] = "5";
        Question[27][4] = "6";
        Question[27][5] = "5";

        Question[28][0] = "Who is the fastest man in the world?";
        Question[28][1] = "Tyson Gay";
        Question[28][2] = "Yohan Blake";
        Question[28][3] = "Usain Bolt";
        Question[28][4] = "Justin Gatlin";
        Question[28][5] = "Usain Bolt";

        Question[29][0] = "Which sport uses the term 'home run'?";
        Question[29][1] = "Basketball";
        Question[29][2] = "Cricket";
        Question[29][3] = "Baseball";
        Question[29][4] = "Football";
        Question[29][5] = "Baseball";

        Question[30][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[30][1] = "Milkha Singh";
        Question[30][2] = "P. T. Usha";
        Question[30][3] = "Usain Bolt";
        Question[30][4] = "Abhinav Bindra";
        Question[30][5] = "Milkha Singh";

        Question[31][0] = "Which country has won the most FIFA World Cups?";
        Question[31][1] = "Germany";
        Question[31][2] = "Argentina";
        Question[31][3] = "Italy";
        Question[31][4] = "Brazil";
        Question[31][5] = "Brazil";

        Question[32][0] = "Which sport is associated with Wimbledon?";
        Question[32][1] = "Football";
        Question[32][2] = "Cricket";
        Question[32][3] = "Tennis";
        Question[32][4] = "Hockey";
        Question[32][5] = "Tennis";

        Question[33][0] = "In cricket, how many players are there in each team?";
        Question[33][1] = "9";
        Question[33][2] = "10";
        Question[33][3] = "11";
        Question[33][4] = "12";
        Question[33][5] = "11";

        Question[34][0] = "Who won the Ballon d'Or in 2023?";
        Question[34][1] = "Lionel Messi";
        Question[34][2] = "Cristiano Ronaldo";
        Question[34][3] = "Kylian Mbappe";
        Question[34][4] = "Erling Haaland";
        Question[34][5] = "Lionel Messi";

        Question[35][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[35][1] = "Russia";
        Question[35][2] = "Qatar";
        Question[35][3] = "Brazil";
        Question[35][4] = "France";
        Question[35][5] = "Qatar";

        Question[36][0] = "The Olympic Games are held every how many years?";
        Question[36][1] = "2";
        Question[36][2] = "3";
        Question[36][3] = "4";
        Question[36][4] = "5";
        Question[36][5] = "4";

        Question[37][0] = "How many rings are there in the Olympic symbol?";
        Question[37][1] = "3";
        Question[37][2] = "4";
        Question[37][3] = "5";
        Question[37][4] = "6";
        Question[37][5] = "5";

        Question[38][0] = "Who is the fastest man in the world?";
        Question[38][1] = "Tyson Gay";
        Question[38][2] = "Yohan Blake";
        Question[38][3] = "Usain Bolt";
        Question[38][4] = "Justin Gatlin";
        Question[38][5] = "Usain Bolt";

        Question[39][0] = "Which sport uses the term 'home run'?";
        Question[39][1] = "Basketball";
        Question[39][2] = "Cricket";
        Question[39][3] = "Baseball";
        Question[39][4] = "Football";
        Question[39][5] = "Baseball";

        Question[40][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[40][1] = "Milkha Singh";
        Question[40][2] = "P. T. Usha";
        Question[40][3] = "Usain Bolt";
        Question[40][4] = "Abhinav Bindra";
        Question[40][5] = "Milkha Singh";

        Question[41][0] = "Which country has won the most FIFA World Cups?";
        Question[41][1] = "Germany";
        Question[41][2] = "Argentina";
        Question[41][3] = "Italy";
        Question[41][4] = "Brazil";
        Question[41][5] = "Brazil";

        Question[42][0] = "Which sport is associated with Wimbledon?";
        Question[42][1] = "Football";
        Question[42][2] = "Cricket";
        Question[42][3] = "Tennis";
        Question[42][4] = "Hockey";
        Question[42][5] = "Tennis";

        Question[43][0] = "In cricket, how many players are there in each team?";
        Question[43][1] = "9";
        Question[43][2] = "10";
        Question[43][3] = "11";
        Question[43][4] = "12";
        Question[43][5] = "11";

        Question[44][0] = "Who won the Ballon d'Or in 2023?";
        Question[44][1] = "Lionel Messi";
        Question[44][2] = "Cristiano Ronaldo";
        Question[44][3] = "Kylian Mbappe";
        Question[44][4] = "Erling Haaland";
        Question[44][5] = "Lionel Messi";

        Question[45][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[45][1] = "Russia";
        Question[45][2] = "Qatar";
        Question[45][3] = "Brazil";
        Question[45][4] = "France";
        Question[45][5] = "Qatar";

        Question[46][0] = "The Olympic Games are held every how many years?";
        Question[46][1] = "2";
        Question[46][2] = "3";
        Question[46][3] = "4";
        Question[46][4] = "5";
        Question[46][5] = "4";

        Question[47][0] = "How many rings are there in the Olympic symbol?";
        Question[47][1] = "3";
        Question[47][2] = "4";
        Question[47][3] = "5";
        Question[47][4] = "6";
        Question[47][5] = "5";

        Question[48][0] = "Who is the fastest man in the world?";
        Question[48][1] = "Tyson Gay";
        Question[48][2] = "Yohan Blake";
        Question[48][3] = "Usain Bolt";
        Question[48][4] = "Justin Gatlin";
        Question[48][5] = "Usain Bolt";

        Question[49][0] = "Which sport uses the term 'home run'?";
        Question[49][1] = "Basketball";
        Question[49][2] = "Cricket";
        Question[49][3] = "Baseball";
        Question[49][4] = "Football";
        Question[49][5] = "Baseball";

        Question[50][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[50][1] = "Milkha Singh";
        Question[50][2] = "P. T. Usha";
        Question[50][3] = "Usain Bolt";
        Question[50][4] = "Abhinav Bindra";
        Question[50][5] = "Milkha Singh";

        Question[51][0] = "Which country has won the most FIFA World Cups?";
        Question[51][1] = "Germany";
        Question[51][2] = "Argentina";
        Question[51][3] = "Italy";
        Question[51][4] = "Brazil";
        Question[51][5] = "Brazil";

        Question[52][0] = "Which sport is associated with Wimbledon?";
        Question[52][1] = "Football";
        Question[52][2] = "Cricket";
        Question[52][3] = "Tennis";
        Question[52][4] = "Hockey";
        Question[52][5] = "Tennis";

        Question[53][0] = "In cricket, how many players are there in each team?";
        Question[53][1] = "9";
        Question[53][2] = "10";
        Question[53][3] = "11";
        Question[53][4] = "12";
        Question[53][5] = "11";

        Question[54][0] = "Who won the Ballon d'Or in 2023?";
        Question[54][1] = "Lionel Messi";
        Question[54][2] = "Cristiano Ronaldo";
        Question[54][3] = "Kylian Mbappe";
        Question[54][4] = "Erling Haaland";
        Question[54][5] = "Lionel Messi";

        Question[55][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[55][1] = "Russia";
        Question[55][2] = "Qatar";
        Question[55][3] = "Brazil";
        Question[55][4] = "France";
        Question[55][5] = "Qatar";

        Question[56][0] = "The Olympic Games are held every how many years?";
        Question[56][1] = "2";
        Question[56][2] = "3";
        Question[56][3] = "4";
        Question[56][4] = "5";
        Question[56][5] = "4";

        Question[57][0] = "How many rings are there in the Olympic symbol?";
        Question[57][1] = "3";
        Question[57][2] = "4";
        Question[57][3] = "5";
        Question[57][4] = "6";
        Question[57][5] = "5";

        Question[58][0] = "Who is the fastest man in the world?";
        Question[58][1] = "Tyson Gay";
        Question[58][2] = "Yohan Blake";
        Question[58][3] = "Usain Bolt";
        Question[58][4] = "Justin Gatlin";
        Question[58][5] = "Usain Bolt";

        Question[59][0] = "Which sport uses the term 'home run'?";
        Question[59][1] = "Basketball";
        Question[59][2] = "Cricket";
        Question[59][3] = "Baseball";
        Question[59][4] = "Football";
        Question[59][5] = "Baseball";

        Question[60][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[60][1] = "Milkha Singh";
        Question[60][2] = "P. T. Usha";
        Question[60][3] = "Usain Bolt";
        Question[60][4] = "Abhinav Bindra";
        Question[60][5] = "Milkha Singh";

        Question[61][0] = "Which country has won the most FIFA World Cups?";
        Question[61][1] = "Germany";
        Question[61][2] = "Argentina";
        Question[61][3] = "Italy";
        Question[61][4] = "Brazil";
        Question[61][5] = "Brazil";

        Question[62][0] = "Which sport is associated with Wimbledon?";
        Question[62][1] = "Football";
        Question[62][2] = "Cricket";
        Question[62][3] = "Tennis";
        Question[62][4] = "Hockey";
        Question[62][5] = "Tennis";

        Question[63][0] = "In cricket, how many players are there in each team?";
        Question[63][1] = "9";
        Question[63][2] = "10";
        Question[63][3] = "11";
        Question[63][4] = "12";
        Question[63][5] = "11";

        Question[64][0] = "Who won the Ballon d'Or in 2023?";
        Question[64][1] = "Lionel Messi";
        Question[64][2] = "Cristiano Ronaldo";
        Question[64][3] = "Kylian Mbappe";
        Question[64][4] = "Erling Haaland";
        Question[64][5] = "Lionel Messi";

        Question[65][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[65][1] = "Russia";
        Question[65][2] = "Qatar";
        Question[65][3] = "Brazil";
        Question[65][4] = "France";
        Question[65][5] = "Qatar";

        Question[66][0] = "The Olympic Games are held every how many years?";
        Question[66][1] = "2";
        Question[66][2] = "3";
        Question[66][3] = "4";
        Question[66][4] = "5";
        Question[66][5] = "4";

        Question[67][0] = "How many rings are there in the Olympic symbol?";
        Question[67][1] = "3";
        Question[67][2] = "4";
        Question[67][3] = "5";
        Question[67][4] = "6";
        Question[67][5] = "5";

        Question[68][0] = "Who is the fastest man in the world?";
        Question[68][1] = "Tyson Gay";
        Question[68][2] = "Yohan Blake";
        Question[68][3] = "Usain Bolt";
        Question[68][4] = "Justin Gatlin";
        Question[68][5] = "Usain Bolt";

        Question[69][0] = "Which sport uses the term 'home run'?";
        Question[69][1] = "Basketball";
        Question[69][2] = "Cricket";
        Question[69][3] = "Baseball";
        Question[69][4] = "Football";
        Question[69][5] = "Baseball";

        Question[70][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[70][1] = "Milkha Singh";
        Question[70][2] = "P. T. Usha";
        Question[70][3] = "Usain Bolt";
        Question[70][4] = "Abhinav Bindra";
        Question[70][5] = "Milkha Singh";

        Question[71][0] = "Which country has won the most FIFA World Cups?";
        Question[71][1] = "Germany";
        Question[71][2] = "Argentina";
        Question[71][3] = "Italy";
        Question[71][4] = "Brazil";
        Question[71][5] = "Brazil";

        Question[72][0] = "Which sport is associated with Wimbledon?";
        Question[72][1] = "Football";
        Question[72][2] = "Cricket";
        Question[72][3] = "Tennis";
        Question[72][4] = "Hockey";
        Question[72][5] = "Tennis";

        Question[73][0] = "In cricket, how many players are there in each team?";
        Question[73][1] = "9";
        Question[73][2] = "10";
        Question[73][3] = "11";
        Question[73][4] = "12";
        Question[73][5] = "11";

        Question[74][0] = "Who won the Ballon d'Or in 2023?";
        Question[74][1] = "Lionel Messi";
        Question[74][2] = "Cristiano Ronaldo";
        Question[74][3] = "Kylian Mbappe";
        Question[74][4] = "Erling Haaland";
        Question[74][5] = "Lionel Messi";

        Question[75][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[75][1] = "Russia";
        Question[75][2] = "Qatar";
        Question[75][3] = "Brazil";
        Question[75][4] = "France";
        Question[75][5] = "Qatar";

        Question[76][0] = "The Olympic Games are held every how many years?";
        Question[76][1] = "2";
        Question[76][2] = "3";
        Question[76][3] = "4";
        Question[76][4] = "5";
        Question[76][5] = "4";

        Question[77][0] = "How many rings are there in the Olympic symbol?";
        Question[77][1] = "3";
        Question[77][2] = "4";
        Question[77][3] = "5";
        Question[77][4] = "6";
        Question[77][5] = "5";

        Question[78][0] = "Who is the fastest man in the world?";
        Question[78][1] = "Tyson Gay";
        Question[78][2] = "Yohan Blake";
        Question[78][3] = "Usain Bolt";
        Question[78][4] = "Justin Gatlin";
        Question[78][5] = "Usain Bolt";

        Question[79][0] = "Which sport uses the term 'home run'?";
        Question[79][1] = "Basketball";
        Question[79][2] = "Cricket";
        Question[79][3] = "Baseball";
        Question[79][4] = "Football";
        Question[79][5] = "Baseball";

        Question[80][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[80][1] = "Milkha Singh";
        Question[80][2] = "P. T. Usha";
        Question[80][3] = "Usain Bolt";
        Question[80][4] = "Abhinav Bindra";
        Question[80][5] = "Milkha Singh";

        Question[81][0] = "Which country has won the most FIFA World Cups?";
        Question[81][1] = "Germany";
        Question[81][2] = "Argentina";
        Question[81][3] = "Italy";
        Question[81][4] = "Brazil";
        Question[81][5] = "Brazil";

        Question[82][0] = "Which sport is associated with Wimbledon?";
        Question[82][1] = "Football";
        Question[82][2] = "Cricket";
        Question[82][3] = "Tennis";
        Question[82][4] = "Hockey";
        Question[82][5] = "Tennis";

        Question[83][0] = "In cricket, how many players are there in each team?";
        Question[83][1] = "9";
        Question[83][2] = "10";
        Question[83][3] = "11";
        Question[83][4] = "12";
        Question[83][5] = "11";

        Question[84][0] = "Who won the Ballon d'Or in 2023?";
        Question[84][1] = "Lionel Messi";
        Question[84][2] = "Cristiano Ronaldo";
        Question[84][3] = "Kylian Mbappe";
        Question[84][4] = "Erling Haaland";
        Question[84][5] = "Lionel Messi";

        Question[85][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[85][1] = "Russia";
        Question[85][2] = "Qatar";
        Question[85][3] = "Brazil";
        Question[85][4] = "France";
        Question[85][5] = "Qatar";

        Question[86][0] = "The Olympic Games are held every how many years?";
        Question[86][1] = "2";
        Question[86][2] = "3";
        Question[86][3] = "4";
        Question[86][4] = "5";
        Question[86][5] = "4";

        Question[87][0] = "How many rings are there in the Olympic symbol?";
        Question[87][1] = "3";
        Question[87][2] = "4";
        Question[87][3] = "5";
        Question[87][4] = "6";
        Question[87][5] = "5";

        Question[88][0] = "Who is the fastest man in the world?";
        Question[88][1] = "Tyson Gay";
        Question[88][2] = "Yohan Blake";
        Question[88][3] = "Usain Bolt";
        Question[88][4] = "Justin Gatlin";
        Question[88][5] = "Usain Bolt";

        Question[89][0] = "Which sport uses the term 'home run'?";
        Question[89][1] = "Basketball";
        Question[89][2] = "Cricket";
        Question[89][3] = "Baseball";
        Question[89][4] = "Football";
        Question[89][5] = "Baseball";

        Question[90][0] = "Who is known as the 'Flying Sikh' of India?";
        Question[90][1] = "Milkha Singh";
        Question[90][2] = "P. T. Usha";
        Question[90][3] = "Usain Bolt";
        Question[90][4] = "Abhinav Bindra";
        Question[90][5] = "Milkha Singh";

        Question[91][0] = "Which country has won the most FIFA World Cups?";
        Question[91][1] = "Germany";
        Question[91][2] = "Argentina";
        Question[91][3] = "Italy";
        Question[91][4] = "Brazil";
        Question[91][5] = "Brazil";

        Question[92][0] = "Which sport is associated with Wimbledon?";
        Question[92][1] = "Football";
        Question[92][2] = "Cricket";
        Question[92][3] = "Tennis";
        Question[92][4] = "Hockey";
        Question[92][5] = "Tennis";

        Question[93][0] = "In cricket, how many players are there in each team?";
        Question[93][1] = "9";
        Question[93][2] = "10";
        Question[93][3] = "11";
        Question[93][4] = "12";
        Question[93][5] = "11";

        Question[94][0] = "Who won the Ballon d'Or in 2023?";
        Question[94][1] = "Lionel Messi";
        Question[94][2] = "Cristiano Ronaldo";
        Question[94][3] = "Kylian Mbappe";
        Question[94][4] = "Erling Haaland";
        Question[94][5] = "Lionel Messi";

        Question[95][0] = "Which country hosted the 2022 FIFA World Cup?";
        Question[95][1] = "Russia";
        Question[95][2] = "Qatar";
        Question[95][3] = "Brazil";
        Question[95][4] = "France";
        Question[95][5] = "Qatar";

        Question[96][0] = "The Olympic Games are held every how many years?";
        Question[96][1] = "2";
        Question[96][2] = "3";
        Question[96][3] = "4";
        Question[96][4] = "5";
        Question[96][5] = "4";

        Question[97][0] = "How many rings are there in the Olympic symbol?";
        Question[97][1] = "3";
        Question[97][2] = "4";
        Question[97][3] = "5";
        Question[97][4] = "6";
        Question[97][5] = "5";

        Question[98][0] = "Who is the fastest man in the world?";
        Question[98][1] = "Tyson Gay";
        Question[98][2] = "Yohan Blake";
        Question[98][3] = "Usain Bolt";
        Question[98][4] = "Justin Gatlin";
        Question[98][5] = "Usain Bolt";

        Question[99][0] = "Which sport uses the term 'home run'?";
        Question[99][1] = "Basketball";
        Question[99][2] = "Cricket";
        Question[99][3] = "Baseball";
        Question[99][4] = "Football";
        Question[99][5] = "Baseball";

    }

}
