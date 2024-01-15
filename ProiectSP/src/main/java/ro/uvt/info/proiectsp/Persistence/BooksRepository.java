package ro.uvt.info.proiectsp.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.proiectsp.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}