package Business.Concrete;
import Business.Abstract.PlayerServicee;
import Business.Abstract.UserValidationService;
import Entites.Concrete.Player;

public class PlayerManager extends PlayerServicee{
	
	UserValidationService _userValidationService;
	

	public PlayerManager(UserValidationService _userValidationService) {
		super();
		this._userValidationService = _userValidationService;
	}

	@Override
	public void add(Player player) {
		if (_userValidationService.checkIfPerson(player)) {
			System.out.println(player.getFirstName()+" is added");
		}
		else {
			System.out.println(player.getFirstName()+" is not added");
		}
		
		
	}

	@Override
	public void delete(Player player) {
		if (_userValidationService.checkIfPerson(player)) {
			System.out.println(player.getFirstName()+" is delected");
		}
		else {
			System.out.println(player.getFirstName()+" is not delected");
		}
		
	}

	@Override
	public void update(Player player) {
		if (_userValidationService.checkIfPerson(player)) {
			System.out.println(player.getFirstName()+" is updated");
		}
		else {
			System.out.println(player.getFirstName()+" is not updated");
		}
		
	}
	
	
	

}
