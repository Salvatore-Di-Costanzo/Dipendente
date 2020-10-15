package com.alten.dipendenti.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table( name = "dipendenti")
public class Dipendente {

    // Definisco i campi

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column ( name = "id")
    private int id;

    @Column ( name = "first_name" )
    private String nome;

    @Column ( name = "last_name" )
    private String cognome;

    @Column ( name = "email" )
    private String email;

    public Dipendente() {    }

    public Dipendente(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
