# TP1 — Injection de dépendances en Java

## Implémentation avec une base de données simulée

`DaoImpl` simule la récupération de la valeur **120.0** depuis une base de données et le calcul (× 2) renvoie **240.0**.

La capture ci-dessous montre l’ancienne exécution, avec un résultat de 200.0.

![Exécution avec DaoImpl : résultat 200.0](docs/images/execution-base-donnees.jpg)

## Implémentation avec un capteur simulé

`DaoImpl2` simule la récupération de la valeur **75.0** depuis un capteur et le calcul (× 2) renvoie **150.0**.

La capture ci-dessous montre l’ancienne exécution, avec un résultat de 100.0.

![Exécution avec DaoImpl2 : résultat 100.0](docs/images/execution-capteur.jpg)
