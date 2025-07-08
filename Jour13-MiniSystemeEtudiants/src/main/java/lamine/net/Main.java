package lamine.net;


import lamine.net.Model.Etudiant;
import lamine.net.Utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int chooseOption;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Etudiant> etudiants = new ArrayList<>();

        Utils utils = new Utils();
        utils.printMenu();

        do {
            System.out.println("Choisissez une option");
            chooseOption = scanner.nextInt();
            switch (chooseOption){
                case 1 ->{
                    System.out.println("Ajouter un etudiant");
                    System.out.println("Entrez le nom");
                    String nom = scanner.next();
                    System.out.println("Entrez le prenom");
                    String prenom = scanner.next();
                    System.out.println("Entrez l'age");
                    int age = scanner.nextInt();
                    System.out.println("Entrez le matricule");
                    String matricule = scanner.next();
                    System.out.println("Entrez l'email");
                    String email = scanner.next();
                    System.out.println("Entrez le telephone");
                    String telephone = scanner.next();

                   Etudiant etudiant1 = new Etudiant(nom,prenom,age,matricule,email,telephone);



                    etudiants.add(etudiant1);
                    System.out.println("Etudiant ajouté avec succes");
                    for (Etudiant etudiant : etudiants)
                        System.out.println(etudiant);

                }
                case 2 ->{
                    boolean trouve = false;
                    System.out.println("Supprimer un etudiant");
                    System.out.println("Entrez le matricule");
                    String matricule = scanner.next();

                    for (int i = 0; i < etudiants.size(); i++) {
                        if (etudiants.get(i).getMatricule().equals(matricule)) {
                            etudiants.remove(i);
                            trouve = true;
                            System.out.println("Etudiant supprimé avec succès");
                            break;
                        }
                    }

                    if (!trouve) {
                        System.out.println("L'etudiant n'existe pas");
                    }

                }
                case 3 ->{
                    System.out.println("Liste des etudiants");
                    for (Etudiant etudiant : etudiants)
                        System.out.println(etudiant);
                }
                case 4 -> {
                    boolean trouve = false;
                    System.out.println("Rechercher un etudiant par son nom");
                    System.out.println("Entrez le nom à rechercher");
                    String nameSearch = scanner.next();
                    for (Etudiant etudiant : etudiants){
                        if (etudiant.getNom().equalsIgnoreCase(nameSearch)){
                            trouve = true;
                            System.out.println(etudiant);
                            break;
                        }
                    }
                    if (!trouve){
                        System.out.println("L'etudiant n'existe pas");
                    }

                }
                case 0 ->{
                    System.out.println("Au revoir");
                }
                default ->{
                    System.out.println("Option invalide");
                }
            }
        } while (chooseOption >= 0 && chooseOption <= 4);

    }
}