package sandbox.crypto.pbkdf2;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import sandbox.utils.Timer;

/**
 * Test key derivation speed
 */
public class Sha256 {

	private static final SecureRandom secureRandom = new SecureRandom();

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		Timer timer = Timer.start();

		String password = "testPassword123!_-";
		int iterations = 10 * 100000;

		System.out.println("Password: " + password);
		System.out.println("Iterations: " + iterations);

		System.out.println("SecureRandom Algorithm for salt: " + secureRandom.getAlgorithm());
		byte[] salt = generateSalt();
		System.out.println("Salt: " + Arrays.toString(salt));

		KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, iterations, 256);
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		SecretKey secretKey = factory.generateSecret(keySpec);

		System.out.println("Key: " + Arrays.toString(secretKey.getEncoded()));

		timer.printElapsed();
	}

	private static byte[] generateSalt() {
		byte[] salt = new byte[16];
		secureRandom.nextBytes(salt);
		return salt;
	}

}
