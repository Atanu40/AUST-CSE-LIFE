package exceptionnewdemo;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

class IDNotFoundException extends Exception {
    int id;
    public IDNotFoundException(int x) {
        id = x;
    }
    @Override
    public String toString() {
        return "ID:" + id + "Currently not online";
    }
}

public class ExceptionNewDemo {
    public static void readOnlineList(int ID) throws FileNotFoundException, IDNotFoundException {

        Scanner reader = new Scanner(new File("C:\\Users\\Asus\\Documents\\NetBeansProjects\\ExceptionNewDemo\\src\\exceptionnewdemo\\online.txt"));
        while (reader.hasNext()) {
            int i = reader.nextInt();
            if (i == ID) {
                return;
            }

        }

        throw new IDNotFoundException(ID);
    }

    public static void main(String[] args) {

        Scanner takeInput = new Scanner(System.in);
        while (true) {
            String message = takeInput.next();
            int friendID = takeInput.nextInt();

            try {
                readOnlineList(friendID);
                System.out.println("Sent message: <" + message + "> to ID: " + friendID);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IDNotFoundException ex) {
                ex.printStackTrace();
                System.out.println(ex);
            }

        }
    }

}
