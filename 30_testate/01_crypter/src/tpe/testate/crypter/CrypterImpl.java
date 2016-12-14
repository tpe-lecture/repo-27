package tpe.testate.crypter;

/**
 * Klasse zur Entschl�ssung und Verschl�ssung von Texten.
 *
 * @author nguem
 *
 */
public class CrypterImpl implements Crypter {

	/**
	 * @param input
	 *            Text, der verschl�sselt werden soll.
	 * @variable newArray to convert the input text into lower-case and into an
	 *           array
	 * @return Verschl�sselter Text.
	 */
	@Override
	public String encrypt(String input) {

		char[] newArray = input.toLowerCase().toCharArray();

		String encryptedText = "";

		for (int i = 0; i <= input.length() - 1; i++) {

			if (newArray[i] == 'e') {
				newArray[i] = '3';
			} else if (input.charAt(i) == '3') {
				newArray[i] = 'e';

			} else if (newArray[i] == '1') {
				newArray[i] = 'l';

			} else if (newArray[i] == 'l') {

				newArray[i] = '1';
			} else if (newArray[i] == '0') {

				newArray[i] = 'o';
			} else if (newArray[i] == 'o') {

				newArray[i] = '0';
			} else if (newArray[i] == '4') {

				newArray[i] = 'a';
			} else if (newArray[i] == 'a') {

				newArray[i] = '4';
			} else if (newArray[i] == '7') {

				newArray[i] = 't';
			} else if (newArray[i] == 't') {

				newArray[i] = '7';
			}
			/**
			 * to check whether the input text doesn't contain invalid letters
			 */
			if ((newArray[i] >= 48 && newArray[i] <= 57) || (newArray[i] >= 97 && newArray[i] <= 122)
					|| newArray[i] == 32) {
				encryptedText += newArray[i]; // the encrypted text
			}
		}
		return encryptedText;
	}

	/**
	 * @param input
	 *            Text, der entschl�sselt werden soll.
	 * @return Entschl�sselter Text.
	 * @throws IllegalArgumentException
	 *             Wird geworfen, wenn die Eingabe ung�ltige Zeichen
	 *             (Grossbuchstaben) enth�lt.
	 *
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < 48 || input.charAt(i) > 122 || (input.charAt(i) > 57 && input.charAt(i) < 97)
					|| Character.isUpperCase(input.charAt(i))) {
				throw new IllegalArgumentException(); // throws an exception in
														// case of upper-case or
														// invalid letters
			}
		}
		return encrypt(input);
	}

}
