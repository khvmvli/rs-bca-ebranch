package retrofit2;
/* loaded from: classes2-dex2jar.jar:retrofit2/HttpException.class */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient Response<?> response;

    public HttpException(Response<?> response) {
        super(getMessage(response));
        this.code = response.code();
        this.message = response.message();
        this.response = response;
    }

    private static String getMessage(Response<?> response) {
        Utils.checkNotNull(response, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(response.code());
        sb.append(" ");
        sb.append(response.message());
        return sb.toString();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public Response<?> response() {
        return this.response;
    }
}
