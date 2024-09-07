package core.server;

public class LoginServer extends Thread {
	private static LoginServer instance;

	public static LoginServer getInstance () {
		return instance;
	}

	public static void initialize () {
		if (instance != null) {
			return;
		}

		instance = new LoginServer ();
	}

	private LoginServer () {
		//TODO
	}
}
