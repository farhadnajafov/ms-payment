package az.company.payments.mapper;

import az.company.payments.dao.entity.PaymentEntity;
import az.company.payments.model.enums.PaymentStatus;
import az.company.payments.model.request.CreatePaymentRequest;
import az.company.payments.model.response.PaymentResponse;

import java.time.LocalDateTime;

import static az.company.payments.model.enums.PaymentStatus.SUCCESS;
import static java.time.LocalDateTime.now;

public enum PaymentMapper {

    PAYMENT_MAPPER;

    public PaymentEntity buildPaymentRequest (CreatePaymentRequest createPaymentRequest){
        return PaymentEntity.builder()
                .status(SUCCESS)
                .orderId(createPaymentRequest.getOrderId())
                .paymentType(createPaymentRequest.getPaymentType())
                .referenceNumber(createPaymentRequest.getReferenceNumber())
                .amount(createPaymentRequest.getAmount())
                .createdAt(now())
                .build();
    }

    public PaymentResponse buildPaymentResponse(PaymentEntity paymentEntity) {
        return PaymentResponse.builder()
                .id(paymentEntity.getId())
                .status(paymentEntity.getStatus())
                .createdAt(paymentEntity.getCreatedAt())
                .paymentType(paymentEntity.getPaymentType())
                .build();
    }
}
