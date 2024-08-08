# Gestion des Limites de Carte de Crédit

## Description

Ce programme Java permet de déterminer si un porteur de carte de crédit a dépassé sa limite de crédit. Il calcule le nouveau solde d'une carte après chaque achat et vérifie si ce solde dépasse la limite de crédit autorisée. 
Le programme offre une interface utilisateur en ligne de commande pour saisir les informations et afficher les résultats.

## Fonctionnalités

- **Saisie des Informations** : Permet à l'utilisateur d'entrer les informations suivantes :
  - Numéro de compte
  - Solde au début du mois
  - Total des charges du mois
  - Total des paiements/crédits du mois
  - Limite de crédit du client

- Calcul du Nouveau Solde : Calcule le nouveau solde après les charges et les paiements.
- Vérification de la Limite : Indique si le solde dépasse la limite de crédit et affiche un message approprié.

## Technologies Utilisées

- Java : Langage de programmation principal pour le développement du programme.
- JDK 22 : Version du kit de développement Java utilisé pour compiler et exécuter le programme.

## Structure du Projet

- `src` : Contient le code source Java.
  - `App.java` : Classe principale contenant la méthode `main` pour l'exécution du programme.
  - `CreditCardManager.java` : Classe responsable de la gestion des données et des calculs liés aux cartes de crédit.
  - `InputUtils.java` : Classe utilitaire pour la gestion des entrées utilisateur et le traitement des erreurs.

## Instructions de Déploiement

1. **Cloner le Repository**
   ```bash
   git clone https://github.com/your-username/credit-card-manager.git
