package com.microservice.host.Repository;

import com.microservice.host.Entity.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HostRepository extends JpaRepository<Host, Long> {

}
