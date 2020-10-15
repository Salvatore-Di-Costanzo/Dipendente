package com.alten.dipendenti.Service;

import com.alten.dipendenti.Entity.Dipendente;

import java.util.List;

public interface DipendenteService {

    public List<Dipendente> getDipendenti();

    public List<Dipendente> getDipendete(int id);

}
