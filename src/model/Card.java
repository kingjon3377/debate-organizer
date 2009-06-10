package model;

/**
 * A piece of evidence.
 * 
 * @author Jonathan Lovelace
 * 
 */
public class Card implements Point {
	/**
	 * The claim that the evidence makes.
	 */
	private String slug;
	/**
	 * Where the evidence is taken from.
	 */
	private Source source;
	/**
	 * The text of the evidence.
	 */
	private String text;

	/**
	 * @return The claim that the evidence makes
	 */
	public final String slug() {
		return slug;
	}

	/**
	 * @param _slug The claim that the evidence makes
	 */
	public final void slug(final String _slug) {
		slug = _slug;
	}

	/**
	 * @return Where the evidence is taken from
	 */
	public final Source source() {
		return source;
	}

	/**
	 * @param _source Where the evidence is taken from
	 */
	public final void source(final Source _source) {
		source = _source;
	}

	/**
	 * @return The text of the evidence
	 */
	public final String text() {
		return text;
	}

	/**
	 * @param _text The text of the evidence
	 */
	public final void text(final String _text) {
		text = _text;
	}

	/**
	 * Constructor.
	 * 
	 * @param _source
	 *            The source of the card.
	 * @param _slug
	 *            The claim the evidence makes.
	 * @param _text
	 *            The text of the evidence.
	 */
	public Card(final Source _source, final String _slug, final String _text) {
		source = _source;
		slug = _slug;
		text = _text;
	}
	/**
	 * @return The card as it should be read in the round.
	 */
	public String asRead() {
		return slug + " From " + source.summary() + ": " + text;
	}
}
