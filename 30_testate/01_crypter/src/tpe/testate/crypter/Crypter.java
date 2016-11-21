package tpe.testate.crypter;

/**
 * Interface für die Verschlüsselung.
 *
 *  Dieses Interface dient dazu, Texte mit der speziellen TPE-Verschlüsselung
 *  zu verschlüsseln. Die Verschlüsselung funktioniert so, dass bestimmte
 *  Zeichen durch andere ersetzt werden.
 *
 *  Hierbei gilt die folgende Übersetzungstabelle:
 *
 *  <code>
 *    e -> 3
 *    3 -> e
 *    l -> 1
 *    1 -> l
 *    o -> 0
 *    0 -> o
 *    a -> 4
 *    4 -> a
 *    t -> 7
 *    7 -> t
 *  </code>
 *
 *  Aus dem Text "tpe im sose 2016 ist eine super vorlesung" w�rde nach
 *  dieser Regel "7p3 im s0s3 2ol6 is7 3in3 sup3r v0r13sung".
 *
 *  Bei der Verschlüsselung sind nur die Zeichen a-z, die Zahlen 0-9 und
 *  das Leerzeichen erlaubt.
 */
public interface Crypter {

    /**
     * Verschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben,
     * so werden diese in Kleinbuchstaben umgewandelt. Ungültige Zeichen
     * werden ignoriert und nicht in den verschlüsselten Text übernommen.
     *
     * @param input Text, der verschlüsselt werden soll.
     * @return Verschlüsselter Text.
     */
    String encrypt(String input);

    /**
     * Entschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben,
     * oder andere ungültige Zeichen, so wirft die Methode eine Ausnahme.
     *
     * @param input Text, der entschlüsselt werden soll.
     * @return Entschlüsselter Text.
     * @throws IllegalArgumentException Wird geworfen, wenn die Eingabe
     *      ungültige Zeichen (Großbuchstaben) enthält.
     */
    String decrypt(String input) throws IllegalArgumentException;
}
