# Nom de l'exécutable à générer
EXEC = lire infogroupe

# Fichiers source OCAML
SOURCES = lire.ml infogroupe.ml

# Règle de compilation de l'exécutable
$(EXEC): $(SOURCES)
	ocamlbuild -use-ocamlfind $(EXEC).native

# Règle de nettoyage
clean:
	ocamlbuild -clean
	rm -f $(EXEC).cmi  $(EXEC).cmo
all:
	ocamlc -o  programmeocaml str.cma  lire.ml infogroupe.ml
# Règle pour lancer le programme
run: 
	ocamlrun programmeocaml
