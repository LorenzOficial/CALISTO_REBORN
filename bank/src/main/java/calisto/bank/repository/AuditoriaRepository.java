package calisto.bank.repository;

import calisto.bank.entity.Auditoria.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriaRepository extends JpaRepository<Auditoria,Long> {
}
