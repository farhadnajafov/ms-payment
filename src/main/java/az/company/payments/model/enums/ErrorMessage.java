package az.company.payments.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessage {
    PAYMENT_NOT_FOUND("Payment not found with order id: %s"),
    SERVER_ERROR("Unexcepted error occured");

    private final String message;
}
