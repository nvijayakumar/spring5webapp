package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import guru.springframework.spring5webapp.domain.Author;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long>{

}
