package com.akis_yazilim.oracle.melih.otobus_bilet.controller;

import com.akis_yazilim.oracle.melih.otobus_bilet.model.entity.OtobusBileti;
import com.akis_yazilim.oracle.melih.otobus_bilet.model.service.AbstractOtobusBiletiService;
import com.akis_yazilim.oracle.melih.otobus_bilet.model.service.OtobusBiletiService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ViewScoped
@Named
public class OtobusBiletiManagedBean
{

    @Autowired
    private AbstractOtobusBiletiService otobusBiletiService;

    private OtobusBileti otobusBileti = new OtobusBileti();
    private List<OtobusBileti> otobusBiletiListesi = new ArrayList<>();

    public void duzenle(OtobusBileti otobusBileti)
    {
        this.otobusBileti = otobusBileti;
    }

    public void yenile()
    {
        otobusBileti = new OtobusBileti();
    }

    public void kaydet()
    {
        otobusBiletiService.kaydet(otobusBileti); // Yapilandirilan bilet kaydedildi.

        otobusBileti = new OtobusBileti(); // Yapilandirilmak uzere yeni bilet olusturuldu.

        otobusBiletiListesi = otobusBiletiService.tumVarliklariCek(); // Liste guncellendi.
    }

    public void biletleriGetir()
    {
        otobusBiletiListesi = otobusBiletiService.tumVarliklariCek();
    }
}
