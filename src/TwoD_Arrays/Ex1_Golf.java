package TwoD_Arrays;

public class Ex1_Golf {

    public static void run() {
        String[] names = {"Joe", "Serena", "Gill", "Stu"};

        int[][] scorecard = new int[4][18];

        scorecard[0][0] = 4;
        scorecard[1][0] = 5;
        scorecard[2][0] = 6;
        scorecard[3][0] = 7;

        scorecard[0][1] = 5;
        scorecard[1][1] = 5;
        scorecard[2][1] = 9;
        scorecard[3][1] = 2;


        for (int row = 0; row < scorecard.length; row++) {
            int totalScore = 0;

            System.out.print(names[row]);

            for (int column = 0; column < scorecard[row].length; column++) {
                System.out.print("  " + scorecard[row][column]);

                totalScore += scorecard[row][column];
            }
            System.out.print(totalScore);
            System.out.println();
        }


        //total each hole
        for(int col = 0; col < scorecard[0].length; col++){
            int totalScore = 0;

            for (int row = 0; row < scorecard.length; row++) {
                totalScore += scorecard[row][col];
            }

            if(totalScore > 0) {
                System.out.print(totalScore+ " ");
//                System.out.print("\n");
            }
        }

    }
}
