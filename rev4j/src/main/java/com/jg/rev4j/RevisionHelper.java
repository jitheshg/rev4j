/**
 * 
 */
package com.jg.rev4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jg.rev4j.core.JRev;
import com.jg.rev4j.core.JRevType;
import com.jg.rev4j.core.impl.JRevJSONImpl;
import com.jg.rev4j.core.json.JSONHelper;

/**
 * 
 * @author Jithesh G
 *
 */
public class RevisionHelper {

	private static Logger log = LoggerFactory.getLogger(RevisionHelper.class);
	
	private JRevType jRevType;
	
	/**
	 * Use static factory method to obtain an instance of <code>RevisionHelper</code>,
	 * {@link RevisionHelper#getInstance()}
	 * 
	 * @return a new instance of <code>RevisionHelper</code>.
	 */
	public static RevisionHelper getInstance() {
		return new RevisionHelper();
	}
	
	protected RevisionHelper() {
	}
	
	public RevisionHelper withType(JRevType jRevType) {
		this.jRevType = jRevType;
		return this;
	}
	
	public JRev build() {
		switch (this.jRevType) {
			case JREV_JSON:
				return new JRevJSONImpl(new JSONHelper());
			default:
				throw new UnsupportedOperationException("The type is not supported.");
		}
	}
}
