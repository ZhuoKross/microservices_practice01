package com.microservice.host.Repository;

import com.microservice.host.Entity.Host;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostRepository extends JpaRepository<Host, Long> {
}
