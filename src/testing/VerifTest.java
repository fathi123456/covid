package testing;

public class VerifTest {

	boolean testlogin(String login) {
	if( !login.contains("admin")) {
		return true;
	}
	
	else {
		return false;
	}
	}
	boolean motPasse(String motPasse)
	{
		if(!motPasse.contains("$")&& !motPasse.contains("&")) {
			return true;
		}
		else {
			return false;
		}
	}
}
