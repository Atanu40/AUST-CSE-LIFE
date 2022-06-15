


package lab.pkg8;

public class Bowler extends Cricketer {

    private int bowlInfo[][];

    public Bowler(String name, String country, int age, int bowlInfo[][]) {
        super(name, country, age);
        this.bowlInfo = bowlInfo;
    }

    double sum = 0, sum1 = 0, avg = 0;

    public void CalculateAverage(int match) {
        for (int i = 0; i < match; i++) {

            sum += bowlInfo[0][i];
            sum1 += bowlInfo[1][i];

        }
        if (sum1 == 0) {
            sum1 = 1;
        }

        avg = sum / sum1;
        System.out.println(this.name+"'s"+" bowling average of " +match+" matches is " + avg);

    }

    public void printInfo() {
        super.printInfo();
        for (int j = 0; j < 10; j++) {
            System.out.println("Match: " + (j + 1) + " Run: " + bowlInfo[0][j] + " Wicket: " + bowlInfo[1][j]);
        }

    }

}
