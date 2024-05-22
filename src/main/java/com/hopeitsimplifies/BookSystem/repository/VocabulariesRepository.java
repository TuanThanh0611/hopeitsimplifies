package com.hopeitsimplifies.BookSystem.repository;
import com.hopeitsimplifies.BookSystem.models.Vocabulary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VocabulariesRepository extends JpaRepository<Vocabulary,Integer> {
}
