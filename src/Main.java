/*
Skapa en array med 10 namn.
        Skriv ut alla namn i arrayen.

        Denna array är public + privat, till skillnad ifrån W3schools-Arrays
        Möjlighet gömma viss data i privata methoden istället, för det man inte vill visa publikt.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] colours = {"Svart", "Vit", "Blå", "Grön", "Röd", "Gul", "Orange", "Rosa", "Lila", "Turkos"};
        printList(colours);
    }

    private static void printList(String[] colours) {
        System.out.println(colours[3]);
        // Skriv din kod här

    }
}
