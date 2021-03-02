package com.zingpay.cardwalla.controller;

import com.zingpay.cardwalla.feign.CardWallaIntegrationClient;
import com.zingpay.cardwalla.util.Status;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bilal Hassan on 26-Feb-21
 * @project cardwalla-microservice
 */

@RequestMapping("/transaction")
@Api(value = "")
@RestController
public class TransactionController extends BaseController {

    @Autowired
    private CardWallaIntegrationClient cardWallaIntegrationClient;

    @ApiOperation(value = "", response = Status.class)
    @GetMapping
    public Status getTransactionInfo() {
        return cardWallaIntegrationClient.getTransactionInfo();
    }
}
