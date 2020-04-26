package br.com.lhamello.onlinebookstore.domain.model.book;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.core.style.ToStringCreator;

@Entity
@Table(name = "CATEGORY")
public class BookCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
  private Set<Book> books;

  @Override
  public String toString() {
    return new ToStringCreator(this)
        .append("id", id)
        .append("name", name)
        .toString();
  }
}
