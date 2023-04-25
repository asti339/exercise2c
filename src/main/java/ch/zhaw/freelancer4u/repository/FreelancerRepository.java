package ch.zhaw.freelancer4u.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import ch.zhaw.freelancer4u.model.Freelancer;

public interface FreelancerRepository extends MongoRepository<Freelancer,String>{
   Page <Freelancer> findFirstByEmail(String email, Pageable pageable);

Freelancer findFirstByEmail(String freelancerEmail, Object pageable);
}
