/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mackleapes.crawler;

/**
 *
 * @author Lucas Hort
 */
public class SpiderTest {

    /**
     * This is our test. It creates a spider (which creates spider legs) and
     * crawls the web.
     *
     * @param args - not used
     */
    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.search("http://arstechnica.com/", "computer");
    }
}
