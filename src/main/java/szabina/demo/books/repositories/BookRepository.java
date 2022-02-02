package szabina.demo.books.repositories;

import org.springframework.data.repository.CrudRepository;
import szabina.demo.books.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
