# Event Manager

## Funkciók
- Események hozzáadása különböző típusokkal (pl. meeting, task, reminder).
- Események törlése időpont vagy típus alapján.
- Események keresése típus vagy időpont szerint.
- Események rendezése időpont alapján.
- Egyszerű API, amely lehetővé teszi az események gyors kezelését.

## Telepítés

### Előfeltételek

Győződj meg róla, hogy a következő programok telepítve vannak a rendszeredre:
- [Java JDK 8 vagy újabb](https://adoptopenjdk.net/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=windows) ha kell egy IDE 

### Telepítés lépései

1. Klónozd a projektet a következő parancs segítségével:
   ```bash
   git clone https://github.com/username/event-manager.git
   ```

2. Navigálj a projekt mappájába:
   ```bash
   cd event-manager
   ```

3. (Opcionális) Fordítsd le és futtasd a projektet Maven-nel:
   ```bash
   mvn clean install
   ```

4. Futtasd a programot közvetlenül a `main` metódussal:
   ```bash
   java -cp target/event-manager-1.0-SNAPSHOT.jar EventApp
   ```

   **Vagy** közvetlenül futtathatod az alkalmazást IDE-ben (pl. IntelliJ IDEA, Eclipse).
