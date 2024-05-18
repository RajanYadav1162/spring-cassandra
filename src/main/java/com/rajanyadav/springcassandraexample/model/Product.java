package com.rajanyadav.springcassandraexample.model;

import java.util.UUID;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Product {
  @PrimaryKey
  private UUID id;
  private String name;

  public Product(UUID id, String name) {
    this.id = id;
    this.name = name;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
