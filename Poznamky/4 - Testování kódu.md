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

## Pojmy
**Testování** - hledání chyb  
**Ladění** - hledání příčin chyb
Chyba se může projevit v jiném části kódu než se zprvu může zdát.  

## Techniky testování a ladění
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
- testování jednotek
- knihovna JUnit
- umožnuje opakování
- testovací třídy
- testované případy
- aserce
- testovací přípravky

### Ruční procházení

### Ladicí tiksy

### Debuggry
