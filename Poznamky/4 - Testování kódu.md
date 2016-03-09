# Testování kódu

## Syntatické chyby
- pomůže nám kompilátor
- program se většinou nespustí

## Logické chyby
- bugy
- některé logické chyby se nemusí na první pohled projevit
- většinou jde o nějaký speciální stav, na který se zapomělo

## Prevence a detekce
- vývojář omezí výskyt chyb, tak že na něm provede zkoušky, zda program chová, tak jak má
- používání zapouzdření sníží pravděpodobnost chyb
- šance odhalení se zvýší použitím modularizace a správné dokumentace


**Testování** - hledání chyb  
**Ladění** - hledání příčin chyb
Chyba se může projevit v jiném části kódu než se zprvu může zdát.  

## Techniky testování
### Testování jednotek
- jednotka je metoda třídy, modul (packagev Javě)
- provádí se během vývoje
- je vytvářena sada testů
- test driven development vs nejprve kód a pak testy (po částech)

#### Základy testování
- je třeba porozumět, co by měla jednotka dělat
- pozitivní i negativní testy
- testy okrajových případů

### Automatizované testování
- umožnuje opakované běhy testů
- regresivní testování = opakovaný běch všech testů
- píšeme testovací třídy
- **po přidání nové funkcionality se musí aktualizovat testy**
- testovací frameworky (knihovna JUnit, viz níže)

## Ladění
- důležita je schopnost čtení kódu

### Ruční procházení
- procházení kódu pomocí čtení
- kód se nespouští
- vysokoúrovňové = procházení krokově po metodách
- nízkoúrvňové = procházení každého řádku
- tabelování = urdžování si přehledu jakou hodnot má která proměnná
- verbální průchod = vysvětlení kódu kolegovi

### Ladicí tiksy
- v průběhu kódu vypíši nějaký stav objektu, či proměnné, která mě zajímá
- lze použít např. System.out.print
- efektivní pouze, pokud se ladí na správném místě
- výstup může být objemný

### Debuggry
- automatizují proces ladění
- umožňijí zastavit program naa určitém řádku
- stepover - krokování po řádcích, ale přeskočí obsahy použitých metod
- stepinto - po řádcích, včetně všech řádků použitých metod (heauresticky)
- zabrazuje pořadí v jakém byly metody volány

# JUnit
- testovací framework
- testovací případy = metody které obsahují testy
- možnost vygenerovat testovací třídu v IDE

## Aserce (assert)
- používá se k vyhodnocení testu
- udává se očekáváná a reálná hodnota
- vrací true/false
