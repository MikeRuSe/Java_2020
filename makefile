compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin
ejecutar:compilar
	java -cp bin aplicacion.Principal help
limpiar:
	rm -rf bin
jar:compilar
	jar cvfm catalogoTelefonos.jar manifest.txt -C bin/ .
javadoc:compilar
	find . -type f -name *.java | xargs javadoc -d html -encoding utf-8 -docencoding utf-8 -charset utf-8	
