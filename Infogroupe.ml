
let ic = open_in "taches.csv";;


let sum = ref 0;;

(* Lecture du fichier ligne par ligne *)
try
  while true do
    
    let line = input_line ic in
    
    let fields = String.split_on_char ',' line in
   
    sum := !sum + int_of_string (List.nth fields 2);
  done
with End_of_file ->
  
  close_in ic;

(* Affichage de la somme finale *)
print_string "le total d'heure est :";;
print_int !sum;;

(* Ouverture du fichier en écriture *)
let oc = open_out "total.csv";;


output_string oc "Le nombre total d'heure des taches du groupe est : ";;


output_string oc (string_of_int !sum);;

(* Fermeture du fichier *)
close_out oc;;
