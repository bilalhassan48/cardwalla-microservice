package com.zingpay.cardwalla.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Bilal Hassan on 23-Feb-21
 * @project cardwalla-microservice
 */

@FeignClient(value = "${feign.cardwallaintegration.name}", url = "${feign.cardwallaintegration.url:#{null}}")
public interface CardWallaIntegrationClient {

}
