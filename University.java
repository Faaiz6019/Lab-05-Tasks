public class University {

    public static void main(String[] args) {

        int marks[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 85, 67};
        int full = 0, half = 0, no = 0, below = 0;
        double average=0;

        for (int i = 0; i < 12; i++) {

            average = average + marks[i];

            if (marks[i] > 85 && marks[i] <= 100) {
                System.out.println("Full Scholarship Awarded to Student " + (i+1));
                full++;
            } else if (marks[i] >= 70 && marks[i] <= 85) {
                System.out.println("Half Scholarship Awarded to Student " + (i+1));
                half++;
            } else {
                System.out.println("No Scholarship for Student " + (i+1));
                no++;
            }
        }
        average = average / 12;
        System.out.println();
        System.out.println("Class Average is " +average);

        for (int j = 0; j < 12; j++) {
            if (marks[j] < average) {
                below++;
            }
            if (marks[j] < 40) {
                marks[j] = 40;
            }
        }
        System.out.println();
        System.out.println("Total Students having Full Scholarship: " +full);
        System.out.println("Total Students having Half Scholarship: " +half);
        System.out.println("Total Students having No Scholarship: " +no);
        System.out.println();
        System.out.println("Students who scored below class Average: " +below);

    }
}
