// Catalano Genetic Library
// The Catalano Framework
//
// Copyright © Diego Catalano, 2012-2019
// diego.catalano at live.com
//
//
//    This library is free software; you can redistribute it and/or
//    modify it under the terms of the GNU Lesser General Public
//    License as published by the Free Software Foundation; either
//    version 2.1 of the License, or (at your option) any later version.
//
//    This library is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//    Lesser General Public License for more details.
//
//    You should have received a copy of the GNU Lesser General Public
//    License along with this library; if not, write to the Free Software
//    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
//

package Catalano.Evolutionary.Genetic.Selection;

import Catalano.Evolutionary.Genetic.Chromosome.IChromosome;
import java.util.List;

/**
 * Common interface to selection operator.
 * @author Diego Catalano
 */
public interface ISelection {
    
    /**
     * Selection operator.
     * @param chromosomes Chromosomes.
     * @return Selected chromosomes.
     */
    int[] Compute(List<IChromosome> chromosomes);
}