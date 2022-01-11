package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import guru.springframework.spring5webapp.domain.Publisher;

public interface PublisherRepository extends PagingAndSortingRepository<Publisher, Long> {

}
