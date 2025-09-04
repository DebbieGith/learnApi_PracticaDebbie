package IntegracionBackFront.backfront.Config.Argon2;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Argon2Password {

    private static final int ITERARTIONS = 10;
    private static final int MEMORY = 32768;
    private static final int PARALLELISM = 2;

    //Crear un ainstancia de Argon2id
    private Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

    public String EncryptPassword(String password){
        return argon2.hash(ITERARTIONS, MEMORY, PARALLELISM, password);
    }

    public boolean VerifyPassword(String hashDB, String contrasena) {
        return argon2.verify(hashDB, contrasena);
    }
}
