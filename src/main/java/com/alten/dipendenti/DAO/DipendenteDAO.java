package com.alten.dipendenti.DAO;


import com.alten.dipendenti.Entity.Dipendente;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface DipendenteDAO {

    public List<Dipendente> getDipendenti();

    public List<Dipendente>  getDipendente(int id);

    public void setDipendente(Dipendente user);


}
