package com.akis_yazilim.oracle.melih.otobus_bilet.utility;

public final class Util
{
    private Util() {}

    public static void istisnaBilgisiGoster(Exception e)
    {
        System.err.println(e.getClass().getSimpleName()
                + " meydana geldi. İstisna mesajı: " + e.getMessage());
    }
}
