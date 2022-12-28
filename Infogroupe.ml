
let ic = open_in "taches.csv";;


let sum = ref 0;;

(* Lecture du fichier ligne par ligne *)
try
  while true do
    (* Lecture d'une ligne du fichier *)
    let line = input_line ic in
    (* Séparation des champs de la ligne en utilisant le caractère ',' comme séparateur *)
    let fields = String.split_on_char ',' line in
    (* Conversion de la troisième colonne en entier et ajout à la somme courante *)
    sum := !sum + int_of_string (List.nth fields 2);
  done
with End_of_file ->
  (* Fermeture du fichier une fois que toutes les lignes ont été lues *)
  close_in ic;

(* Affichage de la somme finale *)
print_string "le total d'heure est :";;
print_int !sum;;

(* Ouverture du fichier en écriture *)
let oc = open_out "total.csv";;

(* Ecriture de la phrase avant le nombre total *)
output_string oc "Le nombre total d'heure des taches du groupe est : ";;

(* Ecriture de la somme finale *)
output_string oc (string_of_int !sum);;

(* Fermeture du fichier *)
close_out oc;;
