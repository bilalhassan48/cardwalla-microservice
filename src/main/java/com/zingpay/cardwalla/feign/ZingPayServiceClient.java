package com.zingpay.cardwalla.feign;

import com.zingpay.cardwalla.dto.TransactionDto;
import com.zingpay.cardwalla.util.Status;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bilal Hassan on 23-Feb-21
 * @project cardwalla-microservice
 */
@FeignClient(value = "${feign.zingpay.name}", url = "${feign.zingpay.url:#{null}}")
public interface ZingPayServiceClient {
    @PostMapping("/bundle/service/")
    Status validateUserAndSubscribeBundle(@RequestHeader("Authorization") String token,
                                          @RequestBody TransactionDto transactionDto);

    @GetMapping("/bundle/service/{network}/{type}")
    Status getBundles(@RequestHeader("Authorization") String token,
                      @PathVariable(name = "network") String network,
                      @PathVariable(name = "type") String type);
}