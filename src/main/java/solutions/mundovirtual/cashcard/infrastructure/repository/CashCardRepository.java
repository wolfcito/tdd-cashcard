package solutions.mundovirtual.cashcard.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;
import solutions.mundovirtual.cashcard.domain.CashCard;

public interface CashCardRepository extends CrudRepository<CashCard, Long> {
}