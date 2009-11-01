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
	 * @param newAuthors
	 *            the new list of authors
	 */
	public final void setAuthors(final List<Author> newAuthors) {
		authors.clear();
		authors.addAll(newAuthors);
	}

	/**
	 * @return the title of the work
	 */
	public final String title() {
		return title;
	}

	/**
	 * @param newTitle
	 *            the title of the source
	 */
	public final void title(final String newTitle) {
		title = newTitle;
	}

	/**
	 * @return the date of the source.
	 */
	public final LocalDate date() {
		return date;
	}

	/**
	 * @param newDate
	 *            the date of the source
	 */
	public final void date(final LocalDate newDate) {
		date = newDate;
	}

	/**
	 * @return whether the source is out of date
	 */
	public final boolean outOfDate() {
		return outOfDate;
	}

	/**
	 * @param newOutOfDate
	 *            whether the source is out of date
	 */
	public final void outOfDate(final boolean newOutOfDate) {
		outOfDate = newOutOfDate;
	}

	/**
	 * Constructor with but one author.
	 * 
	 * @param primaryAuthor
	 *            The primary author
	 * @param newTitle
	 *            The title of the work
	 * @param newDate
	 *            The date of the work
	 * @param dated
	 *            Whether the work should be considered out of date.
	 */
	public Source(final Author primaryAuthor, final String newTitle,
			final LocalDate newDate, final boolean dated) {
		authors = new ArrayList<Author>();
		authors.add(primaryAuthor);
		title = newTitle;
		date = newDate;
		outOfDate = dated;
	}

	/**
	 * Constructor with potentially multiple authors.
	 * 
	 * @param newAuthors
	 *            The authors of the work
	 * @param newTitle
	 *            The title of the work
	 * @param newDate
	 *            The date of the work
	 * @param dated
	 *            Whether the work should be considered out of date
	 */
	public Source(final List<Author> newAuthors, final String newTitle,
			final LocalDate newDate, final boolean dated) {
		authors = new ArrayList<Author>(newAuthors);
		title = newTitle;
		date = newDate;
		outOfDate = dated;
	}

	// ESCA-JAVA0130:
	/**
	 * @note This should conform to citation standards laid out by debate
	 *       leagues.
	 * @return A summary form, suitable to be read in-round.
	 * @bug FIXME: Implement!
	 * FIXME: This shouldn't be final, but CheckStyle objects if it isn't.
	 */
	public final String summary() {
		return "";
	}
}
