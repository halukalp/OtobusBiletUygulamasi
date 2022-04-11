package com.akis_yazilim.oracle.melih.otobus_bilet.utility;

public enum IstisnaMesajTipi
{
	IDYE_GORE_BUL("Varlık bulunamadı."),
	EKLE("Ekleme işlemi başarısız."),
	SIL("Silme işlemi başarısız."),
	GUNCELLE("GÜncelleme işlemi başarısız."),
	HERKESI_CEK("Varlık listesi oluşturulamadı.");
		
	private String deger;

	private IstisnaMesajTipi(String deger) {
		this.deger = deger;
	}

	public String getDeger()
	{
		return deger;
	}		
}
