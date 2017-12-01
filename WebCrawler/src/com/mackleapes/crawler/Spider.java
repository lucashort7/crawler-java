/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mackleapes.crawler;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lucas Hort start : 01/12
 *
 * - REQUISITS - Retrieve a web page (we'll call it a document) from a website
 * Collect all the links on that document Collect all the words on that document
 * See if the word we're looking for is contained in the list of words Visit the
 * next link Keep track of pages that we've already visited Put a limit on the
 * number of pages to search so this doesn't run for eternity.
 *
 *
 */
public class Spider {

    // Fields
    private static final int MAX_PAGES_TO_SEARCH = 10;
    private Set<String> pagesVisited = new HashSet<String>();
    private List<String> pagesToVisit = new LinkedList<String>();

    
    private String nextUrl() {
        String nextUrl;

        do {
            nextUrl = this.pagesToVisit.remove(0);
        } while (this.pagesVisited.contains(nextUrl));

        this.pagesVisited.add(nextUrl);
        return nextUrl;
    }

}
