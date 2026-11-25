# TP Java : Gestionnaire de Rendez-vous avec `java.util.Calendar`

## Objectif pédagogique
L'objectif de ce Travail Pratique est de maîtriser la manipulation des dates et des heures en Java à travers la classe `java.util.Calendar`, tout en appliquant les principes de la Programmation Orientée Objet (encapsulation).

À l'issue de ce TP, vous saurez :
* Instancier et lire les champs d'un objet `Calendar` (`YEAR`, `MONTH`, `DAY_OF_MONTH`, `DAY_OF_WEEK`, etc.).
* Effectuer des calculs temporels avec la méthode `add()`.
* Cloner et comparer deux dates (`before()`, `after()`, `getTimeInMillis()`).
* Formater une date en français avec `SimpleDateFormat`.

---

## Énoncé du TP

### Partie 1 : Affichage de la date actuelle
Dans une classe principale `GestionnaireRdv` :
1. Créez une instance de `Calendar` représentant la date et l'heure actuelles.
2. Extrayez et affichez la date du jour au format `JJ/MM/AAAA` ainsi que l'heure exacte (attention : en Java, les mois sont indexés à partir de `0` pour janvier).
3. Affichez un formatage complet en français (ex. : *jeudi 12/11/2026 à 09:12*) à l'aide de `SimpleDateFormat` et `Locale.FRENCH`.

### Partie 2 : Modélisation de la classe `RendezVous`
Créez une classe `RendezVous` respectant l'encapsulation avec :
1. **Attributs privés :**
   * `objet` (`String`) : l'intitulé du rendez-vous (ex. : *"Dentiste"*, *"Réunion projet"*).
   * `date` (`Calendar`) : la date et l'heure du rendez-vous.
2. **Constructeur :** Initialise `objet` et `date`. Il doit également vérifier automatiquement si la date tombe un week-end (voir Partie 4).
3. **Méthodes métier à implémenter :**
   * `getDateRappel()` : retourne un nouvel objet `Calendar` fixé à **48 heures avant** le rendez-vous (pensez à utiliser `.clone()` pour ne pas modifier la date initiale).
   * `reporter()` : décale le rendez-vous de **2 semaines et 3 jours** à l'aide de la méthode `add()`.
   * `getJoursRestants()` : calcule et retourne le nombre de jours restants entre maintenant et le rendez-vous (utilisez `getTimeInMillis()`).
   * `toString()` : retourne une description lisible du rendez-vous avec son intitulé et sa date formatée.

### Partie 3 : Saisie utilisateur et scénario principal
Dans la méthode `main` de `GestionnaireRdv` :
1. Demandez à l'utilisateur (via `Scanner`) de saisir l'**objet** du rendez-vous, puis l'**année**, le **mois** (entre 1 et 12) et le **jour**.
2. Configurez un objet `Calendar` à cette date et fixez l'heure à **14h30**.
3. Vérifiez que la date saisie se situe bien dans le futur par rapport à l'instant présent (`before()`). Si elle est passée, affichez un message d'erreur et arrêtez le programme.
4. Instanciez un objet `RendezVous`, affichez sa confirmation ainsi que la date de son rappel automatique.
5. Proposez à l'utilisateur de reporter le rendez-vous. S'il accepte, appelez `reporter()` et affichez la nouvelle date ainsi que le compte à rebours en jours.

### Partie 4 : Bonus (Gestion des jours ouvrés)
Ajoutez une méthode privée `ajusterSiWeekEnd()` dans la classe `RendezVous`.
* Si le rendez-vous tombe un **samedi** (`Calendar.SATURDAY`), décalez-le automatiquement de 2 jours.
* Si le rendez-vous tombe un **dimanche** (`Calendar.SUNDAY`), décalez-le automatiquement de 1 jour.
* Appelez cette méthode dans le constructeur ainsi qu'après chaque report.
