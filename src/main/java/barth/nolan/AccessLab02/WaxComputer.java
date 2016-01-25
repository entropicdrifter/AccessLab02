package barth.nolan.AccessLab02;

import java.util.Scanner;

/**
 * Created by Nolan Barth on 1/25/16.
 */
public class WaxComputer {
    private Wax wax = new Wax();

    private String snow;
    private int temp;
    private String waxForSnow;
    private String waxColor;
    private Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        WaxComputer app = new WaxComputer();
        app.run();
    }

    private void setWax(String snowCondType, String color) {
        wax.setSnowCond(snowCondType);
        wax.setWaxType(color);
    }

    private Wax getWax() {
        return wax;
    }

    private void UserPromptTemp() {
        System.out.println("What temperature is it? (in Fahrenheit, please)");
        if (sc.hasNextInt()) {
            temp = sc.nextInt();
        } else {
            System.out.println("Error: unexpected input. Please use a number in numerals, not spelled out.");
            sc.next();
            temp = 0;
            UserPromptTemp();
        }

    }
    private void UserPromptSnow() {
        System.out.println("What condition is the snow? (please type 'powder', 'firm' or 'crusty' without quotes)");
        snow = sc.next();
        ConvertSnow();
    }

    private void ConvertToWax() {
        if (temp > 38) {
            waxColor = "Yellow";
            waxForSnow = "Standard";
        } else if (31 < temp && temp <= 38) {
            waxColor = "Red";
            UserPromptSnow();

        } else if (26 < temp && temp <= 31) {
            waxColor = "Violet";
            UserPromptSnow();
        } else if (18 < temp && temp <= 26) {
            waxColor = "Blue";
            UserPromptSnow();
        } else if (5 < temp && temp <= 18) {
            waxColor = "Green";
            UserPromptSnow();
        } else {
            waxColor = "White";
            waxForSnow = "Standard";
        }
    }

    private void ConvertSnow() {
        switch (snow.toLowerCase()) {
            case "powder":
                waxForSnow = "Special";
                break;
            case "firm":
                waxForSnow = "Standard";
                break;
            case "crusty":
                waxForSnow = "Extra";
                break;
            default:
                System.out.println("Hey, you didn't say 'powder' or 'firm' or 'crusty'! Let's try this again...");
                UserPromptSnow();
                break;
        }
    }

    public void run() {
        UserPromptTemp();
        ConvertToWax();
        setWax(waxForSnow, waxColor);
        System.out.println("You need " + getWax().getWaxType() + " " + getWax().getSnowCond() + " wax for these conditions.");

    }
}
