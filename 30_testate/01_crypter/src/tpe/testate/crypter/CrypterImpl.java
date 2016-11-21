package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

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

			encryptedText += newArray[i];
		}
		return encryptedText;
	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {

		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {

				throw new IllegalArgumentException();
			}
			if ((int) input.charAt(i) < 48 || (int) input.charAt(i) > 122
					|| ((int) input.charAt(i) > 57 && (int) input.charAt(i) < 97)) {
				throw new IllegalArgumentException();
			}
		}
		return encrypt(input);
	}

}
