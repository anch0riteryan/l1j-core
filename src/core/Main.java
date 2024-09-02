package core;

import core.server.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	public static void main (String[] argv) {
		Log.initialize ();
		Logger log = LoggerFactory.getLogger (Main.class);
	}
}
