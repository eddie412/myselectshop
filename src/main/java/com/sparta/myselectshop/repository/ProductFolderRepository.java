package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
}
