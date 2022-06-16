
package lab.pkg8;


public class Cricketer {

    String name;
    String country;
    int age;

    public Cricketer(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + " Country: " + country + " Age: " + age);

    }

}
