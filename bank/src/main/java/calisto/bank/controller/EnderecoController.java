package calisto.bank.controller;

import calisto.bank.entity.Endereco.Endereco;
import calisto.bank.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/endereco")

public class EnderecoController {
    @Autowired

    private EnderecoService enderecoService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Endereco endereco) {
        try {
            String mensagem = enderecoService.save(endereco);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody Endereco endereco, @PathVariable long id) {
        try {
            String mensagem = enderecoService.update(endereco, id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        try {
            String mensagem = enderecoService.delete(id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<Endereco>> findAll() {
        try {
            List<Endereco> enderecos = enderecoService.findAll();
            return new ResponseEntity<>(enderecos, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Endereco> findById(@PathVariable long id) {
        try {
            Endereco endereco = enderecoService.findById(id);
            return new ResponseEntity<>(endereco, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
