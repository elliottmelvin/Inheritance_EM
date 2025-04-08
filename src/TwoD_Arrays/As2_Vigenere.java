package TwoD_Arrays;

import Utilities.Library;

public class As2_Vigenere {
    public static void run() {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] vigenere = createVSquare(alphabet);
        String key;
        printSquare(vigenere, alphabet);

//        System.out.println(decrypt(crypt, key, vigenere, alphabet));
//            for (int i = 0; i < crypt.length(); i++) {
//                for (int j = 0; j < alphabet.length; j++) {
//                    if(i < key.length()) {
//                        System.out.println(vigenere[headerNum(alphabet, key, i)][j]);
//                    }
//                    else{
//                        System.out.println(vigenere[headerNum(alphabet, key, i - key.length())][j]);
//                    }
//                }
//            }
        while(0 == 0){
            System.out.println("What wou    ld you like the key to be?");
            key = Library.input.nextLine();
//            Library.input.nextLine();

            System.out.println("What is the encrypted message?");
            String crypt = Library.input.nextLine();
//            Library.input.nextLine();

            System.out.println("The decrypted message is: " + (decrypt(crypt, key, vigenere, alphabet)));
        }
    }

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];
//code to be written

        int rowAdd = 0;
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (j + rowAdd < 26) {
                    square[i][j] = alphabet[j + rowAdd];
                } else {
                    square[i][j] = alphabet[j + rowAdd - 26];
                }
            }
            rowAdd++;
        }

        return square;

    }//createVSquare

    public static void printSquare(char[][] square, char[] alph) {
        System.out.print("    ");
        for (char letter : alph) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < square.length; i++) {
            System.out.print(alph[i] + "   ");
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }//end printSquare

    public static int linearSearch(char[] arr, char searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }
        }
        return -1;
    }

    public static char getChar(char[][] square, int row, int col) {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                if (i == row - 1 && j == col - 1) {
                    return square[i][j];
                }
            }
        }
        return 'a';
    }

    public static String decrypt(String crypt, String key, char[][] cypher, char[] alphabet) {
        String decoded = "";

        for (int i = 0; i < crypt.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (crypt.charAt(i) == cypher[headerNum(alphabet, key, i)][j]) {
                    decoded += alphabet[j];
                }
            }
        }
        return decoded;
    }

    public static int headerNum(char[] alph, String word, int index) {
        int newIndex = index;
        while (word.length() - 1 < newIndex) {
            newIndex -= word.length();
        }

        for (int i = 0; i < alph.length; i++) {
            if (alph[i] == word.charAt(newIndex)) {
                return i;
            }
        }
        return -1;
    }
}//end class

