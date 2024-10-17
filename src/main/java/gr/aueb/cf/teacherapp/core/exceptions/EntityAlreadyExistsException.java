package gr.aueb.cf.teacherapp.core.exceptions;

public class EntityAlreadyExistsException extends EntityGenericException {

    private static final String DEFAULT_CODE = "Already Exists";

    public EntityAlreadyExistsException(String code, String message) {
        super(code + DEFAULT_CODE, message);
    }
}
