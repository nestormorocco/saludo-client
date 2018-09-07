package com.nestorms.saludoclient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*@FeignClient(name = "saludo-server-service", url = "localhost:8000")*/
@FeignClient(name = "saludo-server-service")
@RibbonClient(name = "saludo-server-service")
public interface SaludoServerServiceProxy {
	@GetMapping("/saludo/{nombre}")
	public String saludo(@PathVariable("nombre") String nombre);
}
