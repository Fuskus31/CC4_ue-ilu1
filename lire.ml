open String;;

(* Fonction de lecture d'un fichier CSV *)
let read_csv_file filename =

  let file = open_in filename in

  let lines = ref [] in

  try
    while true do
    
      let line = input_line file in
      
      let fields = split_on_char ',' line in
     
      lines := fields :: !lines
    done;
    
    close_in file;
    
    !lines
  with
  
  | End_of_file -> close_in file; !lines



(* Fonction de séparation d'une chaîne en une liste de chaînes en utilisant un caractère de séparation donné *)
let rec split_on_char sep s =
  (* Si la chaîne est vide, on renvoie une liste vide *)
  if s = "" then []
  (*cherche l'index du premier caractère de séparation *)
  else begin
    try
      (* Index du prochain caractère de séparation *)
      let i = String.index s sep in
      
      (String.sub s 0 i) :: (split_on_char sep (String.sub s (i+1) (String.length s - i - 1)))
    (*  on renvoie la chaîne elle-même dans une liste *)
    with Not_found -> [s]
  end

(* Lecture du fichier CSV "taches.csv" et stockage de son contenu dans la variable data *)
let data = read_csv_file "taches.csv";;
(* Parcours de toutes les lignes de data et affichage de chaque champ séparé par un espace *)
List.iter (fun line -> print_string (String.concat " " line); print_newline ()) data
