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
``
## Test de l'API

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


