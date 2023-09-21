package preparattionException;

public class Login {
public void checkPassword(String pass) throws PasswordException {
	try {
	if(pass.length()>8) {
		System.out.println("Successfully Logined");
	}
	else {
		throw new PasswordException("Length is too high");
	}
	}
	catch(PasswordException pe) {
		System.out.println(pe);
		pe.printStackTrace();
	}
}
}
