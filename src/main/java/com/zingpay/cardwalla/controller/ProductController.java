package com.zingpay.cardwalla.controller;

import com.zingpay.cardwalla.dto.TransactionDto;
import com.zingpay.cardwalla.feign.CardWallaIntegrationClient;
import com.zingpay.cardwalla.feign.ZingPayServiceClient;
import com.zingpay.cardwalla.util.Status;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author Bilal Hassan on 26-Feb-21
 * @project cardwalla-microservice
 */

@RestController
@RequestMapping("/product")
@Api(value = "")
public class ProductController extends BaseController {

    @Autowired
    private ZingPayServiceClient zingPayServiceClient;

    @ApiOperation(value = "", response = Status.class)
    @GetMapping("{/type}")
    public Status getAgentProducts(String type) {
        //return cardWallaIntegrationClient.getAgentProducts();
        return zingPayServiceClient.getBundles(getToken(), "CARDWALLA", type);
    }

    @ApiOperation(value = "", response = Status.class)
    @PostMapping
    public Status purchaseProduct(@RequestBody TransactionDto transactionDto) {
        int accountId = getLoggedInUserAccountId();

        transactionDto.setDateTime(new Date());
        transactionDto.setAccountId(accountId);
        return zingPayServiceClient.validateUserAndSubscribeBundle(getToken(), transactionDto);
    }
}
