/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Jonathan
 */
public class Hash {
    private String texto = "";
    private final String SHA256 = "SHA-256";
    
    public Hash(String texto){
        this.texto = texto;
    }
    
    public String generate(){
        String hash = "";
        byte[] digest = null;
        byte[] buffer =this.texto.getBytes();
        
        try{
            // Instancio objeto con el algoritmo de seguridad SHA-256
            MessageDigest md = MessageDigest.getInstance(this.SHA256);
            // Resetear el digest que puede tener el objeto
            md.reset();
            // Envia el buffer del texto a encriptar
            md.update(buffer);
            // Obtener el digest del texto
            digest = md.digest();
            // Obtener la cadena del hash en valores hexadecimales
            hash = getHexadecimal(digest);
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return hash;
    }

    private String getHexadecimal(byte[] digest) {
        String hash = "";
        for (byte aux : digest) {
            //Hace un casteo del byte a hexadecimal
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1)	
                hash += "0";	
            hash += Integer.toHexString(b);	
        }	
        return hash;
    }

    
}
