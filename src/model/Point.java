package model;

/**
 * A part of an argument -- something that can be read as a (possibly lengthy)
 * bullet point in an argument. This includes cards, analyses (which count as
 * cards in this model), and arguments (a series of subpoints).
 * 
 * @author Jonathan Lovelace
 * 
 */
public interface Point {
	/**
	 * @return The text of the point as it should be read in most cases
	 */
	String asRead();
	/**
	 * @return The claim the point is making
	 */
	String slug();
}
