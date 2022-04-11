package com.akis_yazilim.oracle.melih.otobus_bilet.model.repository;

import com.akis_yazilim.oracle.melih.otobus_bilet.model.entity.OtobusBileti;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OtobusBiletiRepository extends JpaRepository<OtobusBileti, Integer>
{

    // SELECT * FROM OTOBUS_BILETLERI WHERE HAREKET_ZAMANI > ?;
    List<OtobusBileti> findByHareketZamaniGreaterThan(Date hareketZamani);

    // SELECT * FROM OTOBUS_BILETLERI WHERE HAREKET_ZAMANI < ?;
    List<OtobusBileti> findByHareketZamaniLessThan(Date hareketZamani);
}
