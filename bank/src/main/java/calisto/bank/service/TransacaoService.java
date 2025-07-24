package calisto.bank.service;

import calisto.bank.entity.Transacao.Transacao;
import calisto.bank.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    public String save(Transacao transacao) {

        this.transacaoRepository.save(transacao);
        return "Transacao salva com sucesso!";
    }

    public String update(Transacao transacao, long id) {

        this.transacaoRepository.save(transacao);
        return "Transacao atualizada com sucesso!";
    }

    public String delete(long id) {
        this.transacaoRepository.deleteById(id);
        return "Transacao deletada com sucesso!";
    }

    public List<Transacao> findAll() {
        return this.transacaoRepository.findAll();
    }

    public Transacao findById(long id) {
        return this.transacaoRepository.findById(id).get();
    }
}
