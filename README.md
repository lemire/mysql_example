

Nous supposons que vous avez Java (SDK) installé sur votre machine (version 8 ou mieuxls)
ainsi que maven (version 3 ou mieux). Java et maven devraient être configurés correctement
et disponibles en ligne de commande.

Vous pouvez récupérer le code de ce projet de GitHub en faisant Code/Download ZIP.

Une fois les fichiers sur votre disque, allez en ligne de commande dans le dossier Demo. Tapez ceci...

```
mvn clean package
```

Vous devriez voir ceci :

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running ca.teluq.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

```

Puis pour exécuter l'application, tapez ceci...

```
mvn exec:java -Dexec.mainClass="ca.teluq.App"
```

Vous devriez voir...

```
com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
```

Vous pouvez aussi vous rendre dans le dossier `Demo/target` où vous trouverez
le fichier `Demo-1.0-SNAPSHOT-jar-with-dependencies.jar` après avoir suivi les
instructions. Ce fichier peut être exécuté pour lancer la même application:

```
java -jar Demo-1.0-SNAPSHOT-jar-with-dependencies.jar
```

