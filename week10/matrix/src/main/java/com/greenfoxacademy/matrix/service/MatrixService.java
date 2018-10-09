package com.greenfoxacademy.matrix.service;

import com.greenfoxacademy.matrix.model.Matrix;
import org.springframework.stereotype.Service;

@Service
public interface MatrixService {

  public boolean checkIfMatrixIsSquared(Matrix matrix);
}
