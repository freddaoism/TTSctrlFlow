package com.tutorial;

public class randomNumber {

    public static void printLottoNumber () {

        int[] lottery = new int[5];
        int randomNum;
        c1:
        for (int i = 0; i < 5; i++) {
            // The random number is created here.
            randomNum = (int) (Math.random() * 75);
            if(randomNum == 0) {
                continue c1;
            }
            for (int x = 0; x < i; x++) {
                // Here, code checks if the same random number has generated before.
                if (lottery[x] == randomNum )
                {
                    // If random number is the same, another number will be generated.
                    randomNum = (int) (Math.random() * 75);
                    x = -1; // restart the loop
                }

            }
            lottery[i] = randomNum;
        }

        for (int i = 0; i < lottery.length; i++)
            System.out.print(lottery[i] + " " );
    }
}
