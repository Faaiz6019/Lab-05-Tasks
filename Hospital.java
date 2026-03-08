public class Hospital {

    public static void main(String[] args) {

        int avg = 0, highpatient = 0, highest = 0, exceeds = 0;

        int records[][] = {
                {130, 31, 97, 218, 322, 33, 134},   //patient 1
                {98, 28, 129, 30, 321, 322, 133},   //patient 2
                {25, 226, 127, 128, 229, 310, 131},  //patient 3
                {24, 25, 226, 27, 28, 129, 130},   //patient 4
                {22, 23, 24, 25, 126, 227, 218}    //patient 5
        };

        for (int j = 0; j < 5; j++) {
            avg = 0;
            for (int i = 0; i < 7; i++) {

                if (records[j][i] > 100) {
                    exceeds++;
                }

                if (records[j][i] < 95) {
                    records[j][i] = 95;
                }

                avg = avg + records[j][i];
            }
            avg = avg / 7;
            System.out.printf("Average Temperature of Patient " + (j + 1) + " is " + (avg));
            System.out.println();

            if (avg > highest) {
                highest = avg;
                highpatient = j + 1;
            }
        }
        System.out.println();
        System.out.printf("Patient %d has the highest overall weekly average", highpatient);
        System.out.println();
        System.out.printf("%d times the temperatures exceeded 100", exceeds);
        System.out.println();
        System.out.println();

        System.out.println("Final Temperatures : ");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {

                System.out.printf("%d  \t",records[i][j]);
            }
            System.out.println();
        }
    }
}
