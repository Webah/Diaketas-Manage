
package Controladores;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 ** NOMBRE CLASE:
 **	  TestDatos
 **
 ** DESCRIPCION:
 **       Para comprobar los datos de entrada
 **
 **
 ** DESARROLLADO POR:
 *          Raphael Colleau (RC)
 **
 **
 ** SUPERVISADO POR:
 **
 **
 ** HISTORIA:
 ** 	000 -  4 May 2012 - RC - Creacion + metodos
 ** 	001 -  5 May 2012 - RC - Adicion metodos
 *		002 - 20 May 2012 - ARS - Metodos para nombre, direccion y fecha
 **
 ** NOTAS:
 **
 **
 */
public class TestDatos {

    public static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public static boolean isDNI (String DNI) {
        if (DNI.length() != 9)
            return false;

        for (int i=0; i<8; i++) {
            if (Character.isLetter(DNI.charAt(i)))
                return false;
        }

        if (!Character.isLetter(DNI.charAt(8)))
                return false;

        return true;
    }

    public static boolean isCIF (String CIF) {
        if (CIF.length() != 10)
            return false;

        if (!Character.isLetter(CIF.charAt(0)))
                return false;

        for (int i=1; i<9; i++) {
            if (!Character.isDigit(CIF.charAt(i)))
                return false;
        }

        if (!Character.isLetterOrDigit(CIF.charAt(9)))
                return false;

        return true;
    }

    public static boolean isTelefonoOFax (String numero) {
        if (numero.length() < 9)
            return false;

        for (int i=0; i<numero.length(); i++) {
            if (!Character.isDigit(numero.charAt(i)))
                return false;
        }

        return true;
    }

    public static boolean isCodigoPostal (String cp) {
        if (cp.length() != 5)
            return false;

        for (int i=0; i<cp.length(); i++) {
            if (!Character.isDigit(cp.charAt(i)))
                return false;
        }

        return true;
    }

    public static boolean isEmail(String email){
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();
    }

    public static boolean isOnlyLetter (String s) {
        for (int i=0; i<s.length(); i++) {
            if (!Character.isLetter(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean isOnlyDigit (String s) {
		if (s.length()<1) return false;

		for (int i=0; i<s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean isOnlyLetterOrDigit (String s) {
        for (int i=0; i<s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean isNombre (String s) {
		//Faltan comprobar acentos
        Pattern p = Pattern.compile("[A-Z -]+");
        Matcher m = p.matcher(s.toUpperCase());
        return m.matches();
    }

	public static boolean isDomicilio(String s){
        Pattern p = Pattern.compile("[A-Z0-9 /,.-]+");
        Matcher m = p.matcher(s.toUpperCase());
        return m.matches();
	}

	public static boolean isFecha(String s){
        Pattern p = Pattern.compile("\\d\\d/\\d\\d/\\d\\d\\d\\d$");
        Matcher m = p.matcher(s.toUpperCase());
        return m.matches();
	}

}
