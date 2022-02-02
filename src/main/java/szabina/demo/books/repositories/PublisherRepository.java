package szabina.demo.books.repositories;

import org.springframework.data.repository.CrudRepository;
import szabina.demo.books.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
