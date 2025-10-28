# Compte rendu du projet Spring Boot : Gestion des Produits

## 1. Objectif du projet
### L’objectif de ce travail est de créer une application Spring Boot permettant de gérer une liste de produits (ajout, modification, suppression, recherche, etc.) à l’aide de Spring Data JPA.
## Dans un premier temps, l’application utilise la base de données H2 en mémoire, puis elle est migrée vers une base MySQL.

## 2. Outils et technologies utilisées
### IDE : IntelliJ IDEA Ultimate
### Framework : Spring Boot
### Langage : Java
### Dépendances :
#### Spring Web
#### Spring Data JPA
#### H2 Database
#### Lombok
#### MySQL Connector
### SGBD : H2 (puis MySQL)

## 3. Étapes de réalisation
### Étape 1 : Création du projet
#### Le projet a été créé avec Spring Initializr en sélectionnant les dépendances :
#### Spring Web
#### Spring Data JPA
#### H2 Database
#### Lombok
#### Le projet a ensuite été ouvert dans IntelliJ IDEA Ultimate.

## Étape 2 : Création de l’entité JPA Product
### Une classe Product a été créée dans le package entities, représentant un produit avec les attributs suivants :
<img width="1148" height="536" alt="jee 1" src="https://github.com/user-attachments/assets/a8f90427-32fe-46b1-8bda-9b607b291972" />


#### L’annotation @Data (Lombok) permet de générer automatiquement les getters, setters et constructeurs.

## Étape 3 : Configuration de l’unité de persistance
### Dans le fichier application.properties, la configuration pour la base H2 a été ajoutée :
<img width="1210" height="376" alt="jee 3" src="https://github.com/user-attachments/assets/cd3d3583-ee6b-494d-94f9-af3999c4be3e" />

#### Cela permet d’utiliser une base en mémoire, pratique pour les tests.

## Étape 4 : Création du Repository
### Une interface ProductRepository a été créée pour gérer les opérations CRUD :
<img width="1021" height="83" alt="jee4" src="https://github.com/user-attachments/assets/16ff9dbb-1c79-44f4-a12d-fe6c4ca4b3a8" />

#### Cette interface hérite de JpaRepository, ce qui offre automatiquement les méthodes :
#### save(), findAll(), findById(), deleteById()...

## Étape 5 : Tests des opérations CRUD
### Dans la classe principale StudentsAppApplication, quelques tests ont été effectués au démarrage de l’application :
<img width="992" height="617" alt="jee5" src="https://github.com/user-attachments/assets/87180d74-92b9-47dc-9691-dc2eadee29fb" />

### Les résultats apparaissent dans la console et la base H2 peut être consultée via :

## Étape 6 : Migration vers MySQL
#### Pour utiliser MySQL au lieu de H2, les dépendances et le fichier de configuration ont été modifiés :
### Dépendance MySQL (dans pom.xml) 
<img width="560" height="143" alt="jee6" src="https://github.com/user-attachments/assets/f522f550-6ffb-4a7c-b7b1-dc6a12a3ae77" />


### Configuration MySQL (dans application.properties)
<img width="1422" height="192" alt="jee7" src="https://github.com/user-attachments/assets/2a5f0265-56cc-40b4-9e90-18266d37f654" />

### L’application se connecte désormais à la base product_db sur MySQL et les données sont stockées de manière persistante.

## 4. Résultats obtenus
### L’application permet de :
  #### Ajouter des produits
  #### Consulter la liste de tous les produits
  #### Chercher un produit par mot-clé
  #### Modifier ou supprimer un produit
  #### Afficher les produits en base H2 ou MySQL selon la configuration
<img width="1817" height="871" alt="image" src="https://github.com/user-attachments/assets/4fb12bc6-1d13-47ec-92a6-ce0b21c28900" />

## 5. Conclusion
### Ce mini-projet a permis de comprendre le fonctionnement de Spring Boot avec Spring Data JPA, ainsi que la différence entre une base de données en mémoire (H2) et une base persistante (MySQL).
### L’utilisation de Lombok et JPA Repository simplifie énormément le développement et rend le code plus clair et concis.




