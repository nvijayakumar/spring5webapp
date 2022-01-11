package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import guru.springframework.spring5webapp.domain.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Long>{

}
