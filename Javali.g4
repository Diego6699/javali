// Definição de tokens
grammar Javali;

// Palavras reservadas
IF       : 'if';
ELSE     : 'else';
WHILE    : 'while';
FOR      : 'for';
BREAK    : 'break';
CONTINUE : 'continue';
RETURN   : 'return';
INT      : 'int';
FLOAT    : 'float';
CHAR     : 'char';
BOOL     : 'bool';

// Delimitadores
SEMICOLON   : ';';
LPAREN      : '(';
RPAREN      : ')';
LBRACE      : '{';
RBRACE      : '}';
LBRACKET    : '[';
RBRACKET    : ']';
DOUBLEQUOTE : '"';
SINGLEQUOTE : '\'';

// Identificadores
ID       : [a-zA-Z_] [a-zA-Z_0-9]*;

// Tipos primitivos
type     : INT
         | FLOAT
         | CHAR
         | BOOL;

// Regra de expressões
expression : INT
           | FLOAT
           | CHAR
           | BOOL
           | ID
           | expression ('+'|'-'|'*'|'/') expression
           | '(' expression ')';

// Declaração de variáveis
variable : type ID ('=' expression)?;

// Declaração de variáveis char com literal de caractere
charVariable : CHAR ID '=' CHAR_LITERAL SEMICOLON;

// Declaração de strings
stringVariable : CHAR ID '=' DOUBLEQUOTE STRING_CONTENT DOUBLEQUOTE SEMICOLON;

// Definição de literal de caractere ('char')
CHAR_LITERAL : '\'' [a-zA-Z] '\'';

// Definição de literal de string
STRING_CONTENT : ~('"')+;

// Outras regras para expressões, estruturas de controle, etc.

// Ignorar espaços em branco e quebras de linha
WS       : [ \t\r\n]+ -> skip;

// Regra de início
program  : (charVariable | stringVariable | variable | statement)* EOF;
statement: IF | ELSE | WHILE | FOR | BREAK | CONTINUE | RETURN | expression SEMICOLON;