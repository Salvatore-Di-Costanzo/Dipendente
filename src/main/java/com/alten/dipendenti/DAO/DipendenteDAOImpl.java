package com.alten.dipendenti.DAO;

import com.alten.dipendenti.Entity.Dipendente;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class DipendenteDAOImpl implements DipendenteDAO {

    private EntityManager entityManager;

    public DipendenteDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Dipendente> getDipendenti() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Dipendente> theQuery =
                currentSession.createQuery("from Dipendente",Dipendente.class);

        return theQuery.getResultList();

    }

    @Override
    public List<Dipendente> getDipendente(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery =
                currentSession.createQuery("from Dipendente where id=:idDipendente",Dipendente.class);
        theQuery.setParameter("idDipendente",id);

        return theQuery.getResultList();
    }

    @Override
    public void setDipendente(Dipendente user) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.save(user);
    }
}
