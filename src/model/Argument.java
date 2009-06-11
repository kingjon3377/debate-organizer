package model;

import java.util.ArrayList;
import java.util.List;

/**
 * An argument -- a series of points.
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
	 * @param _points The points in the argument.
	 */
	public Argument(final List<Point> _points) {
		prefix = "Point";
		base = 'A';
		slug = "A sample slug";
		points = new ArrayList<Point>(_points);
	}
	/**
	 * Explicit constructor.
	 * @param _points The points in the argument.
	 * @param _prefix The prefix to every point's number
	 * @param _base The first number
	 * @param _slug The claim the argument supports
	 */
	public Argument(final List<Point> _points, final String _prefix, final char _base, final String _slug) {
		points = new ArrayList<Point>(_points);
		prefix = _prefix;
		base = _base;
		slug = _slug;
	}
	/**
	 * The points that make up the argument.
	 */
	private final List<Point> points;
	/**
	 * "Point" or "Subpoint", usually: This is what is read before
	 * each number. It shouldn't include a trailing space unless you
	 * want a double space.
	 */
	private String prefix;
	/**
	 * This is the "number" of the first point. ('1', 'a', etc.)
	 * @todo TODO: How to do Roman numerals?

	 */
	private char base;
	/**
	 * The claim the argument is making
	 */
	private String slug;
	/**
	 * @return The argument as it should be read in-round
	 */
	public String asRead() {
		final StringBuffer buf = new StringBuffer(slug());
		for (int i = 0; i < points.size(); i++) {
			buf.append(prefix);
			buf.append(' ');
			buf.append(Character.valueOf(charAdd(base, (char) i)));
			buf.append(": ");
			buf.append(points.get(i).asRead());
			buf.append('\n');
//			index++;
		}
		return buf.toString();
	}
	/**
	 * Add two chars, because their sum is always promoted to int.
	 * @param first The first char
	 * @param second The second char
	 * @return Their sum, as a char
	 */
	private static char charAdd(final char first, final char second) {
		return (char) (first + second);
	}
	/**
	 * @return The claim the argument is supporting.
	 */
	public String slug() {
		return slug;
	}
	/**
	 * @param _slug The claim the argument is supporting
	 */
	public void slug(final String _slug) {
		slug = _slug;
	}
	/**
	 * @return The prefix to every number
	 */
	public String prefix() {
		return prefix;
	}
	/**
	 * @param _prefix The prefix to every number
	 */
	public void prefix(final String _prefix) {
		prefix = _prefix;
	}
	/**
	 * @return The number of the first point
	 */
	public char base() {
		return base;
	}
	/**
	 * @param _base The number of the first point
	 */
	public void base(final char _base) {
		base = _base;
	}
}
