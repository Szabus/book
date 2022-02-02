package szabina.demo.books.repositories;

import org.springframework.data.repository.CrudRepository;
import szabina.demo.books.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
