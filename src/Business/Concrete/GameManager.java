package Business.Concrete;

import Business.Abstract.CompanyService;
import Business.Abstract.GameService;
import Entites.Concrete.Company;
import Entites.Concrete.Game;

public class GameManager implements GameService,CompanyService{

	@Override
	public void add(Game game) {
		System.out.println("Game is added : "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game is  delected"+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game is updated"+game.getGameName());
		
	}

	@Override
	public void addCompany(Game game, Company company) {
		System.out.println("Campaign game added :"+game.getGameName()+" "+company.getCompanyName());
		
	}

	@Override
	public void deleteCompany(Game game, Company company) {
		System.out.println("Campaign game delected :"+game.getGameName()+" "+company.getCompanyName());
		
	}

	@Override
	public void updateCompany(Game game, Company company) {
		System.out.println("Campaign game updated :"+game.getGameName()+" "+company.getCompanyName());
		
	}

}
