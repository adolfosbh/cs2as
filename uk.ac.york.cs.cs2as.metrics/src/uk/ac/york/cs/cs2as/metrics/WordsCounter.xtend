package uk.ac.york.cs.cs2as.metrics;

import java.nio.file.Files
import java.nio.file.Paths
import java.net.URI

public class WordsCounter {
	
	private String singleLineComment;
	private String multiLineCommentStart;
	private String multiLineCommentEnd;
	
	new(){}
	new(String singleLineComment) {
		this(singleLineComment,null,null)
	}
	new(String multiLineCommentStart, String multiLineCommentEnd) {
		this(null,multiLineCommentStart,  multiLineCommentEnd)
	}
	new(String singleLineComment, String multiLineCommentStart, String multiLineCommentEnd) {
		this.singleLineComment = singleLineComment
		this.multiLineCommentStart = multiLineCommentStart
		this.multiLineCommentEnd = multiLineCommentEnd
	}
			
	def public int count(String stream) {
		var finalStream = stream;
		finalStream = if (multiLineCommentStart!=null) finalStream.replaceAll('''(?s)«multiLineCommentStart.scape».*«multiLineCommentEnd.scape»''','') else finalStream
		finalStream = if (singleLineComment!=null) finalStream.replaceAll('''«singleLineComment.scape».*''', '') else finalStream
		val split = finalStream.split("\\W+")
		split.length-1;
	}
	
	def public int countFile(String path) {
		count(new String(Files.readAllBytes(Paths.get(path))))
	}
	
	def public int countFile(URI uri) {
		count(new String(Files.readAllBytes(Paths.get(uri))))
	}
	
	def private String scape(String string){
		val str = string.replaceAll("\\*","\\\\*")
		str
	}
}
