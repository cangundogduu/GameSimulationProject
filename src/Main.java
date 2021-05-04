
import Business.Concrete.GameManager;
import Business.Concrete.PlayerManager;
import Business.Concrete.UserValidationManager;
import Entites.Concrete.Company;
import Entites.Concrete.Game;
import Entites.Concrete.Player;

public class Main {

	public static void main(String[] args) {
			Player player1=new Player(1,"Can","Gundogdu","1234456789",1990);
			Player player2=new Player(1,"Fatma","Gundogdu","1234456789",1992);
			
			Game game1=new Game(1,"FÝFA 2021","EA Games");
			Game game2=new Game(2,"PUB G","For PC");
			
			Company company1=new Company(1,"Özel indirim",20);
			
			PlayerManager playerManager=new PlayerManager(new UserValidationManager());
			playerManager.add(player2);
			playerManager.delete(player1);
			
		
			GameManager gameManager=new GameManager();
			gameManager.add(game1);
			gameManager.addCompany(game2, company1);
		
		
	}

}
