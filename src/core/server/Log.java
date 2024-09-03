package core.server;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Log {
	private static final String LOGGER_PROPERTIES_PATH = "./config/log4j2.xml";
	private static Log instance;

	public static Log getInstance () {
		return instance;
	}

	public static void initialize () {
		if (instance != null) {
			return;
		}

		instance = new Log ();
	}

	private Log () {
		FileInputStream configFile;
		try {
			configFile = new FileInputStream (LOGGER_PROPERTIES_PATH);

			ConfigurationSource source = new ConfigurationSource (configFile);
			Configurator.initialize (null, source);
		} catch (FileNotFoundException e) {

			//TODO: Create default configuration XML File

		} catch (Exception e) {
			e.printStackTrace ();
			System.exit (-1);
		}
	}
}
