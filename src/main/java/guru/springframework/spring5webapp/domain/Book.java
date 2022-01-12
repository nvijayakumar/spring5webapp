/**
 * 
 */
package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author vijayakumar
 * @Since  09-Jan-2022
 *
 */
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;
	private String isbn;
	
	@ManyToMany
	@JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), 
		inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author> authors = new HashSet<Author>();
	
	@ManyToOne
	private Publisher publisher;
	
	public Book() {
	}
	
	public Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=").append(id).append(", title=").append(title).append(", isbn=").append(isbn)
				.append("]");
		return builder.toString();
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
}
