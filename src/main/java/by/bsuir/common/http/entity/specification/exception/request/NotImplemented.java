package by.bsuir.common.http.entity.specification.exception.request;

import by.bsuir.common.http.entity.specification.HttpResponseCode;

public class NotImplemented extends HttpRequestException {

    public NotImplemented(String message) {
        super(message);
    }

    @Override
    public HttpResponseCode responseCode() {
        return HttpResponseCode.NOT_IMPLEMENTED;
    }
}
