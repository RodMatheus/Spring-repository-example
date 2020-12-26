package com.example.demo.persistence;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.persistence.infra.ExampleRepositoryCustom;

import com.example.demo.entities.Example;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long>,  ExampleRepositoryCustom {

		Long countByName(String name);

		@Query("FROM Example e WHERE e.id = :id")
		Optional<Example> findById(Long id);

		@Modifying
		@Query("UPDATE FROM Example e SET e.name = :name WHERE e.id = :id")
		void updateName(@Param("id") Long id, @Param("name") String name);
}
