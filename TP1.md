# Réaliser une application web avec JSF (PrimeFaces)

## 1. Authentification des utilisateurs

L'application comporte une page d'authentification avec la logique suivante :

- Si l'utilisateur a le rôle **"admin"**, il est redirigé vers la page de **gestion des utilisateurs**.
- Si l'utilisateur a le rôle **"user"**, il est redirigé vers une page affichant **ses informations détaillées**.
- Si l'utilisateur n'a pas de rôle valide, une **page d'erreur** est affichée.

## 2. Gestion des utilisateurs

La page de gestion des utilisateurs inclut :

- Une **DataTable** affichant la liste des utilisateurs.
- La possibilité de **modifier** ou **supprimer** un utilisateur.
- Un bouton **"addUser"** permettant de rediriger vers une page d'ajout d'un nouvel utilisateur.

## 3. Page d'ajout d'un utilisateur

L'utilisateur peut saisir les informations suivantes :

- **Nom**
- **Prénom**
- **Date de naissance**
- **Solde de compte** (en MAD)
- **Adresse** (format : `Numéro - Nom de la rue`)
- **Ville et Code Postal** (le code postal commence dès le premier chiffre)
- **Pays**

## 4. Convertisseurs personnalisés

### a) Date de naissance
- Format : **XX/XX/XXXX** (jour/mois/année)

### b) Solde de compte
- Affichage avec l'unité **MAD (Dirham Marocain)**

### c) Adresse
- Extraction et formatage des champs suivants :
  - Numéro de rue
  - Nom de rue
  - Ville
  - Code postal

## 5. Validation des données

Des **validateurs** seront ajoutés aux endroits nécessaires pour garantir :
- La conformité du format de la date de naissance.
- La validité du solde du compte (valeur numérique et positive).
- La bonne structuration des champs d'adresse.

---

### Technologies utilisées :
- **JSF** (Jakarta Server Faces)
- **PrimeFaces** pour les composants UI
- **Java EE / Jakarta EE** pour la gestion des utilisateurs
- **JPA / Hibernate** pour l'accès aux données
- **Maven** pour la gestion des dépendances
