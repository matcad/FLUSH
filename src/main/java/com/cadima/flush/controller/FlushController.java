package com.cadima.flush.controller;
import com.cadima.flush.entity.Flush;
import com.cadima.flush.repository.FlushRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FlushController {

        private FlushRepository repository;

        @Autowired
        FlushController(FlushRepository repository){
            this.repository=repository;
        }

        @GetMapping("/flushes")
        public List<Flush> getAllFlushes() {
            return repository.findAll();
        }

        @GetMapping("/flush")
        public List<Flush> FlushList() {
            return repository.findAll();
        }

//        @GetMapping("/flush/{id}")
//        public Flush getFlush(@PathVariable(value="id") Long id){
//            return repository.findById(id);
//        }

        @PostMapping("/flush")
        public Flush addFlush(@RequestBody Flush flush) {
            return repository.save(flush);
        }

        @DeleteMapping("/flush/{id}")
        public void delete(@PathVariable(value = "id") Long id) {
            repository.deleteById(id);
        }



}
