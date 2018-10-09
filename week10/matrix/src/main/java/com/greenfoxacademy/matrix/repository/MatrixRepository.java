package com.greenfoxacademy.matrix.repository;

import com.greenfoxacademy.matrix.model.Matrix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatrixRepository extends CrudRepository<Matrix,Long> {
}
