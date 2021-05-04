package Business.Abstract;

import Entites.Concrete.Company;
import Entites.Concrete.Game;

public interface CompanyService {
	void addCompany(Game game,Company company);
	void deleteCompany(Game game,Company company);
	void updateCompany(Game game,Company company);
}
