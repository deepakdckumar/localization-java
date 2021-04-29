package localization.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

public class SelectLocaleOption {
    PrintWriter printWriter = new PrintWriter(System.out, true);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private final Date today = new Date();
    private final SetLocale setLocale = new SetLocale();

    public void run() {
        String line = "";

        while(!(line.equals("q"))) {
            this.printMenu();
            try {
                line = this.bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (line) {
                case "1":
                    setLocale.setEnglish();
                    break;
                case "2":
                    setLocale.setFrench();
                    break;
                case "3":
                    setLocale.setRussian();
                    break;
            }
        }
    }

    public void printMenu() {
        printWriter.println("==== Date App ====");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, setLocale.getCurrentLocal());
        printWriter.println(setLocale.getResourceBundle().getString("date")+ " " + dateFormat.format(today));
        printWriter.println("\n==== Choose Language Option ====");
        printWriter.println("1. " + setLocale.getResourceBundle().getString("menu1"));
        printWriter.println("2. " + setLocale.getResourceBundle().getString("menu2"));
        printWriter.println("3. " + setLocale.getResourceBundle().getString("menu3"));
        printWriter.println("4. " + setLocale.getResourceBundle().getString("menu4"));
        printWriter.println("q. " + setLocale.getResourceBundle().getString("menuq"));
        printWriter.println(setLocale.getResourceBundle().getString("menucommand") + " ");
    }
}
