package com.zingpay.cardwalla.feign;

import com.zingpay.cardwalla.dto.TransactionDto;
import com.zingpay.cardwalla.util.Status;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author Bilal Hassan on 23-Feb-21
 * @project cardwalla-microservice
 */

@FeignClient(value = "${feign.cardwallaintegration.name}", url = "${feign.cardwallaintegration.url:#{null}}")
public interface CardWallaIntegrationClient {

    @GetMapping("/product")
    Status getAgentProducts(@RequestHeader("Authorization") String token);

    @GetMapping("/transaction-info")
    Status getTransactionInfo(@RequestHeader("Authorization") String token);

    @PostMapping("/product")
    Status purchaseProduct(@RequestHeader("Authorization") String token, @RequestBody TransactionDto transactionDto);
}