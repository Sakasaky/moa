/*
 *    HoeffdingTree.java
 *    Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
 *    @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 *
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package moa.classifiers.trees;

/**
 * Variant for testing : Using half the value of the computed HoeffdingBound
 */
public class HalfVFDT extends VFDT {

    @Override
    public double computeHoeffdingBound(double range, double confidence, double n) {
        System.err.println("Half Hoeffding computed");
        return super.computeHoeffdingBound(range, confidence, n) * 0.5;
    }
}