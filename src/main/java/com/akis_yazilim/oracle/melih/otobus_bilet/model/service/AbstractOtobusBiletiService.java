package com.akis_yazilim.oracle.melih.otobus_bilet.model.service;

import com.akis_yazilim.oracle.melih.otobus_bilet.model.entity.OtobusBileti;
import com.akis_yazilim.oracle.melih.otobus_bilet.model.repository.OtobusBiletiRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public abstract class AbstractOtobusBiletiService implements VarlikService<OtobusBileti, Integer>
{
    @Autowired
    protected OtobusBiletiRepository otobusBiletiRepository;

    protected abstract List<OtobusBileti> findByHareketZamaniGreaterThan(Date hareketZamani);

    protected abstract List<OtobusBileti> findByHareketZamaniLessThan(Date hareketZamani);
}
