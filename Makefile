# Nom de l'exécutable à générer
EXEC = lire

# Fichiers source OCAML
SOURCES = lire.ml

# Règle de compilation de l'exécutable
$(EXEC): $(SOURCES)
	ocamlbuild -use-ocamlfind $(EXEC).native

# Règle de nettoyage
clean:
	ocamlbuild -clean
	rm -f $(EXEC)
all:
	ocamlc -o  programmeocaml str.cma  lire.ml
# Règle pour lancer le programme
run: 
	ocamlrun programmeocaml
