package model;

import java.util.ArrayList;
import java.util.List;

/**
 * An argument -- a series of points.
 * 
 * @author Jonathan Lovelace
 * 
 */
public class Argument implements Point {
	/**
	 * Constructor.
	 */
	public Argument() {
		prefix = "Point";
		base = 'A';
		slug = "A sample slug";
		points = new ArrayList<Point>();
	}

	/**
	 * Constructor.
	 * 
	 * @param argPoints
	 *            The points in the argument.
	 */
	public Argument(final List<Point> argPoints) {
		prefix = "Point";
		base = 'A';
		slug = "A sample slug";
		points = new ArrayList<Point>(argPoints);
	}

	/**
	 * Explicit constructor.
	 * 
	 * @param argPoints
	 *            The points in the argument.
	 * @param numberPrefix
	 *            The prefix to every point's number
	 * @param baseNumber
	 *            The first number
	 * @param newSlug
	 *            The claim the argument supports
	 */
	public Argument(final List<Point> argPoints, final String numberPrefix,
			final char baseNumber, final String newSlug) {
		points = new ArrayList<Point>(argPoints);
		prefix = numberPrefix;
		base = baseNumber;
		slug = newSlug;
	}

	/**
	 * The points that make up the argument.
	 */
	private final List<Point> points;
	/**
	 * "Point" or "Subpoint", usually: This is what is read before each number.
	 * It shouldn't include a trailing space unless you want a double space.
	 */
	private String prefix;
	/**
	 * This is the "number" of the first point. ('1', 'a', etc.)
	 * 
	 * @todo TODO: How to do Roman numerals?
	 */
	private char base;
	/**
	 * The claim the argument is making.
	 */
	private String slug;

	/**
	 * FIXME: This probably shouldn't be final, but CheckStyle objects.
	 * 
	 * @return The argument as it should be read in-round.
	 */
	public final String asRead() {
		final StringBuffer buf = new StringBuffer(slug());
		for (int i = 0; i < points.size(); i++) {
			buf.append(prefix);
			buf.append(' ');
			buf.append(Character.valueOf(charAdd(base, (char) i)));
			buf.append(": ");
			buf.append(points.get(i).asRead());
			buf.append('\n');
		}
		return buf.toString();
	}

	/**
	 * Add two chars, because their sum is always promoted to int.
	 * 
	 * @param first
	 *            The first char
	 * @param second
	 *            The second char
	 * @return Their sum, as a char
	 */
	private static char charAdd(final char first, final char second) {
		return (char) (first + second);
	}

	/**
	 * @return The claim the argument is supporting.
	 */
	public final String slug() {
		return slug;
	}

	/**
	 * @param newSlug
	 *            The claim the argument is supporting
	 */
	public final void slug(final String newSlug) {
		slug = newSlug;
	}

	/**
	 * @return The prefix to every number
	 */
	public final String prefix() {
		return prefix;
	}

	/**
	 * @param numberPrefix
	 *            The prefix to every number
	 */
	public final void prefix(final String numberPrefix) {
		prefix = numberPrefix;
	}

	/**
	 * @return The number of the first point
	 */
	public final char base() {
		return base;
	}

	/**
	 * @param baseNumber
	 *            The number of the first point
	 */
	public final void base(final char baseNumber) {
		base = baseNumber;
	}
}
