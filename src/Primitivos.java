public class Primitivos {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte " + Byte.MIN_VALUE);
        System.out.println();

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short " + Short.MIN_VALUE);
        System.out.println();

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int " + Integer.MIN_VALUE);
        System.out.println();

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long " + Long.MIN_VALUE);
        System.out.println();

        float numeroFloat = 3.4028235E38F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un float " + Float.MIN_VALUE);
        System.out.println();

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un double " + Double.MIN_VALUE);
        System.out.println();

        char caracter = 'A';
        System.out.println("caracter = " + caracter);
        System.out.println("tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("tipo char corresponde en bits a " + Character.SIZE);
        System.out.println("valor máximo de un char " + Character.MAX_VALUE);
        System.out.println("valor mínimo de un char " + Character.MIN_VALUE);
        System.out.println();

        boolean valorBoolean = true;
        System.out.println("valorBoolean = " + valorBoolean);
        System.out.println("tipo boolean no tiene un tamaño específico en bytes o bits");
        System.out.println();


        var _numeroByte = (byte) 127;
        var _numeroShort = (short) 30000;
        var _numeroInt = 2147483647;
        var _numeroLong = 9223372036854775807L;
        var _numeroFloat = 3.4028235E38F;
        var _numeroDouble = 1.7976931348623157E308;
        var _caracter = 'A';
        var _valorBoolean = true;

        System.out.println("_numeroByte = " + _numeroByte);
        System.out.println("_numeroShort = " + _numeroShort);
        System.out.println("_numeroInt = " + _numeroInt);
        System.out.println("_numeroLong = " + _numeroLong);
        System.out.println("_numeroFloat = " + _numeroFloat);
        System.out.println("_numeroDouble = " + _numeroDouble);
        System.out.println("_caracter = " + _caracter);
        System.out.println("_valorBoolean = " + _valorBoolean);
    }
}
