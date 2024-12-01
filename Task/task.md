# Feladat: "Készíts egy egyszerű eseménykezelőt!"

## Leírás:
Képzeld el, hogy egy eseménysorozatot kell feldolgoznod, ahol minden eseményhez tartozik egy esemény típusa és egy időpont. Készíts egy Java alkalmazást, amely képes tárolni, rendezni és keresni az eseményeket egy adott időpont alapján. Az alkalmazásnak tartalmaznia kell egy egyszerű API-t, hogy új eseményeket lehessen hozzáadni, keresni azokat időpont vagy típus alapján, illetve törölni a nem szükséges eseményeket.

## Feladatok:
1. **Esemény osztály**: Készíts egy `Event` osztályt, amely az esemény típusát (pl. meeting, task, reminder) és egy időpontot (pl. `LocalDateTime`) tartalmazza.
   
2. **Esemény tárolása**: Készíts egy `EventManager` osztályt, amely egy listában tárolja az eseményeket. Az osztálynak az alábbi funkciókkal kell rendelkeznie:
   - Hozzáad egy új eseményt.
   - Töröl egy eseményt időpont vagy típus alapján.
   - Rendezheti az eseményeket időpont szerint.
   - Képes keresni eseményeket típus alapján.
   - Képes keresni eseményeket egy adott időpont körül (pl. egy adott időpont előtt/után).

3. **API és tesztelés**: Készíts egy egyszerű main metódust, ahol tesztelheted az események hozzáadását, törlését és keresését.

## Pontos instrukciók:
- Használj `LocalDateTime`-ot az időpont kezelésére.
- A típus egy egyszerű `String` lehet, de megfontolhatod az enum használatát a típusok biztonságosabb kezelésére.
- Az események tárolására használhatsz egy `ArrayList`-et, de más adatstruktúrákat is alkalmazhatsz, mint például a `TreeSet`, hogy az időpontokat automatikusan rendezd.
- A `EventManager` osztálynak biztosítania kell, hogy az eseményeket rendezve tároljuk.

## Tesztelési példák:
1. **Hozzáadás**: Ellenőrizd, hogy helyesen tudsz eseményt hozzáadni.
2. **Keresés típus szerint**: Ellenőrizd, hogy csak a megadott típusú eseményeket adja vissza.
3. **Rendezés**: Ellenőrizd, hogy az események időpont szerint vannak-e rendezve.
4. **Törlés**: Ellenőrizd, hogy megfelelő eseményeket törölhetünk típus vagy időpont alapján.
