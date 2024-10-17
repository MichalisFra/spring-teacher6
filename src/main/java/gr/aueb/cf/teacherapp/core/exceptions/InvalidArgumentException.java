package gr.aueb.cf.teacherapp.core.exceptions;

public class InvalidArgumentException extends EntityGenericException {

    private static final String DEFAULT_CODE = "InvalidArgument";

    public InvalidArgumentException(String code, String message) {
        super(code + DEFAULT_CODE, message);
    }
}
