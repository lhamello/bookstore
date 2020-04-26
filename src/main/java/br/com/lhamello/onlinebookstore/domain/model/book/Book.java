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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public int getUnitsInStock() {
    return unitsInStock;
  }

  public void setUnitsInStock(int unitsInStock) {
    this.unitsInStock = unitsInStock;
  }

  public LocalDateTime getCreateOn() {
    return createOn;
  }

  public void setCreateOn(LocalDateTime createOn) {
    this.createOn = createOn;
  }

  public LocalDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(LocalDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public BookCategory getCategory() {
    return category;
  }

  public void setCategory(BookCategory category) {
    this.category = category;
  }

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
