package com.dio.diosantander.controller;

import com.dio.diosantander.Service.JornadaTrabalhoService;
import com.dio.diosantander.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") long idJornada) throws Exception {
        return ResponseEntity.ok( jornadaTrabalhoService.getById(idJornada).orElseThrow( () -> new Exception("Jornada não encontrada!!!")));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public Object DeleteJornadaById(@PathVariable("idJornada") long idJornada) throws Exception {
        try {
            jornadaTrabalhoService.deleteJornada(idJornada);
        }catch( Exception e) {
            return HttpStatus.BAD_REQUEST;
        }finally {
            return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
        }
    }
}
