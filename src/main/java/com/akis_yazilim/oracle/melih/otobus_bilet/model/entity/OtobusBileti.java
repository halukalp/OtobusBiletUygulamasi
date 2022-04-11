package com.akis_yazilim.oracle.melih.otobus_bilet.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@SequenceGenerator(name = "OTOBUS_BILETI_ID_SEQ", sequenceName = "OTOBUS_BILETI_ID_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "OTOBUS_BILETLERI")
@Entity
public class OtobusBileti
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OTOBUS_BILETI_ID_SEQ")
    @Column(name = "OTOBUS_BILETI_ID")
    @Id
    private Integer otobusBiletiID;

    private String firma;

    private String nereden;

    private String nereye;

    @Column(name = "HAREKET_ZAMANI")
    private String hareketZamani;
}
