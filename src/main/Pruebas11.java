package main;

import model.model;

public class Pruebas11 {
    
    public static String cifrar(String texto) {
        model dl = new model();
        String text = texto;
        int numero = 25;
        
        final String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        
        String cifrado = "";
        for (int i = 0; i < text.length(); i++) {
            int posicion = alfabeto.indexOf(text.charAt(i));
            if (posicion >= 0) {
                cifrado += alfabeto.charAt((posicion + numero) % alfabeto.length());
            } else {
                cifrado += text.charAt(i);
            }
        }

//        System.out.println(cifrado);
        String respues = "";
        for (int x = 0; x < cifrado.length(); x++) {
            dl.setLetra(String.valueOf(cifrado.charAt(x)));
            dl.setBinario(Integer.toBinaryString(dl.getCodigoAscii()));
//            System.out.println(" " + dl.getCodigoAscii() + " " + dl.getBinario());
            respues = respues + dl.getBinario() ;
        }
        return respues;
    }
    
    public static void main(String[] args) {
        
        System.out.print(cifrar("sebastian"));

//        // de binario a decimal
//        int decimalConvertido = Integer.parseInt(binario, 2);
//        System.out.println(decimalConvertido); // 8
    }
    
}
