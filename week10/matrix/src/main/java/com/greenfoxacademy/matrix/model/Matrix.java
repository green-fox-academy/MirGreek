package com.greenfoxacademy.matrix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Matrix {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String matrixNumbers;
  boolean isSquare;

  public Matrix(String matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }

  public Matrix() {
  }

  public Matrix(String matrixNumbers, boolean isSquare) {
    this.matrixNumbers = matrixNumbers;
    this.isSquare = isSquare;
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;

  }

  public String getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(String matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }
}
