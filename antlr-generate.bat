@echo off
set SAVECLASSPATH=%CLASSPATH%

set CLASSPATH=lib/antlr-4.0-rc-1-complete.jar;

java org.antlr.v4.Tool -visitor -o src/logoparsing  grammar/Logo.g4
pause

set CLASSPATH=%SAVECLASSPATH%
 