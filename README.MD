- [Creation des comptes](#creation-des-comptes)
  * [GitHub](#github)
  * [Gitpod](#gitpod)
    + [Creation compte](#creation-compte)
    + [Configuration du compte](#configuration-du-compte)
- [Fork du projet](#fork-du-projet)
- [Construction du projet](#construction-du-projet)
- [Utiliser gitpod](#utiliser-gitpod)
- [Api Springboot](#api-springboot)
  * [Lancement application 'springboot'](#lancement-application--springboot-)
  * [Test de l'API](#test-de-l-api)
  * [Modification Msg](#modification-msg)
  * [Mesure consommation mémoire](#mesure-consommation-m-moire)
- [Mode Dev Quarkus](#mode-dev-quarkus)
  * [Lancer l'application quarkus](#lancer-l-application-quarkus)
  * [Tester](#tester)
- [Commit  modifications](#commit--modifications)
- [PullRequest](#pullrequest)


# Creation des comptes
## GitHub
Dans cette section nous créons un compte sur github. Si vous en avez déjà vous pouvez passer à l'étape suivante.
1. Se rendre sur https://github.com
1. Bouton Sign up
![Github1](assets/GitHub1.png)
1. Remplissez  le formulaire d'inscription
![Github1](assets/GitHub2.png)
1. Connecter vous au site github avec le nouveau compte créé
1. Remplissez le formulaire
![Github1](assets/GitHub3.png)
## Gitpod
### Creation compte
TOTO : Blabla Interêt de  Gitpod
1. Se  rendre sur https://gitpod.io et se cconnecter avec Github
![Github1](assets/GitPod1.png)
1. Authoriser Gitpod à accèder à votre compte Github
![Github1](assets/GitPod2.png)
1. Selectionner la formule à 1Ohrs/mois
![Github1](assets/GitPod3.png)
1. Préciser que vous etes étudiant
![Github1](assets/GitPod4.png)
### Configuration du compte
Il faut ajouter à votre compte gitpod le droit de pouvoir  lire&ecrire sur vos repos github.
1. Se connecter à votre compte Gitpod
1. Se rendre  dans votre paramètres de comptes
![Github1](assets/GitPodSettings1.png)
1. Editer les parametres de vote liaison à Github dans le menu 'Git Provider'
![Github1](assets/GitPodSettings2.png)
1. Ajouter le droit de lecture/ecriture à vos repos à travers Gitpod
![Github1](assets/GitPodSettings3.png)

# Fork du projet
L'objectif est de créer une copie du projet 'miage-numres-step1' sur votre compte github.

1. Se rendre sur le projet github [miage-numres-step1] (https://github.com/aepsilon-tek/miage-numres-step1)
1. Fork du projet grâce au bouton

![Capture d'écran](assets/Fork1.png)
![Capture d'écran](assets/Fork2.png)

# Construction du projet
```sh
./mvnw clean compile 
```

Cette commande permet de compiler les 2 sous modules api-quarkus et api-springboot.

# Utiliser gitpod


# Api Springboot
## Lancement application 'springboot'
```
 ./mvnw spring-boot:run  -pl api-springboot
```

## Test de l'API
1.Récupération de l'url de l'api
1.Appel dans le navigateur de l'ordinateur

## Modification Msg
1. Dans le terminal, construire l'application springboot
```sh
```
2. Se déplacer dans le répertoire `target`
3. Lancer la commande `java -jar `

## Mesure consommation mémoire


# Mode Dev Quarkus
## Lancer l'application quarkus
```sh
./mvnw quarkus:dev -pl api-quarkus
```

## Tester
Ouverture de port



# Commit  modifications

# PullRequest
