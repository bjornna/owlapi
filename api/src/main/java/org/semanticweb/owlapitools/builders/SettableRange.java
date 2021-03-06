package org.semanticweb.owlapitools.builders;

import org.semanticweb.owlapi.model.HasRange;
import org.semanticweb.owlapi.model.OWLObject;

/**
 * An interface for objects which have a settable range attribute.
 * 
 * @author ignazio
 * @param <B>
 *        type of builder
 * @param <R>
 *        type of range
 */
public interface SettableRange<R extends OWLObject, B> extends HasRange<R> {

    /**
     * @param range
     *        range to set
     * @return builder
     */
    B withRange(R range);
}
