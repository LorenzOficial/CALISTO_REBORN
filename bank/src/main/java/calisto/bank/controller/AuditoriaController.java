package calisto.bank.controller;

import calisto.bank.entity.Auditoria.Auditoria;
import calisto.bank.service.AuditoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auditoria")
public class AuditoriaController {
    @Autowired

    private AuditoriaService auditoriaService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Auditoria auditoria) {
        try {
            String mensagem = auditoriaService.save(auditoria);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody Auditoria auditoria, @PathVariable long id) {
        try {
            String mensagem = auditoriaService.update(auditoria, id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        try {
            String mensagem = auditoriaService.delete(id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<Auditoria>> findAll() {
        try {
        List<Auditoria> auditorias = auditoriaService.findAll();
        return new ResponseEntity<>(auditorias, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Auditoria> findById(@PathVariable long id) {
        try {
            Auditoria auditoria = auditoriaService.findById(id);
            return new ResponseEntity<>(auditoria, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}