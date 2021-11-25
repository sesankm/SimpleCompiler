/*-***
 * This grammar is defined for the example grammar defined in the
 *project part 1 instructions
 */

/*
 * NOTE: make sure that the java cup runtime file is in the same directory as this file
 * it is also alright if the runtime location is added to to the classpath, but just
 * putting in the same file is far easier.
 */
import java_cup.runtime.*;


%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%cup
%line
%column
%unicode
%class ExampleLexer
/*
 * NOTE: the above name ExampleLexer, will have to be changed here if
 * you chose to rename the lexer object.
 */
 
%{

/**
 * Return a new Symbol with the given token id, and with the current line and
 * column numbers.
 */
Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}

/**
 * Return a new Symbol with the given token id, the current line and column
 * numbers, and the given token value.  The value is used for tokens such as
 * identifiers and numbers.
 */
Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
}

%}


/*-*
 * PATTERN DEFINITIONS:
 */

tab = \\t
newline = \\n
slash = \\
star = \*
squote = \'
dquote = \"

letter = [A-Za-z]
digit = [0-9]

id = {letter}+({digit}|{letter})*
intlit = {digit}+
char	= {letter}
charlit	= {squote}{letter}{squote}
floating = {digit}+\.{digit}+
string = {dquote}{letter}*{dquote}
stringlit = {dquote}{letter}*{dquote}
whitespace = [ \n\t\r]
inlinecomment = {slash}{slash}.*\n
multilinecomment = {slash}{star}.{star}{slash}

%%
/**
 * LEXICAL RULES:
 */
read  { return newSym(sym.READ, "read"); }
print { return newSym(sym.PRINT, "print"); }
"*"   { return newSym(sym.TIMES, "*"); }
"+"   { return newSym(sym.PLUS, "+"); }
"-"   { return newSym(sym.MINUS, "-"); }
"/"   { return newSym(sym.DIVIDE, "/"); }
"="   { return newSym(sym.ASSMNT, "="); }
";"   { return newSym(sym.SEMI, ";"); }
"("   { return newSym(sym.LPAR, "("); }
")"   { return newSym(sym.RPAR, ")"); }
"{"   { return newSym(sym.LBRAC, "{"); }
"}"   { return newSym(sym.RBRAC, "}"); }
"["   { return newSym(sym.LBOX, "{"); }
"]"   { return newSym(sym.RBOX, "}"); }
","   { return newSym(sym.COMMA, ","); }
"~"   {return newSym(sym.TILDE, "~");}
"<"   {return newSym(sym.LT, "<");}
">"   {return newSym(sym.GT, ">");}
":"   {return newSym(sym.COLON, ":");}
"?"   {return newSym(sym.QUESTION, "?");}
"=="  {return newSym(sym.EQ, "==");}
"<="  {return newSym(sym.LTE, "<=");}
">="  {return newSym(sym.GTE, ">=");}
"<>"  {return newSym(sym.NE, "<>");}
"||"  {return newSym(sym.OR, "||");}
"|"   {return newSym(sym.PIPE, "|");}
","   {return newSym(sym.COMMA, ",");}
"&&"  {return newSym(sym.AND, "&&");}
"++"  {return newSym(sym.INC, "++");}
"--"  {return newSym(sym.DEC, "--"); }
slash {return newSym(sym.BS, "\\");}

var			{ return newSym(sym.VAR, "var"); }
true			{ return newSym(sym.TRUE, "true"); }
false			{ return newSym(sym.FALSE, "false"); }
int			{ return newSym(sym.INT, "int"); }
char			{ return newSym(sym.CHAR, "char"); }
float			{ return newSym(sym.FLOAT, "foat"); }
bool			{ return newSym(sym.BOOL, "bool"); }
void			{ return newSym(sym.VOID, "void"); }

else			{return newSym(sym.ELSE, "else");}
if			{return newSym(sym.IF, "if");}
while			{return newSym(sym.WHILE, "while");}
return 			{return newSym(sym.RETURN, "return");}
class			{return newSym(sym.CLASS, "class");}
printline		{return newSym(sym.PRINTLN, "printline");}
final			{return newSym(sym.FINAL, "final");}


{id}            	{ return newSym(sym.ID, yytext()); }
{intlit}         	{ return newSym(sym.INTLIT, yytext()); }
{charlit}    		{ return newSym(sym.CHARLIT, yytext()); }
{floating}    	 	{  return newSym(sym.FLOATING, yytext()); }
{stringlit}    		{ return newSym(sym.STRINGLIT, yytext()); }
{whitespace}     	{ /* Ignore whitespace. */ }
{inlinecomment} 	{ /* For this stand-alone lexer, print out comments. */}
{multilinecomment}    	{ /* Ignore whitespace. */ }
.               	{ System.out.println("Illegal char, '" + yytext() + "' line: " + yyline + ", column: " + yychar); } 
