package com.alten.dipendenti.Service;

import com.alten.dipendenti.DAO.DipendenteDAO;
import com.alten.dipendenti.Entity.Dipendente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DipendenteServiceImpl implements DipendenteService {

    @Autowired
    private DipendenteDAO dipendenteDAO;


    @Override
    @Transactional
    public List<Dipendente> getDipendenti() {
        return dipendenteDAO.getDipendenti();
    }

    @Override
    @Transactional
    public List<Dipendente> getDipendete(int id) {
        return dipendenteDAO.getDipendente(id);
    }
}
