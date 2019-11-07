
package acme.entities.configuration;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Configuration extends DomainEntity {

	//serialisation identifier
	private static final long	serialVersionUID	= 1L;

	//atributos

	private String				title;

	private Double				spamThreshold;

	//@ElementCollection(targetClass = String.class)
	@ElementCollection(fetch = FetchType.EAGER)
	private Collection<String>	spamWords;

}
