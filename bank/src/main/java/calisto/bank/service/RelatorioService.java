package calisto.bank.service;

import calisto.bank.entity.Relatorio.Relatorio;
import calisto.bank.repository.RelatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatorioService {
    @Autowired
    private RelatorioRepository relatorioRepository;

    public String save(Relatorio relatorio) {

        this.relatorioRepository.save(relatorio);
        return "Relatorio salvo com sucesso!";
    }

    public String update(Relatorio relatorio, long id) {

        this.relatorioRepository.save(relatorio);
        return "Relatorio atualizado com sucesso!";
    }

    public String delete(long id) {
        this.relatorioRepository.deleteById(id);
        return "Relatorio deletado com sucesso!";
    }

    public List<Relatorio> findAll() {
        return this.relatorioRepository.findAll();
    }

    public Relatorio findById(long id) {
        return this.relatorioRepository.findById(id).get();
    }
}
