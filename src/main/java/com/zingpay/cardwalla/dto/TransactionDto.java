package com.zingpay.cardwalla.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Bilal Hassan on 23-Feb-21
 * @project cardwalla-microservice
 */

@Getter
@Setter
public class TransactionDto implements Serializable {
    private int accountId;
    private long serviceId;
    private Double amount;
    private String serviceProvider;
    private String retailerRefNumber;
    private String refTo;
    private Date dateTime;
    private String billingMonth;
    private String bundleId;
}
