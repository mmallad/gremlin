package com.tinkerpop.gremlin.model;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 * @version 0.1
 */
public interface Edge extends Element {

    public Vertex getOutVertex();

    public Vertex getInVertex();

    public String getLabel();

}
