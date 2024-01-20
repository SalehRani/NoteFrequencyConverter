package org.salehrani;

import java.util.Scanner;

public class NoteFrequency {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nNNNNNNNN        NNNNNNNN  FFFFFFFFFFFFFFFFFFFFFF         CCCCCCCCCCCCC");
        System.out.println("N:::::::N       N::::::N  F::::::::::::::::::::F      CCC::::::::::::C");
        System.out.println("N::::::::N      N::::::N  F::::::::::::::::::::F    CC:::::::::::::::C");
        System.out.println("N:::::::::N     N::::::N  FF::::::FFFFFFFFF::::F   C:::::CCCCCCCC::::C");
        System.out.println("N::::::::::N    N::::::N    F:::::F       FFFFFF  C:::::C       CCCCCC");
        System.out.println("N:::::::::::N   N::::::N    F:::::F              C:::::C");
        System.out.println("N:::::::N::::N  N::::::N    F::::::FFFFFFFFFF    C:::::C");
        System.out.println("N::::::N N::::N N::::::N    F:::::::::::::::F    C:::::C");
        System.out.println("N::::::N  N::::N:::::::N    F:::::::::::::::F    C:::::C");
        System.out.println("N::::::N   N:::::::::::N    F::::::FFFFFFFFFF    C:::::C");
        System.out.println("N::::::N    N::::::::::N    F:::::F              C:::::C");
        System.out.println("N::::::N     N:::::::::N    F:::::F               C:::::C       CCCCCC");
        System.out.println("N::::::N      N::::::::N  FF:::::::FF              C:::::CCCCCCCC::::C");
        System.out.println("N::::::N       N:::::::N  F::::::::FF               CC:::::::::::::::C");
        System.out.println("N::::::N        N::::::N  F::::::::FF                 CCC::::::::::::C");
        System.out.println("NNNNNNNN         NNNNNNN  FFFFFFFFFFF                    CCCCCCCCCCCCC\n");

        boolean inOperation = true;

        while (inOperation) {
            boolean validNoteName = false;
            boolean validOctave = false;
            String noteInput;
            String note = null;

            while (validNoteName == false) {
                System.out.print("Please enter a note (# or b for accidentals): ");
                noteInput = keyboard.nextLine();

                if ((!Character.isUpperCase(noteInput.charAt(0)))|| (noteInput.length() > 2 && (Character.isDigit(noteInput.charAt(1)) || Character.isDigit(noteInput.charAt(2))))) {
                    System.out.println("\nPlease enter a valid note name and capitalize it!!");
                    continue;
                } else {
                    while (validOctave == false) {
                        System.out.print("\nPlease enter an octave designation: ");

                        String octaveString = keyboard.nextLine();
                        try {
                            int octave = Integer.parseInt(octaveString);

                            if (octave < 0 || octave > 8) {
                                System.out.println("\nPlease enter a valid octave designation from a piano keyboard!!");
                                continue;
                            } else {
                                note = noteInput + octaveString;
                                System.out.println("\nYou entered: " + note);
                                validNoteName = true;
                                validOctave = true;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("\nPlease enter a valid octave designation from a piano keyboard!!");
                        }
                    }
                }
            }

            int n = 0;

            //Set n for each note in piano
            if (note.equals("A0")) {
                n = 1;
            } else if (note.equals("A#0") || note.equals("Bb0")) {
                n = 2;
            } else if (note.equals("B0")) {
                n = 3;
            } else if (note.equals("C1")) {
                n = 4;
            } else if (note.equals("C#1") || note.equals("Db1")) {
                n = 5;
            } else if (note.equals("D1")) {
                n = 6;
            } else if (note.equals("D#1") || note.equals("Eb1")) {
                n = 7;
            } else if (note.equals("E1")) {
                n = 8;
            } else if (note.equals("F1")) {
                n = 9;
            } else if (note.equals("F#1") || note.equals("Gb1")) {
                n = 10;
            } else if (note.equals("G1")) {
                n = 11;
            } else if (note.equals("G#1") || note.equals("Ab1")) {
                n = 12;
            } else if (note.equals("A1")) {
                n = 13;
            } else if (note.equals("A#1") || note.equals("Bb1")) {
                n = 14;
            } else if (note.equals("B1")) {
                n = 15;
            } else if (note.equals("C2")) {
                n = 16;
            } else if (note.equals("C#2") || note.equals("Db2")) {
                n = 17;
            } else if (note.equals("D2")) {
                n = 18;
            } else if (note.equals("D#2") || note.equals("Eb2")) {
                n = 19;
            } else if (note.equals("E2")) {
                n = 20;
            } else if (note.equals("F2")) {
                n = 21;
            } else if (note.equals("F#2") || note.equals("Gb2")) {
                n = 22;
            } else if (note.equals("G2")) {
                n = 23;
            } else if (note.equals("G#2") || note.equals("Ab2")) {
                n = 24;
            } else if (note.equals("A2")) {
                n = 25;
            } else if (note.equals("A#2") || note.equals("Bb2")) {
                n = 26;
            } else if (note.equals("B2")) {
                n = 27;
            } else if (note.equals("C3")) {
                n = 28;
            } else if (note.equals("C#3") || note.equals("Db3")) {
                n = 29;
            } else if (note.equals("D3")) {
                n = 30;
            } else if (note.equals("D#3") || note.equals("Eb3")) {
                n = 31;
            } else if (note.equals("E3")) {
                n = 32;
            } else if (note.equals("F3")) {
                n = 33;
            } else if (note.equals("F#3") || note.equals("Gb3")) {
                n = 34;
            } else if (note.equals("G3")) {
                n = 35;
            } else if (note.equals("G#3") || note.equals("Ab3")) {
                n = 36;
            } else if (note.equals("A3")) {
                n = 37;
            } else if (note.equals("A#3") || note.equals("Bb3")) {
                n = 38;
            } else if (note.equals("B3")) {
                n = 39;
            } else if (note.equals("C4")) {
                n = 40;
            } else if (note.equals("C#4") || note.equals("Db4")) {
                n = 41;
            } else if (note.equals("D4")) {
                n = 42;
            } else if (note.equals("D#4") || note.equals("Eb4")) {
                n = 43;
            } else if (note.equals("E4")) {
                n = 44;
            } else if (note.equals("F4")) {
                n = 45;
            } else if (note.equals("F#4") || note.equals("Gb4")) {
                n = 46;
            } else if (note.equals("G4")) {
                n = 47;
            } else if (note.equals("G#4") || note.equals("Ab4")) {
                n = 48;
            } else if (note.equals("A4")) {
                n = 49;
            } else if (note.equals("A#4") || (note.equals("Bb4"))) {
                n = 50;
            } else if (note.equals("B4")) {
                n = 51;
            } else if (note.equals("C5")) {
                n = 52;
            } else if (note.equals("C#5") || note.equals("Db5")) {
                n = 53;
            } else if (note.equals("D5")) {
                n = 54;
            } else if (note.equals("C#5") || note.equals("Db5")) {
                n = 55;
            } else if (note.equals("E5")) {
                n = 56;
            } else if (note.equals("F5")) {
                n = 57;
            } else if (note.equals("F#5") || note.equals("Gb5")) {
                n = 58;
            } else if (note.equals("G5")) {
                n = 59;
            } else if (note.equals("G#5") || note.equals("Ab5")) {
                n = 60;
            } else if (note.equals("A5")) {
                n = 61;
            } else if (note.equals("A#5") || note.equals("Bb5")) {
                n = 62;
            } else if (note.equals("B5")) {
                n = 63;
            } else if (note.equals("C6")) {
                n = 64;
            } else if (note.equals("C#6") || note.equals("Db6")) {
                n = 65;
            } else if (note.equals("D6")) {
                n = 66;
            } else if (note.equals("D#6") || note.equals("Eb6")) {
                n = 67;
            } else if (note.equals("E6")) {
                n = 68;
            } else if (note.equals("F6")) {
                n = 69;
            } else if (note.equals("F#6") || note.equals("Gb6")) {
                n = 70;
            } else if (note.equals("G6")) {
                n = 71;
            } else if (note.equals("G#6") || note.equals("Ab6")) {
                n = 72;
            } else if (note.equals("A6")) {
                n = 73;
            } else if (note.equals("A#6") || note.equals("Bb6")) {
                n = 74;
            } else if (note.equals("B6")) {
                n = 75;
            } else if (note.equals("C7")) {
                n = 76;
            } else if (note.equals("C#7") || note.equals("Db7")) {
                n = 77;
            } else if (note.equals("D7")) {
                n = 78;
            } else if (note.equals("D#7") || note.equals("Eb7")) {
                n = 79;
            } else if (note.equals("E7")) {
                n = 80;
            } else if (note.equals("F7")) {
                n = 81;
            } else if (note.equals("F#7") || note.equals("Gb7")) {
                n = 82;
            } else if (note.equals("G7")) {
                n = 83;
            } else if (note.equals("G#7") || note.equals("Ab7")) {
                n = 84;
            } else if (note.equals("A7")) {
                n = 85;
            } else if (note.equals("A#7") || note.equals("Bb7")) {
                n = 86;
            } else if (note.equals("C7")) {
                n = 87;
            } else if (note.equals("C8")) {
                n = 88;
            } else {
                System.out.println("\nThis note is not on an 88-key piano. Try again.\n");
                continue;
            }

            double noteFrequency = 440 * Math.pow(2, (n - 49.0)/12.0);

            System.out.printf("\nNote frequency is: %.3fHz", noteFrequency);
            System.out.println();

            System.out.print("\nWould you like to perform another calculation? (Y/N): ");
            String choice = keyboard.nextLine();
            System.out.println();

            if (!(choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("N"))) {
                System.out.println("Please provide the proper answer (\"Yes\", \"Y\", \"No\", \"N\"");
            } else if (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y")) {
                continue;
            } else {
                System.out.println("Thank you for using NFC!");
                break;
            }
        }

    }
}