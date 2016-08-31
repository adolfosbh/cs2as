package uk.ac.york.cs.cs2as.generator

class Helper {
	
	
	def static String scapeKeywords(String string) {
		if (#['body','context'].contains(string))
			'''_«string»'''
		else
			string;
	}
}