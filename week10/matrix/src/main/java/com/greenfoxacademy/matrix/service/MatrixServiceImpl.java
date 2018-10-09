package com.greenfoxacademy.matrix.service;

import com.greenfoxacademy.matrix.model.Matrix;
import com.greenfoxacademy.matrix.repository.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatrixServiceImpl implements MatrixService {

  MatrixRepository matrixRepository;

  @Autowired
  public MatrixServiceImpl(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }

  @Override
  public boolean checkIfMatrixIsSquared(Matrix matrix) {
    //char[] charNumbers= new char[matrix.getMatrixNumbers().length()] ;
    String[] oneLine = matrix.getMatrixNumbers().split("[\\r\\n]");

    for (int i = 0; i <matrix.getMatrixNumbers().length() ; i++) {
       if( oneLine[i].length()== oneLine.length){
          matrixRepository.save(matrix);
          return true;
       }
    }
    return false;
  }
}
