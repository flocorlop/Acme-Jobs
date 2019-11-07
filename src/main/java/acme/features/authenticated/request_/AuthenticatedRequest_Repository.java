
package acme.features.authenticated.request_;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.entities.requests_.Request_;
import acme.framework.repositories.AbstractRepository;

public interface AuthenticatedRequest_Repository extends AbstractRepository {

	@Query("select r from Request_ r")
	Collection<Request_> findManyAll();

	@Query("select r from Request_ r where r.id = ?1")
	Request_ findOneById(int id);
}
