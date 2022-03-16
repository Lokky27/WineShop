package com.example.wine_shop_application.repositories;

import com.example.wine_shop_application.models.Wine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WineRepository extends JpaRepository<Wine, Long>
{

}
