package br.edu.IntegraTech.reporisotory;

import br.edu.IntegraTech.models.Item;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
