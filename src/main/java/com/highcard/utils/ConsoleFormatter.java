// ==============================
// File: ConsoleFormatter.java
// Path: src/main/java/com/highcard/utils/ConsoleFormatter.java
// ==============================

package com.highcard.utils;

public class ConsoleFormatter {

    public static void printHeader(String title) {

        System.out.println("\n=================================");
        System.out.println(title);
        System.out.println("=================================");
    }

    public static void printSubHeader(String title) {

        System.out.println("\n----------- " + title + " -----------");
    }

    public static void printDivider() {

        System.out.println("---------------------------------");
    }

    public static void printMessage(String message) {

        System.out.println(message);
    }
}