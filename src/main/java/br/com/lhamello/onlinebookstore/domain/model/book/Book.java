package br.com.lhamello.onlinebookstore.domain.model.book;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.core.style.ToStringCreator;

@Entity
@Table(name = "BOOK")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String sku;
  private String name;
  private String description;
  @Column(name = "UNIT_PRICE")
  private BigDecimal unitPrice;
  @Column(name = "IMAGE_URL")
  private String imageUrl;
  private Boolean active;
  @Column(name = "UNITS_IN_STOCK")
  private int unitsInStock;
  @Column(name = "DATE_CREATED")
  private LocalDateTime createOn;
  @Column(name = "LAST_UPDATED")
  private LocalDateTime updatedOn;
  @ManyToOne
  @JoinColumn(name = "CATEGORY_ID", nullable = false)
  private BookCategory category;

  @Override
  public String toString() {
    return new ToStringCreator(this)
        .append("id", id)
        .append("sku", sku)
        .append("name", name)
        .append("description", description)
        .append("unitPrice", unitPrice)
        .append("imageUrl", imageUrl)
        .append("active", active)
        .append("unitsInStock", unitsInStock)
        .append("createOn", createOn)
        .append("updatedOn", updatedOn)
        .toString();
  }
}
