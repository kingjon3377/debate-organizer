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
	 * @param cardSlug
	 *            The claim that the evidence makes
	 */
	public final void slug(final String cardSlug) {
		slug = cardSlug;
	}

	/**
	 * @return Where the evidence is taken from
	 */
	public final Source source() {
		return source;
	}

	/**
	 * @param cardSource
	 *            Where the evidence is taken from
	 */
	public final void source(final Source cardSource) {
		source = cardSource;
	}

	/**
	 * @return The text of the evidence
	 */
	public final String text() {
		return text;
	}

	/**
	 * @param cardText
	 *            The text of the evidence
	 */
	public final void text(final String cardText) {
		text = cardText;
	}

	/**
	 * Constructor.
	 * 
	 * @param cardSource
	 *            The source of the card.
	 * @param cardSlug
	 *            The claim the evidence makes.
	 * @param cardText
	 *            The text of the evidence.
	 */
	public Card(final Source cardSource, final String cardSlug, final String cardText) {
		source = cardSource;
		slug = cardSlug;
		text = cardText;
	}

	/**
	 * FIXME: This probably shouldn't be final, but CheckStyle objects.
	 * 
	 * @return The card as it should be read in the round.
	 */
	public final String asRead() {
		return slug + " From " + source.summary() + ": " + text;
	}
}
