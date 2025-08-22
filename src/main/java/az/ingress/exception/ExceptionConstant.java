package az.ingress.exception;

public interface ExceptionConstant {

    String  UNEXPECTED_EXCEPTION_CODE = "UNEXPECTED_EXCEPTION";
    String  UNEXPECTED_EXCEPTION_MESSAGE = "Unexpected exception occured";
    String COMMENT_NOT_FOUND_CODE = "COMMENT_NOT_FOUND";
    String COMMENT_NOT_FOUND_MESSAGE = "Comment with id: %s not found";
    String POST_NOT_FOUND_CODE = "PRODUCT_NOT_FOUND";
    String POST_NOT_FOUND_MESSAGE = "Post with id:%s not found";
    String FORBIDDEN_EXCEPTION_CODE = "FORBIDDEN";
    String FORBIDDEN_EXCEPTION_MESSAGE = "You don't have permission to access this resource.";
}
