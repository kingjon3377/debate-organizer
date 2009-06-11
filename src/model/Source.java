package model;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
/**
 * A source of evidence.
 * 
 * @author Jonathan Lovelace
 * 
 */
public class Source {
	/**
	 * The authors of the source.
	 */
	private final List<Author> authors;
	/**
	 * The title of the source.
	 */
	private String title;
	/**
	 * The date of the source. (Oh, for some way to specify precision ...)
	 */
	private LocalDate date;
	// FIXME: What else goes here?
	/**
	 * Whether the source is out of date (and thus needs to be replaced).
	 */
	private boolean outOfDate;

	/**
	 * @return the primary author of the source
	 */
	public final Author primaryAuthor() {
		return authors.get(0);
	}

	/**
	 * @return the authors of the source
	 */
	public final List<Author> authors() {
		return new ArrayList<Author>(authors);
	}

	/**
	 * Add an author.
	 * 
	 * @param author
	 *            the author to add
	 */
	public final void addAuthor(final Author author) {
		authors.add(author);
	}

	/**
	 * Replace the list of authors.
	 * 
	 * @param _authors
	 *            the new list of authors
	 */
	public final void setAuthors(final List<Author> _authors) {
		authors.clear();
		authors.addAll(_authors);
	}

	/**
	 * @return the title of the work
	 */
	public final String title() {
		return title;
	}

	/**
	 * @param _title
	 *            the title of the source
	 */
	public final void title(final String _title) {
		title = _title;
	}

	/**
	 * @return the date of the source.
	 */
	public final LocalDate date() {
		return date;
	}

	/**
	 * @param _date
	 *            the date of the source
	 */
	public final void date(final LocalDate _date) {
		date = _date;
	}

	/**
	 * @return whether the source is out of date
	 */
	public final boolean outOfDate() {
		return outOfDate;
	}

	/**
	 * @param _outOfDate
	 *            whether the source is out of date
	 */
	public final void outOfDate(final boolean _outOfDate) {
		outOfDate = _outOfDate;
	}

	/**
	 * Constructor with but one author.
	 * 
	 * @param primaryAuthor
	 *            The primary author
	 * @param _title
	 *            The title of the work
	 * @param _date
	 *            The date of the work
	 * @param dated
	 *            Whether the work should be considered out of date.
	 */
	public Source(final Author primaryAuthor, final String _title,
			final LocalDate _date, final boolean dated) {
		authors = new ArrayList<Author>();
		authors.add(primaryAuthor);
		title = _title;
		date = _date;
		outOfDate = dated;
	}

	/**
	 * Constructor with potentially multiple authors.
	 * 
	 * @param _authors
	 *            The authors of the work
	 * @param _title
	 *            The title of the work
	 * @param _date
	 *            The date of the work
	 * @param dated
	 *            Whether the work should be considered out of date
	 */
	public Source(final List<Author> _authors, final String _title,
			final LocalDate _date, final boolean dated) {
		authors = new ArrayList<Author>(_authors);
		title = _title;
		date = _date;
		outOfDate = dated;
	}

	/**
	 * @note This should conform to citation standards laid out by debate
	 *       leagues.
	 * @return A summary form, suitable to be read in-round.
	 * @bug FIXME: Implement!
	 */
	public String summary() {
		return "";
	}
}
