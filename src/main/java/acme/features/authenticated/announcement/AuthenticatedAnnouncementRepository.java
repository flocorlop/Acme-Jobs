
package acme.features.authenticated.announcement;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.announcements.Announcement;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedAnnouncementRepository extends AbstractRepository {

	@Query("select a from Announcement a where datediff(current_timestamp, a.moment)<30")
	Collection<Announcement> findManyAll();

	@Query("select a from Announcement a where a.id = ?1")
	Announcement findOneById(int id);

}
