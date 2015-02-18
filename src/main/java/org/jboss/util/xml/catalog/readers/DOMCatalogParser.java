/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc., and individual contributors as indicated
 * by the @authors tag.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// DOMCatalogParser.java - An interface for reading catalog files

package org.jboss.util.xml.catalog.readers;

import org.jboss.util.xml.catalog.Catalog;
import org.w3c.dom.Node;

/**
 * The DOMCatalogParser interface.
 *
 * <p>This interface must be implemented in order for a class to
 * participate as a parser for the DOMCatalogReader.
 *
 * @see Catalog
 * @see DOMCatalogReader
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
public interface DOMCatalogParser {
    /**
     * Parse a DOM node as a catalog entry.
     *
     * <p>This method is expected to analyze the specified node and
     * construct appropriate catalog entry(ies) from it.</p>
     *
     * @param catalog The catalog for which this node is being considered.
     * @param node The DOM Node from the catalog.
     */
    public void parseCatalogEntry(Catalog catalog, Node node);
}
