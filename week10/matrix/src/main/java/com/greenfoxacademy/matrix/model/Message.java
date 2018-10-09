package com.greenfoxacademy.matrix.model;

public class Message {
  String message;
  String error;
  boolean squareMatrix;


  public Message() {
  }

  public Message(String message, String error, boolean squareMatrix) {
    this.message = "This is a square matrix :)";
    this.error = "This is not a square matrix";
    this.squareMatrix = false;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public boolean isSquareMatrix() {
    return squareMatrix;
  }

  public void setSquareMatrix(boolean squareMatrix) {
    this.squareMatrix = squareMatrix;
  }
}
