# Application web intelligente qui estime le prix d'unappartement
Ce projet est une application web complète et sécurisée qui permet aux utilisateurs d'estimer le prix d'un appartement en fonction de ses caractéristiques. Il s'agit d'une solution full-stack qui intègre un modèle de machine learning pour des prédictions précises.
Fonctionnalités Clés ✨
Estimation des prix : Obtenez une estimation précise du prix d'un appartement en saisissant ses caractéristiques.
Historique des prédictions : Consultez et gérez l'historique de toutes vos estimations sauvegardées.
Authentification sécurisée : Accédez à l'application via un formulaire de connexion sécurisé, avec une gestion d'utilisateurs basée sur JWT (JSON Web Tokens).
Architecture Technique 🏗
L'application est conçue selon une architecture microservices distribuée, où chaque composant joue un rôle spécifique :
Frontend (Angular) : Interface utilisateur moderne, responsive et intuitive, développée avec Angular 20 et stylisée avec Bootstrap.
Backend (Spring Boot) : Gère la logique métier, la sécurité (via Spring Security) et l'authentification des utilisateurs.
API de Prédiction (FastAPI) : Expose un modèle de régression entraîné pour l'estimation des prix. Cette API est rapide et optimisée.
Modèle de Machine Learning 📈
Le cœur de ce projet est un modèle de régression personnalisé, entraîné sur un jeu de données Kaggle contenant 81 colonnes.
Score R² : Le modèle atteint un score de R^2 de 0.85, ce qui indique une bonne performance prédictive.
Prétraitement des données : Le jeu de données a subi un nettoyage rigoureux, incluant la gestion des valeurs manquantes et l'encodage des variables catégorielles, pour garantir la qualité du modèle.
Technologies et Outils 🛠
Frontend : Angular 20, Bootstrap
Backend : Spring Boot, Spring Security, JWT
Machine Learning : Scikit-learn, Pandas, Joblib, FastAPI
Développement : IntelliJ IDEA, VS Code, Jupyter Notebook
API Testing : Postman
