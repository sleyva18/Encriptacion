package dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import model.model;

public class EncriptacionD {

    public static String cifrar(String texto) {
        model dl = new model();
        String text = texto;
        int numero = 25;

        final String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
//        final String alfabeto = "AbCdEfGhIjKlmNñOpQrStUvWxYz";
        String cifrado = "";
        for (int i = 0; i < text.length(); i++) {
            int posicion = alfabeto.indexOf(text.charAt(i));
            if (posicion >= 0) {
                cifrado += alfabeto.charAt((posicion + numero) % alfabeto.length());
            } else {
                cifrado += text.charAt(i);
            }
        }

        System.out.println("Texto en cifrado cesar => " + cifrado);
        System.out.println("Texto desconcatenado letra por letra ...");
        String respues = "";

        for (int x = 0; x < cifrado.length(); x++) {
            dl.setLetra(String.valueOf(cifrado.charAt(x)));
            dl.setBinario(Integer.toBinaryString(dl.getCodigoAscii()));
            System.out.println("Conversion ascii => " + dl.getCodigoAscii() + " Conversion binaria => " + dl.getBinario());
            respues = respues + dl.getBinario();
        }
        return respues;
    }

    public static void main(String[] args) {

        System.out.println("Conversion binaria => " + cifrar("hola"));
//        String textoCifrado = cifrar("sysvallegrande");
//        
//        byte[] bytesDelMensaje = textoCifrado.getBytes();
//
//        MessageDigest resumenDelMensaje = null;
//        try {
//            resumenDelMensaje = MessageDigest.getInstance("MD5");
//            byte[] bytesDelResumen = resumenDelMensaje.digest(bytesDelMensaje);
//
//            BigInteger resumenNumero = new BigInteger(1, bytesDelResumen);
//            String resumen = resumenNumero.toString(16);
//
//            System.out.println("Mensaje '" + textoCifrado + "' -> Hash MD5: " + resumen);
//        } catch (NoSuchAlgorithmException e) {
//        }

//        // de binario a decimal
//        int decimalConvertido = Integer.parseInt(binario, 2);
//        System.out.println(decimalConvertido); // 8
    }

}
