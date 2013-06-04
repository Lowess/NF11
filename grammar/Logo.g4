grammar Logo; 

@header {
  package logoparsing;
}

//******************************************************************************************************
// DEFINITION DES EXPRESSIONS REGULIERES
//******************************************************************************************************

//*****************************************
//RegExp d'ordre général
//*****************************************
INT : '0' | [1-9][0-9]* ;
WS : [ \t\r\n]+ -> skip ;
ID : [a-z][a-z0-9]* ;

//*****************************************
//RegExp pour les noms de fonction
//*****************************************
LC : 'LC' ;
BC : 'BC' ;
VE : 'VE' ;
AV : 'AV' ;
TD : 'TD' ;
TG : 'TG' ;
RE : 'RE' ;
FPOS : 'FPOS' ;
FCC : 'FCC' ;

//*****************************************
//RegExp pour les expressions arithmétiques
//*****************************************
PLUS : '+' ;
MINUS : '-' ;
MUL : '*' ;
DIV : '/' ;
HASARD : 'HASARD' ;
//*****************************************
//RegExp pour les expressions booléennes
//*****************************************
ET : '&' ;
OU : '|' ;
OP_BOOL : '=' ;
OP_INT : '<'|'<='|'='|'>='|'>' ;

//*****************************************
//RegExp pour les expressions d'affectation
//*****************************************
OP_AFFECT : ':=' ;
LOCALE : 'LOCALE' ;

//*****************************************
//RegExp pour les expressions conditionnelles
//*****************************************
COND_IF : 'SI' ; 
BOUCLE_REPETE : 'REPETE' ; 
BOUCLE_TANTQUE : 'TANQUE' ;
POUR : 'POUR' ;
FIN : 'FIN' ;
//******************************************************************************************************
// REGLES DE GRAMMAIRE
//******************************************************************************************************
 
programme : liste_instructions ;

liste_instructions :  (instruction)+ ;

instruction:
  	LC # lc
  	| BC # bc
  	| VE # ve
  	| AV expr_arithmetique # av
  	| TD expr_arithmetique # td
	| TG expr_arithmetique # tg
	| RE expr_arithmetique # re
  	| FPOS expr_arithmetique expr_arithmetique # fpos
  	| FCC expr_arithmetique # fcc
  	| expr_conditionnelle # expr_cond
  	| expr_affectation # expr_affect
  	| LOCALE ID # affect_locale
  	| POUR ID liste_instructions FIN # procedure
  	;
  		
expr_arithmetique :
	expr_arithmetique MUL expr_arithmetique # mul
	| expr_arithmetique DIV expr_arithmetique # div  
	| expr_arithmetique PLUS expr_arithmetique # plus 
	| expr_arithmetique MINUS expr_arithmetique # minus 
  	| HASARD expr_arithmetique # hasard
  	| INT # int
  	| '-' INT # neg
  	| ':' ID # id
  	| '(' expr_arithmetique ')' # parent
  	| 'LOOP' # loop
	;
		
expr_booleene:
	expr_booleene ET expr_booleene # bool_et
	| expr_booleene OU expr_booleene # bool_ou
	| expr_booleene OP_BOOL expr_booleene # bool_op_bool
	| expr_arithmetique OP_INT expr_arithmetique # bool_op_arithm
	| '(' expr_booleene ')' # bool_parent
	| 'true' # bool_vrai
	| 'false' # bool_faux
	| ':' ID # id_bool
	;
	
bloc:
	'[' liste_instructions ']' 
	;
	
expr_conditionnelle:
	COND_IF expr_booleene bloc # si
	| COND_IF expr_booleene bloc bloc # si_sinon
	| BOUCLE_REPETE expr_arithmetique bloc # repete
	| BOUCLE_TANTQUE expr_booleene bloc # tanque
	;

expr_affectation:
	'DONNE' '"' ID expr_arithmetique # affect_id_int
	| 'DONNE' '"' ID expr_booleene # affect_id_bool
	;
