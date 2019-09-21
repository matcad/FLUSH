package com.cadima.flush.repository;

import com.cadima.flush.entity.Flush;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FlushRepository extends CrudRepository<Flush, Long> {

    List<Flush> findAll();
//    Flush findById(Long id);
}
