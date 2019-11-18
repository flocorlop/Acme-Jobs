
package acme.features.administrator.investorRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.investorRecords.InvestorRecord;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractUpdateService;

@Service
public class AdministratorInvestorRecordUpdateService implements AbstractUpdateService<Administrator, InvestorRecord> {

	//	Internal state ---------------------

	@Autowired
	AdministratorInvestorRecordRepository repository;


	@Override
	public boolean authorise(final Request<InvestorRecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<InvestorRecord> request, final InvestorRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "sector", "statement", "stars");
	}

	@Override
	public void bind(final Request<InvestorRecord> request, final InvestorRecord entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors); //ejemplo: request.bind(entity, errors, "moment");
	}

	@Override
	public void validate(final Request<InvestorRecord> request, final InvestorRecord entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
		/*
		 * it can be used to validate that a deadline is in future,
		 * that a range is sequential, that a ticker is unique,
		 * or that an amount of money is positive and its currency is EUR.
		 */

	}

	@Override
	public InvestorRecord findOne(final Request<InvestorRecord> request) {
		assert request != null;
		InvestorRecord result;
		int id;
		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);
		return result;
	}

	@Override
	public void update(final Request<InvestorRecord> request, final InvestorRecord entity) {
		assert request != null;
		assert entity != null;

		/*
		 * ejemplo
		 * Date moment;
		 *
		 * moment = new Date(System.currentTimeMillis() - 1);
		 * entity.setMoment(moment);
		 * this.repository.save(entity);
		 */
		//		String name = entity.getName();
		//		entity.setName(name);
		//		String sector = entity.getSector();
		//		entity.setSector(sector);
		//		String statement = entity.getStatement();
		//		entity.setStatement(statement);
		//		Integer stars = entity.getStars();
		//		entity.setStars(stars);

		this.repository.save(entity);

	}

}
