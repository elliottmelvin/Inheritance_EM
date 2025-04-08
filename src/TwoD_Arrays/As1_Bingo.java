package TwoD_Arrays;

import Utilities.Library;

public class As1_Bingo {
    public static void run(){
        char[] letters = {'B', 'I', 'N', 'G', 'O'};

        int[][] allRows = new int[5][5];

        int min = 1;
        int max = 15;

        for (int i = 0; i < allRows.length; i++) {
            allRows[i] = generateArray(5, min, max);
            min = max + 1;
            max += 15;
        }

        for (int i = 0; i < allRows.length; i++) {
            System.out.print(letters[i] + ":");
            for (int j = 0; j < allRows[i].length; j++) {
                System.out.print(" " + allRows[i][j]);
            }
            System.out.println();
        }

        while(0==0){
            System.out.println("Press Enter to Reveal the Next Number!");

            Library.input.nextLine();
            int chosenNum = Library.myRandom(1, 75);
            System.out.println("The Number Chosen was " + chosenNum);

            boolean notFound = true;

            for (int i = 0; i < allRows.length; i++) {
                for (int j = 0; j < allRows[i].length; j++) {
                    if(allRows[i][j] == chosenNum){
                        allRows[i][j] = allRows[i][j] * -1;
                        notFound = false;
                    }
                }
            }

            if(notFound == false) {
                for (int i = 0; i < allRows.length; i++) {
                    System.out.print(letters[i] + ":");
                    for (int j = 0; j < allRows[i].length; j++) {
                        System.out.print(" " + allRows[i][j]);
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("Not found");
            }
            if(checkRow(allRows)){
                System.out.println("Congratulations you win!");
                break;
            }
            else if(checkCol(allRows)){
                System.out.println("Congratulations you win!");
                break;
            }
        }//while
    }

    public static int[] generateArray(int arrLength, int min, int max){
        int[] numArray = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            numArray[i] = Library.myRandom(min, max);
        }
        return numArray;
    }

    public static boolean checkRow(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int numNeg = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < 0) {
                    numNeg += 1;
                }
            }
            if(numNeg == 5){
                return true;
            }
        }
        return false;
    }

    public static boolean checkCol(int[][]arr){
        int colNum = 0;
        for (int i = 0; i < 4; i++) {
            int numNeg = 0;
            colNum += 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][colNum] < 0){
                    numNeg += 1;
                }
            }
            if(numNeg == 5){
                return true;
            }
        }
        return false;
    }
}
