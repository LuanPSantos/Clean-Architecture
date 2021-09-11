package codeplays.trainee.cleanarch.domain.usecase;

public class ResponseModel {

    private final String data;

    public ResponseModel(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
