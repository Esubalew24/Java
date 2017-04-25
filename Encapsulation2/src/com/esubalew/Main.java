package com.esubalew;

public class Main {

    public static void main(String[] args) {


        // Challenge


Printer printer = new Printer(50, false);
        System.out.println("Initial page count : " + printer.getPagePrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was: " + pagesPrinted + " new total print count for printer = " + printer.getPagePrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was: " + pagesPrinted + " new total print count for printer = " + printer.getPagePrinted());

    }
}
