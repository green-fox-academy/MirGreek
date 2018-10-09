package com.greenfoxacademy.matrix.model;

import java.util.List;

public class Matrix {
  List<String> matrixNumbers;

  public Matrix(List<String> matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }

  public Matrix() {
  }

  public List<String> getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(List<String> matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }
}
