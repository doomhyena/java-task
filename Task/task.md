# Feladat: "Készíts egy egyszerű Todo alkalmazást!"

## Leírás:
Egy egyszerű Todo listát kezelő alkalmazást kell készíteni, amely lehetővé teszi a felhasználó számára feladatok hozzáadását, megjelenítését és eltávolítását. Az alkalmazás menüvezérelt, és biztosítja az alapvető funkciókat, amelyek egy Todo listával kapcsolatosak.

## Feladatok:
1. **Feladatok tárolása**:
   - Tárold a feladatokat egy `ArrayList` segítségével, ahol minden feladat egy szövegként (`String`) szerepel.

2. **Felhasználói interakció**:
   - Készíts egy egyszerű menürendszert, ahol a felhasználó az alábbi opciók közül választhat:
     1. Új feladat hozzáadása.
     2. Feladatok megjelenítése.
     3. Feladat eltávolítása.
     4. Kilépés az alkalmazásból.
   - A felhasználótól kapott bevitel ellenőrzésére biztosíts kezelést, hogy a rendszer ne omoljon össze érvénytelen input esetén.

3. **Funkcionalitás**:
   - **Új feladat hozzáadása**:
     - Kérd be a feladat szövegét a felhasználótól, és add hozzá a lista végéhez.
   - **Feladatok megjelenítése**:
     - Jelenítsd meg a feladatok listáját számozott formában.
     - Jelezd, ha a lista üres.
   - **Feladat eltávolítása**:
     - Jelenítsd meg a feladatok listáját.
     - Kérd be a felhasználótól az eltávolítandó feladat sorszámát.
     - Ellenőrizd, hogy a megadott sorszám érvényes-e, és távolítsd el a megfelelő feladatot.

4. **Kilépés**:
   - Az alkalmazás addig fusson, amíg a felhasználó nem választja a "Kilépés" opciót.

## Pontos instrukciók:
- Az alkalmazást egy `Main` osztályban valósítsd meg.
- Használj `Scanner` osztályt a felhasználói bevitel kezelésére.
- Gondoskodj a bevitel helyes kezeléséről (pl. csak számokat fogadj el menüpont választásakor).
- A feladatok szövege tetszőleges lehet, de ellenőrizd, hogy üres bevitel ne kerüljön a listába.
- A feladat eltávolításánál kezeld az érvénytelen sorszámokat (pl. negatív szám vagy a lista méretén kívüli szám).

## Tesztelési példák:
1. **Feladat hozzáadása**:
   - Adj hozzá több feladatot, és ellenőrizd, hogy azok megjelennek a lista megtekintésekor.
2. **Feladatok megjelenítése**:
   - Ellenőrizd, hogy üres lista esetén a megfelelő üzenet jelenik meg.
3. **Feladat eltávolítása**:
   - Próbálj meg törölni egy nem létező sorszámú feladatot, és ellenőrizd, hogy hibaüzenet jelenik meg.
   - Törölj egy létező feladatot, és ellenőrizd, hogy az eltűnik a listából.
4. **Kilépés**:
   - Ellenőrizd, hogy a program sikeresen kilép, ha a felhasználó a megfelelő opciót választja.
