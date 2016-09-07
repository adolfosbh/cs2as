package uk.ac.york.cs.cs2as.metrics;

class Main {
	
	def static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: one argument with the path to the file whose words are counted");
			return;
		}
		val path = args.get(0) as String;
		val wc = new WordsCounter("--","/*","*/");
		System.out.println(String.format("Number of words of (%1$s) is: %2$d", path, wc.countFile(path)));
	}
}