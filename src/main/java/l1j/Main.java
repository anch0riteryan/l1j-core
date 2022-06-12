package l1j;

import l1j.server.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	public static void main (String[] args) {
		Log.initialize ();

		Logger log = LoggerFactory.getLogger (Main.class);
	}
}
