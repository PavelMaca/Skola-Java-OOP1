# Práce s knihovnami
- znát důležité knihovny

Generování dokumentace pomocí javadoc

##String
- contains
- endsWith
- indexOf
- substring
. toUpperCase
- trim

## ArrayList<E> - generická třída (<E>)
- Instance je **seznam objektů**.
- **Indexovaná** kolekce.
- **Stejný prvek lze vložit vícekrát**.
- E = libovolná třída
- stává se z něho list s kterýmikoli typy
- diamantová notace => lze vypustit E přivolání: `ArrayList<E> prom = new ArrayList();`
- metoda get(int index) - vrátí prvek na indexu E

# Třídy pro práci s kolekcemi
## HashSet<E>
- Instance je množina objektů.
- Je možné zjisti, zda prvek z U do množinypatří, či ne.
- **Každý prvek  je unikátní*, nelze vložit např. 2x jedničku typu Integer.  
- **Není indexovaná**
- Navrženo pro rychlé vyhledávání

## HashMap<K, V>
