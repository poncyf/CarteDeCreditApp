package com.example.CarteDeCredit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Collecte des informations auprès de l'utilisateur
int numeroCompte = saisirNumeroCompte(scanner);  // méthode pour récupérer et valider le numéro de compte
double soldeDebutMois = saisirSoldeDebutMois(scanner);  // éthode pour récupérer et valider le solde au début du mois
double totalCharges = saisirTotalCharges(scanner);  // méthode pour récupérer et valider le total des charges du mois
double totalPaiements = saisirTotalPaiements(scanner);  // méthode pour récupérer et valider le total des paiements/crédits du mois
double limiteCredit = saisirLimiteCredit(scanner);  // méthode pour récupérer et valider la limite de crédit du client
            
double nouveauSolde = calculerNouveauSolde(soldeDebutMois, totalCharges, totalPaiements);
            
            afficherResultat(numeroCompte, nouveauSolde, limiteCredit);
        }
    }

    public static int saisirNumeroCompte(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Entrez le numéro de compte: ");
                int numeroCompte = scanner.nextInt();
                if (numeroCompte <= 0) {
                    throw new IllegalArgumentException("Le numéro de compte doit être un entier positif.");
                }
                return numeroCompte;
            } catch (InputMismatchException e) {
                System.err.println("\u001B[31m" + "Erreur: Le numéro de compte doit être un entier positif." + "\u001B[0m");
                scanner.next(); 
            } catch (IllegalArgumentException e) {
                System.err.println("\u001B[31m" + "Erreur: " + e.getMessage() + "\u001B[0m");
            }
        }
    }

    /*     * Saisit et valide le solde au début du mois.
              Répète la demande jusqu'à obtenir une entrée valide en cas d'erreur de l'utilisateur*/

    public static double saisirSoldeDebutMois(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Entrez le solde au début du mois: ");
                double soldeDebutMois = scanner.nextDouble();
                if (soldeDebutMois < 0) {
                    throw new IllegalArgumentException("Le solde au début du mois doit être un nombre réel positif.");
                }
                return soldeDebutMois;
            } catch (InputMismatchException e) {
                System.err.println("\u001B[31m" + "Erreur: Le solde au début du mois doit être un nombre réel positif." + "\u001B[0m");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.err.println("\u001B[31m" + "Erreur: " + e.getMessage() + "\u001B[0m");
            }
        }
    }
    
    /*     Saisit et valide le total des charges du mois.
           Répète la demande jusqu'à obtenir une entrée valide en cas d'erreur de l'utilisateur*/


    public static double saisirTotalCharges(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Entrez le total de toutes les charges du mois: ");
                double totalCharges = scanner.nextDouble();
                if (totalCharges < 0) {
                    throw new IllegalArgumentException("Le total des charges doit être un nombre réel positif.");
                }
                return totalCharges;
            } catch (InputMismatchException e) {
                System.err.println("\u001B[31m" + "Erreur: Le total des charges doit être un nombre réel positif." + "\u001B[0m");
                scanner.next(); 
            } catch (IllegalArgumentException e) {
                System.err.println("\u001B[31m" + "Erreur: " + e.getMessage() + "\u001B[0m");
            }
        }
    }
    
    
    /*Saisit et valide le total des paiements/crédits du mois.
     * Répète la demande jusqu'à obtenir une entrée valide en cas d'erreur de l'utilisateur*/

    public static double saisirTotalPaiements(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Entrez le total de paiements/crédits du mois: ");
                double totalPaiements = scanner.nextDouble();
                if (totalPaiements < 0) {
                    throw new IllegalArgumentException("Le total des paiements/crédits doit être un nombre réel positif.");
                }
                return totalPaiements;
            } catch (InputMismatchException e) {
                System.err.println("\u001B[31m" + "Erreur: Le total des paiements/crédits doit être un nombre réel positif." + "\u001B[0m");
                scanner.next(); 
            } catch (IllegalArgumentException e) {
                System.err.println("\u001B[31m" + "Erreur: " + e.getMessage() + "\u001B[0m");
            }
        }
    }
    
    /* Saisit et valide la limite de crédit du client.
      Répète la demande jusqu'à obtenir une entrée valide en cas d'erreur de l'utilisateur*/

    public static double saisirLimiteCredit(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Entrez la limite de crédit du client par mois: ");
                double limiteCredit = scanner.nextDouble();
                if (limiteCredit < 0) {
                    throw new IllegalArgumentException("La limite de crédit doit être un nombre réel positif.");
                }
                return limiteCredit;
            } catch (InputMismatchException e) {
                System.err.println("\u001B[31m" + "Erreur: La limite de crédit doit être un nombre réel positif." + "\u001B[0m");
                scanner.next(); 
            } catch (IllegalArgumentException e) {
                System.err.println("\u001B[31m" + "Erreur: " + e.getMessage() + "\u001B[0m");
            }
        }
    }

         /* Calcule le nouveau solde à la fin du mois 
            en fonction du solde initial, des charges et des paiements.*/

    public static double calculerNouveauSolde(double soldeDebutMois, double totalCharges, double totalPaiements) {
        return soldeDebutMois + totalCharges - totalPaiements;
    }

         /* Affiche les informations sur le compte et le solde, 
            en signalant si la limite de crédit est dépassée.*/

    public static void afficherResultat(int numeroCompte, double nouveauSolde, double limiteCredit) {
        System.out.println("Numéro de compte: " + numeroCompte);
        System.out.println("Nouveau solde: " + nouveauSolde);
        
        if (nouveauSolde > limiteCredit) {
            System.out.println("\u001B[31m" + "Limite de crédit dépassée" + "\u001B[0m");
        }
    }

    Object getGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
