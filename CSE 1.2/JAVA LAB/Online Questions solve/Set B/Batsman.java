
package lab.pkg8;


public class Batsman extends Cricketer {

    private int batInfo[][];

    public Batsman(String name, String country, int age, int batInfo[][]) {
        super(name, country, age);
        this.batInfo = batInfo;
    }

    double sum = 0, sum1 = 0;
    double avg = 0;

    public void CalculateAverage(int match) {
        for (int i = 0; i < match; i++) {

            sum += batInfo[0][i];
            sum1 += batInfo[1][i];

        }
        if (sum1 == 0) {
            sum1 = 1;
        }

        avg = sum / sum1;

        System.out.println(this.name+"'s"+" batting average of " +match+" matches is " + avg);

    }

    public void printInfo() {
        super.printInfo();
        for (int j = 0; j < 10; j++) {
            System.out.println("Match: " + (j + 1) + " Run: " + batInfo[0][j] + " Out: " + batInfo[1][j]);
        }

    }

}
