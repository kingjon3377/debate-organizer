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
	 * @param authName
	 *            the author's name
	 */
	public final void name(final String authName) {
		name = authName;
	}

	/**
	 * @param authQuals
	 *            the author's qualifications
	 */
	public final void quals(final String authQuals) {
		quals = authQuals;
	}

	/**
	 * Constructor.
	 *
	 * @param authName
	 *            the author's name
	 * @param authQuals
	 *            the author's qualifications
	 */
	public Author(final String authName, final String authQuals) {
		name = authName;
		quals = authQuals;
	}
}
