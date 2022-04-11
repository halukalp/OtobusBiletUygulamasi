package com.akis_yazilim.oracle.melih.otobus_bilet.model.service;

import java.util.List;

public interface VarlikService<V, I>
{
    V idyeGoreBul(I id);

    List<V> tumVarliklariCek();

    V kaydet(V varlik);

    void sil(I id);
}
