/*
 * Copyright (c) 2005 Brian Goetz and Tim Peierls
 * Released under the Creative Commons Attribution License
 *   (http://creativecommons.org/licenses/by/2.5)
 * Official home: http://www.jcip.net
 *
 * Any republication or derived work distributed in source code form
 * must include this copyright and license notice.
 */

package com.bvan.javaoop.sample.multithreading.memorizer;

/**
 * @author bvanchuhov
 */
public interface Computable<A, V> {
    V compute(A arg) throws InterruptedException;
}
