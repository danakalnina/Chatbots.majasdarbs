package com.dana;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            String to_ko_tu_gaidi_no_lietotaja;

            System.out.println("Labdien! Par kuru Riga Coding School programmu Jūs vēlētos uzzināt vairāk?");
            System.out.println("1) Programēšanas pamati");
            System.out.println("2) UX/UI Dizains");
            System.out.println("3) Kiberdrošība");

            to_ko_tu_gaidi_no_lietotaja = scanner.nextLine();

            if (to_ko_tu_gaidi_no_lietotaja.equals ("1")) {
                System.out.println("Izvēlaties, par kuru programmu Jūs vēlētos uzzināt");
                System.out.println("Lūdzu, sazinaties ar Riga Coding School vadību, tel.- 21234567");
            } else if  (to_ko_tu_gaidi_no_lietotaja.equals ("2")) {
                System.out.println("Lūdzu, sazinaties ar Māri, tel.- 23330333");
            } else if (to_ko_tu_gaidi_no_lietotaja.equals ("3")) {
                System.out.println( "Lūdzu, sazinaties ar Andri, tel.= 24440444");
            }
    }

}






