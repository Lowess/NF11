grammar Logo;

@header {
  package logoparsing;
}


//**********************************************************************
// DEFINITION DES EXPRESSIONS REGULIERES
//**********************************************************************

//*****************************************
//RegExp d'ordre général
//*****************************************
INT : '0' | [1-9][0-9]* ;
WS : [ \t\r\n]+ -> skip ;
ID : [a-zA-Z][a-zA-Z0-9]* ;

//*****************************************
//RegExp pour les expressions booléennes
//*****************************************
OP_BOOL : '=' ;
OP_INT : '<'|'<='|'='|'>='|'>' ;

//**********************************************************************
// REGLES DE GRAMMAIRE
//********************************************************************** 
  	
programme : (liste_procedures)* (liste_instructions)+ ;

liste_instructions :  (instruction)+ ;

instruction:
  	'LC' # lc
  	| 'BC' # bc
  	| 'VE' # ve
  	| 'AV' expr_arithmetique # av
  	| 'TD' expr_arithmetique # td
	| 'TG' expr_arithmetique # tg
	| 'RE' expr_arithmetique # re
  	| 'FPOS' expr_arithmetique expr_arithmetique # fpos
  	| 'FCC' expr_arithmetique # fcc
  	| expr_conditionnelle # expr_cond
  	| expr_affectation # expr_affect
  	| 'LOCALE' ID # affect_locale
  	| appel_procedure # appel_procedure
  	;

//Déclaration d'une procédure
liste_procedures : 
	(procedure)+
	;

procedure : 
	'POUR' ID liste_params liste_instructions 'FIN'
	;
	
//Appel d'une procédure
appel_procedure: 
	ID liste_appel
	;

liste_params: 
	(':' ID)* 
	;

liste_appel: 
	expr_arithmetique *
	;
	
expr_arithmetique :
	expr_arithmetique MUL expr_arithmetique # mul
	| expr_arithmetique DIV expr_arithmetique # div  
	| expr_arithmetique PLUS expr_arithmetique # plus 
	| expr_arithmetique MINUS expr_arithmetique # minus 
  	| 'HASARD' expr_arithmetique # hasard
  	| INT # int
  	| '-' INT # neg
  	| ':' ID # id
  	| '(' expr_arithmetique ')' # parent
  	| 'LOOP' # loop
	;
		
expr_booleene:
	expr_booleene 'ET' expr_booleene # bool_et
	| expr_booleene 'OU' expr_booleene # bool_ou
	| expr_booleene OP_BOOL expr_booleene # bool_op_bool
	| expr_arithmetique OP_INT expr_arithmetique # bool_op_arithm
	| '(' expr_booleene ')' # bool_parent
	| 'true' # bool_vrai
	| 'false' # bool_faux
	| ':' ID # id_bool
	;
	
bloc: '[' liste_instructions ']' ;
	
expr_conditionnelle:
	'SI' expr_booleene bloc bloc? # si_sinon
	| 'REPETE' expr_arithmetique bloc # repete
	| 'TANTQUE' expr_booleene bloc # tanque
	;

expr_affectation:
	'DONNE' '"' ID expr_arithmetique # affect_id_int
	| 'DONNE' '"' ID expr_booleene # affect_id_bool
	;
