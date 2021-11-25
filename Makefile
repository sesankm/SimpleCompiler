JAVA=java
JAVAC=javac
JFLEX=$(JAVA) -jar jflex-1.8.2/lib/jflex-full-1.8.2.jar
CUPJAR=./java-cup-11b.jar
CUP=$(JAVA) -jar $(CUPJAR)
CP=.:$(CUPJAR)

default: run

.SUFFIXES: $(SUFFIXES) .class .java

.java.class:
				$(JAVAC) -cp $(CP) $*.java

FILE=		ExampleLexer.java      parser.java    sym.java 	ExampleLexerTest.java	Token.java	Type.java	BinOp.java	Name.java	Expr.java Args.java Optionalsemi.java Argdecl.java Argdecllist.java Argdecls.java ReadList.java Optionalfinal.java Optionalexpr.java OptionalElse.java Fielddecl.java Fielddecls.java Stmts.java Stmt.java Methoddecl.java Methoddecls.java Memberdecls.java Program.java

run: test1.as
run: test2.as
run: test3.as
run: test4.as

test1.as: all
		$(JAVA) -cp $(CP) ExampleLexerTest test1.as > test1-output.txt
		cat -n basicFails-output.txt

test2.as: all
		$(JAVA) -cp $(CP) ExampleLexerTest test2.as > test2-output.txt
		cat -n test2-output.txt

test3.as: all
		$(JAVA) -cp $(CP) ExampleLexerTest test3.as > test3-output.txt
		cat -n test3-output.txt

test4.as: all
		$(JAVA) -cp $(CP) ExampleLexerTest test2.as > test4-output.txt
		cat -n test4-output.txt

basicTerminals.txt: all
		$(JAVA) -cp $(CP) ExampleLexerTest basicTerminals.txt > basicTerminals-output.txt
		cat -n basicTerminals-output.txt


all: ExampleLexer.java parser.java $(FILE:java=class)

clean:
		rm -f *.class *~ *.bak ExampleLexer.java parser.java sym.java

ExampleLexer.java: exampleGrammar.jflex
		$(JFLEX) exampleGrammar.jflex

parser.java: exampleTokens.cup
		$(CUP) -interface < exampleTokens.cup

parserD.java: exampleTokens.cup
		$(CUP) -interface -dump < exampleTokens.cup
