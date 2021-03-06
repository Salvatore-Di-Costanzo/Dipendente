package com.alten.dipendenti.controller;

import com.alten.dipendenti.Entity.Dipendente;
import com.alten.dipendenti.Service.DipendenteService;
import com.alten.dipendenti.Service.DipendenteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    private DipendenteService dipendenteService;

    @GetMapping("/dipendenti")
    public List<Dipendente> getDipendenti(){
        return dipendenteService.getDipendenti();
    }

    @GetMapping("/dipendenti/{id}")
    public List<Dipendente> getDipendente(@PathVariable int id) {
        return dipendenteService.getDipendete(id);
    }


    @PostMapping("/insert")
    public void setDipendente(@RequestBody Dipendente dipendente){
        dipendenteService.setDipendente(dipendente);
    }

}
