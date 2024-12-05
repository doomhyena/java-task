# Értékelés

### **1. Feladatok tárolása (ArrayList használata)**

### A leírás elvárása:

- A feladatokat `ArrayList`ben kellett tárolni, ahol minden feladat egy szöveg (`String`) formátumú.

### Megvalósítás:

- A kódban megfelelően használtad az `ArrayList`et a feladatok tárolására:
    
    ```java
    static ArrayList<String> todo = new ArrayList<>();
    ```
    

### Értékelés:

- Ez a feladatot megcsináltad. **(10/10 pont)**

---

### **2. Felhasználói interakció (menürendszer)**

### Feladatleírás elvárása:

- Legyen egy menürendszer, ahol a felhasználó az alábbi opciók közül választhat:
    1. Új feladat hozzáadása.
    2. Feladatok megjelenítése.
    3. Feladat eltávolítása.
    4. Kilépés.

### Megvalósítás:

- A kódod tartalmaz egy menüt, ami a feladatban is le van írva:
    
    ```java
    System.out.println("Menü:\n1. Új feladat.\n2. Feladatok megjelenítése\n3. Feladatok eltávolítása\n4. Kilépés");
    
    ```
    
- Azonban nincs bevitel-ellenőrzés az rossz inputokra, például szöveges vagy a menün kívüli számokra.

### Hiányosságok:

- Nincs védelem érvénytelen bemenetek ellen. Példa: „x” vagy „5” bevitel esetén a kód összeomlik.

### Értékelés:

- A menü alapvetően működik, de a hibakezelés hiányosságai miatt pontot vontam le. **(7/10 pont)**

---

### **3. Új feladat hozzáadása**

### Feladatleírás elvárása:

- Kérje be a felhasználótól a feladat szövegét, és adja hozzá a lista végéhez.
- Az üres beviteleket ne engedje.

### Megvalósítás:

- A kód helyesen hozzáadja a feladatot:
    
    ```java
    String fel = be.next();
    todo.add(fel);
    ```
    
- Azonban az üres szövegeket nem szűri ki, így akár üres feladat is bekerülhet a listába.

### Hiányosságok:

- Az üres bevitelek ellenőrzése hiányzik.

### Értékelés:

- A funkció működik, de az üres bevitel kezelése fontos elvárás, ami nem sikerült. **(7/10 pont)**

---

### **4. Feladatok megjelenítése**

### Feladatleírás elvárása:

- A feladatokat számozott formában jelenítse meg.
- Ha a lista üres, jelezze megfelelő üzenettel.

### Megvalósítás:

- A kód helyesen jeleníti meg a feladatokat számozott formában:
    
    ```java
    for (String n : todo) {
        System.out.println(szam + ". :" + n);
        szam++;
    }
    
    ```
    
- Üres lista esetén üzenetet ad:
    
    ```java
    else {
        System.out.println("ÜRES!!!!");
    }
    ```
    

### Hiányosságok:

- Az „ÜRES!!!!” üzenet helyett egy barátságosabb visszajelzés (pl. „A lista üres.”) jobb felhasználói élményt nyújtana.

### Értékelés:

- A funkció teljesült, de a felhasználói élmény fejleszthető lenne. **(9/10 pont)**

---

### **5. Feladat eltávolítása**

### Feladatleírás elvárása:

- Kérje be a felhasználótól az eltávolítandó feladat sorszámát.
- Ellenőrizze, hogy a megadott szám érvényes-e.

### Megvalósítás:

- A kód törli a feladatot a lista megfelelő indexéről:
    
    ```java
    int t = be.nextInt();
    todo.remove(t - 1);
    
    ```
    
- Azonban nincs ellenőrzés, hogy a megadott szám érvényes-e (pl. negatív szám vagy a lista méretén kívüli érték esetén).

### Hiányosságok:

- Az érvénytelen sorszámok kezelése hiányzik, ami programhibához vezethet.

### Értékelés:

- A funkció alapvetően működik, de a hibakezelés hiánya miatt pontlevonás jár. **(6/10 pont)**

---

### **6. Kilépés az alkalmazásból**

### Feladatleírás elvárása:

- Az alkalmazás addig fusson, amíg a felhasználó a „Kilépés” opciót nem választja.

### Megvalósítás:

- A kód helyesen kezeli a kilépést:
    
    ```java
    System.exit(0);
    
    ```
    

### Hiányosságok:

- Nincsenek.

### Értékelés:

- A funkció tökéletesen teljesült. **(10/10 pont)**

---

### **Összefoglaló pontszám**

| Funkció | Pontszám |
| --- | --- |
| Feladatok tárolása | 10/10 |
| Felhasználói interakció | 7/10 |
| Új feladat hozzáadása | 7/10 |
| Feladatok megjelenítése | 9/10 |
| Feladat eltávolítása | 6/10 |
| Kilépés | 10/10 |
| **Összesen** | **49/60** |

### Végső százalék: **81,67%**

## Osztályzatok eloszlása

- **1-es (elégtelen):** 0–59%
- **2-es (elégséges):** 60–74%
- **3-as (közepes):** 75–84%
- **4-es (jó):** 85–94%
- **5-ös (jeles):** 95–100%
