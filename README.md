cs2as
=====

Public repository in which I'll allocate some code related to cs2as development.


CS2AS External DSTL
------

The external DSTL conceived to declare CS2AS declarations for a particular 
language is implemented via the following set of plugins:
* uk.ac.york.cs.cs2as.dsl
* uk.ac.york.cs.cs2as.dsl.ui

As a prototype we don't provide it as an installable eclipse plugins yet (i.e p2 repository), so the 
dependencies need to be manually handled. We are currently using bleeding edge [Eclipse OCL][1] and 
[Eclipse QVTd][2] source code.


Proper documentation is still pending. To have a quick glance of the language, its grammar can be found in the **uk.ac.york.cs.cs2as.dsl** project:
* _src/uk/ac/york/cs/cs2as/CS2ASDSL.xtext_



[1]: http://projects.eclipse.org/projects/modeling.mdt.ocl
[2]: http://projects.eclipse.org/projects/modeling.mmt.qvtd
