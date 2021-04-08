package com.company;

public class Demana {

    String obligat(String s){
        while (s.length()<2 || s.contains(" ")){
            Main.print.titol(s+" no és vàlid, torna a introduir-lo","groc");
            s=Main.scan.nextLine();
        }
        return s;
    }

    public String opcional(String s) {
        while (s==null || s.isEmpty()) {
            Main.print.titol("No has introduit res? Vols guardar igualment?","groc");
            if(Main.scan.nextLine().equals("si")){
                return "-   -";
            }
            Main.print.titol("Torna a introduir el camp:","blanc");
            s=Main.scan.nextLine();
        }
        return s;
    }
}
