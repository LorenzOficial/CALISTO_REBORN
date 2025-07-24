package calisto.bank.service;

import calisto.bank.entity.Endereco.Endereco;
import calisto.bank.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public String save(Endereco endereco) {

        this.enderecoRepository.save(endereco);
        return "Endereço salva com sucesso!";
    }

    public String update(Endereco endereco, long id) {

        this.enderecoRepository.save(endereco);
        return "Endereço atualizada com sucesso!";
    }

    public String delete(long id) {
        this.enderecoRepository.deleteById(id);
        return "Endereço deletada com sucesso!";
    }

    public List<Endereco> findAll() {
        return this.enderecoRepository.findAll();
    }

    public Endereco findById(long id) {
        return this.enderecoRepository.findById(id).get();
    }
}
