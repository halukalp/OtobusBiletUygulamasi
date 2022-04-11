package com.akis_yazilim.oracle.melih.otobus_bilet.model.service;

import com.akis_yazilim.oracle.melih.otobus_bilet.model.entity.OtobusBileti;
import com.akis_yazilim.oracle.melih.otobus_bilet.utility.IstisnaMesajTipi;
import com.akis_yazilim.oracle.melih.otobus_bilet.utility.Util;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OtobusBiletiService extends AbstractOtobusBiletiService
{
    @Override
    protected List<OtobusBileti> findByHareketZamaniGreaterThan(Date hareketZamani)
    {
        return otobusBiletiRepository.findByHareketZamaniGreaterThan(hareketZamani);
    }

    @Override
    protected List<OtobusBileti> findByHareketZamaniLessThan(Date hareketZamani)
    {
        return otobusBiletiRepository.findByHareketZamaniLessThan(hareketZamani);
    }

    @Override
    public OtobusBileti idyeGoreBul(Integer id)
    {
        OtobusBileti otobusBileti = otobusBiletiRepository.findById(id)
                                   .orElseThrow(() -> new RuntimeException(IstisnaMesajTipi.IDYE_GORE_BUL.getDeger()));

        return otobusBileti;
    }

    @Override
    public List<OtobusBileti> tumVarliklariCek()
    {
        return otobusBiletiRepository.findAll();
    }

    @Override
    public OtobusBileti kaydet(OtobusBileti varlik)
    {
        try
        {
            return otobusBiletiRepository.save(varlik);
        }
        catch (IllegalArgumentException e)
        {
            Util.istisnaBilgisiGoster(e);
            return null;
        }
    }

    @Override
    public void sil(Integer id)
    {
        try
        {
            otobusBiletiRepository.deleteById(id);
        }
        catch (IllegalArgumentException e)
        {
            Util.istisnaBilgisiGoster(e);
        }
    }
}
