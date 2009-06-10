package model;

/**
 * An author of a source.
 * 
 * @author Jonathan Lovelace
 */
public class Author {
	/**
	 * The author's name.
	 */
	private String name;
	/**
	 * What qualifications the author has -- why we should trust him or her.
	 */
	private String quals;

	/**
	 * @return the author's name
	 */
	public final String name() {
		return name;
	}

	/**
	 * @return the author's qualifications
	 */
	public final String quals() {
		return quals;
	}

	/**
	 * @param _name
	 *            the author's name
	 */
	public final void name(final String _name) {
		name = _name;
	}

	/**
	 * @param _quals
	 *            the author's qualifications
	 */
	public final void quals(final String _quals) {
		quals = _quals;
	}

	/**
	 * Constructor.
	 * 
	 * @param _name
	 *            the author's name
	 * @param _quals
	 *            the author's qualifications
	 */
	public Author(final String _name, final String _quals) {
		name = _name;
		quals = _quals;
	}
}
