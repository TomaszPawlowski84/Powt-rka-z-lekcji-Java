package com.TomaszPawlowski;

public class Main {

    public static void main(String[] args) {
        //  znak
        char zmcChar = 'B';
        System.out.println(zmcChar);
        //String
        String zmString ="Coś";
        System.out.println(zmString);
        //Bolean
        boolean zmBoolean = true;
        System.out.println(zmBoolean);

        //byte
        byte zmByte = Byte.MIN_VALUE;
        byte zmByte2 =Byte.MAX_VALUE;
        System.out.println("Byte " + zmByte + " < " + zmByte2);

        //short
        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("Short " + zmShort + " < " + zmShort2);

        // int
        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("Integer " + zmInt + " < " + zmInt2);

        //long
        long zmLong = Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        System.out.println("long " + zmLong + " < " + zmLong2);

        //float
        float zmFloat = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        System.out.println("float " + zmFloat + " < " +zmFloat2);

        //double
        double zmDouble = Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        System.out.println("double " + zmDouble + " < " + zmDouble2);
    }
}
