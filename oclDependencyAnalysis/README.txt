Copyright (c) 2014 The University of York, Willink Transformations Ltd. and others 
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Adolfo Sanchez-Barbudo Herrera  (The University Of York) - initial API and implementation


README.TXT

- Simple project to compute the a dependency graph and to detect cycles in such a depedency graph
- The dependency graph is constructed from a Complete OCL document depicting a Concrete Syntax to Abstract Syntax (CS2AS) specification. 
- The dependencies are established between CS nodes, so that if CS node A depends on CS node B, that means that in order to have a properly 
  defined AS created from A, the associated AS from B should be previously be created.
  
Notes: 
  - To execute run analysis program in an workspace with Eclipse OCL (Examples) installed
  - For the time being, the URL of the OCL document is handcoded.