package calisto.bank.controller;

import calisto.bank.entity.Relatorio.Relatorio;
import calisto.bank.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/relatorio")
public class RelatorioController {
    @Autowired

    private RelatorioService relatorioService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Relatorio relatorio) {
        try {
            String mensagem = relatorioService.save(relatorio);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody Relatorio relatorio, @PathVariable long id) {
        try {
            String mensagem = relatorioService.update(relatorio, id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        try {
            String mensagem = relatorioService.delete(id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<Relatorio>> findAll() {
        try {
            List<Relatorio> relatorios = relatorioService.findAll();
            return new ResponseEntity<>(relatorios, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Relatorio> findById(@PathVariable long id) {
        try {
            Relatorio relatorio = relatorioService.findById(id);
            return new ResponseEntity<>(relatorio, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    
    
    
    
    
}
