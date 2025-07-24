package calisto.bank.controller;

import calisto.bank.entity.Transacao.Transacao;
import calisto.bank.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacao")
public class TransacaoController {
    @Autowired

    private TransacaoService transacaoService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Transacao transacao) {
        try {
            String mensagem = transacaoService.save(transacao);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody Transacao transacao, @PathVariable long id) {
        try {
            String mensagem = transacaoService.update(transacao, id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        try {
            String mensagem = transacaoService.delete(id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Transacao>> findAll() {
        try {
            List<Transacao> transacaos = transacaoService.findAll();
            return new ResponseEntity<>(transacaos, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Transacao> findById(@PathVariable long id) {
        try {
            Transacao transacao = transacaoService.findById(id);
            return new ResponseEntity<>(transacao, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}
