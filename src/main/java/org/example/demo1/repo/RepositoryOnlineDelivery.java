package org.example.demo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOnlineDelivery extends JpaRepository<OnlineDelivery, Long> {
}