package net.explorviz.api;

/**
 * API for ExplorViz Extensions
 *
 * @author Christian Zirkelbach (czi@informatik.uni-kiel.de)
 *
 */
public final class API {

	private API() {
		// no need to instantiate
	}

	/**
	 * Provides the ExplorViz API for backend extensions
	 */
	public static ExtensionAPIImpl get() {
		return ExtensionAPIImpl.getInstance();
	}
}
