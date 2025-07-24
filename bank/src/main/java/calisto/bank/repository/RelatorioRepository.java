package calisto.bank.repository;

import calisto.bank.entity.Relatorio.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {
}
