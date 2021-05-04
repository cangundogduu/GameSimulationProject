package Business.Concrete;

import Business.Abstract.UserValidationService;
import Entites.Concrete.Player;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean checkIfPerson(Player player) {
		if (player.getBirthYear()>0&&player.getNationalityId()!=null) {
			System.out.println("Kimlik doðrulandý");
			return true;
		}
		else {
			System.out.println("Kimlik doðrulanamadý");
			return false;
			
		}
		
	}

}
