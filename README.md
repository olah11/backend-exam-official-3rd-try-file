# Szó számoló
## Bevezetés
Ebben a feladatban egy olyan metódust kell írnod ami egy fájlt dolgoz fell.

Az alább meghatározott metódust a `wordcounter` csomagban (package) előre elkészített `hu.nive.ujratervezes.wordcounter.WordCounter` osztályban írd meg!

A `Main` osztály `main` metódusában próbálhatod ki a kódodat, illetve használd
az előre megírt teszteseteket az algoritmusod kipróbálására!

## Feladatleírás
Implementáld az alábbi metódust:

- a metódus neve: `countWords` (szavak megszámlálása)
- a metódus bemeneti paraméterei:
    - `fileName`, Egy `String` ami tartalmazza a file elérési útját és nevét.
    - `wordLength`, Egy `int` mely megadja hogy milyen hosszú szavakat kell megszámlálnunk. 
- visszatérési értéke:
  - egy `int[]` melynek az elemei azt adják meg hogy a file egyes soraiba, hány olyan szó van melynek hossza egyezik a paraméterként megadott hosszal.
  
A mondat végi írásjel nem része a mondat utolsó szavának.

## File felépitése
Minden a metódus által feldolgozandó file mondatokat tartalmaz a mondat végén lévő írásjellel együtt.
Egy sorban egy mondat van. 

## Test-ek
```java
    @Test
    void test_countWords_normalParameters(){
        int[] expected = new int[]{1,2};
        assertArrayEquals(expected, new hu.nive.ujratervezes.wordcounter.WordCounter().countWords("src/main/resources/test1.txt", 2) );
    }

    @Test
    void test_countWords_lastWordCounts(){
        int[] expected = new int[]{1,2,1,1};
        assertArrayEquals(expected, new hu.nive.ujratervezes.wordcounter.WordCounter().countWords("src/main/resources/test2.txt", 4) );
    }

    @Test
    void test_countWords_lastWordCountsAndNotAllEndsWithDot(){
        int[] expected = new int[]{1,2,1,1};
        assertArrayEquals(expected, new hu.nive.ujratervezes.wordcounter.WordCounter().countWords("src/main/resources/test3.txt", 4) );
    }

    @Test
    void test_countWords_notAllLinesHasWordWithGivenLength(){
        int[] expected = new int[]{1,0,0};
        assertArrayEquals(expected, new hu.nive.ujratervezes.wordcounter.WordCounter().countWords("src/main/resources/test4.txt", 11) );
    }

    @Test
    void test_countWords_notExistingFile(){
        int[] expected = new int[0];
        assertArrayEquals(expected, new hu.nive.ujratervezes.wordcounter.WordCounter().countWords("notExistingFile", 0) );
    }
```

## Pontozás

A feladat 0 pontot ér, bármely alábbi esetben:
- le sem fordul az adott projekt.
- teszteset sem fut le sikeresen
- ha a forráskód olvashatatlan, nem felel meg a konvencióknak, nem követi a clean code alapelveket
- ha kielégíti a teszteseteket, de a szöveges követelményeknek nem felel meg

Clean code-ra adható pontok: max 10

A test-ek egyenként 2 pontot érnek.
