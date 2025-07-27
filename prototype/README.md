# Dynamic-Image-Composition-Service

Ein robusten Backend Service, der ein Bild von einer URL entgegennimmt, es als JPEG lädt und als Base64 kordierte Daten URL zurückgibt.

---

## Features 

* Nimmt ein **baseImage** per Post Request entgegen
* Lädt ein Bild von einer URL
* Kodiert das Bild als JPEG
* Gbit das Ergebnis im **Json** zuück

---

## Compiler

* Visual Studio Code

---

## Technologie

* Java 17
* Spring Boot 3.5.4 
* Maven

---

## Wie start man das Projekt

Der Server muss auf Port **8080** laufen

### In Vs Code:

* Öffne die Datei `Main.java`
* Klick auf **Run Java**

### Oder im Terminal:

```bash
./mvnw spring-boot:run
```

## API Testen mit curl

```bash
curl -X POST http://localhost:8080/api/compose \
  -H "Content-Type: application/json" \
  -d '{
    "baseImage": "https://images.unsplash.com/photo-1599420186946-7b6fb4e297f0"
}'
```

## Beispielantwort
```json
{
  "finalImage": "data:image/jpeg;base64,..."
} 
```

## API Testen mit Postman
1. Methode: **Post**
2. URL: http://localhost:8080/api/compose
3.Body: * Wählen: raw
        * Typ: JSON
        * Inhalt:

```json
{
  "baseImage": "https://images.unsplash.com/photo-1599420186946-7b6fb4e297f0"
}
```

Beispielantwort
```json
{
  "finalImage": "data:image/jpeg;base64,..."
}
```