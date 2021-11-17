# Übung 6
Quellcode der Vorlesung: https://github.com/fdiba-inf/vorlesung
## Repl.it öffnen
Bevor Sie die Taste _"Work in Repl.it"_ klicken, öffnen Sie https://repl.it/auth/github/get, um sicherzustellen, dass Sie in repl.it angemeldet sind.
## Aufgabe 1. Komplexität in O-Notation
Zu welchen Komplexitätsklassen gehören die folgenden Anweisungen in Abhängigkeit von n?
``` 
for (int i = 1; i < n; i = i * 2) {
    System.out.println(i);
}
``` 
``` 
for (int i = 1; i < n; i++) {
    System.out.println(i);
}
``` 
``` 
for (int i = 1; i < n; i++) {
    for(int j = 1; j < n; j = j * 2) {
        System.out.println(i + j);
    }
}
``` 
``` 
for (int i = 1; i < Math.pow(2, n); i++) {
    System.out.println(i);
}
``` 
``` 
for (int i = 1; i < n; i++) {
    for(int j = 1; j < n; j++) {
        System.out.println(i + j);
    }
}
``` 
``` 
for (int i = 1; i < 1000; i++) {
    System.out.println(n);
}
``` 
## Aufgabe 2. Palindrom
Ändern Sie die Klasse _Palindrome_ im Paket _exercise6_. 
Der Benutzer soll eine Zahl eingeben, die großer Null ist.
Dann wird bestimmt, ob die Zahl Palindrom ist (wenn rückwärts gelesen, erscheint dieselbe Zahl z.B. 1221, 242).
Ausgabe:
``` 
Palindrome: <true/false>
``` 
## Aufgabe 3. Passwortüberprüfung
Ändern Sie die Klasse _PasswordCheck_ im Paket _exercise6_. 
Sie soll die Korrektheit eines Passworts überprüfen. 
Der Benutzer soll ein Password eingeben, bis es korrekt ist:
* ist mindestens acht Zeichen lang
* besteht nur aus Buchstaben und Ziffern (_Character.isLetterOrDigit(symbol)_)
* enthält mindestens zwei Ziffern (_Character.isDigit(symbol)_)

Die folgende Nachricht wird am Ende in der Konsole ausgegeben:
``` 
Password valid!
``` 
## *Aufgabe 4. Galgenmännchen (https://de.wikipedia.org/wiki/Galgenm%C3%A4nnchen)
Erstellen Sie eine neue Klasse _Hangman_ im Paket _exercise6_. 
Drinnen werden Sie das Spiel Galgenmännchen implementieren. 
Das Spiel soll die folgenden Funktionalitäten haben:
* Das versteckte Wort wird von einer vordefinierten Menge von Wörtern _zufällig_ ausgewählt. (_new Random().nextInt(number)_)
* Das versteckte Wort wird in der Konsole ausgegeben z.B. \_ \_ \_ \_. Der Benutzer soll Buchstaben eingeben, bis das ganze Wort aufgedeckt wird. Das Wort wird nach jede Eingabe ausgegeben z.B. \_ I \_ \_.
* Die eingegebenen Buchstaben werden gespeichert und nach jeder Eingabe ausgegeben. Der Benutzer kann nicht einen schon eingegebenen Buchstaben wieder eingeben.
* Die Anzahl der Fehler wird gespeichert und nach jeder Eingabe ausgegeben. Der Benutzer verliert das Spiel, wenn diese Anzahl einen vordefinierten Wert erreicht.
* Am Ende jedes Spiels wird der Benutzer gefragt, ob er noch ein Spiel starten will. Der Benutzer kann _yes_ oder _no_ eingeben. Wenn _yes_, dann wird das Spiel mit einem neuen Wort gestartet.
* Die Spielzeit wird gemessen und am Ende des Spiels ausgegeben. (_System.currentTimeMillis()_)

## Achtung! Achtung! Achtung!
Wenn Sie alle Aufgaben gemacht haben, sollen Sie die Lösungen in _GitHub_ hochladen. 
Wenn "Version Control" nicht verfügbar ist, geben Sie die folgenden Befehle in die Konsole ein:
``` 
git pull
git add .
git commit -m "Some message"
git push
``` 
