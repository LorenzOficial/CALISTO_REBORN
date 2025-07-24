package calisto.bank.service;

import calisto.bank.entity.Auditoria.Auditoria;
import calisto.bank.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditoriaService {
    @Autowired

    private AuditoriaRepository auditoriaRepository;

    public String save(Auditoria auditoria) {

        this.auditoriaRepository.save(auditoria);
        return "Auditoria salva com sucesso!";
    }

    public String update(Auditoria auditoria, long id) {

        this.auditoriaRepository.save(auditoria);
        return "Auditoria atualizada com sucesso!";
    }

    public String delete(long id) {
        this.auditoriaRepository.deleteById(id);
        return "Auditoria deletada com sucesso!";
    }

    public List<Auditoria> findAll() {
        return this.auditoriaRepository.findAll();
    }

    public Auditoria findById(long id) {
        return this.auditoriaRepository.findById(id).get();
    }
}
