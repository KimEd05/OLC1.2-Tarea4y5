package analizadores;

import java_cup.runtime.Symbol;
%% 

%{
    
%}

/* Directivas */
%cupsym Simbolos
%class Scanner
%cup
%public
%full
%8bit
%unicode
%line
%column
%char
%ignorecase

/* Expresiones regulares */
blanco = [ |\t|\n|\f|\r]+
par = [0|2|4|6|8]
impar = [1|3|5|7|9]

%%

/* Caracteres */
","                 { return new Symbol(Simbolos.coma, yyline, yycolumn, yytext()); }

/* Tokens */
{par}               { return new Symbol(Simbolos.par, yyline, yycolumn, yytext()); }
{impar}             { return new Symbol(Simbolos.impar, yyline, yycolumn, yytext()); }

/* Comentarios */
{blanco}            {   }

/* Errores */
.                   { System.err.println("Elemento léxico desconocido: " + yytext() + ", Línea: " + (yyline + 1) + ", Columna: " + (yycolumn + 1)); }
